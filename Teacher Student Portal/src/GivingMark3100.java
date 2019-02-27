
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class GivingMark3100 extends JFrame {
    
    
    //JPanel panel1 = new JPanel();
   
    

    private Container c;
    private JLabel title, sid, quiz, attendance, Final,online,offline,mid,project;
    private JScrollPane scroll;
    private JPanel panel;

    private JLabel[] sid1 = new JLabel[100];
    private JTextField[] attendance1 = new JTextField[100];
    private JTextField[] online1 = new JTextField[100];
    private JTextField[] offline1 = new JTextField[100];
    private JTextField[] mid1 = new JTextField[100];
    private JTextField[] project1 = new JTextField[100];
    
    private JButton button;

    static Vector<String> vec = new Vector<String>();
    static private String ara[][] = new String[50][50];
    static int y = 50;
    static int y1 = 80;
    static int ind = 0;
    private Component jframe;

    public void myStudent(Vector<String> v1) {
        vec = v1;
        System.out.println("hi ami vector er size: " + vec.size());
    }

    GivingMark3100() {
        // myStudent(vec);
        initComponents();

    }
    
    
    

    public void initComponents() {
        

        this.setBounds(150, 140, 1020, 540);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
      
        c = this.getContentPane();
        c.setLayout(null);

        title = new JLabel("Mark Distribution Of CSE3100");
        title.setBounds(340, 5, 400, 80);
        title.setFont(new Font("Courier New", Font.BOLD, 16));
        title.setForeground(Color.DARK_GRAY);
        c.add(title);

        sid = new JLabel("Student Id");
        sid.setBounds(80, 50, 150, 80);
        sid.setFont(new Font("Courier New", Font.BOLD, 16));
        sid.setForeground(Color.BLUE);
        c.add(sid);

        attendance = new JLabel("Attendance(10)");
        attendance.setBounds(300, 50, 140, 80);
        attendance.setFont(new Font("Courier New", Font.BOLD, 16));
        attendance.setForeground(Color.BLUE);
        c.add(attendance);

        online = new JLabel("Online(20)");
        online.setBounds(470, 50, 110, 80);
        online.setFont(new Font("Courier New", Font.BOLD, 16));
        online.setForeground(Color.BLUE);
        c.add(online);

        offline = new JLabel("Offline(20)");
        offline.setBounds(600, 50, 110, 80);
        offline.setFont(new Font("Courier New", Font.BOLD, 16));
        offline.setForeground(Color.BLUE);
        c.add(offline);
        
        mid = new JLabel("Mid(20)");
        mid.setBounds(740, 50, 80, 80);
        mid.setFont(new Font("Courier New", Font.BOLD, 16));
        mid.setForeground(Color.BLUE);
        c.add(mid);
        
        project = new JLabel("Project(30)");
        project.setBounds(840, 50, 110, 80);
        project.setFont(new Font("Courier New", Font.BOLD, 16));
        project.setForeground(Color.BLUE);
        c.add(project);

        Iterator i = vec.iterator();

        System.out.println("Hello Shohag");

        System.out.println("size: " + vec.size());

        while (i.hasNext()) {

            String _sid = (String) i.next();

            sid1[ind] = new JLabel(_sid);
            sid1[ind].setBounds(80, y + 55, 150, 80);
            sid1[ind].setFont(new Font("Courier New", Font.BOLD, 16));
            sid1[ind].setForeground(Color.black);
            c.add(sid1[ind]);

            attendance1[ind] = new JTextField();
            attendance1[ind].setBounds(320, y1 + 50, 60, 35);
            attendance1[ind].setFont(new Font("Courier New", Font.BOLD, 16));
            attendance1[ind].setForeground(Color.black);
            c.add(attendance1[ind]);

            online1[ind] = new JTextField();
            online1[ind].setBounds(470, y1 + 50, 70, 35);
            online1[ind].setFont(new Font("Courier New", Font.BOLD, 16));
            online1[ind].setForeground(Color.black);
            c.add(online1[ind]);

            offline1[ind] = new JTextField();
            offline1[ind].setBounds(610, y1 + 50, 70, 35);
            offline1[ind].setFont(new Font("Courier New", Font.BOLD, 16));
            offline1[ind].setForeground(Color.black);
            c.add(offline1[ind]);
            
            
            mid1[ind] = new JTextField();
            mid1[ind].setBounds(740, y1 + 50, 70, 35);
            mid1[ind].setFont(new Font("Courier New", Font.BOLD, 16));
            mid1[ind].setForeground(Color.black);
            c.add(mid1[ind]);
            
            
            project1[ind] = new JTextField();
            project1[ind].setBounds(870, y1 + 50, 70, 35);
            project1[ind].setFont(new Font("Courier New", Font.BOLD, 16));
            project1[ind].setForeground(Color.black);
            c.add(project1[ind]);

            y = y + 50;
            y1 = y1 + 50;
            ind++;
        }

        button = new JButton("INSERT");
        button.setBounds(390, 440, 120, 40);
        button.setFont(new Font("Courier New", Font.BOLD, 16));
        button.setForeground(Color.BLUE);
        c.add(button);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                System.out.println("IND here: " + ind);

                for (int ii = 0, k = 0; ii < ind; ii++, k++) {

                    for (int j = 0; j < 6; j++) {

                        String temp = (String) sid1[k].getText();
                        ara[ii][j] = temp;
                        System.out.println("id: " + ara[ii][j]);

                        j++;
                        String temp1 = (String) attendance1[k].getText();
                        ara[ii][j] = temp1;
                        System.out.println("attendance: " + ara[ii][j]);

                        j++;
                        String temp2 = (String) online1[k].getText();
                        ara[ii][j] = temp2;
                        System.out.println("online: " + ara[ii][j]);

                        j++;
                        String temp3 = (String) offline1[k].getText();
                        ara[ii][j] = temp3;
                        System.out.println("offline: " + ara[ii][j]);
                        
                        j++;
                        String temp4 = (String) mid1[k].getText();
                        ara[ii][j] = temp4;
                        System.out.println("mid: " + ara[ii][j]);
                        
                        j++;
                        String temp5 = (String) project1[k].getText();
                        ara[ii][j] = temp5;
                        System.out.println("project: " + ara[ii][j]);

                    }
                }

                /*System.out.println("\n\nami ind: " + ind);

                for (int ii = 0; ii < ind; ii++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.println("\n\nid: " + ara[ii][j]);
                        j++;
                        System.out.println("quiz: " + ara[ii][j]);
                        j++;
                        System.out.println("attendance: " + ara[ii][j]);
                        j++;
                        System.out.println("final: " + ara[ii][j]);
                    }
                }*/

                for (int ii = 0; ii < ind; ii++) {

                    MyDatabaseHandler db = new MyDatabaseHandler();
                    db.connectDatabase();

                    String iid = ara[ii][0];
                    String aattendance = ara[ii][1];
                    String oonline = ara[ii][2];
                    String ooffline = ara[ii][3];
                    String mid = ara[ii][4];
                    String project = ara[ii][5];

                    System.out.println("iid: " + iid);
                    System.out.println("aattendance: " + aattendance);
                    System.out.println("oonline: " + oonline);
                    System.out.println("ooffline: " + ooffline);
                    System.out.println("mid: " + mid);
                    System.out.println("project: " + project);

                    
                    int aattendance1 = Integer.parseInt(aattendance);
                    int online1 = Integer.parseInt(oonline);
                    int offline1 = Integer.parseInt(ooffline);
                    int mid1 = Integer.parseInt(mid);
                    int project1 = Integer.parseInt(project);

                    

                    int total_mark = aattendance1 + online1 + offline1 + mid1 + project1;

                    String grade = "";
                    double gpa = 0.00;

                    if (total_mark < 40) {
                        grade = "F";
                        gpa = 0.00;
                    } else if (total_mark >= 40 && total_mark < 45) {

                        grade = "D";
                        gpa = 2.00;
                    } else if (total_mark >= 45 && total_mark < 50) {

                        grade = "C";
                        gpa = 2.25;
                    } else if (total_mark >= 50 && total_mark < 55) {

                        grade = "C+";
                        gpa = 2.50;
                    } else if (total_mark >= 55 && total_mark < 60) {

                        grade = "B-";
                        gpa = 2.75;
                    } else if (total_mark >= 60 && total_mark < 65) {

                        grade = "B";
                        gpa = 3.00;
                    } else if (total_mark >= 65 && total_mark < 70) {
                        grade = "B+";
                        gpa = 3.25;
                    } else if (total_mark >= 70 && total_mark < 75) {
                        grade = "A-";
                        gpa = 3.50;
                    } else if (total_mark >= 75 && total_mark < 80) {
                        grade = "A";
                        gpa = 3.75;
                    } else if (total_mark >= 80 && total_mark <= 100) {
                        grade = "A+";
                        gpa = 4.00;

                    }

                    System.out.println("oboseshe aici");
                    db.insertMarkcse3100(iid, aattendance1, online1, offline1, mid1, project1, grade,gpa, total_mark);
                }
            }
        });

        System.out.println("IND: " + ind);
        int ind1 = 0;
    }
    
    

    public static void main(String[] args) {
        GivingMark3100 f1 = new GivingMark3100();
        
        
        
       
    }
}
