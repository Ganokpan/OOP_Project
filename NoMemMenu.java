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

public class NoMemMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    static int total;
    
    Connection _connect = null;
    Statement _sql_statment = null;
    public NoMemMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        Numchick = new javax.swing.JTextField();
        Numcheese = new javax.swing.JTextField();
        NumZeed = new javax.swing.JTextField();
        Numpotato = new javax.swing.JTextField();
        NumBerger = new javax.swing.JTextField();
        NumNug = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Numcola = new javax.swing.JTextField();
        Numpepsi = new javax.swing.JTextField();
        Numwater = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(218, 77, 79));

        jLabel29.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 60)); // NOI18N
        jLabel29.setText("MENU");

        jLabel30.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel30.setText("รายการอาหาร");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel30)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(67, Short.MAX_VALUE)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addGap(82, 82, 82))
        );

        jPanel8.setBackground(new java.awt.Color(234, 182, 106));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel8.setText("รายการ");

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel9.setText("ราคา");

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel10.setText("จำนวน");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel10)
                                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(234, 132, 94));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel4.setText("รายการเครื่องดื่ม");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35))
        );

        jPanel4.setBackground(new java.awt.Color(234, 132, 94));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel3.setText("รายการอาหาร");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(143, 143, 143))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(44, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40))
        );

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton1.setText("ยืนยัน");

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton2.setText("ส่งรายการอาหาร");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel1.setText("ราคาอาหารทั้งหมด");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel14.setText("ไก่ทอดสูตรต้นตำรับ");

        jLabel15.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel15.setText("ไก่ทอดลาวาชีส");

        jLabel16.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel16.setText("ไก่ทอดแซ่บซี๊ด");

        jLabel17.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel17.setText("เฟรนฟรายส์");

        jLabel18.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel18.setText("เบอร์เกอร์ไก่ทอด");

        jLabel19.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel19.setText("นักเก็ตไก่");

        jLabel23.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel23.setText("60 บาท");

        jLabel24.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel24.setText("100 บาท");

        jLabel25.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel25.setText("80 บาท");

        jLabel26.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel26.setText("45 บาท");

        jLabel27.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel27.setText("79 บาท");

        jLabel28.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel28.setText("35 บาท");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel19))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel23)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel28))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NumNug, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                        .addComponent(NumBerger)
                                        .addComponent(Numpotato)
                                        .addComponent(NumZeed)
                                        .addComponent(Numcheese)
                                        .addComponent(Numchick))
                                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel23)
                                        .addComponent(Numchick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel24)
                                        .addComponent(Numcheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel25)
                                        .addComponent(NumZeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel26)
                                        .addComponent(Numpotato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel27)
                                        .addComponent(NumBerger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel19)
                                        .addComponent(jLabel28)
                                        .addComponent(NumNug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton1.setText("ยืนยัน");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
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
                if ((Numchick.getText()).equals("") || !(Numchick.getText()).equals("")) {
                    if ((Numchick.getText()).equals("")) {
                        Num1 = 0;
                    } else if (!(Numchick.getText()).equals("")) {
                        if ((Numchick.getText()).equals("0")) {
                            Num1 = 0;
                        } else {
                            int Num = Integer.parseInt(Numchick.getText());
                            Num1 = Num * 60;
                        }

                    }
                }

                if ((Numcheese.getText()).equals("") || !(Numcheese.getText()).equals("")) {
                    if ((Numcheese.getText()).equals("")) {
                        Num2 = 0;
                    } else if (!(Numcheese.getText()).equals("")) {
                        if ((Numcheese.getText()).equals("0")) {
                            Num2 = 0;
                        } else {
                            int Num = Integer.parseInt(Numcheese.getText());
                            Num2 = Num * 100;
                        }
                    }
                }

                if ((NumZeed.getText()).equals("") || !(NumZeed.getText()).equals("")) {
                    if ((NumZeed.getText()).equals("")) {
                        Num3 = 0;
                    } else if (!(NumZeed.getText()).equals("")) {
                        if ((NumZeed.getText()).equals("0")) {
                            Num3 = 0;
                        } else {
                            int Num = Integer.parseInt(NumZeed.getText());
                            Num3 = Num * 80;
                        }

                    }
                }

                if ((NumNug.getText()).equals("") || !(NumNug.getText()).equals("")) {
                    if ((NumNug.getText()).equals("")) {
                        Num4 = 0;
                    } else if (!(NumNug.getText()).equals("")) {
                        if ((NumNug.getText()).equals("0")) {
                            Num4 = 0;
                        } else {
                            int Num = Integer.parseInt(NumNug.getText());
                            Num4 = Num * 35;
                        }
                    }
                }

                if ((Numpotato.getText()).equals("") || !(Numpotato.getText()).equals("")) {
                    if ((Numpotato.getText()).equals("")) {
                        Num5 = 0;
                    } else if (!(Numpotato.getText()).equals("")) {
                        if ((Numpotato.getText()).equals("0")) {
                            Num5 = 0;
                        } else {
                            int Num = Integer.parseInt(Numpotato.getText());
                            Num5 = Num * 45;
                        }

                    }
                }

                if ((NumBerger.getText()).equals("") || !(NumBerger.getText()).equals("")) {
                    if ((NumBerger.getText()).equals("")) {
                        Num6 = 0;
                    } else if (!(NumBerger.getText()).equals("")) {
                        if ((NumBerger.getText()).equals("0")) {
                            Num6 = 0;
                        } else {
                            int Num = Integer.parseInt(NumBerger.getText());
                            Num6 = Num * 79;
                        }
                    }
                }

                if ((Numcola.getText()).equals("") || !(Numcola.getText()).equals("")) {
                    if ((Numcola.getText()).equals("")) {
                        Num7 = 0;
                    } else if (!(Numcola.getText()).equals("")) {
                        if ((Numcola.getText()).equals("0")) {
                            Num7 = 0;
                        } else {
                            int Num = Integer.parseInt(Numcola.getText());
                            Num7 = Num * 40;
                        }
                    }
                }

                if ((Numpepsi.getText()).equals("") || !(Numpepsi.getText()).equals("")) {
                    if ((Numpepsi.getText()).equals("")) {
                        Num8 = 0;
                    } else if (!(Numpepsi.getText()).equals("")) {
                        if ((Numpepsi.getText()).equals("0")) {
                            Num8 = 0;
                        } else {
                            int Num = Integer.parseInt(Numpepsi.getText());
                            Num8 = Num * 40;
                        }

                    }
                }

                if ((Numwater.getText()).equals("") || !(Numwater.getText()).equals("")) {
                    if ((Numwater.getText()).equals("")) {
                        Num9 = 0;
                    } else if (!(Numwater.getText()).equals("")) {
                        if ((Numwater.getText()).equals("0")) {
                            Num9 = 0;
                        } else {
                            int Num = Integer.parseInt(Numwater.getText());
                            Num9 = Num * 15;
                        }

                    }
                }

                int total = Num1 + Num2 + Num3 + Num4 + Num5 + Num6 + Num7 + Num8 + Num9;

                jTextField1.setText(total + " ");
            }
        });

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jButton2.setText("ส่งรายการอาหาร");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel1.setText("ราคาอาหารทั้งหมด");

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel2.setText("บาท");

        jPanel7.setBackground(new java.awt.Color(234, 182, 106));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel5.setText("รายการ");

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel6.setText("ราคา");

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel7.setText("จำนวน");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(234, 182, 106));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel8.setText("รายการ");

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel9.setText("ราคา");

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 17)); // NOI18N
        jLabel10.setText("จำนวน");

        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel10)
                                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel1)
                                .addGap(42, 42, 42)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                                                                  

    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            _sql_statment = _connect.createStatement();

            String sql_commnad = "INSERT INTO datachicken (friedchicken,cheesechicken,spicychicken,nuggets,frenchfries,berger,coke,pepsi,drink,total) VALUES ( '" + Numchick.getText() + "','" + Numcheese.getText() + "','" + NumZeed.getText() + "','" + NumNug.getText() + "','" + Numpotato.getText() + "','" + NumBerger.getText() + "','" + Numcola.getText() + "','" + Numpepsi.getText() + "','" + Numwater.getText() + "','" + jTextField1.getText() + "')  ";
            _sql_statment.execute(sql_commnad);
            System.out.println("save data complete");

        } catch (Exception ex) {
            System.out.println(ex.toString());
            System.out.println("noooooooo data");
        }

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
            java.util.logging.Logger.getLogger(gui2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                gui2 dialog = new gui2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField NumBerger;
    private javax.swing.JTextField NumNug;
    private javax.swing.JTextField NumZeed;
    private javax.swing.JTextField Numcheese;
    private javax.swing.JTextField Numchick;
    private javax.swing.JTextField Numcola;
    private javax.swing.JTextField Numpepsi;
    private javax.swing.JTextField Numpotato;
    private javax.swing.JTextField Numwater;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
