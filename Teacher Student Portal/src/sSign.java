
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import javax.swing.BorderFactory;


public class sSign extends javax.swing.JFrame {

    
    public sSign() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        y = new javax.swing.JComboBox<>();
        m = new javax.swing.JComboBox<>();
        d = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cse3100 = new javax.swing.JCheckBox();
        cse3104 = new javax.swing.JCheckBox();
        cse3108 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hum3115 = new javax.swing.JCheckBox();
        cse3101 = new javax.swing.JCheckBox();
        cse3103 = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        cse3107 = new javax.swing.JCheckBox();
        cse3109 = new javax.swing.JCheckBox();
        cse3110 = new javax.swing.JCheckBox();
        cp = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        pl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Date of  Birth");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setText("Phone");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Registration Form ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 51));
        jLabel7.setText("Password");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Id");

        register.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(153, 0, 153));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Name");

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(102, 0, 0));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        y.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "......", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });

        m.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".........", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });

        d.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 102));
        jLabel8.setText("Month");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 102));
        jLabel10.setText("Year");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 102));
        jLabel9.setText("Day");

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

        cse3108.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3108.setForeground(new java.awt.Color(153, 0, 102));
        cse3108.setText("CSE3108");

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

        cse3103.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3103.setForeground(new java.awt.Color(153, 0, 102));
        cse3103.setText("CSE3103");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 51));
        jLabel11.setText("Courses");

        cse3107.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3107.setForeground(new java.awt.Color(153, 0, 102));
        cse3107.setText("CSE3107");

        cse3109.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3109.setForeground(new java.awt.Color(153, 0, 102));
        cse3109.setText("CSE3109");

        cse3110.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cse3110.setForeground(new java.awt.Color(153, 0, 102));
        cse3110.setText("CSE3110");

        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 51));
        jLabel14.setText("Confirm Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(292, 292, 292)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(register)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cse3109)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(m, 0, 125, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cp, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(pl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cse3101)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cse3104))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cse3103)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cse3108))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cse3107)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cse3110))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(hum3115)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cse3100)))
                                .addGap(280, 280, 280))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addGap(112, 112, 112)
                        .addComponent(jLabel10)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hum3115)
                    .addComponent(cse3100))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cse3101)
                            .addComponent(cse3104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cse3103)
                            .addComponent(cse3108)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cse3107)
                    .addComponent(cse3110))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cse3109)
                .addGap(39, 39, 39)
                .addComponent(register)
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_idActionPerformed

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

        String _email,_phone;
        
        
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
        
        if (hum31) {
            v.add("HUM3115");
        }
        
        if (cs3101) {
            v.add("CSE3101");
        }
        
        if (cs3103) {
            v.add("CSE3103");
        }
        
        if (cs3107) {
            v.add("CSE3107");
        }
        
        if (cs3109) {
            v.add("CSE3109");
        }
        
        if (cs3100) {
            v.add("CSE3100");
        }
        
        if (cs3104) {
            v.add("CSE3104");
        }
        
        if (cs3108) {
            v.add("CSE3108");
        }
        
        if (cs3110) {
            v.add("CSE3110");
        }

        if (!(id.getText().equals("")) && !(name.getText().equals("")) && !(password.getText().equals("")) && !(dateofBirth.equals("")) && !(email.getText().equals("")) && !(phone.getText().equals(""))) {
            
            Iterator i = v.iterator();
            
            System.out.println("v size: "+v.size());
            
            
            while (i.hasNext()) {
                MyDatabaseHandler db = new MyDatabaseHandler();
                db.connectDatabase();
                
                
                
                
                String it = (String) i.next();
                System.out.println("it: " + it);
                
                db.insertDataSt(id.getText(),name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
                
                if(it.equals("HUM3115")){
                    
                    db.insertDatahum3115(id.getText(),name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
                }
                
                if(it.equals("CSE3101")){
                    
                    db.insertDatacse3101(id.getText(),name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
                }
                
                if(it.equals("CSE3103")){
                    
                    db.insertDatacse3103(id.getText(),name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
                }
                
                if(it.equals("CSE3107")){
                    
                    db.insertDatacse3107(id.getText(),name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
                }
                
                if(it.equals("CSE3109")){
                    
                    db.insertDatacse3109(id.getText(),name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
                }
                
                if(it.equals("CSE3100")){
                    
                    db.insertDatacse3100(id.getText(),name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
                }
                
                if(it.equals("CSE3104")){
                    
                    db.insertDatacse3104(id.getText(),name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
                }
                
                if(it.equals("CSE3108")){
                    
                    db.insertDatacse3108(id.getText(),name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
                }
                if(it.equals("CSE3110")){
                 
                    
                    db.insertDatacse3110(id.getText(),name.getText(), password.getText(), dateofBirth, email.getText(), phone.getText(), it);
                }
                
                
            }
            
            id.setText("");
            name.setText("");
            password.setText("");
            dateofBirth = "";
            email.setText("");
            phone.setText("");
            cp.setText("");
            
            
            hum3115.setSelected(false);
            cse3101.setSelected(false);
            cse3103.setSelected(false);
            cse3107.setSelected(false);
            cse3109.setSelected(false);
            cse3100.setSelected(false);
            cse3104.setSelected(false);
            cse3108.setSelected(false);
            cse3110.setSelected(false);
        }   
    }//GEN-LAST:event_registerActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        
        //password.setEchoChar('.');
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.hide();
        studentFront f = new studentFront();
        f.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void hum3115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hum3115ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hum3115ActionPerformed

    private void cse3100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cse3100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cse3100ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
        
        String _email = email.getText();
        boolean b = _email.trim().endsWith("@gmail.com");
        
        if (!b) {
            email.setBorder(BorderFactory.createLineBorder(Color.decode("#ff0000")));
            //Highlighter highlighter = email.getHighlighter();
            //HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.red);
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

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        // TODO add your handling code here:
        
        String pass = password.getText();
        String confo = cp.getText();
        
        if (!pass.equals(confo)) {
            
            cp.setBorder(BorderFactory.createLineBorder(Color.decode("#ff0000")));
        }
    }//GEN-LAST:event_cpActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(sSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sSign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sSign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPasswordField cp;
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
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
