/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeexamination;

import Project.connectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Roshdology
 */
public class AddStudent extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
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

        SearchID = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UsernameInput = new javax.swing.JTextField();
        PasswordInput = new javax.swing.JTextField();
        EmailInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SalaryInput = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FnameInput = new javax.swing.JTextField();
        LnameInput = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        DepartmentComboBox = new javax.swing.JComboBox<>();
        UpdateBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        SearchID.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N

        SearchBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("Enter the ID of Student");

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setText("Password");

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setText("Email");

        UsernameInput.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        UsernameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameInputActionPerformed(evt);
            }
        });

        PasswordInput.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        PasswordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordInputActionPerformed(evt);
            }
        });

        EmailInput.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        EmailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailInputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setText("Username");

        SalaryInput.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        SalaryInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryInputActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setText("Fname");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setText("Lname");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setText("GPA");

        FnameInput.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        FnameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameInputActionPerformed(evt);
            }
        });

        LnameInput.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        LnameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnameInputActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setText("Department");

        DepartmentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GE", "SE", "IS", "IT" }));
        DepartmentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentComboBoxActionPerformed(evt);
            }
        });

        UpdateBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(SearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(LnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(FnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DepartmentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LnameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(SalaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        int ID = Integer.parseInt(SearchID.getText());
        setTextBoxes(ID);
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void UsernameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameInputActionPerformed

    }//GEN-LAST:event_UsernameInputActionPerformed

    private void PasswordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordInputActionPerformed

    private void EmailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailInputActionPerformed

    private void SalaryInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalaryInputActionPerformed

    private void FnameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameInputActionPerformed

    private void LnameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnameInputActionPerformed

    private void DepartmentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentComboBoxActionPerformed

    }//GEN-LAST:event_DepartmentComboBoxActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        int ID = Integer.parseInt(SearchID.getText());
        Update(ID);
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ID = Integer.parseInt(SearchID.getText());
        Delete(ID);
    }//GEN-LAST:event_jButton1ActionPerformed


public void setTextBoxes(int ID)
{
    try {
        ID = Integer.parseInt(SearchID.getText());
      Connection c=connectionProvider.getCon();
        Statement st = c.createStatement();
        String sqlQuery = "select * from credentials where ID = "+ID+"";
        ResultSet result = st.executeQuery(sqlQuery);
        if(result.next())
        {
            if("Student".equals(result.getString("UserType")))
                    {
        String username = result.getString("Username"); String password = result.getString("Password");
        String email=result.getString("Email"); String fName=result.getString("Fname") ;
        String lName=result.getString("Lname"); double GPA=result.getDouble("Grade");
        String SelectedDeb = result.getString("Department"); int index = 0;
        for(int i = 0; i<4;i++)
        {
            if(DepartmentComboBox.getSelectedItem().equals(SelectedDeb))
            {
                index = i;
                break;
            }
            else
                DepartmentComboBox.setSelectedIndex(i);
        }
        
        
        UsernameInput.setText(username);  PasswordInput.setText(password);
        EmailInput.setText(email); FnameInput.setText(fName);
        LnameInput.setText(lName); SalaryInput.setText(Double.toString(GPA).trim());
        }else
                JOptionPane.showMessageDialog(null, "We could not find the "
                        + "ID you entered please check");
        }
    } catch (SQLException ex) {
        Logger.getLogger(UpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
    }
}public void Update(int ID)
{
        try {
            String username = UsernameInput.getText();String password = PasswordInput.getText();
            String email = EmailInput.getText();String fName = FnameInput.getText();
            String lName = LnameInput.getText(); Double GPA = Double.parseDouble(SalaryInput.getText());
            String Department = (String) DepartmentComboBox.getSelectedItem();
           Connection c=connectionProvider.getCon();
            String sqlQuery = "UPDATE `credentials` SET `Username` = '"+username+
                    "', `Password` = '"+password+"', `Email` = "
                    + "'"+email+"', `Fname` = '"+fName+"', `Lname` = "
                    + "'"+lName+"',`Grade` = '"+GPA+"', `Department` ="
                    + " '"+Department+"' WHERE `credentials`.`ID` = "+ID+"";
            PreparedStatement st = c.prepareStatement(sqlQuery);        
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
public void Delete(int ID)
{
        try {
          Connection c=connectionProvider.getCon();
            String sqlQuery ="DELETE FROM `credentials` WHERE `credentials`.`ID` = "+ID+"";        
            PreparedStatement st = c.prepareStatement(sqlQuery);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted Successfully!!");
        } catch (SQLException ex) {
            Logger.getLogger(UpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
        }
}    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DepartmentComboBox;
    private javax.swing.JTextField EmailInput;
    private javax.swing.JTextField FnameInput;
    private javax.swing.JTextField LnameInput;
    private javax.swing.JTextField PasswordInput;
    private javax.swing.JTextField SalaryInput;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchID;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField UsernameInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
