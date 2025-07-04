/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package q1project;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Malilong
 */
public class TransactionFrame extends javax.swing.JFrame {
    
    DefaultTableModel model;
    double total = 0;
    String ID;

    /**
     * Creates new form TransactionFrame
     */
    public TransactionFrame() {
        initComponents();
        model = (DefaultTableModel)cartTable.getModel();
        
       
    }
    public TransactionFrame(String selectedDonut){
        initComponents();
        comboboxProduct.setSelectedItem(selectedDonut);
         model = (DefaultTableModel)cartTable.getModel();
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane1 = new java.awt.ScrollPane();
        paymentGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboboxProduct = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        quantityField = new javax.swing.JTextField();
        addToCartButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        PaymentButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cashButton = new javax.swing.JRadioButton();
        cardButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TotalButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        removeButtton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartTable.setBackground(new java.awt.Color(102, 51, 0));
        cartTable.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        cartTable.setForeground(new java.awt.Color(255, 204, 153));
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Donut", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.setSelectionBackground(new java.awt.Color(255, 204, 204));
        cartTable.setSelectionForeground(new java.awt.Color(255, 0, 102));
        cartTable.setShowHorizontalLines(true);
        cartTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(cartTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 430, 360));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 153));
        jLabel1.setText("YUM YUM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 153));
        jLabel2.setText("Select Donut:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        comboboxProduct.setBackground(new java.awt.Color(255, 255, 255));
        comboboxProduct.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        comboboxProduct.setForeground(new java.awt.Color(102, 51, 0));
        comboboxProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Glazed Donut", "Chocolate Donut", "Strawberry Donut", "Boston Cream Donut", "Jelly-Filled Donut" }));
        jPanel1.add(comboboxProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 153));
        jLabel3.setText("Quantity:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, 20));

        quantityField.setBackground(new java.awt.Color(255, 255, 255));
        quantityField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        quantityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityFieldActionPerformed(evt);
            }
        });
        jPanel1.add(quantityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, 30));

        addToCartButton.setBackground(new java.awt.Color(255, 0, 0));
        addToCartButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        addToCartButton.setForeground(new java.awt.Color(0, 0, 0));
        addToCartButton.setText("ADD TO CART");
        addToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addToCartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/q1project/darkwoodpic.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 210, 230));

        returnButton.setBackground(new java.awt.Color(0, 102, 255));
        returnButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("RETURN");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 170, 40));

        PaymentButton.setBackground(new java.awt.Color(204, 0, 0));
        PaymentButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        PaymentButton.setText("PAY HERE");
        PaymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PaymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 150, 100));

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(102, 51, 0));
        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 51, 0));
        jLabel5.setText("Payment Method:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 140, 20));

        paymentGroup.add(cashButton);
        cashButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        cashButton.setForeground(new java.awt.Color(102, 51, 0));
        cashButton.setText("CASH");
        cashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cashButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        paymentGroup.add(cardButton);
        cardButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        cardButton.setForeground(new java.awt.Color(102, 51, 0));
        cardButton.setText("CARD");
        cardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/q1project/WOODPIC.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/q1project/darkwoodpic.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 270, 100));

        TotalButton.setBackground(new java.awt.Color(255, 204, 204));
        TotalButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        TotalButton.setForeground(new java.awt.Color(255, 0, 102));
        TotalButton.setText("Calculate Total");
        TotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TotalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 40));

        ClearButton.setBackground(new java.awt.Color(102, 51, 0));
        ClearButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 204, 153));
        ClearButton.setText("CLEAR TABLE");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, 40));

        removeButtton.setBackground(new java.awt.Color(255, 255, 153));
        removeButtton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        removeButtton.setForeground(new java.awt.Color(102, 102, 0));
        removeButtton.setText("REMOVE ITEM");
        removeButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButttonActionPerformed(evt);
            }
        });
        getContentPane().add(removeButtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 200, -1));

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("10% DISCOUNT on ₱500+ Purchases!");
        jPanel3.add(jLabel7);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 420, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/q1project/YUMDONUT.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void quantityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityFieldActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
       MainStoreFrame mainFrame = new MainStoreFrame();
       mainFrame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void cardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardButtonActionPerformed

    private void cashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cashButtonActionPerformed

    private void addToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartButtonActionPerformed
        String product = comboboxProduct.getSelectedItem().toString();
      
        String quantityText = quantityField.getText().trim();
        
        if (quantityText.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter a quantity. ");
            return;
        }
        
        int quantity;
        try{
            quantity = Integer.parseInt(quantityText);
            if (quantity <=0){
                JOptionPane.showMessageDialog(this, "Quantity must be greater than zero.");
                return;
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, " Invalid quantity. Please enter a number.");
            return;
        }
        int price = 0;
        

        switch (product) {
            case "Glazed Donut":
                price = 79;
                ID = "001";
                break;
            case "Chocolate Donut":
                price = 69;
                ID="002";
                break;
            case "Strawberry Donut":
                price = 55;
                ID="003";
                break;
            case "Boston Cream Donut":
                price = 89;
                ID="004";
                break;
            case "Jelly-Filled Donut":
                price = 99;
                ID="005";
                break;
        }
        
        total= quantity * price;
        
        model.addRow(new Object[]{ID,product,price,quantity,total});
       
    }//GEN-LAST:event_addToCartButtonActionPerformed

    private void PaymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentButtonActionPerformed
        if (cashButton.isSelected()){
            JOptionPane.showMessageDialog(this, "Succesfully paid using cash");
           
        }else  if (cardButton.isSelected()){
            JOptionPane.showMessageDialog(this, "Succesfully paid using Card");
            
        }else{
            JOptionPane.showMessageDialog(this, "please select a payment method");
        }
    }//GEN-LAST:event_PaymentButtonActionPerformed

    private void TotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalButtonActionPerformed


        double grandTotal = 0;
        
        for (int i = 0; i < model.getRowCount(); i++){
        Object value = model.getValueAt(i, 4);
        if (value instanceof Number){
            grandTotal += ((Number) value).doubleValue();
        } else {
        try{
            grandTotal+= Double.parseDouble(value.toString());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid total value at row" + i);
        }
            
        }
        
        
        }
         double discount =0;
         if (grandTotal>500){
             discount =50;
             JOptionPane.showMessageDialog(this, " 50₱ discount applied!");
         }
         double finalTotal= grandTotal - discount;
        
         
         String message = "Original Total:₱ " + grandTotal;
         if (discount >= 0){
             message += "\n Discount Applied: ₱" + discount;
         }
         message += "\n Final Total:" + finalTotal;
         JOptionPane.showMessageDialog(this, message, "Total Summary", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_TotalButtonActionPerformed

    private void removeButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButttonActionPerformed
        int selectedRow = cartTable.getSelectedRow();
        if (selectedRow != -1){
            model.removeRow(selectedRow);
        }else{
            JOptionPane.showMessageDialog(this, "Please select an item to remove.");
        }
    }//GEN-LAST:event_removeButttonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        model.setRowCount(0); //clears all rows
    }//GEN-LAST:event_ClearButtonActionPerformed

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
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton PaymentButton;
    private javax.swing.JButton TotalButton;
    private javax.swing.JButton addToCartButton;
    private javax.swing.JRadioButton cardButton;
    private javax.swing.JTable cartTable;
    private javax.swing.JRadioButton cashButton;
    private javax.swing.JComboBox<String> comboboxProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup paymentGroup;
    private javax.swing.JTextField quantityField;
    private javax.swing.JButton removeButtton;
    private javax.swing.JButton returnButton;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
