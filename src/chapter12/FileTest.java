package chapter12;

import java.io.File;

/*
* 12.4 文件操作     page: 282
* by:fy     time: 2018-03-27
* */
public class FileTest {
    public static void main(String[] args) {
                File mynewDir = new File("C:\\Users\\29435\\Desktop\\newdir","doc.txt");
        //
        mynewDir.mkdir();
        //mynewDir.delete();
    }
}
