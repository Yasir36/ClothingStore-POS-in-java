/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csp.frames;

import com.csp.dao.ItemDao;
import com.csp.daoimpl.ItemDaoImpl;
import com.csp.model.ItemBean;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class AddItem extends javax.swing.JFrame {

    /**
     * Creates new form AddStock
     */
    public AddItem() {
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

        addItemPanel = new javax.swing.JPanel();
        itemNameField = new javax.swing.JTextField();
        outletLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        sizeField = new javax.swing.JTextField();
        categoryLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        colorField = new javax.swing.JTextField();
        categoryField = new javax.swing.JTextField();
        sizeLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        priceField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        quantityField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        addItemPanel.setBackground(new java.awt.Color(32, 32, 32));
        addItemPanel.setForeground(new java.awt.Color(32, 32, 32));
        addItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemNameField.setBackground(new java.awt.Color(32, 32, 32));
        itemNameField.setForeground(java.awt.Color.white);
        itemNameField.setBorder(null);
        itemNameField.setOpaque(false);
        itemNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameFieldActionPerformed(evt);
            }
        });
        addItemPanel.add(itemNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 290, -1));

        outletLabel.setBackground(new java.awt.Color(210, 236, 184));
        outletLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        outletLabel.setForeground(new java.awt.Color(78, 139, 183));
        outletLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        outletLabel.setText("Name");
        addItemPanel.add(outletLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));
        addItemPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 290, 10));
        addItemPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 290, 10));

        sizeField.setBackground(new java.awt.Color(32, 32, 32));
        sizeField.setForeground(java.awt.Color.white);
        sizeField.setBorder(null);
        sizeField.setOpaque(false);
        addItemPanel.add(sizeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, -1));

        categoryLabel.setBackground(new java.awt.Color(210, 236, 184));
        categoryLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(78, 139, 183));
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        categoryLabel.setText("Category");
        addItemPanel.add(categoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));
        addItemPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 290, 10));
        addItemPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 10));

        colorField.setBackground(new java.awt.Color(32, 32, 32));
        colorField.setForeground(java.awt.Color.white);
        colorField.setBorder(null);
        colorField.setOpaque(false);
        addItemPanel.add(colorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 290, -1));

        categoryField.setBackground(new java.awt.Color(32, 32, 32));
        categoryField.setForeground(java.awt.Color.white);
        categoryField.setBorder(null);
        categoryField.setOpaque(false);
        addItemPanel.add(categoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 290, -1));

        sizeLabel.setBackground(new java.awt.Color(210, 236, 184));
        sizeLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        sizeLabel.setForeground(new java.awt.Color(78, 139, 183));
        sizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sizeLabel.setText("Size");
        addItemPanel.add(sizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 20));

        colorLabel.setBackground(new java.awt.Color(210, 236, 184));
        colorLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        colorLabel.setForeground(new java.awt.Color(78, 139, 183));
        colorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        colorLabel.setText("Color");
        addItemPanel.add(colorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 20));

        addButton.setBackground(java.awt.Color.white);
        addButton.setText("Add");
        addButton.setFocusPainted(false);
        addButton.setSelected(true);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addItemPanel.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 210, 30));
        addItemPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 290, 20));

        priceField.setBackground(new java.awt.Color(32, 32, 32));
        priceField.setForeground(java.awt.Color.white);
        priceField.setBorder(null);
        priceField.setOpaque(false);
        addItemPanel.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 290, -1));

        priceLabel.setBackground(new java.awt.Color(210, 236, 184));
        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(78, 139, 183));
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        priceLabel.setText("Price");
        addItemPanel.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 100, -1));

        exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(232, 17, 35));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        addItemPanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 20, -1));
        addItemPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 290, 10));

        quantityField.setBackground(new java.awt.Color(32, 32, 32));
        quantityField.setForeground(java.awt.Color.white);
        quantityField.setBorder(null);
        quantityField.setOpaque(false);
        addItemPanel.add(quantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 290, -1));

        quantityLabel.setBackground(new java.awt.Color(210, 236, 184));
        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(78, 139, 183));
        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        quantityLabel.setText("Quantity");
        addItemPanel.add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        ItemBean ib = new ItemBean();
        ItemDao id = new ItemDaoImpl();
        
        if(!(itemNameField.getText().equals("") || categoryField.getText().equals("") || sizeField.getText().equals("") || colorField.getText().equals("") || quantityField.getText().equals("") || priceField.getText().equals("")) ){
            
            ib.setName(itemNameField.getText());
            ib.setCategory(categoryField.getText());
            ib.setSize(sizeField.getText());
            ib.setColor(colorField.getText());
            ib.setQuantity(Integer.parseInt(quantityField.getText()));
            ib.setPrice(Integer.parseInt(priceField.getText()));
            
            if(id.addItem(ib)>0){   
                JOptionPane.showMessageDialog(this,"Item Added!");
                itemNameField.setText("");
                categoryField.setText("");
                sizeField.setText("");
                colorField.setText("");
                quantityField.setText("");
                priceField.setText("");
            }
            else
                JOptionPane.showMessageDialog(this, "Item Could Not Be Added!");
        }
        else{
            JOptionPane.showMessageDialog(this, "No field Can be Empty!");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void itemNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addItemPanel;
    private javax.swing.JTextField categoryField;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField colorField;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField itemNameField;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel outletLabel;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField sizeField;
    private javax.swing.JLabel sizeLabel;
    // End of variables declaration//GEN-END:variables
}
