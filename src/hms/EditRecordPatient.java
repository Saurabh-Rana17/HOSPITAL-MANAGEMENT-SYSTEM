/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hms;

import Package.ConnectionProvider;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AMAAN SHAIKH
 */
public class EditRecordPatient extends javax.swing.JFrame {

    int a = 0;

    /**
     * Creates new form EditRecordPatient
     */
    public EditRecordPatient() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Middle Name");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 160, 30));

        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setText("Last Name");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 320, 160, 30));

        jTextField11.setForeground(new java.awt.Color(153, 153, 153));
        jTextField11.setText("First Name");
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField11FocusLost(evt);
            }
        });
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 150, 30));

        jTextField15.setForeground(new java.awt.Color(153, 153, 153));
        jTextField15.setText("upto 10 characters");
        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField15FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField15FocusLost(evt);
            }
        });
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 380, 170, 30));

        jTextField16.setForeground(new java.awt.Color(153, 153, 153));
        jTextField16.setText("upto 10 digits");
        jTextField16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField16FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField16FocusLost(evt);
            }
        });
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 160, 30));

        jTextField17.setForeground(new java.awt.Color(153, 153, 153));
        jTextField17.setText("upto 6 characters");
        jTextField17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField17FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField17FocusLost(evt);
            }
        });
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 450, 170, 30));

        jTextField18.setForeground(new java.awt.Color(153, 153, 153));
        jTextField18.setText("upto 10 digits");
        jTextField18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField18FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField18FocusLost(evt);
            }
        });
        getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 160, 30));

        jTextField19.setForeground(new java.awt.Color(153, 153, 153));
        jTextField19.setText("upto 50 characters");
        jTextField19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField19FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField19FocusLost(evt);
            }
        });
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 520, 170, 30));

        jTextField20.setForeground(new java.awt.Color(153, 153, 153));
        jTextField20.setText("upto 10 digits");
        jTextField20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField20FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField20FocusLost(evt);
            }
        });
        getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, 160, 30));

        jTextField21.setForeground(new java.awt.Color(153, 153, 153));
        jTextField21.setText("upto 100 characters");
        jTextField21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField21FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField21FocusLost(evt);
            }
        });
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 590, 170, 30));

        jTextField22.setForeground(new java.awt.Color(153, 153, 153));
        jTextField22.setText("Bood Pressure, Dibetease,...upto 100 characters");
        jTextField22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField22FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField22FocusLost(evt);
            }
        });
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 660, 410, 30));

        jTextField23.setForeground(new java.awt.Color(153, 153, 153));
        jTextField23.setText("upto 3 digits");
        jTextField23.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField23FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField23FocusLost(evt);
            }
        });
        getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 160, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Record");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, 110, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Age*");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PID*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Phone no*");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bill to Pay*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Gender*");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Blood Group");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Genetic Disease");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 520, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Medical History");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 590, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Note about Condition");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 660, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Go Back");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 250, 100, 40));

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jToggleButton1.setText("Save");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 730, 100, 50));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/low-poly-white-background-design_1017-33204.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 1090, 640));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hms/hospitaltranparent1.jpg"))); // NOI18N
        jLabel14.setText("jLabel5");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jMenu2.setText("Logout");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        if (jTextField2.getText().equals("Middle Name")) {
            jTextField2.setText("");
            jTextField2.setForeground(new Color(0, 0, 0));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if (jTextField2.getText().equals("")) {
            jTextField2.setText("Middle Name");
            jTextField2.setForeground(new Color(153, 153, 153));
        }         // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        if (jTextField3.getText().equals("Last Name")) {
            jTextField3.setText("");
            jTextField3.setForeground(new Color(0, 0, 0));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if (jTextField3.getText().equals("")) {
            jTextField3.setText("Last Name");
            jTextField3.setForeground(new Color(153, 153, 153));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
        if (a < 1) {
            jTextField11.setEditable(false);
            jTextField2.setEditable(false);
            jTextField3.setEditable(false);
            jTextField23.setEditable(false);
            jTextField15.setEditable(false);
            jTextField17.setEditable(false);
            jTextField18.setEditable(false);
            jTextField19.setEditable(false);
            jTextField20.setEditable(false);
            jTextField21.setEditable(false);
            jTextField22.setEditable(false);
        }
        a++;

        if (jTextField11.getText().equals("First Name")) {
            jTextField11.setText("");
            jTextField11.setForeground(new Color(0, 0, 0));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11FocusGained

    private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
        if (jTextField11.getText().equals("")) {
            jTextField11.setText("First Name");
            jTextField11.setForeground(new Color(153, 153, 153));
        }         // TODO add your handling code here:

    }//GEN-LAST:event_jTextField11FocusLost

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed

    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusGained
        if (jTextField15.getText().equals("upto 10 characters")) {
            jTextField15.setText("");
            jTextField15.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField15FocusGained

    private void jTextField15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusLost
        if (jTextField15.getText().equals("")) {
            jTextField15.setText("upto 10 characters");
            jTextField15.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField15FocusLost

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusGained
        if (jTextField16.getText().equals("upto 10 digits")) {
            jTextField16.setText("");
            jTextField16.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField16FocusGained

    private void jTextField16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField16FocusLost
        if (jTextField16.getText().equals("")) {
            jTextField16.setText("upto 10 digits");
            jTextField16.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField16FocusLost

    private void jTextField17FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField17FocusGained
        if (jTextField17.getText().equals("upto 6 characters")) {
            jTextField17.setText("");
            jTextField17.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField17FocusGained

    private void jTextField17FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField17FocusLost
        if (jTextField17.getText().equals("")) {
            jTextField17.setText("upto 6 characters");
            jTextField17.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField17FocusLost

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField18FocusGained
        if (jTextField18.getText().equals("upto 10 digits")) {
            jTextField18.setText("");
            jTextField18.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField18FocusGained

    private void jTextField18FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField18FocusLost
        if (jTextField18.getText().equals("")) {
            jTextField18.setText("upto 10 digits");
            jTextField18.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField18FocusLost

    private void jTextField19FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField19FocusGained
        if (jTextField19.getText().equals("upto 50 characters")) {
            jTextField19.setText("");
            jTextField19.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField19FocusGained

    private void jTextField19FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField19FocusLost
        if (jTextField19.getText().equals("")) {
            jTextField19.setText("upto 50 characters");
            jTextField19.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField19FocusLost

    private void jTextField20FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField20FocusGained
        if (jTextField20.getText().equals("upto 10 digits")) {
            jTextField20.setText("");
            jTextField20.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField20FocusGained

    private void jTextField20FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField20FocusLost
        if (jTextField20.getText().equals("")) {
            jTextField20.setText("upto 10 digits");
            jTextField20.setForeground(new Color(153, 153, 153));
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20FocusLost

    private void jTextField21FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField21FocusGained
        if (jTextField21.getText().equals("upto 100 characters")) {
            jTextField21.setText("");
            jTextField21.setForeground(Color.BLACK);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21FocusGained

    private void jTextField21FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField21FocusLost
        if (jTextField21.getText().equals("")) {
            jTextField21.setText("upto 100 characters");
            jTextField21.setForeground(new Color(153, 153, 153));
        }     // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21FocusLost

    private void jTextField22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField22FocusGained
        if (jTextField22.getText().equals("Bood Pressure, Dibetease,...upto 100 characters")) {
            jTextField22.setText("");
            jTextField22.setForeground(new Color(0, 0, 0));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22FocusGained

    private void jTextField22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField22FocusLost

        if (jTextField22.getText().equals("")) {
            jTextField22.setText("Bood Pressure, Dibetease,...upto 100 characters");
            jTextField22.setForeground(new Color(153, 153, 153));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22FocusLost

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed

    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField23FocusGained
        if (jTextField23.getText().equals("upto 3 digits")) {
            jTextField23.setText("");
            jTextField23.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField23FocusGained

    private void jTextField23FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField23FocusLost
        if (jTextField23.getText().equals("")) {
            jTextField23.setText("upto 3 digits");
            jTextField23.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField23FocusLost

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        HomePage ob = new HomePage();
        ob.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String FN = jTextField11.getText();
        String MN = jTextField2.getText();
        String LN = jTextField3.getText();
        String Age = jTextField23.getText();
        String Gender = jTextField15.getText();
        String PID = jTextField16.getText();
        String BloodGroup = jTextField17.getText();
        String PhoneNo = jTextField18.getText();
        String GeneticDisease = jTextField19.getText();
        String BillToPay = jTextField20.getText();
        String MedicalHistory = jTextField21.getText();
        String Note = jTextField22.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //st.executeUpdate("insert into patient values('" + FN + "','" + MN + "','" + LN + "','" + PID + "','" + Gender + "','" + Age + "','" + BloodGroup + "','" + PhoneNo + "','" + GeneticDisease + "','" + MedicalHistory + "','" + Note + "','" + BillToPay + "')");
            
            st.executeUpdate("UPDATE patient SET FN = '"+FN +"' where PID ='"+PID+"' " );
            st.executeUpdate("UPDATE patient SET MN = '"+MN +"' where PID ='"+PID+"' " );
            st.executeUpdate("UPDATE patient SET LN = '"+LN +"' where PID ='"+PID+"' " );
            st.executeUpdate("UPDATE patient SET Age = '"+Age +"' where PID ='"+PID+"' " );
            st.executeUpdate("UPDATE patient SET Gender = '"+Gender +"' where PID ='"+PID+"' " );
            st.executeUpdate("UPDATE patient SET BloodGroup = '"+BloodGroup +"' where PID ='"+PID+"' " );
            st.executeUpdate("UPDATE patient SET PhoneNO = '"+PhoneNo +"' where PID ='"+PID+"' " );
            st.executeUpdate("UPDATE patient SET GeneticDisease = '"+GeneticDisease +"' where PID ='"+PID+"' " );
            st.executeUpdate("UPDATE patient SET BillToPay = '"+BillToPay +"' where PID ='"+PID+"' " );
            st.executeUpdate("UPDATE patient SET MedicalHistory = '"+MedicalHistory +"' where PID ='"+PID+"' " );
            st.executeUpdate("UPDATE patient SET NoteAboutCondition = '"+Note +"' where PID ='"+PID+"' " );
            JOptionPane.showMessageDialog(null, "Successfully Added");
            
            //JOptionPane.showMessageDialog(null, "Successfully Added");
            setVisible(false);
            new MakeRecordPatient().setVisible(true);
        } catch (Exception e) {
            if (FN.length() >= 21) {
                JOptionPane.showMessageDialog(null, "Enter First Name correctly ");
            }
            if (MN.length() >= 21) {
                JOptionPane.showMessageDialog(null, "Enter Middle Name correctly ");
            }
            if (LN.length() >= 21) {
                JOptionPane.showMessageDialog(null, "Enter Last Name correctly ");
            }
            if (Age.length() >= 4) {
                JOptionPane.showMessageDialog(null, "Enter Age correctly ");
            }
            if (Gender.length() >= 11) {
                JOptionPane.showMessageDialog(null, "Enter Gender correctly ");
            }
            if (PID.length() >= 11) {
                JOptionPane.showMessageDialog(null, "Enter Doctor's Id correctly ");
            }
            if (BloodGroup.length() >= 11) {
                JOptionPane.showMessageDialog(null, "Enter Blood Group correctly ");
            }
            if (PhoneNo.length() >= 11) {
                JOptionPane.showMessageDialog(null, "Enter Phone number correctly ");
            }
            if (GeneticDisease.length() >= 51) {
                JOptionPane.showMessageDialog(null, "Enter Genetic Disease correctly ");
            }
            if (BillToPay.length() >= 11) {
                JOptionPane.showMessageDialog(null, "Enter Bill to Pay correctly ");
            }
            if (MedicalHistory.length() >= 101) {
                JOptionPane.showMessageDialog(null, "Enter Medical History correctly ");
            }
            if (Note.length() >= 101) {
                JOptionPane.showMessageDialog(null, "Enter Note about Condition correctly ");
            }
            JOptionPane.showMessageDialog(null, "Enter data correctly" + e);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String PID = jTextField16.getText();
        try {

            Connection con;
            con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from patient where PID=('" + PID + "')");

            if (rs.next()) {
                String FN = rs.getString("FN");
                String MN = rs.getString("MN");
                String LN = rs.getString("LN");
                String PIDs = rs.getString("PID");
                String Gender = rs.getString("Gender");
                String Age = rs.getString("Age");
                String PhoneNo = rs.getString("PhoneNo");
                String BloodGroup = rs.getString("BloodGroup");
                String GeneticDisease = rs.getString("GeneticDisease");
                String MedicalHistory = rs.getString("MedicalHistory");
                String Note = rs.getString("NoteAboutCondition");
                String BillToPay = rs.getString("BillToPay");

                jTextField11.setText(FN);
                jTextField2.setText(MN);
                jTextField3.setText(LN);
                jTextField16.setText(PIDs);
                jTextField15.setText(Gender);
                jTextField23.setText(Age);
                jTextField18.setText(PhoneNo);
                jTextField22.setText(Note);
                jTextField17.setText(BloodGroup);
                jTextField21.setText(MedicalHistory);
                jTextField19.setText(GeneticDisease);
                jTextField20.setText(BillToPay);

                jTextField16.setEditable(false);
                jTextField11.setEditable(true);
                jTextField2.setEditable(true);
                jTextField3.setEditable(true);
                jTextField23.setEditable(true);
                jTextField15.setEditable(true);
                jTextField17.setEditable(true);
                jTextField18.setEditable(true);
                jTextField19.setEditable(true);
                jTextField20.setEditable(true);
                jTextField21.setEditable(true);
                jTextField22.setEditable(true);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        LoginPage l=new LoginPage();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

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
            java.util.logging.Logger.getLogger(EditRecordPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditRecordPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditRecordPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditRecordPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditRecordPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
