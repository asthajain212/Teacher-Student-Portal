
import java.awt.Color;
import java.awt.Font;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;


public class tSign extends javax.swing.JFrame {

    
    static int flaghm3115=0,flagcs3100=0,flagcs3101=0,flagcs3103=0,flagcs3104=0,flagcs3107=0,flagcs3108=0,flagcs3109=0,flagcs3110=0;
    
            
    private ImageIcon img;
    
    
    public tSign() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        phone = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        y = new javax.swing.JComboBox<>();
        m = new javax.swing.JComboBox<>();
        d = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hum3115 = new javax.swing.JCheckBox();
        cse3101 = new javax.swing.JCheckBox();
        cse3103 = new javax.swing.JCheckBox();
        cse3107 = new javax.swing.JCheckBox();
        cse3109 = new javax.swing.JCheckBox();
        cse3100 = new javax.swing.JCheckBox();
        cse3104 = new javax.swing.JCheckBox();
        cse3108 = new javax.swing.JCheckBox();
        cse3110 = new javax.swing.JCheckBox();
        pl = new javax.swing.JLabel();
        confirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Registration Form ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Name ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Date of  Birth");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setText("Phone");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 51));
        jLabel7.setText("Password");

        register.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(153, 0, 153));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(153, 0, 153));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 51));
        jLabel9.setText("Confirm Password");

        y.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "......", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));

        m.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".........", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        d.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 102));
        jLabel8.setText("Month");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 102));
        jLabel10.setText("Year");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 102));
        jLabel3.setText("Day");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 51));
        jLabel11.setText("Courses");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 51));
        jLabel12.setText("Theory");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 51));
        jLabel13.setText("Lab");

        hum3115.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hum3115.setForeground(new java.awt.Color(153, 0, 102));
        hum3115.setText("HUM3115");
        hum3115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hum3115ActionPerformed(evt);
            }
        });

        cse3101.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3101.setForeground(new java.awt.Color(153, 0, 102));
        cse3101.setText("CSE3101");
        cse3101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3101ActionPerformed(evt);
            }
        });

        cse3103.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3103.setForeground(new java.awt.Color(153, 0, 102));
        cse3103.setText("CSE3103");
        cse3103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3103ActionPerformed(evt);
            }
        });

        cse3107.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3107.setForeground(new java.awt.Color(153, 0, 102));
        cse3107.setText("CSE3107");
        cse3107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3107ActionPerformed(evt);
            }
        });

        cse3109.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3109.setForeground(new java.awt.Color(153, 0, 102));
        cse3109.setText("CSE3109");
        cse3109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3109ActionPerformed(evt);
            }
        });

        cse3100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3100.setForeground(new java.awt.Color(153, 0, 102));
        cse3100.setText("CSE3100");
        cse3100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3100ActionPerformed(evt);
            }
        });

        cse3104.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3104.setForeground(new java.awt.Color(153, 0, 102));
        cse3104.setText("CSE3104");
        cse3104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3104ActionPerformed(evt);
            }
        });

        cse3108.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3108.setForeground(new java.awt.Color(153, 0, 102));
        cse3108.setText("CSE3108");
        cse3108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3108ActionPerformed(evt);
            }
        });

        cse3110.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3110.setForeground(new java.awt.Color(153, 0, 102));
        cse3110.setText("CSE3110");
        cse3110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cse3110ActionPerformed(evt);
            }
        });

        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(back)
                        .addGap(288, 288, 288)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel2)
                        .addGap(190, 190, 190)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel7)
                        .addGap(167, 167, 167)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel8)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel4)
                        .addGap(145, 145, 145)
                        .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel5)
                        .addGap(201, 201, 201)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel6)
                        .addGap(193, 193, 193)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel11)
                        .addGap(181, 181, 181)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(cse3109))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(cse3107)
                        .addGap(103, 103, 103)
                        .addComponent(cse3110))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hum3115)
                            .addComponent(cse3103)
                            .addComponent(cse3101))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cse3100)
                            .addComponent(cse3104)
                            .addComponent(cse3108)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(register)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(back))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hum3115)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cse3101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cse3100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cse3104)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cse3108)
                    .addComponent(cse3103))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cse3110))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cse3107)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cse3109)
                .addGap(27, 27, 27)
                .addComponent(register)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_nameActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:

        Map<String, String> map = new HashMap<String, String>();
        
        map.put("January", "01");
        map.put("February", "02");
        map.put("March", "03");
        map.put("April", "04");
        map.put("May", "05");
        map.put("June", "06");
        map.put("July", "07");
        map.put("August", "08");
        map.put("September", "09");
        map.put("October", "10");
        map.put("November", "11");
        map.put("December", "12");  
        
        String _email, _phone;
        
        String year = (String) y.getSelectedItem();
        System.out.println("year: " + year);
        
        String month = (String) m.getSelectedItem();
        System.out.println("month: " + month);
        
        month = map.get(month);
        System.out.println("month new: " + month);
        
        String day = (String) d.getSelectedItem();
        System.out.println("day: " + day);
        
        String dateofBirth = "";
        
        dateofBirth = dateofBirth + year;
        dateofBirth = dateofBirth + "-";
        dateofBirth = dateofBirth + month;
        dateofBirth = dateofBirth + "-";
        dateofBirth = dateofBirth + day;

        //System.out.println("dateofBirth: "+dateofBirth);
        Vector<String> v = new Vector<String>();
        
        boolean hum31 = hum3115.isSelected();
        boolean cs3101 = cse3101.isSelected();
        boolean cs3103 = cse3103.isSelected();
        boolean cs3107 = cse3107.isSelected();
        boolean cs3109 = cse3109.isSelected();
        boolean cs3100 = cse3100.isSelected();
        boolean cs3104 = cse3104.isSelected();
        boolean cs3108 = cse3108.isSelected();
        boolean cs3110 = cse3110.isSelected();
        
        
        if (hum31 && flaghm3115 == 0) {
            v.add("HUM3115");
            
            //flaghm3115 = 1;
            System.out.println("flag here: "+flaghm3115);
        }
        
        if (cs3101 && flagcs3101 == 0) {
            v.add("CSE3101");
            flagcs3101 = 1;
        }
        
        if (cs3103 && flagcs3103 == 0) {
            v.add("CSE3103");
            flagcs3103 = 1;
        }
        
        if (cs3107 && flagcs3107 == 0) {
            v.add("CSE3107");
            flagcs3107 = 1;
        }
        
        if (cs3109 && flagcs3109 == 0) {
            v.add("CSE3109");
            flagcs3109 = 1;
        }
        
        if (cs3100 && flagcs3100 == 0) {
            v.add("CSE3100");
            flagcs3100 = 1;
            
        }
        
        if (cs3104 && flagcs3104 == 0) {
            v.add("CSE3104");
            flagcs3104 = 1;
        }
        
        if (cs3108 && flagcs3108 == 0) {
            v.add("CSE3108");
            flagcs3108 = 1;
        }
        
        if (cs3110 && flagcs3110 == 0) {
            v.add("CSE3110");
            flagcs3110 = 1;
        }
        
        if (!(name.getText().equals("")) && !(password.getText().equals("")) && !(confirm.getText().equals("")) && !(dateofBirth.equals("")) && !(email.getText().equals("")) && !(phone.getText().equals(""))) {
            
            Iterator i = v.iterator();
            
            System.out.println("v size: "+v.size());
            
            
            while (i.hasNext()) {
                MyDatabaseHandler db = new MyDatabaseHandler();
                db.connectDatabase();
                
                
                
                
                String it = (String) i.next();
                System.out.println("it: " + it);
                
                db.insertData(name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
            }
            
            name.setText("");
            password.setText("");
            dateofBirth = "";
            email.setText("");
            phone.setText("");
            confirm.setText("");
            pl.setText("");
            
            hum3115.setSelected(false);
            cse3101.setSelected(false);
            cse3103.setSelected(false);
            cse3107.setSelected(false);
            cse3109.setSelected(false);
            cse3100.setSelected(false);
            cse3104.setSelected(false);
            cse3108.setSelected(false);
            cse3110.setSelected(false);
            
            tLogin tl = new tLogin();
            tl.pass(v);
            
        }
    }//GEN-LAST:event_registerActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.hide();
        teacherFornt t = new teacherFornt();
        t.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void hum3115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hum3115ActionPerformed
        // TODO add your handling code here:
        
        MyDatabaseHandler db = new MyDatabaseHandler();
        db.connectDatabase();
        
        ResultSet rs = db.testQuery();
        db.getResultHum3115(rs,"HUM3115");
        hum3115.setSelected(false);
     
    }//GEN-LAST:event_hum3115ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:

        System.out.println("hell0");
        String pass = password.getText();
        int ln = pass.length();
        
        if (ln < 5) {
            password.setBorder(BorderFactory.createLineBorder(Color.decode("#ff0000")));
        } else if (ln >= 5 && ln < 10) {
            pl.setText("Weak");
            pl.setFont(new Font("Courier New", Font.BOLD, 18));
            pl.setForeground(Color.green);
        } else if (ln >= 10 && ln < 15) {
            pl.setText("Medium");
            pl.setFont(new Font("Courier New", Font.BOLD, 18));
            pl.setForeground(Color.blue);
        } else {
            pl.setText("Strong");
            pl.setFont(new Font("Courier New", Font.BOLD, 18));
            pl.setForeground(Color.RED);
        }
    }//GEN-LAST:event_passwordActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:

        String pass = password.getText();
        String confo = confirm.getText();
        
        if (!pass.equals(confo)) {
            
            confirm.setBorder(BorderFactory.createLineBorder(Color.decode("#ff0000")));
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:

        String _email = email.getText();
        boolean b = _email.trim().endsWith("@gmail.com");
        
        if (!b) {
            email.setBorder(BorderFactory.createLineBorder(Color.decode("#ff0000")));
            
        }
        

    }//GEN-LAST:event_emailActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:

        String _phone = phone.getText();
        boolean p = _phone.trim().startsWith("01");
        
        int plen = _phone.length();
        
        if (!p || (plen <= 0 && plen > 11)) {
            phone.setBorder(BorderFactory.createLineBorder(Color.decode("#ff0000")));
        }
    }//GEN-LAST:event_phoneActionPerformed

    private void cse3101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3101ActionPerformed
        // TODO add your handling code here:
        
        MyDatabaseHandler db = new MyDatabaseHandler();
        db.connectDatabase();
        
        ResultSet rs = db.testQuery();
        db.getResultCse3101(rs,"CSE3101");
        cse3101.setSelected(false);
    }//GEN-LAST:event_cse3101ActionPerformed

    private void cse3103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3103ActionPerformed
        // TODO add your handling code here:
        
        MyDatabaseHandler db = new MyDatabaseHandler();
        db.connectDatabase();
        
        ResultSet rs = db.testQuery();
        db.getResultCse3103(rs,"CSE3103");
        cse3103.setSelected(false);
    }//GEN-LAST:event_cse3103ActionPerformed

    private void cse3107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3107ActionPerformed
        // TODO add your handling code here:
        
        MyDatabaseHandler db = new MyDatabaseHandler();
        db.connectDatabase();
        
        ResultSet rs = db.testQuery();
        db.getResultCse3107(rs,"CSE3107");
        cse3107.setSelected(false);
    }//GEN-LAST:event_cse3107ActionPerformed

    private void cse3109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3109ActionPerformed
        // TODO add your handling code here:
        
        MyDatabaseHandler db = new MyDatabaseHandler();
        db.connectDatabase();
        
        ResultSet rs = db.testQuery();
        db.getResultCse3109(rs,"CSE3109");
        cse3109.setSelected(false);
    }//GEN-LAST:event_cse3109ActionPerformed

    private void cse3100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3100ActionPerformed
        // TODO add your handling code here:
        
        MyDatabaseHandler db = new MyDatabaseHandler();
        db.connectDatabase();
        
        ResultSet rs = db.testQuery();
        db.getResultCse3100(rs,"CSE3100");
        cse3100.setSelected(false);
    }//GEN-LAST:event_cse3100ActionPerformed

    private void cse3104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3104ActionPerformed
        // TODO add your handling code here:
        
        MyDatabaseHandler db = new MyDatabaseHandler();
        db.connectDatabase();
        
        ResultSet rs = db.testQuery();
        db.getResultCse3104(rs,"CSE3104");
        cse3104.setSelected(false);
    }//GEN-LAST:event_cse3104ActionPerformed

    private void cse3108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3108ActionPerformed
        // TODO add your handling code here:
        MyDatabaseHandler db = new MyDatabaseHandler();
        db.connectDatabase();
        
        ResultSet rs = db.testQuery();
        db.getResultCse3108(rs,"CSE3108");
        cse3108.setSelected(false);
    }//GEN-LAST:event_cse3108ActionPerformed

    private void cse3110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3110ActionPerformed
        // TODO add your handling code here:
        
        MyDatabaseHandler db = new MyDatabaseHandler();
        db.connectDatabase();
        
        ResultSet rs = db.testQuery();
        db.getResultCse3110(rs,"CSE3110");
        cse3110.setSelected(false);
    }//GEN-LAST:event_cse3110ActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tSign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPasswordField confirm;
    private javax.swing.JCheckBox cse3100;
    private javax.swing.JCheckBox cse3101;
    private javax.swing.JCheckBox cse3103;
    private javax.swing.JCheckBox cse3104;
    private javax.swing.JCheckBox cse3107;
    private javax.swing.JCheckBox cse3108;
    private javax.swing.JCheckBox cse3109;
    private javax.swing.JCheckBox cse3110;
    private javax.swing.JComboBox<String> d;
    private javax.swing.JTextField email;
    private javax.swing.JCheckBox hum3115;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> m;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel pl;
    private javax.swing.JButton register;
    private javax.swing.JComboBox<String> y;
    // End of variables declaration//GEN-END:variables
}