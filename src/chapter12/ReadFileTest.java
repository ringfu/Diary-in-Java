package chapter12;

import java.io.FileInputStream;
import java.io.IOException;

/*
* 12.3 字节流      page: 279
* by: fy    time:2018-03-27
* */
public class ReadFileTest {
    public static void main(String[] args) throws IOException{  //fy: 防止读取异常
        try{
            //指定文件路径到输入流， 相当于建立了输入流和文件之间的连接
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\29435\\Desktop\\hello world.txt");
            int n = fileInputStream.available();
            byte[] b = new byte[n];
            while((fileInputStream.read(b,0,n)) != -1){ //read()读入文件内容到 b 数组中
                System.out.println(new String(b));
            }
            System.out.println();
            fileInputStream.close(); //关闭输入流
        }catch (IOException e){
            System.out.println(e.getMessage());//异常处理
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

/*
* 笔记：
* 1，从文件读入数据步骤：
*   1，实例化输入流， 建立输入流和文件之间关联FileInputStream fileInputStream = new FileInputStream("data.txt")
*   2，读取文件到指定容器fileInputStream.read(b,0,n)
*   3，关闭输入流fileInputStream.close()
* */