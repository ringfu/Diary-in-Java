package chapter11;

import java.awt.*;


public class LayoutTest {
   public static void main(String[] args) {

        Frame frame = new Frame("flow layout test");
        Button button1 = new Button("button one");
        Button button2 = new Button("button two");
        Button button3 = new Button("button three");
        Button button4 = new Button("button  four");
        Button button5 = new Button("button five");

//        frame.add(button1);
//        frame.add(button2);
//        frame.add(button3);
//        frame.setLayout(new FlowLayout());
       //fy: FlowLayout 流式布局，是Panel及其子类的默认布局：按加入顺序从左到右，排满一行换行
//        frame.setLayout(new BorderLayout());
//       frame.add(button1,"North");
//       frame.add(button2,"West");
//       frame.add(button3,"East");
//       frame.add(button5,"Center");
       //fy: BorderLayout 边界布局：将容器划分为N,S,W,E，Center五个区域，在加入组件时需指定位置，默认加入Center， 并且可以覆盖

//       frame.setLayout(new GridLayout(2,3));
//       frame.add(button1);
//       frame.add(button2);
//       frame.add(button3);
//       frame.add(button4);
//       frame.add(button5);
//       frame.pack();
       //fy: GridLayout 网格布局

       CardLayout c = new CardLayout();
       frame.setLayout(c);
       Label lable[] = new Label[4];
       for(int i = 0; i < 4; i++){
           lable[i] = new Label("the " + (int)(i+1) + "card");
           frame.add(lable[i],"card"+i);
       }
       lable[0].setBackground(Color.GREEN);
       lable[1].setBackground(Color.BLUE);
       lable[2].setBackground(Color.CYAN);
       lable[3].setBackground(Color.ORANGE);

       frame.setSize(100,70);
        frame.setLocation(250,250);
        frame.setVisible(true);
        while (true){
            try{
                Thread.sleep(1000);  //进程睡眠1000毫秒， 即保持页面1000毫秒
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            c.next(frame);
        }
    }

}

/*
* 笔记：
* 1,FlowLayout 流式布局，是Panel及其子类的默认布局：按加入顺序从左到右，排满一行换行
*   public FlowLayout(), 创建FlowLayout布局管理对象，默认居中对齐，组件间水平和垂直方向默认间隔5像素
*   public FlowLayout(int align) , 显示设置对齐方式align
*   public FlowLayout(int align, int hgap, int vgap), 显示设置对齐方式align，水平和垂直间隔
* 2，BorderLayout 边界布局：将容器划分为N,S,W,E，Center五个区域，在加入组件时需指定位置，默认加入Center， 并且可以覆盖
*   public BorderLayout(), 构造BorderLayout布局管理对象，边界间隔0
*   public BorderLayout(int hgap, int vgap), 显示说明组件间隔
* 3，GridLayout 网格布局：将容器划分为规格相等的网格，组件依次放入，一行满了换行
*   public GridLayout(),默认一行
*   public GridLayout(int rows,int cols), 显示说明rows行，cols列
*   public GridLayout(int rows, int cols, int hgap, int vgap), 显示说明行列数和组件间隔
*   如果组件个数多余网格个数，则保持网格行数不变，自动调整列数
* 4，CardLayout 卡片布局：效果为:多个组件在同一容器内交替显示，只有一个组件可见
*   public void first(Container container),显示指定容器container的第一个组件
*   public void last(Container container)
*   public void previous(Container container),显示当前组件的前一个组件，若当前是第一个，则显示最后一个
*   public void show(Container container),显示当前组件
*   */