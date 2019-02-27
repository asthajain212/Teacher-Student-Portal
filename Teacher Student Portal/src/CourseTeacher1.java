
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class CourseTeacher1 extends JFrame{
    
    private Container c;
    private JLabel title;
    
    private JButton labelcs3101,labelcs3103,labelcs3107,labelcs3109,labelhm3115;
    private JButton labelcs3100,labelcs3104,labelcs3108,labelcs3110;
    
    private JLabel labelTheory,labelLab;
    private JLabel labelhm1,labelcst1,labelcst2,labelcst3,labelcst4;
    private JLabel labelcsl1,labelcsl2,labelcsl3,labelcsl4;
    private ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9;
    private Font f;
    static int x = 30;
    static int x1 = 30;
    static int xt = 30;
    static int xl = 30;
    
    static Vector<String> vec = new Vector<String>();
    
    public void getStudent(Vector<String> v1){
        
        vec = v1;
    }
    
    CourseTeacher1(){
        initComponents();
    }
    
    public void initComponents(){
        
        //this.setVisible(true);
        this.setBounds(240, 140, 800, 540);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        c = this.getContentPane();
        c.setLayout(null);
        
        title = new JLabel("This Courses are Enroled by You Teacher");
        title.setBounds(170, 20, 400, 80);
        title.setFont(new Font("Courier New", Font.BOLD, 16));
        title.setForeground(Color.DARK_GRAY);
        c.add(title); 
    }
    
    public void funcSetInfo(String name,String course){
        
         int ft,fl;
         ft = fl = 0;
         
         System.out.println("ami ekhane");

         if(course.equals("HUM3115")){
             
             System.out.println("hey ami ekhane");
              
             img1 = new ImageIcon(getClass().getResource("hum3115.png"));
             
             labelhm3115 = new JButton(img1);
             labelhm3115.setBounds(x+150, 100, img1.getIconWidth(), img1.getIconHeight());
             c.add(labelhm3115);
             
             labelhm1 = new JLabel();
             labelhm1.setBounds(xt+160, 210, 80, 40);
             labelhm1.setText("HUM3115");
             labelhm1.setFont(new Font("Courier New", Font.BOLD, 16));
             labelhm1.setForeground(Color.RED);
             c.add(labelhm1);
             
             x = x+150;
             ft = 1;
             xt = xt+160;
             
              labelhm3115.addActionListener(new ActionListener(){
                 
                 public void actionPerformed(ActionEvent e) {
                     
                     MyDatabaseHandler db = new MyDatabaseHandler();
                     db.connectDatabase();
                     
                     ResultSet rs = db.gettingQueryhum3115();
                     db.gettingStudent3115(rs);
                     

                     GivingMark3115 mark3115 = new GivingMark3115();
                     //mark3101.myStudent(vec);
                     mark3115.setVisible(true);
                     
                     dispose();
                 }
             });
         }
         
         if(course.equals("CSE3101")){
              
             img2 = new ImageIcon(getClass().getResource("cse3101.jpg"));
             
             labelcs3101 = new JButton(img2);
             labelcs3101.setBounds(x+150, 100, img2.getIconWidth(), img2.getIconHeight());
             c.add(labelcs3101);
             
             labelcst1 = new JLabel();
             labelcst1.setBounds(xt+160, 210, 80, 40);
             labelcst1.setText("CSE3101");
             labelcst1.setFont(new Font("Courier New", Font.BOLD, 16));
             labelcst1.setForeground(Color.RED);
             c.add(labelcst1);
             
             x = x+150;
             ft = 1;
             xt = xt+160;
             
             labelcs3101.addActionListener(new ActionListener(){
                 
                 public void actionPerformed(ActionEvent e) {
                     
                     MyDatabaseHandler db = new MyDatabaseHandler();
                     db.connectDatabase();
                     
                     ResultSet rs = db.gettingQuerycse3101();
                     db.gettingStudent3101(rs);

                      
                     GivingMark3101 mark3101 = new GivingMark3101();
                     //mark3101.myStudent(vec);
                     mark3101.setVisible(true);
                     
                     dispose();
                 }
             });
         }
         
         if(course.equals("CSE3103")){
              
             img3 = new ImageIcon(getClass().getResource("cse3103.jpg"));
             
             labelcs3103 = new JButton(img3);
             labelcs3103.setBounds(x+150, 100, img3.getIconWidth(), img3.getIconHeight());
             c.add(labelcs3103);
             
             labelcst2 = new JLabel();
             labelcst2.setBounds(xt+160, 210, 80, 40);
             labelcst2.setText("CSE3103");
             labelcst2.setFont(new Font("Courier New", Font.BOLD, 16));
             labelcst2.setForeground(Color.RED);
             c.add(labelcst2);
             
             x = x+150;
             ft = 1;
             xt = xt+160;
             
              labelcs3103.addActionListener(new ActionListener(){
                 
                 public void actionPerformed(ActionEvent e) {
                     
                     MyDatabaseHandler db = new MyDatabaseHandler();
                     db.connectDatabase();
                     
                     ResultSet rs = db.gettingQuerycse3103();
                     db.gettingStudent3103(rs);

                     GivingMark3103 mark3103 = new GivingMark3103();
                     //mark3101.myStudent(vec);
                     mark3103.setVisible(true);
                     
                     dispose();
                 }
             });
         }
         
         if(course.equals("CSE3107")){
              
             img4 = new ImageIcon(getClass().getResource("cse3107.jpg"));
             
             labelcs3107 = new JButton(img4);
             labelcs3107.setBounds(x+150, 100, img4.getIconWidth(), img4.getIconHeight());
             c.add(labelcs3107);
             
             labelcst3 = new JLabel();
             labelcst3.setBounds(xt+160, 210, 80, 40);
             labelcst3.setText("CSE3107");
             labelcst3.setFont(new Font("Courier New", Font.BOLD, 16));
             labelcst3.setForeground(Color.RED);
             c.add(labelcst3);
             
             x = x+150;
             ft = 1;
             xt = xt+160;
             
             labelcs3107.addActionListener(new ActionListener(){
                 
                 public void actionPerformed(ActionEvent e) {
                     
                     MyDatabaseHandler db = new MyDatabaseHandler();
                     db.connectDatabase();
                     
                     ResultSet rs = db.gettingQuerycse3107();
                     db.gettingStudent3107(rs);

                     GivingMark3107 mark3107 = new GivingMark3107();
                     //mark3101.myStudent(vec);
                     mark3107.setVisible(true);
                     
                     dispose();
                 }
             });
         }
         
         if(course.equals("CSE3109")){
              
             img5 = new ImageIcon(getClass().getResource("cse3109.png"));
             
             labelcs3109 = new JButton(img5);
             labelcs3109.setBounds(x+150, 100, img5.getIconWidth(), img5.getIconHeight());
             c.add(labelcs3109);
             
             labelcst4 = new JLabel();
             labelcst4.setBounds(xt+160, 210, 80, 40);
             labelcst4.setText("CSE3109");
             labelcst4.setFont(new Font("Courier New", Font.BOLD, 16));
             labelcst4.setForeground(Color.RED);
             c.add(labelcst4);
             
             x = x+150;
             ft = 1;
             xt = xt+160;
             
             labelcs3109.addActionListener(new ActionListener(){
                 
                 public void actionPerformed(ActionEvent e) {
                     
                     MyDatabaseHandler db = new MyDatabaseHandler();
                     db.connectDatabase();
                     
                     ResultSet rs = db.gettingQuerycse3109();
                     db.gettingStudent3109(rs);

                     GivingMark3109 mark3109 = new GivingMark3109();
                     //mark3101.myStudent(vec);
                     mark3109.setVisible(true);
                     
                     dispose();
                 }
             });
         }
         
         if(course.equals("CSE3100")){
              
             img6 = new ImageIcon(getClass().getResource("cse3100.jpg"));
             
             labelcs3100 = new JButton(img6);
             labelcs3100.setBounds(x1+150, 280, img6.getIconWidth(), img6.getIconHeight());
             c.add(labelcs3100);
             
             labelcsl1 = new JLabel();
             labelcsl1.setBounds(xl+160, 390, 80, 40);
             labelcsl1.setText("CSE3100");
             labelcsl1.setFont(new Font("Courier New", Font.BOLD, 16));
             labelcsl1.setForeground(Color.RED);
             c.add(labelcsl1);
             
             x1 = x1+150;
             fl = 1;
             xl = xl+160;
             
             labelcs3100.addActionListener(new ActionListener(){
                 
                 public void actionPerformed(ActionEvent e) {
                     
                     MyDatabaseHandler db = new MyDatabaseHandler();
                     db.connectDatabase();
                     
                     ResultSet rs = db.gettingQuerycse3100();
                     db.gettingStudent3100(rs);

                     GivingMark3100 mark3100 = new GivingMark3100();
                     //mark3101.myStudent(vec);
                     mark3100.setVisible(true);
                     
                     dispose();
                 }
             });
         }
         
         if(course.equals("CSE3104")){
              
             img7 = new ImageIcon(getClass().getResource("cse3104.jpg"));
             
             labelcs3104 = new JButton(img7);
             labelcs3104.setBounds(x1+150, 280, img7.getIconWidth(), img7.getIconHeight());
             c.add(labelcs3104);
             
             labelcsl2 = new JLabel();
             labelcsl2.setBounds(xl+160, 390, 80, 40);
             labelcsl2.setText("CSE3104");
             labelcsl2.setFont(new Font("Courier New", Font.BOLD, 16));
             labelcsl2.setForeground(Color.RED);
             c.add(labelcsl2);
             
             x1 = x1+150;
             fl = 1;
             xl = xl+160;
             
             labelcs3104.addActionListener(new ActionListener(){
                 
                 public void actionPerformed(ActionEvent e) {
                     
                     MyDatabaseHandler db = new MyDatabaseHandler();
                     db.connectDatabase();
                     
                     ResultSet rs = db.gettingQuerycse3104();
                     db.gettingStudent3104(rs);

                     GivingMark3104 mark3104 = new GivingMark3104();
                     //mark3101.myStudent(vec);
                     mark3104.setVisible(true);
                     
                     dispose();
                 }
             });
         }
         
         if(course.equals("CSE3108")){
              
             img8 = new ImageIcon(getClass().getResource("cse3108.jpg"));
             
             labelcs3108 = new JButton(img8);
             labelcs3108.setBounds(x1+150, 280, img8.getIconWidth(), img8.getIconHeight());
             c.add(labelcs3108);
             
             labelcsl3 = new JLabel();
             labelcsl3.setBounds(xl+160, 390, 80, 40);
             labelcsl3.setText("CSE3108");
             labelcsl3.setFont(new Font("Courier New", Font.BOLD, 16));
             labelcsl3.setForeground(Color.RED);
             c.add(labelcsl3);
             
             x1 = x1+150;
             fl = 1;
             xl = xl+160;
             
             labelcs3108.addActionListener(new ActionListener(){
                 
                 public void actionPerformed(ActionEvent e) {
                     
                     MyDatabaseHandler db = new MyDatabaseHandler();
                     db.connectDatabase();
                     
                     ResultSet rs = db.gettingQuerycse3108();
                     db.gettingStudent3108(rs);

                     GivingMark3108 mark3108 = new GivingMark3108();
                     
                     mark3108.setVisible(true);
                     
                     dispose();
                 }
             });
         }
         
         if(course.equals("CSE3110")){
              
             img9 = new ImageIcon(getClass().getResource("cse3110.jpg"));
             
             labelcs3110 = new JButton(img9);
             labelcs3110.setBounds(x1+150, 280, img9.getIconWidth(), img9.getIconHeight());
             c.add(labelcs3110);
             
             labelcsl4 = new JLabel();
             labelcsl4.setBounds(xl+160, 390, 80, 40);
             labelcsl4.setText("CSE3110");
             labelcsl4.setFont(new Font("Courier New", Font.BOLD, 16));
             labelcsl4.setForeground(Color.RED);
             c.add(labelcsl4);
             
             x1 = x1+150;
             fl = 1;
             xl = xl+160;
             
             labelcs3110.addActionListener(new ActionListener(){
                 
                 public void actionPerformed(ActionEvent e) {
                     
                     MyDatabaseHandler db = new MyDatabaseHandler();
                     db.connectDatabase();
                     
                     ResultSet rs = db.gettingQuerycse3110();
                     db.gettingStudent3110(rs);

                     GivingMark3110 mark3110 = new GivingMark3110();
                     
                     mark3110.setVisible(true);
                     
                     dispose();
                 }
             });
         }
         
         if(ft==1){
             labelTheory = new JLabel();
             labelTheory.setBounds(80, 120, 80, 20);
             labelTheory.setFont(new Font("Courier New", Font.BOLD, 18));
             labelTheory.setText("Theory");
             labelTheory.setForeground(Color.BLUE);
             c.add(labelTheory);
         }
         
         if(fl==1){
             labelLab = new JLabel();
             labelLab.setBounds(80, 300, 40, 20);
             labelLab.setFont(new Font("Courier New", Font.BOLD, 18));
             labelLab.setText("Lab");
             labelLab.setForeground(Color.BLUE);
             c.add(labelLab);
         }
    }
    
    public static void main(String[] args) {
        
        CourseTeacher1 f1 = new CourseTeacher1();
       
    }

    
    
}
