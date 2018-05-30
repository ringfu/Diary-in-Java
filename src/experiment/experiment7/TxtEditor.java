package experiment.experiment7;

import javax.swing.event.InternalFrameAdapter;
import java.awt.*;
import java.awt.desktop.SystemEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.sql.BatchUpdateException;

public class TxtEditor {
    Frame f = new Frame("Txt Editor");
    MenuBar mb = new MenuBar();
    TextArea textArea = new TextArea("hello world",40,60,TextArea.SCROLLBARS_BOTH);
    public void init(){
        f.setVisible(true);
        f.setLayout(new BorderLayout());
        f.setSize(800,500);
        f.setLocation(200,200);
        //menubar
        f.setMenuBar(mb);
        // "File" menu
        Menu file = new Menu("File");
        // 'New' item
        MenuItem file_new = new MenuItem("New");
        file_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                init();
            }
        });
        file.add(file_new);
        //'Open' item
        MenuItem file_open = new MenuItem("Open");
        file_open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(" open file");
                FileDialog fileDialog = new FileDialog(f,"Open file",FileDialog.LOAD);
                fileDialog.setVisible(true);
                if (fileDialog.getFile() != null){
                    String pathname = fileDialog.getDirectory()+fileDialog.getFile();
                    int c =0;
                        try{
                            FileInputStream rf = new FileInputStream(pathname);
                            byte buffer[] = new byte[512];
                            while ((c = rf.read(buffer,0,512)) != -1){
                                textArea.setText(new String(buffer,0,c));
                            }
                        } catch (Exception e1) {
                            System.out.println("filed to open this file");
                        }
                }
            }
        });
        file.add(file_open);

        MenuItem file_save = new MenuItem("Save");
        file_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("save file");
                FileDialog fileDialog = new FileDialog(f,"Save file",FileDialog.SAVE);
                fileDialog.setVisible(true);
                String pathname = new String(fileDialog.getDirectory()+fileDialog.getFile());
                File file = new File(pathname);
                try {
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(textArea.getText());
                    writer.flush();
                    writer.close();
                }catch (Exception ex){
                    System.out.println("filed to write file !");
                }

            }
        });
        file.add(file_save);

        file.add(new MenuItem("-"));

        MenuItem file_exit = new MenuItem("Exit");
        file_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("exit file");
                System.exit(0);
            }
        });
        file.add(file_exit);

        //"File" menu
        Menu edit = new Menu("Edit");
        MenuItem edit_find = new MenuItem("Find");
        edit_find.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame _find = new Frame("Find");
                _find.setVisible(true);
                _find.setLocation(f.getX()+100,f.getY()+100);
                TextField find_TextFile = new TextField();
                find_TextFile.setVisible(true);
                Button find_button = new Button("find");
                _find.setLayout(new FlowLayout());
                _find.add(find_TextFile);
                _find.add(find_button);
            }
        });
        edit.add(new MenuItem("Find"));
        edit.add(new MenuItem("Select all"));
        edit.add(new MenuItem("Copy"));
        edit.add(new MenuItem("Cut"));
        edit.add(new MenuItem("Paste"));

        Menu format = new Menu("Format");
        format.add(new MenuItem("Wrap"));
        format.add(new MenuItem("Font"));

        Menu help = new Menu("Help");
        help.add(new MenuItem("How to use TxtEditor"));
        help.add(new MenuItem("Connect us"));

        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(help);

        f.add(textArea);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("exit --1");
                Frame alarm = new Frame("Alarm !");
                alarm.setVisible(true);
                alarm.setSize(200,100);
                alarm.setLocation(f.getX()+200,f.getY()+200);
                TextField t = new TextField("do you want to save your change ?");
                Panel p = new Panel();
                p.setVisible(true);
                p.setLayout(new FlowLayout());
                Button yes = new Button("YES");
                yes.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("save file");
                        FileDialog fileDialog = new FileDialog(f,"Save file",FileDialog.SAVE);
                        fileDialog.setVisible(true);
                        String pathname = new String(fileDialog.getDirectory()+fileDialog.getFile());
                        File file = new File(pathname);
                        try {
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                            writer.write(textArea.getText());
                            writer.flush();
                            writer.close();
                        }catch (Exception ex){
                            System.out.println("filed to write file !");
                        }
                        alarm.dispose();
                        System.exit(0);

                    }
                });
                Button no = new Button("NO");
                no.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("don't save the change, exit");
                        alarm.dispose();
                        System.exit(0);
                    }
                });
                Button cancle = new Button("CANCLE");
                cancle.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("cancle change the change");
                            alarm.dispose();
                    }
                });
                p.add(yes);
                p.add(no);
                p.add(cancle);
                alarm.add(t,BorderLayout.NORTH);
                alarm.add(p,BorderLayout.SOUTH);
                System.out.println("exit --2");
//                ((Window)e.getComponent()).dispose();
                //System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        TxtEditor editor = new TxtEditor();
        editor.init();
    }

//    private class ItemListener implements ActionListener{
//        private void _new(){
//
//        }
//        public void actionPerformed(ActionEvent actionEvent){
//            String command = actionEvent.getActionCommand();
//            if (command == "New"){
//                textArea.setText("******* New file ********");
//                _new();
//            }
//        }
//    }
//


}
