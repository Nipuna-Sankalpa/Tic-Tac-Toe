/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceFiles;

/**
 *
 * @author Dilip
 */
public class PlayerOptionSingle extends javax.swing.JFrame {

    /**
     * Creates new form PlayerOption
     */
    public String playerName = null;
    static PlayerList playerList = new PlayerList();

    public PlayerOptionSingle() {
        initComponents();
        fillCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        cmbPlayer = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        btnADD = new javax.swing.JButton();
        lblNotification = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 180, 40));

        getContentPane().add(cmbPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 180, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/next.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 470, 120, 50));

        btnADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/add.png"))); // NOI18N
        btnADD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnADD.setOpaque(false);
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });
        getContentPane().add(btnADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 275, 120, 50));

        lblNotification.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNotification.setForeground(new java.awt.Color(255, 255, 255));
        lblNotification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotification.setText("Select Player or Add Player");
        getContentPane().add(lblNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 565, 380, 30));

        jLabel3.setFont(new java.awt.Font("Futura LT", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Player :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Futura LT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Player : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/BackgroundStart.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        playerName = cmbPlayer.getSelectedItem().toString();
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        // TODO add your handling code here:
        if(playerList.contain(txtName.getText()))
            lblNotification.setText("Player Name has Already Added");
        else
        {
        Human player;
        player = new Human(txtName.getText());
        playerList.addPlayers(player);
        fillCombo();
        txtName.setText("");
        }
    }//GEN-LAST:event_btnADDActionPerformed

    public void fillCombo() {
        
        cmbPlayer.removeAllItems();
        for (int i = 0; i < playerList.getSize(); i++) {
            cmbPlayer.addItem(playerList.getPlayerName(i));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JComboBox cmbPlayer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNotification;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
