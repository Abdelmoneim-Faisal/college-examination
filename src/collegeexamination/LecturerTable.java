/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegeexamination;

import Project.connectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Roshdology
 */
public class LecturerTable extends javax.swing.JInternalFrame {

    /**
     * Creates new form LecturerTable
     */
    DefaultTableModel TABEL = new DefaultTableModel();
    public LecturerTable() {
        initComponents();
        table();
        tableLecturerContent();
    }
    private void table(){
        TABEL.addColumn("ID");
        TABEL.addColumn("Username");
        TABEL.addColumn("Password");
        TABEL.addColumn("Email");
        TABEL.addColumn("Fname");
        TABEL.addColumn("Lname");
        TABEL.addColumn("Salary");
    }
    private void tableLecturerContent()
    {
        try {
            ListTable.setModel(TABEL);
            Connection c=connectionProvider.getCon();
            Statement st = c.createStatement();
            String sqlQuery = "select * from credentials WHERE UserType = 'Lecturer'";
            ResultSet result = st.executeQuery(sqlQuery);
            printTable(result);
        } catch (SQLException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void printTable(ResultSet result){
        try {
            Connection c=connectionProvider.getCon();
            Statement st = c.createStatement();
            TABEL.setRowCount(0);
            while(result.next())
            {
                TABEL.addRow(new Object[] {result.getString("ID"),result.getString("Username"),result.getString("Password"),
                    result.getString("Email"),result.getString("Fname")
                        ,result.getString("Lname"),result.getString("Salary")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminForm.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ListTable = new javax.swing.JTable();

        ListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ListTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
