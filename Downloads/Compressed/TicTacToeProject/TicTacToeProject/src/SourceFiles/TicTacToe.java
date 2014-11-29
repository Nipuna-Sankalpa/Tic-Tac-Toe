/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Dilip
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    static int winComb[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}};
    public static int[][] state = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    static Player pl1;
    static Player pl2;
    public static int butClicked = 0;
    static String player1Name;
    static String player2Name;
    PlayerOptionSingle singlePlay;
    PlayerOptionMulti multiPlay;
    PlayerList playerList = new PlayerList();
    boolean clickStart = false;
    int turn = 0;

    public TicTacToe() {
        initComponents();
        Congrat.setVisible(false);
        ImageIcon icon = new ImageIcon(getClass().getResource("/resource/start.png"));
        start.setDisabledIcon(icon);
        start.disable();
    }

    public void start() {
        int current = 1;
        turn = 1;
        int w = 0;
        while ((w = checkWin(turn, state)) == 0) {
            if (current == 1) {
                notification.setText(player1Name + " Turn");
                pl1.playTurn(1, turn);
                refreshGrid();
                current = 2;
            } else if (current == 2) {
                notification.setText(player2Name + " Turn");
                pl2.playTurn(2, turn);
                refreshGrid();
                current = 1;
            }
            turn++;
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (w == 1) {
            pl1.notifyWin(1);
            pl2.notifyLose(2);
            print(1);

        } else if (w == 2) {
            pl2.notifyWin(1);
            pl1.notifyLose(2);
            print(2);

        } else if (w == -1) {
            print(-1);
            pl1.notifyDraw();
            pl2.notifyDraw();

        }
        try {
            Thread.sleep(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
        }
        clickStart = false;
    }

    public void refreshGrid() {

        ImageIcon icon;
        if (state[0][0] == 1) {
            icon = new ImageIcon(getClass().getResource("/resource/wrong.png"));
            jButton1.setIcon(icon);
        } else if (state[0][0] == 2) {
            icon = new ImageIcon(getClass().getResource("/resource/right.png"));
            jButton1.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/resource/1.jpg"));
            jButton1.setIcon(icon);
        }
        ///////////////////
        if (state[0][1] == 1) {
            icon = new ImageIcon(getClass().getResource("/resource/wrong.png"));
            jButton2.setIcon(icon);
        } else if (state[0][1] == 2) {
            icon = new ImageIcon(getClass().getResource("/resource/right.png"));
            jButton2.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/resource/2.jpg"));
            jButton2.setIcon(icon);
        }
        /////////////////
        if (state[0][2] == 1) {
            icon = new ImageIcon(getClass().getResource("/resource/wrong.png"));
            jButton3.setIcon(icon);
        } else if (state[0][2] == 2) {
            icon = new ImageIcon(getClass().getResource("/resource/right.png"));
            jButton3.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/resource/3.jpg"));
            jButton3.setIcon(icon);
        }
        ///////////////
        if (state[1][0] == 1) {
            icon = new ImageIcon(getClass().getResource("/resource/wrong.png"));
            jButton4.setIcon(icon);
        } else if (state[1][0] == 2) {
            icon = new ImageIcon(getClass().getResource("/resource/right.png"));
            jButton4.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/resource/4.jpg"));
            jButton4.setIcon(icon);
        }
        ////////////////
        if (state[1][1] == 1) {
            icon = new ImageIcon(getClass().getResource("/resource/wrong.png"));
            jButton5.setIcon(icon);
        } else if (state[1][1] == 2) {
            icon = new ImageIcon(getClass().getResource("/resource/right.png"));
            jButton5.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/resource/5.jpg"));
            jButton5.setIcon(icon);
        }
        ////////////////////
        if (state[1][2] == 1) {
            icon = new ImageIcon(getClass().getResource("/resource/wrong.png"));
            jButton6.setIcon(icon);
        } else if (state[1][2] == 2) {
            icon = new ImageIcon(getClass().getResource("/resource/right.png"));
            jButton6.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/resource/6.jpg"));
            jButton6.setIcon(icon);
        }
        /////////////////
        if (state[2][0] == 1) {
            icon = new ImageIcon(getClass().getResource("/resource/wrong.png"));
            jButton7.setIcon(icon);
        } else if (state[2][0] == 2) {
            icon = new ImageIcon(getClass().getResource("/resource/right.png"));
            jButton7.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/resource/7.jpg"));
            jButton7.setIcon(icon);
        }
        ////////////////
        if (state[2][1] == 1) {
            icon = new ImageIcon(getClass().getResource("/resource/wrong.png"));
            jButton8.setIcon(icon);
        } else if (state[2][1] == 2) {
            icon = new ImageIcon(getClass().getResource("/resource/right.png"));
            jButton8.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/resource/8.jpg"));
            jButton8.setIcon(icon);
        }
        /////////////////
        if (state[2][2] == 1) {
            icon = new ImageIcon(getClass().getResource("/resource/wrong.png"));
            jButton9.setIcon(icon);
        } else if (state[2][2] == 2) {
            icon = new ImageIcon(getClass().getResource("/resource/right.png"));
            jButton9.setIcon(icon);
        } else {
            icon = new ImageIcon(getClass().getResource("/resource/9.jpg"));
            jButton9.setIcon(icon);
        }
    }

    public static int checkWin(int turn, int[][] st) {
        int ret = 0;
        String x = "";
        String o = "";
        int i = 0, j = 0, c = 0, p, q;
        for (p = 0; p < 3; p++) {
            for (q = 0; q < 3; q++) {
                c++;
                if (st[p][q] == 1) {
                    x += c;
                } else if (st[p][q] == 2) {
                    o += c;
                }
            }
        }
        //print(x+" : "+o);
        ret = checkWin2(x, o);

        if (turn == 10 && ret == 0) {
            ret = -1;
        }
        return ret;
    }

    public static int checkWin2(String x, String o) {
        int ret = 0;
        int p;
        for (p = 0; p < 8; p++) {

            if (x.indexOf((char) winComb[p][0] + '0') > -1 && x.indexOf((char) winComb[p][1] + '0') > -1 && x.indexOf((char) winComb[p][2] + '0') > -1) {
                ret = 1;
                break;
            }
            if (o.indexOf((char) winComb[p][0] + '0') > -1 && o.indexOf((char) winComb[p][1] + '0') > -1 && o.indexOf((char) winComb[p][2] + '0') > -1) {
                ret = 2;
                break;
            }
        }

        return ret;
    }

    public void print(int win) {

        ImageIcon icon;
        if (win == 1) {
            icon = new ImageIcon(getClass().getResource("/resource/congrat1.png"));
        } else if (win == 2) {
            icon = new ImageIcon(getClass().getResource("/resource/congrat2.png"));
        } else {
            icon = new ImageIcon(getClass().getResource("/resource/congrat3.png"));
        }
        Congrat.setIcon(icon);
        Congrat.setVisible(true);
        start.setVisible(false);
        icon = new ImageIcon(getClass().getResource("/resource/start.png"));
        start.setIcon(icon);
        start.setVisible(true);
    }

    public void gameInit() {
        state[0][0] = 0;
        state[0][1] = 0;
        state[0][2] = 0;
        state[1][0] = 0;
        state[1][1] = 0;
        state[1][2] = 0;
        state[2][0] = 0;
        state[2][1] = 0;
        state[2][2] = 0;
        refreshGrid();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Congrat = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        notification = new javax.swing.JLabel();
        radioMulti = new javax.swing.JRadioButton();
        radioSingle = new javax.swing.JRadioButton();
        jButton11 = new javax.swing.JButton();
        start = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Congrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 400, 200));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/1.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 69, 144, 144));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/2.jpg"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 69, 144, 144));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/3.jpg"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 69, 144, 144));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/4.jpg"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 225, 144, 144));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/5.jpg"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 225, 144, 144));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/6.jpg"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 225, 144, 144));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/7.jpg"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 382, 144, 144));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/8.jpg"))); // NOI18N
        jButton8.setToolTipText("");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setOpaque(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 382, 144, 144));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/9.jpg"))); // NOI18N
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setOpaque(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 382, 144, 144));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/SelectPlayers.png"))); // NOI18N
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setOpaque(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 300, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/MultiPlayer1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/SinglePlayer1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, 30));

        notification.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        notification.setForeground(new java.awt.Color(255, 255, 255));
        notification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notification.setText("select multiplay or singleplay");
        notification.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 565, 360, 30));

        buttonGroup1.add(radioMulti);
        radioMulti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(radioMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        buttonGroup1.add(radioSingle);
        radioSingle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(radioSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Score.png"))); // NOI18N
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setOpaque(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 200, 50));

        start.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/start.png"))); // NOI18N
        start.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                startMouseReleased(evt);
            }
        });
        getContentPane().add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Exit.png"))); // NOI18N
        exit.setText("jLabel1");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                exitMouseReleased(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 200, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Background.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (state[0][0] == 0) {
            butClicked = 1;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (state[0][1] == 0) {
            butClicked = 2;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (state[0][2] == 0) {
            butClicked = 3;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (state[1][0] == 0) {
            butClicked = 4;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (state[1][1] == 0) {
            butClicked = 5;
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (state[1][2] == 0) {
            butClicked = 6;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (state[2][0] == 0) {
            butClicked = 7;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if (state[2][1] == 0) {
            butClicked = 8;
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (state[2][2] == 0) {
            butClicked = 9;
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void startMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseReleased
        // TODO add your handling code here:
        if (turn == 0) {
            clickStart = true;
        } else {
            reset();
            clickStart = true;

        }

    }//GEN-LAST:event_startMouseReleased
    public void reset() {
        Congrat.setVisible(false);
        ImageIcon icon;
        start.setVisible(false);
        start.setSize(200, 50);
        icon = new ImageIcon(getClass().getResource("/resource/start.png"));
        start.setIcon(icon);
        start.setVisible(true);
    }
    private void exitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseReleased

        try {
            FileOutputStream fileStream = new FileOutputStream("playerList.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(playerList.getList());
        } catch (Exception e) {

        }
        System.exit(0);
    }//GEN-LAST:event_exitMouseReleased

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if (radioSingle.isSelected()) {
            singlePlay = new PlayerOptionSingle();
            singlePlay.setVisible(true);

        } else {
            multiPlay = new PlayerOptionMulti();
            multiPlay.setVisible(true);

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Score score = new Score();
        score.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed
    void checkRadio() {
        while (radioSingle.isSelected() == false && radioMulti.isSelected() == false) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    void playerSelected() {
        while (singlePlay == null && multiPlay == null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (radioSingle.isSelected()) {
            while (singlePlay.playerName == null) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            player1Name = singlePlay.playerName;
        } else {
            while (multiPlay.player1Name == null || multiPlay.player2Name == null) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            player1Name = multiPlay.player1Name;
            player2Name = multiPlay.player2Name;
        }
    }

    public boolean isSingle() {
        if (radioSingle.isSelected() == true) {
            return true;
        } else {
            return false;
        }
    }

    void load() {
        ArrayList temp = null;
        try {
            FileInputStream fileStream = new FileInputStream("playerList.ser");
            ObjectInputStream os = new ObjectInputStream(fileStream);
            temp = (ArrayList) os.readObject();
            for (int i = 0; i < temp.size(); i++) {
            playerList.addPlayers((Human) temp.get(i));
        }
        } catch (Exception e) {
            
        }
    }

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        TicTacToe t = new TicTacToe();
        t.setVisible(true);
        t.load();
        t.checkRadio();
        t.notification.setText("Select Players");
        t.playerSelected();
        pl1 = t.playerList.getPlayers(player1Name);
        if (t.isSingle()) {
            pl2 = new Computer("layer");
        } else {
            pl2 = t.playerList.getPlayers(player2Name);
        }

        t.start.enable();
        t.notification.setText("Click Start");

        while (t.clickStart == false) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        while (true) {
            t.start();
            t.notification.setText("Play Again");
            while (t.clickStart == false) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            t.gameInit();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Congrat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel notification;
    private javax.swing.JRadioButton radioMulti;
    private javax.swing.JRadioButton radioSingle;
    private javax.swing.JLabel start;
    // End of variables declaration//GEN-END:variables
}
