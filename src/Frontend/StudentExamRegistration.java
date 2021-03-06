/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import DatabaseLayer.DBConnection;
import DatabaseLayer.DBUserConnection;
import Models.StudentExamRegistrationVer;
import java.sql.PreparedStatement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class StudentExamRegistration extends javax.swing.JInternalFrame {
    Models.StudentExamRegistrationVer ExmReg;

    
 
    /**
     * Creates new form StudentExamRegistration
     */
    public StudentExamRegistration() {
        initComponents();
        ExmReg = new StudentExamRegistrationVer();
        showTableData();
        showExamRegstraionTableData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblExamRegisterID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIndex = new javax.swing.JTextField();
        cmbExam = new javax.swing.JComboBox<>();
        cmbHall = new javax.swing.JComboBox<>();
        txtTime = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ExamRegistrationTbl = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExamTbl = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbGender = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        cmbIndex = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnGenerate = new javax.swing.JButton();
        btnPrintAddmission = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAddmission = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Exam Register ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 39, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 161, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Exam ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 85, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 239, 40, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hall");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 277, 40, 14));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Time");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 315, 40, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 353, 40, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 101, 43));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 430, 101, 43));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 430, 93, 43));

        lblExamRegisterID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(lblExamRegisterID, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 39, 155, 20));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 159, 152, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Exam Index Number");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 123, -1, -1));
        getContentPane().add(txtIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 121, 74, -1));

        cmbExam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbExam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Exam-", "IELTS", "FCE", "PET", "KET" }));
        getContentPane().add(cmbExam, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 237, 152, -1));

        cmbHall.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbHall.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Hall-", "Hall 01", "Hall 02", "Hall 03", "" }));
        getContentPane().add(cmbHall, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 275, 152, -1));

        txtTime.setEditable(false);
        getContentPane().add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 313, 152, -1));

        txtDate.setEditable(false);
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 351, 152, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 201, 66, -1));

        ExamRegistrationTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Exam Reg ID", "Index Number", "Student Name", "Gender", "Exam ID", "Type", "Halll", "Time", "Date", "Email"
            }
        ));
        ExamRegistrationTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExamRegistrationTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ExamRegistrationTbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 240, 784, 131));

        ExamTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Exam Id", "Type", "Hall", "Time", "Date"
            }
        ));
        ExamTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExamTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ExamTbl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 83, 784, 110));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Registerd Students");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Exam Table");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 53, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 484, 101, 40));

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 484, 101, 40));

        cmbGender.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Gender-", "Male", "Female" }));
        getContentPane().add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 199, 152, -1));

        txtId.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 83, 152, -1));

        cmbIndex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbIndex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Type-", "IE", "FE", "PE", "KE" }));
        cmbIndex.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIndexActionPerformed(evt);
            }
        });
        getContentPane().add(cmbIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 121, 72, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Email");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 389, 40, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 389, 152, -1));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReset.setText("Reset Addmission");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 560, 141, 30));

        btnGenerate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGenerate.setText("Generate Addmission");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, 157, 30));

        btnPrintAddmission.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPrintAddmission.setText("Print Addmission");
        btnPrintAddmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintAddmissionActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrintAddmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 560, -1, 30));

        txtAddmission.setColumns(20);
        txtAddmission.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAddmission.setRows(5);
        txtAddmission.setToolTipText("");
        jScrollPane3.setViewportView(txtAddmission);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 463, 142));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Admission Card");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 104, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 51));
        jLabel14.setText("Exam Registration");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void ExamTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamTblMouseClicked
        int row = ExamTbl.getSelectedRow();
            TableModel model = ExamTbl.getModel();
            txtId.setText(model.getValueAt(row, 0).toString());
            String type = model.getValueAt(row, 1).toString();
                switch(type){
                    case "IELTS":
                        cmbExam.setSelectedIndex(1);
                        break;
                    case "FCE":
                        cmbExam.setSelectedIndex(2);
                        break;
                    case "PET":
                        cmbExam.setSelectedIndex(3);
                        break;
                    case "KET":
                        cmbExam.setSelectedIndex(4);
                        break;
                }
            String hall = model.getValueAt(row, 2).toString();
                switch(hall){
                    case "Hall 01":
                        cmbHall.setSelectedIndex(1);
                        break;
                    case "Hall 02":
                        cmbHall.setSelectedIndex(2);
                        break;
                    case "Hall 03":
                        cmbHall.setSelectedIndex(3);
                        break;
                }
            txtTime.setText(model.getValueAt(row, 3).toString());
            txtDate.setText(model.getValueAt(row, 4).toString());
    }//GEN-LAST:event_ExamTblMouseClicked

    private void ExamRegistrationTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExamRegistrationTblMouseClicked
        int row = ExamRegistrationTbl.getSelectedRow();
        TableModel model = ExamRegistrationTbl.getModel();
        lblExamRegisterID.setText(model.getValueAt(row, 0).toString());
        txtId.setText(model.getValueAt(row, 1).toString());
        txtIndex.setText(model.getValueAt(row, 2).toString());
        txtName.setText(model.getValueAt(row, 3).toString());
        String Gender = model.getValueAt(row, 4).toString();
                switch(Gender){
                    case "Male":
                        cmbExam.setSelectedIndex(1);
                        break;
                    case "Female":
                        cmbExam.setSelectedIndex(2);
                        break;
                }
        String type = model.getValueAt(row, 5).toString();
                switch(type){
                    case "IELTS":
                        cmbExam.setSelectedIndex(1);
                        break;
                    case "FCE":
                        cmbExam.setSelectedIndex(2);
                        break;
                    case "PET":
                        cmbExam.setSelectedIndex(3);
                        break;
                    case "KET":
                        cmbExam.setSelectedIndex(4);
                        break;
                }
        String hall = model.getValueAt(row, 6).toString();
                switch(hall){
                    case "Hall 01":
                        cmbHall.setSelectedIndex(1);
                        break;
                    case "Hall 02":
                        cmbHall.setSelectedIndex(2);
                        break;
                    case "Hall 03":
                        cmbHall.setSelectedIndex(3);
                        break;
                }
        txtTime.setText(model.getValueAt(row, 7).toString());
        txtDate.setText(model.getValueAt(row, 8).toString());
        txtEmail.setText(model.getValueAt(row, 9).toString());
        
        
    }//GEN-LAST:event_ExamRegistrationTblMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        lblExamRegisterID.setText("");
        txtId.setText("");
        txtIndex.setText("");
        txtName.setText("");
        cmbGender.setSelectedIndex(0);
        cmbExam.setSelectedIndex(0);
        cmbHall.setSelectedIndex(0);
        txtTime.setText("");
        txtDate.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String Id = txtId.getText();
        String Index = txtIndex.getText();
        String Name = txtName.getText();
        int Gender = cmbGender.getSelectedIndex();
        int Type = cmbExam.getSelectedIndex();
        int Hall= cmbHall.getSelectedIndex();
        String Time  = txtTime.getText();
        String Date = txtDate.getText();
        String Email = txtEmail.getText();
        
        if ((Id.isEmpty()) || (Index.isEmpty()) || (Name.isEmpty()) || (Gender == 0) || (Type == 0) || (Hall == 0) || (Time.isEmpty())  ||(Date == null) || (Email.isEmpty())){
            JOptionPane.showMessageDialog(this, "Please Select Correct Student Details");
        }else{
            ExmReg.setExamId(txtId.getText());
            ExmReg.setExamIndex(txtIndex.getText());
            ExmReg.setStudentName(txtName.getText());
            ExmReg.setStudentGender(cmbGender.getSelectedItem().toString());
            ExmReg.setExamType(cmbExam.getSelectedItem().toString());
            ExmReg.setExamHall(cmbHall.getSelectedItem().toString());
            ExmReg.setExamTime(txtTime.getText());
            ExmReg.setExamDate(txtDate.getText());
            ExmReg.setStudentEmail(txtEmail.getText());
            
            DatabaseLayer.DBUserConnection up = new DBUserConnection();
            up.AddExamRegistration(ExmReg);
            JOptionPane.showMessageDialog(rootPane, "Exam Registration Added Successfully");
        
            txtId.setText("");
            txtIndex.setText("");
            txtName.setText("");
            cmbGender.setSelectedIndex(0);
            cmbExam.setSelectedIndex(0);
            cmbHall.setSelectedIndex(0);
            txtTime.setText("");
            txtDate.setText(null);
            txtEmail.setText("");
            
            showExamRegstraionTableData();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DBConnection con = new DBConnection();
        String sql = "update ExamRegistration set StudentName = ?, Gender = ?,ExamType = ?, ExamHall = ?, ExamTime = ?, ExamDate = ?, StudentEmail = ? where ExamRegistrationID = ?";
        
        int Type = cmbExam.getSelectedIndex();
        
        try {
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            prep.setString(1, txtName.getText());
            prep.setString(2, cmbGender.getSelectedItem().toString());
            prep.setString(3, cmbExam.getSelectedItem().toString());
            prep.setString(4, cmbHall.getSelectedItem().toString());
            prep.setString(5, txtTime.getText());
            prep.setString(6, txtDate.getText());
            prep.setString(7, txtEmail.getText());
            prep.setString(8, lblExamRegisterID.getText());
            prep.executeUpdate();
            
            if ((Type == 0)){
            JOptionPane.showMessageDialog(this, "Please Select Correct Student Details For update");
            }else{
                JOptionPane.showMessageDialog(null, "Updated");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showExamRegstraionTableData();
            
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DBConnection con = new DBConnection();
        String sql = "delete from ExamRegistration where ExamRegistrationID = ?";
        int Type = cmbExam.getSelectedIndex();
    try {
             PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
             prep.setString(1, lblExamRegisterID.getText());
             prep.execute();
             if ((Type == 0)){
            JOptionPane.showMessageDialog(this, "Please Select Correct Student Details For Delete");
            }else{
             JOptionPane.showMessageDialog(null, "Deleted");
             }
  
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
         showExamRegstraionTableData();
         
         lblExamRegisterID.setText("");
         txtId.setText("");
         txtIndex.setText("");
         txtName.setText("");
         cmbGender.setSelectedIndex(0);
         cmbExam.setSelectedIndex(0);
         cmbHall.setSelectedIndex(0);
         txtTime.setText("");
         txtDate.setText("");
         txtEmail.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIndexActionPerformed
        String selectedValue = cmbIndex.getSelectedItem().toString();
        
        txtIndex.setText(selectedValue+txtIndex.getText());
    }//GEN-LAST:event_cmbIndexActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtAddmission.setText("");
        lblExamRegisterID.setText("");
        txtId.setText("");
        txtIndex.setText("");
        txtName.setText("");
        cmbGender.setSelectedIndex(0);
        cmbExam.setSelectedIndex(0);
        cmbHall.setSelectedIndex(0);
        txtTime.setText("");
        txtDate.setText("");
        txtEmail.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        txtAddmission.setText("----------------------------------------------------------------------------------------------------\n");
        txtAddmission.setText(txtAddmission.getText()+"                                CAMBRIDGE ENGLISH LANGUAGE SCHOOL (CELS)                       \n\n");
        txtAddmission.setText(txtAddmission.getText()+"                                                  Anuradhapura                       \n\n");
        txtAddmission.setText(txtAddmission.getText()+"                                                Exam Addmission                       \n");
        txtAddmission.setText(txtAddmission.getText()+"----------------------------------------------------------------------------------------------------\n\n\n");
        txtAddmission.setText(txtAddmission.getText()+"  Exam Date               :     "+txtDate.getText()+"\n\n");
        txtAddmission.setText(txtAddmission.getText()+"  Exam Time               :     "+txtTime.getText()+"\n\n");
        txtAddmission.setText(txtAddmission.getText()+"  Exam Index Number :      "+txtIndex.getText()+"\n\n");
        txtAddmission.setText(txtAddmission.getText()+"  Exam Id                    :     "+txtId.getText()+"\n\n");
        txtAddmission.setText(txtAddmission.getText()+"  Student Name           :     "+txtName.getText()+"\n\n");
        txtAddmission.setText(txtAddmission.getText()+"  Exam Type                :     "+cmbExam.getSelectedItem().toString()+"\n\n");
        txtAddmission.setText(txtAddmission.getText()+"  Hall Name                 :     "+cmbHall.getSelectedItem().toString()+"\n\n\n\n\n\n\n\n\n\n\n");
        txtAddmission.setText(txtAddmission.getText()+"  MUST BE ADHERED TO:\n\n");
        txtAddmission.setText(txtAddmission.getText()+"    *Bring this Addmission card when you come to examination.\n");
        txtAddmission.setText(txtAddmission.getText()+"    *Come to the Institute 30 minutes before the examination.\n\n");
        txtAddmission.setText(txtAddmission.getText()+"----------------------------------------------------------------------------------------------------");
        
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnPrintAddmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintAddmissionActionPerformed
        String ADD = txtAddmission.getText();
        try{
            if((ADD.isEmpty())){
                JOptionPane.showMessageDialog(rootPane, "Pleace Generate a Addmission Card");
            }else{
                txtAddmission.print();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex); 
        }
    }//GEN-LAST:event_btnPrintAddmissionActionPerformed
public void showTableData() {

        try {
            DBConnection con = new DBConnection();
            String sql = "select * from Exam";
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            prep.executeQuery();

            ExamTbl.setModel(DbUtils.resultSetToTableModel(prep.executeQuery()));

        } catch (Exception ex) {
            //Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
public void showExamRegstraionTableData() {

        try {
            DBConnection con = new DBConnection();
            String sql = "select * from ExamRegistration";
            PreparedStatement prep = con.getDBConnection().prepareStatement(sql);
            prep.executeQuery();

            ExamRegistrationTbl.setModel(DbUtils.resultSetToTableModel(prep.executeQuery()));

        } catch (Exception ex) {
            //Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ExamRegistrationTbl;
    private javax.swing.JTable ExamTbl;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnPrintAddmission;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbExam;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbHall;
    private javax.swing.JComboBox<String> cmbIndex;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblExamRegisterID;
    private javax.swing.JTextArea txtAddmission;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIndex;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
