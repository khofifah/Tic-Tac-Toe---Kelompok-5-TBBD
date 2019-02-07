/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacTes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Khofi Muffin
 */
public class TicTacToe_Screen extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int x = xCount - xCount;
    private int o = oCount - oCount;
    
    /**
     * Creates new form TicTacToe_Screen
     */
    public TicTacToe_Screen() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
        
    }
    
    private void gameScore(){
        labelPlayerX.setText(String.valueOf(xCount));
        labelPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choosePlayer(){
        if(startGame.equals("X")){
            startGame = "O";
        } else {
            startGame = "X";
        }
    }
    
    private void clearBtn(){
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
    }
    
    private void WinYes(){
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        if(b1 == ("X") && b2== ("X") && b3 == ("X")){
            btn1.setBackground(Color.YELLOW);
            btn2.setBackground(Color.YELLOW);
            btn3.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b4 == ("X") && b5== ("X") && b6 == ("X")){
            btn4.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b7 == ("X") && b8 == ("X") && b9 == ("X")){
            btn7.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b1 == ("X") && b4== ("X") && b7 == ("X")){
            btn1.setBackground(Color.YELLOW);
            btn4.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b2== ("X") && b5== ("X") && b8 == ("X")){
            btn2.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b3 == ("X") && b6== ("X") && b9 == ("X")){
            btn3.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b1 == ("X") && b5== ("X") && b9 == ("X")){
            btn1.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b3 == ("X") && b5== ("X") && b7 == ("X")){
            btn3.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player X wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        
        if(b1 == ("O") && b2== ("O") && b3 == ("O")){
            btn1.setBackground(Color.YELLOW);
            btn2.setBackground(Color.YELLOW);
            btn3.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b4 == ("O") && b5== ("O") && b6 == ("O")){
            btn4.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b7 == ("O") && b8 == ("O") && b9 == ("O")){
            btn7.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b1 == ("O") && b4== ("O") && b7 == ("O")){
            btn1.setBackground(Color.YELLOW);
            btn4.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b2== ("O") && b5== ("O") && b8 == ("O")){
            btn2.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b3 == ("O") && b6== ("O") && b9 == ("O")){
            btn3.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b1 == ("O") && b5== ("O") && b9 == ("O")){
            btn1.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
        }
        
        if(b3 == ("O") && b5== ("O") && b7 == ("O")){
            btn3.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn7.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            JOptionPane.showMessageDialog(this, "Player O wins!!!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            clearBtn();
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

        try {
            jPanel1 =(javax.swing.JPanel)java.beans.Beans.instantiate(getClass().getClassLoader(), "TicTacTes.TicTacToe_Screen");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btn4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btn5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btn6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        labelPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe - Kelompok 5 TBBD");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tic Tac Toe");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 3));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        btn1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        btn2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        btn3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel5.add(btn3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player X:");
        jPanel6.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        labelPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayerX.setText("0");
        jPanel7.add(labelPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        btn4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel8.add(btn4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        btn5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel9.add(btn5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        btn6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel10.add(btn6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Player O:");
        jPanel11.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        labelPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        labelPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPlayerO.setText("0");
        jPanel12.add(labelPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        btn7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel13.add(btn7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        btn8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel14.add(btn8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        btn9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel15.add(btn9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel16.add(btnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel17.add(btnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you want to exit?", "Tic Tac Toe - Kelompok 5 TBBD",
                JOptionPane.YES_NO_OPTION)!= JOptionPane.YES_NO_OPTION)
        {
        } else {
            System.exit(0);
        } 
    }//GEN-LAST:event_btnExitActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if(btn1.getText() != null){
            btn1.setText(startGame);
            if(startGame.equalsIgnoreCase("X")){
                btn1.setForeground(Color.magenta);
            } else {
                btn1.setForeground(Color.ORANGE);
            }
            choosePlayer();
            WinYes();
        }
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            btn2.setForeground(Color.magenta);
        } else {
            btn2.setForeground(Color.ORANGE);
        }
        choosePlayer();
        WinYes();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            btn3.setForeground(Color.magenta);
        } else {
            btn3.setForeground(Color.ORANGE);
        }
        choosePlayer();
        WinYes();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            btn4.setForeground(Color.magenta);
        } else {
            btn4.setForeground(Color.ORANGE);
        }
        choosePlayer();
        WinYes();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            btn5.setForeground(Color.magenta);
        } else {
            btn5.setForeground(Color.ORANGE);
        }
        choosePlayer();
        WinYes();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            btn6.setForeground(Color.magenta);
        } else {
            btn6.setForeground(Color.ORANGE);
        }
        choosePlayer();
        WinYes();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            btn7.setForeground(Color.magenta);
        } else {
            btn7.setForeground(Color.ORANGE);
        }
        choosePlayer();
        WinYes();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            btn8.setForeground(Color.magenta);
        } else {
            btn8.setForeground(Color.ORANGE);
        }
        choosePlayer();
        WinYes();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            btn9.setForeground(Color.magenta);
        } else {
            btn9.setForeground(Color.ORANGE);
        }
        choosePlayer();
        WinYes();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
               
        if(JOptionPane.showConfirmDialog(frame, "Are You really want to reset this game?", "Tic Tac Toe - Kelompok 5 TBBD",
                JOptionPane.YES_NO_OPTION)!= JOptionPane.YES_NO_OPTION)
        {
        } else {
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        
        btn1.setBackground(Color.LIGHT_GRAY);
        btn2.setBackground(Color.LIGHT_GRAY);
        btn3.setBackground(Color.LIGHT_GRAY);
        btn4.setBackground(Color.LIGHT_GRAY);
        btn5.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.LIGHT_GRAY);
        
        labelPlayerX.setText(String.valueOf(x));
        labelPlayerO.setText(String.valueOf(o));
        } 
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelPlayerO;
    private javax.swing.JLabel labelPlayerX;
    // End of variables declaration//GEN-END:variables
}

