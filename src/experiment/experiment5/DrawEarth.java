package experiment.experiment5;

import javafx.application.Application;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.desktop.AppEvent;

public class DrawEarth extends Applet{
    public void paint(Graphics g)  {

        //g.drawOval(10,210,70,40);  //draw a oval and para:(x,y,width,height)
        for(double d = 0; ; d++){
            double radian = Math.toRadians(d % 360);
            double x = 100*Math.sin(radian)+150;
            double y = 100*Math.cos(radian)+100;
            g.drawOval((int)x , (int)y,20,20);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
//            g.drawOval((int)x , (int)y,20,20);
        }

    }

}

/*
* import java.applet.Applet;
import java.awt.Graphics;

public class DrawCircle extends Applet {
	public void  draw(Graphics g){
		for(double d = 0; d < 360; d = d+ 10){
			double radian = Math.toRadians(d);
			double x = 50*Math.sin(radian)+60;
			double y = 50*Math.cos(radian)+70;
//			System.out.println(x + "," + y);
			g.drawString("*",(int)x , (int)y);
		}
	}
}

package experimentThree;

import java.awt.*;
import java.applet.*;
import java.applet.Applet;
public class Draw extends Applet {
	public void paint(Graphics g)  {
		g.drawLine(30,10,60,20);   //para: (x1,y1,x2,y2)
		g.drawRect(10,30,50,20);    //para: (x,y,width,height)
		g.fillRect(10,60,50, 20);    //para: (x,y,width,height), and the result is a rectangle filed with black.
		g.drawRoundRect(10,90,50,50,10,10);   //para: (x,y,width,height,arcwidth,archeight)
		g.fill3DRect(10,150,50,50,true);    //para: (x,y,width,height,raised), and the result is a 3D rectangle filled with black.
		g.drawOval(10,210,70,40);  //draw a oval and para:(x,y,width,height)
		g.fillOval(10,260,70,40);
		g.drawOval(10,310,50,40);
		g.fillOval(10,360,50,40);
		drawMyPolygon(g); //use x[] and y[] point collection to draw some lines to form a graph
		g.drawOval(10,490,40,40); //draw a circle
	}
	public void drawMyPolygon(Graphics g)     {
		int[] x={10,50,20,30,40};
		int[] y={450,450,480,430,480};
		g.drawPolygon(x , y, 5);
	}
}


* */