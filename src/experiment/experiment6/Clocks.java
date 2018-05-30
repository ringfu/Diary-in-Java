package experiment.experiment6;
import experiment.experiment5.RunnableTest1;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.applet.*;

public class Clocks extends Applet {
    private int R = 100;  //半径50
    private  int gap = 10;  //两个圆之间间隔
    Thread[] threads = new Thread[5]; //五个时钟的线程
    double stander = 0; //标准时间

    public void start(){
        for (int i = 0; i < 5; i++){
            if(threads[i] == null){
                int finalI = i;
                threads[i] = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (threads[finalI] != null){
                            repaint();
                            stander++; //秒数加1， 表示角度加1
                            try{
                            threads[finalI].sleep(1000); //drawEarth线程休眠 50ms， 表现出来就是画的缓慢些
                       }catch(InterruptedException e){}
                        }
                    }
                });
                threads[i].start(); //启动线程
            }
        }
    }

    public void drawClock(Graphics g,int x, int y, double time_s){
        g.drawOval(x,y,2*R,2*R);  //画时钟的表盘
        for (int i = 0; i < 360; i = i+30){
            double radian = Math.toRadians(i);
            double x1 = (int)(R)*Math.sin(radian)+(x+R);
            double y1 = (int)(R)*Math.cos(radian)+(y+R+gap);
            g.drawString("*",(int)x1,(int)y1);
        }
        double d = time_s%43200;//用秒表示的时间,每秒钟一度。
        double radian_h= Math.toRadians(d/30); //小时的度数表示
        int x_h = (int)(1.0/3 * R*Math.sin(radian_h) + x+R);
        int y_h = (int)(-1.0/3 * R*Math.cos(radian_h) + y+R);
        g.drawLine(x+R, y+R, x_h,y_h); //hour pointer


        double radian_m= Math.toRadians(d/6);
        int x_m = (int)(2.0/3 * R*Math.sin(radian_m) +x+R);
        int y_m = (int)(-2.0/3 * R*Math.cos(radian_m) + y+R);
        g.drawLine(x+R, y+R, x_m,y_m); //minute pointer


        double radian_s= Math.toRadians(d);
        int x_s = (int)(R*Math.sin(radian_s) +R+x);
        int y_s = (int)(-R*Math.cos(radian_s) + y+R);
        g.drawLine(x+R, y+R, x_s,y_s); //second pointer
    }
    /*
    double stander = 0; //标准时间
    double _beijin = stander;
    double _london = stander+ 7200;
    double _sidney = stander + 10800;
    double _paris = stander + 14400;
    double _maldives = stander + 18000;*/
      public void paint(Graphics g){
          drawClock(g,0,0,stander);  //画北京的时钟
          g.drawString("BeiJin",0+gap,2*R+gap);

          drawClock(g,2*R+gap,0,stander+7200);
          g.drawString("London",2*R+2*gap,2*R+gap);

          drawClock(g,4*R+2*gap,0,stander+10800);
          g.drawString("Sidney",4*R+3*gap,2*R+gap);

          drawClock(g,6*R+3*gap,0,stander+14400);
          g.drawString("Paris",6*R+4*gap,2*R+gap);

          drawClock(g,8*R+4*gap,0,stander+18000);
          g.drawString("Maldives",8*R+5*gap,2*R+gap);
      }

      public void stop(){
        for (int i = 0; i < 5; i++){
            threads[i].stop();
            threads[i] = null;
        }
      }
}
