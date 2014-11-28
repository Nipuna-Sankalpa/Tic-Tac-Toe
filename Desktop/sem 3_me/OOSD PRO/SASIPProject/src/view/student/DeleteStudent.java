/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.student;

import controller.student.StudentDetailController;
import datalayer.student.StudentDA;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.student.Student;
import utilities.ComboBoxUtility;

/**
 *
 * @author Mampitiya
 */
public class DeleteStudent extends javax.swing.JInternalFrame {

    private DefaultTableModel tableModel;
    private StudentDetailController controller;

    /**
     * Creates new form DeleteStudent
     */
    public DeleteStudent() {
        String columns[] = {"Class ID", "Year", "Category", "Day"};
        tableModel = new DefaultTableModel(columns, 0);
        initComponents();
        imgLbl.setPreferredSize(new Dimension(128, 128));
        imgLbl.setMaximumSize(new Dimension(128, 128));
        imgLbl.setMinimumSize(new Dimension(128, 128));
        controller = new StudentDetailController();
        try {
            ComboBoxUtility.setComboItem(idCmbx, "Select studentID from student order by 1");
            ComboBoxUtility.setComboItem(nameCmbx, "Select concat(firstName,' ',lastName) as name from student");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Database Error!");
            ex.printStackTrace();
        }
    }
    
    public DeleteStudent(StudentDetailController controller) {
        String columns[] = {"Class ID", "Year", "Category", "Day"};
        tableModel = new DefaultTableModel(columns, 0);
        initComponents();
        try {
            ComboBoxUtility.setComboItem(idCmbx, "Select studentID from student order by 1");
            ComboBoxUtility.setComboItem(nameCmbx, "Select concat(firstName,' ',lastName) as name from student");
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Database Error!");
            ex.printStackTrace();
        }
        
        this.controller = controller;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        idRbtn = new javax.swing.JRadioButton();
        idCmbx = new javax.swing.JComboBox();
        nameRbtn = new javax.swing.JRadioButton();
        nameCmbx = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        genderTxt = new javax.swing.JTextField();
        clrBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gurdNameTxt = new javax.swing.JTextField();
        guardPhnTxt = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        imgLbl = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        classDetailTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();

        setBorder(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By"));

        idRbtn.setSelected(true);
        idRbtn.setText("Student ID:");
        idRbtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                idRbtnStateChanged(evt);
            }
        });

        idCmbx.setEditable(true);
        idCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCmbxActionPerformed(evt);
            }
        });

        nameRbtn.setText("Student Name:");
        nameRbtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                nameRbtnStateChanged(evt);
            }
        });

        nameCmbx.setEditable(true);
        nameCmbx.setEnabled(false);
        nameCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCmbxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idRbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(nameRbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idRbtn)
                    .addComponent(idCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameRbtn)
                    .addComponent(nameCmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Profile"));

        jLabel3.setText("Address: ");

        jLabel4.setText("Telephone: ");

        jLabel5.setText("Gender: ");

        addTxt.setEditable(false);

        phoneTxt.setEditable(false);

        genderTxt.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addTxt)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(genderTxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clrBtn.setBackground(new java.awt.Color(153, 180, 209));
        clrBtn.setText("Clear");
        clrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtnActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Guardian Details"));

        jLabel2.setText("Name: ");

        jLabel6.setText("Telephone:");

        gurdNameTxt.setEditable(false);

        guardPhnTxt.setEditable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gurdNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guardPhnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(gurdNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardPhnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Image"));

        imgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/student_images/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgLbl))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Class Details"));

        classDetailTable.setModel(tableModel);
        jScrollPane1.setViewportView(classDetailTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
        );

        deleteBtn.setText("Delete");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 627, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clrBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void idRbtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_idRbtnStateChanged
        if (idRbtn.isSelected()) {
            idCmbx.setEnabled(true);
            nameCmbx.setEnabled(false);
        }
    }//GEN-LAST:event_idRbtnStateChanged

    private void idCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCmbxActionPerformed
        String id = "";
        if (idCmbx.getSelectedItem() != null && idCmbx.getSelectedIndex() != 0) {
            id = idCmbx.getSelectedItem().toString();
            try {
                Student student = controller.searchStudentByID(id);
                addTxt.setText(student.getAddress());
                phoneTxt.setText(student.getMobileNumber());
                genderTxt.setText(student.isMale() ? "Male" : "Female");
                gurdNameTxt.setText(student.getGuardianName());
                guardPhnTxt.setText(student.getGuardianNumber());
                imgLbl.setIcon(student.getImage());
                nameCmbx.setSelectedItem(student.getFirstName() + " " + student.getLastName());
                ResultSet rst = controller.getClassDetails(id);
                while (rst.next()) {
                    tableModel.addRow(new String[]{rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4)});
                }
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_idCmbxActionPerformed

    private void nameRbtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_nameRbtnStateChanged
        if (nameRbtn.isSelected()) {
            nameCmbx.setEnabled(true);
            idCmbx.setEnabled(false);
        }
    }//GEN-LAST:event_nameRbtnStateChanged

    private void nameCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCmbxActionPerformed
        tableModel.setRowCount(0);
        String name = "";
        if (nameCmbx.getSelectedItem() != null && nameCmbx.getSelectedIndex() != 0) {
            name = nameCmbx.getSelectedItem().toString();
            try {
                Student student = controller.searchStudentByName(name);
                addTxt.setText(student.getAddress());
                phoneTxt.setText(student.getMobileNumber());
                genderTxt.setText(student.isMale() ? "Male" : "Female");
                gurdNameTxt.setText(student.getGuardianName());
                guardPhnTxt.setText(student.getGuardianNumber());
                guardPhnTxt.setText(student.getGuardianNumber());
                imgLbl.setIcon(student.getImage());
                idCmbx.setSelectedItem(student.getStudentID());
                ResultSet rst = controller.getClassDetailsByName(nameCmbx.getSelectedItem().toString());
                while (rst.next()) {
                    tableModel.addRow(new String[]{rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4)});
                }
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_nameCmbxActionPerformed

    private void clrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrBtnActionPerformed
        idCmbx.setSelectedIndex(0);
        nameCmbx.setSelectedIndex(0);
        tableModel.setRowCount(0);
        phoneTxt.setText("");
        addTxt.setText("");
        guardPhnTxt.setText("");
        gurdNameTxt.setText("");
        genderTxt.setText("");
        imgLbl.setIcon(new ImageIcon(getClass().getResource("/resources/student_images/user.png")));
    }//GEN-LAST:event_clrBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int rst = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete " + nameCmbx.getSelectedItem() + "?");
        if (rst == 0) {
            String id = idCmbx.getSelectedItem().toString();            
            int rs = controller.deleteStudent(id);
            if(rs == 1){
                JOptionPane.showMessageDialog(this, "Successfully Deleted!");
                clrBtnActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addTxt;
    private javax.swing.JTable classDetailTable;
    private javax.swing.JButton clrBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField genderTxt;
    private javax.swing.JTextField guardPhnTxt;
    private javax.swing.JTextField gurdNameTxt;
    private javax.swing.JComboBox idCmbx;
    private javax.swing.JRadioButton idRbtn;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox nameCmbx;
    private javax.swing.JRadioButton nameRbtn;
    private javax.swing.JTextField phoneTxt;
    // End of variables declaration//GEN-END:variables
}