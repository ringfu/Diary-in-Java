package chapter15_net;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ParseURL {
    public static void main(String[] args)throws Exception {
        // get url info
//        URL Aurl = new URL("http://java.sun.com:80/docs/books");
//        URL tuto = new URL(Aurl,"tutorial.intro.html#DOWNLOADING");
//        System.out.println("protocol ="+tuto.getProtocol());
//        System.out.println("host = "+tuto.getHost());
//        System.out.println("filename = "+tuto.getFile());
//        System.out.println("port = "+tuto.getPort());
//        System.out.println("ref = "+tuto.getRef());
//        System.out.println("Userinfo = "+tuto.getUserInfo());
//
        //get www source
//        URL tric = new URL("http://www.hzau.edu.cn/wzts.htm");
//        BufferedReader in = new BufferedReader( new InputStreamReader(tric.openStream()));
//        String inputline;
//        while ((inputline = in.readLine()) != null){
//            System.out.println(inputline);
//        }
//        in.close();

        //connect network
        try{
            URL url = new URL("http://www.hzau.edu.cn/wzts.htm");
            URLConnection con = url.openConnection();
            DataInputStream dis = new DataInputStream(con.getInputStream());
            PrintStream ps = new PrintStream(con.getOutputStream());
            con.setDoOutput(true);
            String line = dis.readLine();
            ps.println("client****************");
            }catch (MalformedURLException e ){
            System.out.println("URl expection");
        }

    }
}
