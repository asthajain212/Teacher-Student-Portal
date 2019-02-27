
import java.awt.Color;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class GivingMark3107 extends JFrame {

    private Container c;
    private JLabel title, sid, quiz, attendance, Final;
    private JScrollPane scroll;
    private JPanel panel;

    private JLabel[] sid1 = new JLabel[100];
    private JTextField[] quiz1 = new JTextField[100];
    private JTextField[] attendance1 = new JTextField[100];
    private JTextField[] Final1 = new JTextField[100];
    private JButton button;

    static Vector<String> vec = new Vector<String>();
    static private String ara[][] = new String[50][50];
    static int y = 50;
    static int y1 = 80;
    static int ind = 0;

    public void myStudent(Vector<String> v1) {
        vec = v1;
        System.out.println("hi ami vector er size: " + vec.size());
    }

    GivingMark3107() {
        // myStudent(vec);
        initComponents();

    }

    public void initComponents() {

        this.setBounds(240, 140, 800, 540);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
       

        c = this.getContentPane();
        c.setLayout(null);

        title = new JLabel("Mark Distribution Of CSE3107");
        title.setBounds(240, 5, 400, 80);
        title.setFont(new Font("Courier New", Font.BOLD, 16));
        title.setForeground(Color.DARK_GRAY);
        c.add(title);

        sid = new JLabel("Student Id");
        sid.setBounds(80, 50, 150, 80);
        sid.setFont(new Font("Courier New", Font.BOLD, 16));
        sid.setForeground(Color.BLUE);
        c.add(sid);

        quiz = new JLabel("Quiz(20)");
        quiz.setBounds(310, 50, 80, 80);
        quiz.setFont(new Font("Courier New", Font.BOLD, 16));
        quiz.setForeground(Color.BLUE);
        c.add(quiz);

        attendance = new JLabel("Attendance(10)");
        attendance.setBounds(420, 50, 140, 80);
        attendance.setFont(new Font("Courier New", Font.BOLD, 16));
        attendance.setForeground(Color.BLUE);
        c.add(attendance);

        Final = new JLabel("Final(70)");
        Final.setBounds(600, 50, 100, 80);
        Final.setFont(new Font("Courier New", Font.BOLD, 16));
        Final.setForeground(Color.BLUE);
        c.add(Final);

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

            quiz1[ind] = new JTextField();
            quiz1[ind].setBounds(300, y1 + 50, 60, 35);
            quiz1[ind].setFont(new Font("Courier New", Font.BOLD, 16));
            quiz1[ind].setForeground(Color.black);
            c.add(quiz1[ind]);

            attendance1[ind] = new JTextField();
            attendance1[ind].setBounds(440, y1 + 50, 70, 35);
            attendance1[ind].setFont(new Font("Courier New", Font.BOLD, 16));
            attendance1[ind].setForeground(Color.black);
            c.add(attendance1[ind]);

            Final1[ind] = new JTextField();
            Final1[ind].setBounds(590, y1 + 50, 70, 35);
            Final1[ind].setFont(new Font("Courier New", Font.BOLD, 16));
            Final1[ind].setForeground(Color.black);
            c.add(Final1[ind]);

            y = y + 50;
            y1 = y1 + 50;
            ind++;
        }

        button = new JButton("INSERT");
        button.setBounds(320, 440, 120, 40);
        button.setFont(new Font("Courier New", Font.BOLD, 16));
        button.setForeground(Color.BLUE);
        c.add(button);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                System.out.println("IND here: " + ind);

                for (int ii = 0, k = 0; ii < ind; ii++, k++) {

                    for (int j = 0; j < 4; j++) {

                        String temp = (String) sid1[k].getText();
                        ara[ii][j] = temp;
                        System.out.println("id: " + ara[ii][j]);

                        j++;
                        String temp1 = (String) quiz1[k].getText();
                        ara[ii][j] = temp1;
                        System.out.println("quiz: " + ara[ii][j]);

                        j++;
                        String temp2 = (String) attendance1[k].getText();
                        ara[ii][j] = temp2;
                        System.out.println("attendance: " + ara[ii][j]);

                        j++;
                        String temp3 = (String) Final1[k].getText();
                        ara[ii][j] = temp3;
                        System.out.println("final: " + ara[ii][j]);

                    }
                }

                System.out.println("\n\nami ind: " + ind);

                for (int ii = 0; ii < ind; ii++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.println("\n\nid: " + ara[ii][j]);
                        j++;
                        System.out.println("quiz: " + ara[ii][j]);
                        j++;
                        System.out.println("attendance: " + ara[ii][j]);
                        j++;
                        System.out.println("final: " + ara[ii][j]);
                    }
                }

                for (int ii = 0; ii < ind; ii++) {

                    MyDatabaseHandler db = new MyDatabaseHandler();
                    db.connectDatabase();

                    String iid = ara[ii][0];
                    String qquiz = ara[ii][1];
                    String aattendance = ara[ii][2];
                    String ffinal = ara[ii][3];

                    System.out.println("iid: " + iid);
                    System.out.println("qquiz: " + qquiz);
                    System.out.println("aattendance: " + aattendance);
                    System.out.println("ffinal: " + ffinal);

                    int qquiz1 = Integer.parseInt(qquiz);
                    int aattendance1 = Integer.parseInt(aattendance);

                    int ffinal1 = Integer.parseInt(ffinal);

                    int total_mark = qquiz1 + aattendance1 + ffinal1;

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
                    db.insertMarkcse3107(iid, qquiz1, aattendance1, ffinal1, grade, gpa, total_mark);
                }
            }
        });

        System.out.println("IND: " + ind);
        int ind1 = 0;
    }

    public static void main(String[] args) {
        
        GivingMark3107 f1 = new GivingMark3107();
    }
}
