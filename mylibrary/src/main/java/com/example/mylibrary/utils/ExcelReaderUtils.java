package com.example.mylibrary.utils;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelReaderUtils {


    public interface Listenner {
        void readOk(Object data);
    }

    public static void readExcelFile(Context context, String filepath,Listenner listenner) {
        Observable observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> e) throws Exception {
                e.onNext(filepath);
                e.onComplete();
            }
        }).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
        Observer observer = new Observer() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Object value) {
                readFile(context,filepath,listenner);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };
        observable.subscribe(observer);
    }


    private static synchronized Object readFile(Context context, String filepath,Listenner listenner) {
        InputStream inputStream = null;//输入流
        FileOutputStream outputStream = null;//输出流
        Workbook book = null;//Excel工作簿对象
        try {
            inputStream = context.getAssets().open(filepath);
            File tempFile = new File(context.getCacheDir(), "test.xls");//临时文件，第二个参数为文件名字，可随便取
            outputStream = new FileOutputStream(tempFile);
            byte[] buf = new byte[1024];
            int len;
            while ((len = inputStream.read(buf)) > 0) {//while循环进行读取
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
            try {
                book = Workbook.getWorkbook(tempFile);//用读取到的表格文件来实例化工作簿对象（符合常理，我们所希望操作的就是Excel工作簿文件）
            } catch (BiffException e) {
                e.printStackTrace();
            }
            List<List> datas=new ArrayList<>();
            Sheet[] sheets = book.getSheets(); //得到所有的工作表
            for (int m = 0; m < sheets.length; m++) {
                Sheet sheet = book.getSheet(m);
                int Rows = sheet.getRows();//得到当前工作表的行数
                int Cols = sheet.getColumns(); //得到当前工作表的列数
                for (int i = 0; i < Cols; i++) {  // 注意：这里是按列读取的！！！
                    List<String>  inners=new ArrayList<>();
                    for (int j = 0; j < Rows; j++) {
                        String content = sheet.getCell(i, j).getContents();//结果是String类型的，根据具体需求进行类型转换
                        if(i!=0){
                            inners.add(content);
                        }
                    }
                    datas.add(inners);
                }
            }
            listenner.readOk(datas);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
