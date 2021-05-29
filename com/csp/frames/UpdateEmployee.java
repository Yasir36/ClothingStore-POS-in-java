/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csp.frames;

import com.csp.dao.EmployeeDao;
import com.csp.daoimpl.EmployeeDaoImpl;
import com.csp.model.EmployeeBean;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class UpdateEmployee extends javax.swing.JFrame {
    private static int count = 0;
    /**
     * Creates new form UpdateEmployee
     */
    
    public UpdateEmployee() {
        initComponents();
        showEmployees();
    }

    private void showEmployees(){
        EmployeeDao empDao = new EmployeeDaoImpl();
        List<EmployeeBean> emps = empDao.getAllEmployees();
        EmployeeBean empBean ;
        if(count!=-1)
        for(int i=count;i<=count;i++){
            empBean = emps.get(i);
            usernameField.setText(empBean.getUsername());
            passwordField.setText(empBean.getPassword());
            salaryField.setText(""+empBean.getSalary());
            idField.setText(""+empBean.getId());
            if(count==emps.size()-1)
            {
                count=-1;
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateEmployeePanel = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        outletLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        salaryField = new javax.swing.JTextField();
        categoryLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        sizeLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        passwordField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        updateEmployeePanel.setBackground(new java.awt.Color(78, 139, 183));
        updateEmployeePanel.setForeground(new java.awt.Color(32, 32, 32));
        updateEmployeePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameField.setBackground(new java.awt.Color(78, 139, 183));
        usernameField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        usernameField.setForeground(new java.awt.Color(32, 32, 32));
        usernameField.setBorder(null);
        usernameField.setOpaque(false);
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        updateEmployeePanel.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 290, -1));

        outletLabel.setBackground(new java.awt.Color(210, 236, 184));
        outletLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        outletLabel.setForeground(new java.awt.Color(32, 32, 32));
        outletLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        outletLabel.setText("Username");
        updateEmployeePanel.add(outletLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));
        updateEmployeePanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 290, 10));

        salaryField.setBackground(new java.awt.Color(78, 139, 183));
        salaryField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        salaryField.setForeground(new java.awt.Color(32, 32, 32));
        salaryField.setBorder(null);
        salaryField.setOpaque(false);
        updateEmployeePanel.add(salaryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 290, -1));

        categoryLabel.setBackground(new java.awt.Color(210, 236, 184));
        categoryLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(32, 32, 32));
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        categoryLabel.setText("Password");
        updateEmployeePanel.add(categoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));
        updateEmployeePanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 290, 10));
        updateEmployeePanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 10));

        sizeLabel.setBackground(new java.awt.Color(210, 236, 184));
        sizeLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        sizeLabel.setForeground(new java.awt.Color(32, 32, 32));
        sizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sizeLabel.setText("Salary");
        updateEmployeePanel.add(sizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 20));

        updateButton.setBackground(java.awt.Color.white);
        updateButton.setText("Update");
        updateButton.setFocusPainted(false);
        updateButton.setSelected(true);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        updateEmployeePanel.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, 30));

        exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(232, 17, 35));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        updateEmployeePanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 30, 30));

        idLabel.setBackground(new java.awt.Color(78, 139, 183));
        idLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idLabel.setForeground(new java.awt.Color(32, 32, 32));
        idLabel.setText("ID :");
        updateEmployeePanel.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 30, 20));

        idField.setBackground(new java.awt.Color(78, 139, 183));
        idField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idField.setForeground(new java.awt.Color(32, 32, 32));
        idField.setText("0");
        updateEmployeePanel.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 30, 20));

        nextButton.setText("-->");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        updateEmployeePanel.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 70, 30));

        passwordField.setBackground(new java.awt.Color(78, 139, 183));
        passwordField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        passwordField.setForeground(new java.awt.Color(32, 32, 32));
        passwordField.setBorder(null);
        passwordField.setOpaque(false);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        updateEmployeePanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateEmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateEmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        EmployeeBean eb = new EmployeeBean();
        EmployeeDao ed = new EmployeeDaoImpl();

        if(!(usernameField.getText().equals("") || passwordField.getText().equals("") || salaryField.getText().equals(""))){
            eb.setUsername(usernameField.getText());
            eb.setSalary(Integer.parseInt(salaryField.getText()));
            eb.setPassword(passwordField.getText());
            eb.setType("employee");
            eb.setId(Integer.parseInt(idField.getText()));

            if(ed.updateEmployee(eb)>0){
                JOptionPane.showMessageDialog(this,"Employee Updated!");
                count = 0;
                this.dispose(); 
            }
            else
            JOptionPane.showMessageDialog(this, "Employee Could Not Be Updated!");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        count =0;
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
       count++;
       showEmployees();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel outletLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField salaryField;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel updateEmployeePanel;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
