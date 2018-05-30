package chapter12;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileTest {
    public static void main(String[] args) {
        try{
            System.out.println("please input your idea:");
            byte[] b = new byte[512];
            System.in.read(b);  //从键盘读取输入数据， 存放在 b 中

            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\29435\\Desktop\\hello world.txt",true);
            //实例化输出流， 建立输出流和文件之间联系
            fileOutputStream.write(b); //写文件
            fileOutputStream.close();//关闭文件
            System.out.println("save file successful");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}

/*
* 笔记：
* 1，读取键盘输入到指定文件步骤：
*   1，读取键盘输入到指定容器：System.in.read(b)
*   2，实例化输出流， 建立输出流和问价之间联系：FileOutputStream fileOutputStream = new FileOutputStream("data.txt",true)
*   3，将数据通过输出流写入文件：fileOutputStream.write(b)
*   4，关闭输出流， 异常处理
* 2，输出流参数FileOutputStream(String name, boolen append): name: 输出流输出的文件路径，
*       append：false重写方式，即从文件头开始覆盖写入，true添加写入，即接着原文件写入
* */