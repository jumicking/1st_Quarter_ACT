/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package donut_shop;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MALILONG_CpE121
 */
public class TransactionFrame extends javax.swing.JFrame {
    double total=0;
    DefaultTableModel model;
    

    /**
     * Creates new form TransactionFrame
     */
    public TransactionFrame() {
        initComponents();
        model = (DefaultTableModel) cartTable.getModel();
        model.setRowCount(0);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        productDropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        cashButton = new javax.swing.JRadioButton();
        cardButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        calculateTotalButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        addToCartButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        totalblank = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Select Donut:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 20));

        productDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Glazed Donut", "Chocolate Donut", "Strawberry Donut", "Boston Cream Donut", "Jelly-Filled Donut" }));
        getContentPane().add(productDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel2.setText("Quantity:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });
        getContentPane().add(quantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, 40));

        buttonGroup1.add(cashButton);
        cashButton.setText("Cash");
        getContentPane().add(cashButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        buttonGroup1.add(cardButton);
        cardButton.setText("Card");
        cardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Donut Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(cartTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 310, 340));

        calculateTotalButton.setText("Calculate Total");
        calculateTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTotalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(calculateTotalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        returnButton.setText("Return to Store");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 110, 30));

        addToCartButton.setText("Add to Cart");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addToCartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 110, 30));

        jLabel3.setText("TOTAL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));
        getContentPane().add(totalblank, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 100, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void cardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardButtonActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
         
        String donut=productDropdown.getSelectedItem().toString();
        int quantity=Integer.parseInt(quantityField.getText());
        int price=0;
        
        switch (donut){
            case "Glazed Donut":
                price = (int) 2.50;
                break;
            case "Chocolate Donut":
                price = (int) 3.00;
                break;
            case "Strawberry Donut":
                price = (int) 3.20;
                break;
            case "Boston Cream Donut":
                price = (int) 3.50;
                break;
            case "Jelly-Filled Donut":
                price = (int) 3.75;
                break;
        }
        total=quantity*price;
        
        //Add row to JTable(Cart)
         
         model.addRow(new Object[]{donut,quantity,price,total});
        
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void calculateTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateTotalButtonActionPerformed
                                                                                                       
    double total = 0.0;
    DefaultTableModel cartModel = (DefaultTableModel) cartTable.getModel(); // Replace jTable1 with your actual JTable name

    for (int i = 0; i < cartModel.getRowCount(); i++) {
        Object value = cartModel.getValueAt(i, 2); // Column 3 (index 2)

        if (value != null) {
            try {
                String strValue = value.toString().replace("%", "").trim(); // Remove % if exists
                total += Double.parseDouble(strValue);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid number at row " + (i + 1), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }

    // Set the total amount into your label named totalblank
    totalblank.setText(String.format("%.2f", total));
}
        
    }//GEN-LAST:event_calculateTotalButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
      MainStoreFrame shop = new MainStoreFrame();
      shop.setVisible(true);
        
        this.setVisible(false); // Closes the transaction window
      

    }//GEN-LAST:event_returnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton calculateTotalButton;
    private javax.swing.JRadioButton cardButton;
    private javax.swing.JTable cartTable;
    private javax.swing.JRadioButton cashButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> productDropdown;
    private javax.swing.JTextField quantityField;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel totalblank;
    // End of variables declaration//GEN-END:variables
}
