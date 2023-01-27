/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeexamination;

import Project.connectionProvider;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author masa
 */
public class AddSubjectStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddSubject
     */
    public AddSubjectStudent() {
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

        jLabel1 = new javax.swing.JLabel();
        IdInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SubjectComboBox = new javax.swing.JComboBox<>();
        AddBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        UserNameInput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setText("Username : ");

        IdInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdInputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setText("Select the subject :");

        SubjectComboBox.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        SubjectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PL2", "Operation Research", "Data base", "Data Structures" }));
        SubjectComboBox.setSelectedIndex(-1);
        SubjectComboBox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                SubjectComboBoxComponentAdded(evt);
            }
        });
        SubjectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubjectComboBoxActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Enter the id :");

        SearchBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        UserNameInput.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(AddBtn)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameInput))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(SubjectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(jButton1))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdInputActionPerformed

    private void SubjectComboBoxComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_SubjectComboBoxComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectComboBoxComponentAdded

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
         AddSub();
    }//GEN-LAST:event_AddBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        String ID = IdInput.getText();
 try {
        Connection c=connectionProvider.getCon();
        Statement st = c.createStatement();
        String sqlQuery = "select * from credentials where ID = '"+ID+"'AND UserTYpe='Student'";
        ResultSet result = st.executeQuery(sqlQuery);
     if(result.next())
        {
        String username = result.getString("Username");
        UserNameInput.setText(username); 
        }else if (ID.equals("")){
        JFrame jf=new JFrame();
        jf.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jf, "please enter an id ");
    } else{
                JOptionPane.showMessageDialog(null, "We could not find the "
                        + "ID you entered please check");
        }
    } catch (SQLException ex) {
        Logger.getLogger(UpdateDelete.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
    public void AddSub(){
        String ID =IdInput.getText();
        String username = UserNameInput.getText();
        String Subject = (String) SubjectComboBox.getSelectedItem();
        try {
           Connection c=connectionProvider.getCon();
            String sqlQuery = "INSERT INTO `subjects`(`Username`,`subject`,`UserType`)"
                    + "  VALUES ('"+username+"','"+Subject+"','Student')";        
            PreparedStatement st = c.prepareStatement(sqlQuery);
            int result = st.executeUpdate();
            if(ID.equals("")){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "please enter an id ");
        }else if(Subject==null){
            JFrame jf=new JFrame();
        jf.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jf, "please select a subject ");
        }else if (result==0){
             JFrame jf=new JFrame();
        jf.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(jf, "you have already submited this subject before");
        }
          else{
                JOptionPane.showMessageDialog(null, "subject has been added ! ");
            AdminForm a=new AdminForm();  
            a.setVisible(true); 
            this.dispose();
           }
        } catch (SQLException ex) {
            Logger.getLogger(AddSubjectStudent.class.getName()).log(Level.SEVERE, null, ex); 
        }
        
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void SubjectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubjectComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubjectComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminForm b=new AdminForm();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddSubjectStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSubjectStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSubjectStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSubjectStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSubjectStudent().setVisible(true);
            }
        });
    }
   
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField IdInput;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JComboBox<String> SubjectComboBox;
    private javax.swing.JLabel UserNameInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
