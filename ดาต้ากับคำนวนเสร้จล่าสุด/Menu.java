/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */Connection _connect = null;
    Statement _sql_statment = null;
    public Menu() {
        initComponents(); try {
            Class.forName("com.mysql.jdbc.Driver");
            _connect = DriverManager.getConnection("jdbc:mysql://localhost/oop"
                    + "?user=root&password=");

            if (_connect != null) {
                System.out.println("Database Connected.");
            } else {
                System.out.println("Database Connect Failed.");
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Numchicken = new javax.swing.JTextField();
        chickenCheese = new javax.swing.JTextField();
        chickenZEED = new javax.swing.JTextField();
        Nuggets = new javax.swing.JTextField();
        Frenchfries = new javax.swing.JTextField();
        Burger = new javax.swing.JTextField();
        Cola = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("หน้าหลัก");
        jButton1.setPreferredSize(new java.awt.Dimension(101, 37));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel1.setText("รายการอาหาร");

        jLabel2.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel2.setText("ไก่ทอด");

        jLabel3.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel3.setText("ไก่ชีส");

        jLabel4.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel4.setText("ไก่วิ้งแซ่บ");

        jLabel5.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel5.setText("นักเก็ตส์");

        jLabel6.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel6.setText("เฟรนฟราย");

        jLabel7.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel7.setText("เบอร์เกอร์ไก่ทอด");

        jLabel9.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel9.setText("รายการเครื่องดื่ม");

        jLabel10.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel10.setText("โค้ก");

        jLabel11.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel11.setText("เป๊ปซี่");

        jLabel12.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel12.setText("น้ำเปล่า");

        jTextField1.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel13.setText("รายการอาหารทั้งหมด");

        jLabel14.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel14.setText("บาท");

        jButton2.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jButton2.setText("ส่งรายการอาหาร");
        jButton2.setMaximumSize(new java.awt.Dimension(61, 31));
        jButton2.setMinimumSize(new java.awt.Dimension(61, 31));
        jButton2.setPreferredSize(new java.awt.Dimension(61, 31));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel15.setText("60 บาท");

        jLabel16.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel16.setText("100 บาท");

        jLabel17.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel17.setText("80 บาท");

        jLabel18.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel18.setText("35 บาท");

        jLabel19.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel19.setText("45 บาท");

        jLabel20.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel20.setText("79 บาท");

        jLabel21.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel21.setText("40 บาท");

        jLabel22.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel22.setText("40 บาท");

        jLabel23.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jLabel23.setText("15 บาท");

        Numchicken.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N

        chickenCheese.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N

        chickenZEED.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N

        Nuggets.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N

        Frenchfries.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N

        Burger.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N

        Cola.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N

        jTextField10.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N

        jButton3.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        jButton3.setText("ยืนยัน");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int Num1 = 0;
                int Num2 = 0;
                int Num3 = 0;
                int Num4 = 0;
                int Num5 = 0;
                int Num6 = 0;
                int Num7 = 0;
                int Num8 = 0;
                int Num9 = 0;
              
                if((Numchicken.getText()).equals("") || !(Numchicken.getText()).equals("")){
                    if((Numchicken.getText()).equals("")){
                        Num1 = 0;
                    }else if(!(Numchicken.getText()).equals("")){
                        int Num = Integer.parseInt(Numchicken.getText());
                        Num1 = Num*60;
                    }    
                }if((chickenCheese.getText()).equals("") || !(chickenCheese.getText()).equals("")){
                    if((chickenCheese.getText()).equals("")){
                        Num2 = 0;
                    }else if(!(chickenCheese.getText()).equals("")){
                        int Num = Integer.parseInt(chickenCheese.getText());
                        Num2 = Num*100;
                    }    
                }if((chickenZEED.getText()).equals("") || !(chickenZEED.getText()).equals("")){
                    if((chickenZEED.getText()).equals("")){
                        Num3 = 0;
                    }else if(!(chickenZEED.getText()).equals("")){
                        int Num = Integer.parseInt(chickenZEED.getText());
                        Num3 = Num*80;
                    }    
                }if((Nuggets.getText()).equals("") || !(Nuggets.getText()).equals("")){
                    if((Nuggets.getText()).equals("")){
                        Num4 = 0;
                    }else if(!(Nuggets.getText()).equals("")){
                        int Num = Integer.parseInt(Nuggets.getText());
                        Num4 = Num*35;
                    }    
                }if((Frenchfries.getText()).equals("") || !(Frenchfries.getText()).equals("")){
                    if((Frenchfries.getText()).equals("")){
                        Num5 = 0;
                    }else if(!(Frenchfries.getText()).equals("")){
                        int Num = Integer.parseInt(Frenchfries.getText());
                        Num5 = Num*45;
                    }    
                }if((Burger.getText()).equals("") || !(Burger.getText()).equals("")){
                    if((Burger.getText()).equals("")){
                        Num6 = 0;
                    }else if(!(Burger.getText()).equals("")){
                        int Num = Integer.parseInt(Burger.getText());
                        Num6 = Num*79;
                    }    
                }if((Cola.getText()).equals("") || !(Cola.getText()).equals("")){
                    if((Cola.getText()).equals("")){
                        Num7 = 0;
                    }else if(!(Cola.getText()).equals("")){
                        int Num = Integer.parseInt(Cola.getText());
                        Num7 = Num*40;
                    }    
                }if((jTextField9.getText()).equals("") || !(jTextField9.getText()).equals("")){
                    if((jTextField9.getText()).equals("")){
                        Num8 = 0;
                    }else if(!(jTextField9.getText()).equals("")){
                        int Num = Integer.parseInt(jTextField9.getText());
                        Num8 = Num*40;
                    }    
                }if((jTextField10.getText()).equals("") || !(jTextField10.getText()).equals("")){
                    if((jTextField10.getText()).equals("")){
                        Num9 = 0;
                    }else if(!(jTextField10.getText()).equals("")){
                        int Num = Integer.parseInt(jTextField10.getText());
                        Num9 = Num*15;
                    }    
                }
                
                int total = Num1 + Num2 + Num3 + Num4 + Num5 + Num6 + Num7+Num8+Num9;
                jTextField1.setText(total+" ");
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(132, 132, 132)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(jLabel12))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(65, 65, 65)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(11, 11, 11)
                                                                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(Cola, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                .addGap(0, 9, Short.MAX_VALUE)
                                                                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(67, 67, 67)
                                                                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(76, 76, 76)
                                                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel4)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(jLabel5)
                                                                                        .addComponent(jLabel6))
                                                                                .addGap(34, 34, 34))
                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(Burger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Frenchfries, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Nuggets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(chickenZEED, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel16)
                                                                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(Numchicken, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(chickenCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                .addGap(134, 134, 134))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel14)
                                                .addGap(107, 107, 107))))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(200, 200, 200)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Numchicken, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chickenCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chickenZEED, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Nuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Frenchfries, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Burger, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Cola, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NewHome home = new NewHome();
        home.setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    //ยืนยันคำสั่งซื้อ

    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  try {

                    _sql_statment = _connect.createStatement();

                    String sql_commnad = "INSERT INTO datachicken (friedchicken,cheesechicken,spicychicken,nuggets,frenchfries,berger,coke,pepsi,drink,total) VALUES ( '" + Numchicken.getText() + "','" + chickenCheese.getText() + "','" + chickenZEED.getText() + "','" + Nuggets.getText() + "','" + Frenchfries.getText() + "','" + Burger.getText() + "','" + Cola.getText() + "','" + jTextField9.getText() + "','" + jTextField10.getText() + "','" + jTextField1.getText() + "')  ";
                    _sql_statment.execute(sql_commnad);
                    System.out.println("save data complete");

                } catch (Exception ex) {
                    System.out.println(ex.toString());
                    System.out.println("noooooooo data");
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*int Num1 = 60*(Integer.parseInt(Numchicken.getText()));
            int Num2 = 100*Integer.parseInt(chickenCheese.getText());
            int Num3 = 80*Integer.parseInt(chickenZEED.getText());
            int Num4 = 35*Integer.parseInt(Nuggets.getText());
            int Num5 = 45*Integer.parseInt(Frenchfries.getText());
            int Num6 = 79*Integer.parseInt(Burger.getText());
            int Num7 = 40*Integer.parseInt(Cola.getText());
        
            int total = Num1+Num2+Num3+Num4+Num5+Num6+Num7;
            System.out.println(total);*/
    }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Burger;
    public javax.swing.JTextField Cola;
    public javax.swing.JTextField Frenchfries;
    public javax.swing.JTextField Nuggets;
    public javax.swing.JTextField Numchicken;
    public javax.swing.JTextField chickenCheese;
    public javax.swing.JTextField chickenZEED;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField10;
    public javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}