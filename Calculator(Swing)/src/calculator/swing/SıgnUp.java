/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sıgnup.swing;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class SıgnUp extends javax.swing.JFrame {

    public void history() throws IOException{
        

    }

    private double number,answer;
    private int operation;
    private DrawerController drawer;
    
        
        
    
    
    public void calculate(){
        switch(operation){
            case 1:
                answer = number + Double.parseDouble(input.getText());
                lbl.setText("");
                input.setText(Double.toString(answer));
                
                break;
            case 2:
                answer = number - Double.parseDouble(input.getText());
                lbl.setText("");
                input.setText(Double.toString(answer));
            
                break;
            case 3:
                answer = number * Double.parseDouble(input.getText());
                lbl.setText("");
                input.setText(Double.toString(answer));
               
                break;
            case 4:
                answer = number / Double.parseDouble(input.getText());
                lbl.setText("");
                input.setText(Double.toString(answer));
                
                break;
            case 5:
                answer = 1 / number;
                lbl.setText("");
                input.setText(Double.toString(answer));
               
                break;
            case 6:
                answer = number*number;
                lbl.setText("");
                input.setText(Double.toString(answer));
               
                break;
            case 7:
                answer = Math.pow(number, 1.0/2.0);
                lbl.setText("");
                input.setText(Double.toString(answer));
                
                break;
            case 8:
                answer = number * (Double.parseDouble(input.getText())/100);
                lbl.setText("");
                input.setText(Double.toString(answer));
                
                break;
                
                
        }
        
    }
    
    public void delete1(){
        String str = input.getText();
        if(str != null && str.length()>0){
            str = str.substring(0,str.length()-1);
            input.setText(str);
            
        }
    }
    
    
    
    
    public SıgnUp() {
        initComponents();
        drawer = Drawer.newDrawer(this)
                .header(new JLabel("Geçmiş"))
                .addChild(new DrawerItem("asdas"))
                .separator(2, new Color(90, 90, 90))
                .closeOnPress(true)
                .addFooter(new DrawerItem("Çıkış").icon(new ImageIcon(getClass().getResource("/icons/exit.png"))).build())
                .event(new EventDrawer() {
            @Override
            public void selected(int i, DrawerItem dı) {
                input.setText(dı.getActionCommand());
            }
                })
                .drawerBackground(new Color(231, 228, 228))
                .enableScroll(true)
                .build();
                
                
        Image icon = new ImageIcon(this.getClass().getResource("/icons/icons8_calculator_32px.png")).getImage();
        this.setIconImage(icon);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ilk = new javax.swing.JPanel();
        sonuc = new javax.swing.JPanel();
        input = new javax.swing.JTextField();
        history = new javax.swing.JButton();
        lbl = new javax.swing.JLabel();
        tustakımı = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ilk.setBackground(new java.awt.Color(231, 228, 228));
        ilk.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sonuc.setBackground(new java.awt.Color(231, 228, 228));
        sonuc.setForeground(new java.awt.Color(231, 228, 228));
        sonuc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        input.setEditable(false);
        input.setBackground(new java.awt.Color(231, 228, 228));
        input.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        input.setForeground(new java.awt.Color(0, 0, 0));
        input.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        input.setToolTipText("");
        input.setBorder(null);
        input.setCaretColor(new java.awt.Color(231, 228, 228));
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        sonuc.add(input, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 330, 70));

        history.setBackground(new java.awt.Color(231, 228, 228));
        history.setForeground(new java.awt.Color(231, 228, 228));
        history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_time_machine_32px_1.png"))); // NOI18N
        history.setBorder(null);
        history.setBorderPainted(false);
        history.setContentAreaFilled(false);
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        sonuc.add(history, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 40, 30));

        lbl.setBackground(new java.awt.Color(0, 0, 0));
        lbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sonuc.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 320, 40));

        ilk.add(sonuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 160));

        tustakımı.setOpaque(false);
        tustakımı.setLayout(new java.awt.GridLayout(6, 4, 3, 3));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(16, 16, 16));
        jButton1.setText("%");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(16, 16, 16));
        jButton2.setText("CE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(16, 16, 16));
        jButton3.setText("C");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_clear_symbol_16px.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(16, 16, 16));
        jButton5.setText("1/x");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(16, 16, 16));
        jButton6.setText(" x²");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(16, 16, 16));
        jButton7.setText("√x");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("÷");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton8);

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(16, 16, 16));
        jButton9.setText("7");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton9);

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(16, 16, 16));
        jButton10.setText("8");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton10);

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(16, 16, 16));
        jButton11.setText("9");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton11);

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(16, 16, 16));
        jButton12.setText("x");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton12);

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(16, 16, 16));
        jButton13.setText("4");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton13);

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(16, 16, 16));
        jButton14.setText("5");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton14);

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(16, 16, 16));
        jButton15.setText("6");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton15);

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton16.setForeground(new java.awt.Color(16, 16, 16));
        jButton16.setText("-");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton16);

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(16, 16, 16));
        jButton17.setText("1");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton17);

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(16, 16, 16));
        jButton18.setText("2");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton18);

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(16, 16, 16));
        jButton19.setText("3");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton19);

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(16, 16, 16));
        jButton20.setText("+");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton20);

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(16, 16, 16));
        jButton21.setText("±");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton21);

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(16, 16, 16));
        jButton22.setText("0");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton22);

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(16, 16, 16));
        jButton23.setText(".");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton23);

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton24.setForeground(new java.awt.Color(16, 16, 16));
        jButton24.setText("=");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        tustakımı.add(jButton24);

        ilk.add(tustakımı, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 330, 350));

        getContentPane().add(ilk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        number = Double.parseDouble(input.getText());
        operation = 3;
        input.setText("");
        lbl.setText(number +" "+ evt.getActionCommand());
    }//GEN-LAST:event_jButton12ActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        if(drawer.isShow()){
            drawer.hide();
        }else{
            drawer.show();
        }
    }//GEN-LAST:event_historyActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        number = Double.parseDouble(input.getText());
        operation = 1;
        input.setText("");
        lbl.setText(number +" "+ evt.getActionCommand());
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        input.setText(input.getText()+"-");
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        calculate();
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        number = Double.parseDouble(input.getText());
        operation = 2;
        input.setText("");
        lbl.setText(number +" "+ evt.getActionCommand());
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        number = Double.parseDouble(input.getText());
        operation = 4;
        input.setText("");
        lbl.setText(number +" "+ evt.getActionCommand());
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        input.setText(input.getText()+evt.getActionCommand());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        input.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        delete1();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        number = Double.parseDouble(input.getText());
        operation = 8;
        input.setText("");
        lbl.setText(number +" "+ evt.getActionCommand());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        number = Double.parseDouble(input.getText());
        operation = 5;
        input.setText("");
        lbl.setText("1/("+number+")");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        number = Double.parseDouble(input.getText());
        operation = 6;
        input.setText("");
        lbl.setText(number+"²");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        number = Double.parseDouble(input.getText());
        operation = 7;
        input.setText("");
        lbl.setText("√"+number);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SıgnUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SıgnUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SıgnUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SıgnUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SıgnUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton history;
    private javax.swing.JPanel ilk;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel lbl;
    private javax.swing.JPanel sonuc;
    private javax.swing.JPanel tustakımı;
    // End of variables declaration//GEN-END:variables
}
