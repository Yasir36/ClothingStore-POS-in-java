/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.csp.frames;

import com.csp.dao.ItemDao;
import com.csp.daoimpl.ItemDaoImpl;
import com.csp.model.ItemBean;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class RemoveItem extends javax.swing.JFrame {
    private static int count = 0;
    ItemDao id = new ItemDaoImpl();
    Stack<ItemBean> items = id.getAllItems();
    ItemBean ib;
    /** Creates new form RemoveItem */
    public RemoveItem() {
        initComponents();
        showItems();
    }
   
    private void showItems()
    {
        
        for(int i=count;i<=count;i++)
        {          
           ib = items.pop();
           itemNameField.setText(ib.getName());
           categoryField.setText(ib.getCategory());
           sizeField.setText(ib.getSize());
           colorField.setText(ib.getColor());
           priceField.setText(Integer.toString(ib.getPrice()));
           quantityField.setText(Integer.toString(ib.getQuantity()));
           idField.setText(""+ib.getItemId());
           if(items.isEmpty()){
               items = id.getAllItems();
               count=0;
           }
        }        
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteItemPanel = new javax.swing.JPanel();
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
        deleteButton = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        priceField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        quantityField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        idField = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        deleteItemPanel.setBackground(new java.awt.Color(32, 32, 32));
        deleteItemPanel.setForeground(new java.awt.Color(32, 32, 32));
        deleteItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemNameField.setEditable(false);
        itemNameField.setBackground(new java.awt.Color(32, 32, 32));
        itemNameField.setForeground(java.awt.Color.white);
        itemNameField.setBorder(null);
        itemNameField.setOpaque(false);
        itemNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameFieldActionPerformed(evt);
            }
        });
        deleteItemPanel.add(itemNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 290, -1));

        outletLabel.setBackground(new java.awt.Color(210, 236, 184));
        outletLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        outletLabel.setForeground(new java.awt.Color(78, 139, 183));
        outletLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        outletLabel.setText("Name");
        deleteItemPanel.add(outletLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));
        deleteItemPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 290, 10));
        deleteItemPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 290, 10));

        sizeField.setEditable(false);
        sizeField.setBackground(new java.awt.Color(32, 32, 32));
        sizeField.setForeground(java.awt.Color.white);
        sizeField.setBorder(null);
        sizeField.setOpaque(false);
        deleteItemPanel.add(sizeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, -1));

        categoryLabel.setBackground(new java.awt.Color(210, 236, 184));
        categoryLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(78, 139, 183));
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        categoryLabel.setText("Category");
        deleteItemPanel.add(categoryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, -1));
        deleteItemPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 290, 10));
        deleteItemPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 290, 10));

        colorField.setEditable(false);
        colorField.setBackground(new java.awt.Color(32, 32, 32));
        colorField.setForeground(java.awt.Color.white);
        colorField.setBorder(null);
        colorField.setOpaque(false);
        deleteItemPanel.add(colorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 290, -1));

        categoryField.setEditable(false);
        categoryField.setBackground(new java.awt.Color(32, 32, 32));
        categoryField.setForeground(java.awt.Color.white);
        categoryField.setBorder(null);
        categoryField.setOpaque(false);
        deleteItemPanel.add(categoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 290, -1));

        sizeLabel.setBackground(new java.awt.Color(210, 236, 184));
        sizeLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        sizeLabel.setForeground(new java.awt.Color(78, 139, 183));
        sizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sizeLabel.setText("Size");
        deleteItemPanel.add(sizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 80, 20));

        colorLabel.setBackground(new java.awt.Color(210, 236, 184));
        colorLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        colorLabel.setForeground(new java.awt.Color(78, 139, 183));
        colorLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        colorLabel.setText("Color");
        deleteItemPanel.add(colorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 20));

        deleteButton.setBackground(java.awt.Color.white);
        deleteButton.setText("Delete");
        deleteButton.setFocusPainted(false);
        deleteButton.setSelected(true);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        deleteItemPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 210, -1));
        deleteItemPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 290, 20));

        priceField.setEditable(false);
        priceField.setBackground(new java.awt.Color(32, 32, 32));
        priceField.setForeground(java.awt.Color.white);
        priceField.setBorder(null);
        priceField.setOpaque(false);
        deleteItemPanel.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 290, -1));

        priceLabel.setBackground(new java.awt.Color(210, 236, 184));
        priceLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(78, 139, 183));
        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        priceLabel.setText("Price");
        deleteItemPanel.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 100, -1));

        exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(232, 17, 35));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        deleteItemPanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 20, -1));
        deleteItemPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 290, 10));

        quantityField.setEditable(false);
        quantityField.setBackground(new java.awt.Color(32, 32, 32));
        quantityField.setForeground(java.awt.Color.white);
        quantityField.setBorder(null);
        quantityField.setOpaque(false);
        deleteItemPanel.add(quantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 290, -1));

        quantityLabel.setBackground(new java.awt.Color(210, 236, 184));
        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(78, 139, 183));
        quantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        quantityLabel.setText("Quantity");
        deleteItemPanel.add(quantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, -1));

        nextButton.setBackground(java.awt.Color.white);
        nextButton.setText("-->");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        deleteItemPanel.add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 60, -1));

        idField.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idField.setForeground(new java.awt.Color(78, 139, 183));
        idField.setText("1");
        deleteItemPanel.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 20, -1));

        idLabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        idLabel.setForeground(new java.awt.Color(78, 139, 183));
        idLabel.setText("Item Id :");
        deleteItemPanel.add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNameFieldActionPerformed

    }//GEN-LAST:event_itemNameFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (id.removeItem(Integer.parseInt(idField.getText())) > 0) {
            JOptionPane.showMessageDialog(this, "Item Deleted!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Item Could Not Be Deleted!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
        count = 0;
    }//GEN-LAST:event_exitMouseClicked

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        count++;
        showItems();
    }//GEN-LAST:event_nextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categoryField;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField colorField;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel deleteItemPanel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField itemNameField;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel outletLabel;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField quantityField;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField sizeField;
    private javax.swing.JLabel sizeLabel;
    // End of variables declaration//GEN-END:variables

}
