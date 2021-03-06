/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.PizzaApplication;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 *
 * @author jesse
 */
public class DrinkSelectionScreen extends javax.swing.JFrame {
    List<Integer> order = new ArrayList<>();
    OrderManager om;
    public void contOrder(OrderManager OrMa) {
        om = OrMa;
    }
    /**
     * Creates new form DrinkSelectionScreen
     */
    public DrinkSelectionScreen() {
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

        BackButton = new javax.swing.JButton();
        CheckoutButton = new javax.swing.JButton();
        DietCokeButton = new javax.swing.JButton();
        LemonadeButton = new javax.swing.JButton();
        SweetTeaButton = new javax.swing.JButton();
        DasaniButton = new javax.swing.JButton();
        CokeButton = new javax.swing.JButton();
        PibbButton = new javax.swing.JButton();
        SpriteButton = new javax.swing.JButton();
        RootBeerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza Application");

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        CheckoutButton.setText("Checkout");
        CheckoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutButtonActionPerformed(evt);
            }
        });

        DietCokeButton.setText("Diet Coke");
        DietCokeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DietCokeButtonActionPerformed(evt);
            }
        });

        LemonadeButton.setText("Lemonade");
        LemonadeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LemonadeButtonActionPerformed(evt);
            }
        });

        SweetTeaButton.setText("Sweet Tea");
        SweetTeaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SweetTeaButtonActionPerformed(evt);
            }
        });

        DasaniButton.setText("Dasani");
        DasaniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DasaniButtonActionPerformed(evt);
            }
        });

        CokeButton.setText("Coca-Cola");
        CokeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CokeButtonActionPerformed(evt);
            }
        });

        PibbButton.setText("Mr. Pibb");
        PibbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PibbButtonActionPerformed(evt);
            }
        });

        SpriteButton.setText("Sprite");
        SpriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpriteButtonActionPerformed(evt);
            }
        });

        RootBeerButton.setText("Root Beer");
        RootBeerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RootBeerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CokeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PibbButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpriteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RootBeerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LemonadeButton)
                    .addComponent(DietCokeButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DasaniButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SweetTeaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckoutButton)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DietCokeButton)
                    .addComponent(CokeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PibbButton)
                    .addComponent(LemonadeButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SpriteButton)
                    .addComponent(SweetTeaButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RootBeerButton)
                    .addComponent(DasaniButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckoutButton)
                    .addComponent(BackButton))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        NewOrderScreen neworder = new NewOrderScreen();
        neworder.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CokeButtonActionPerformed
        order.add(1);
        JOptionPane.showMessageDialog(this, "Successfully added to order!!!!");
    }//GEN-LAST:event_CokeButtonActionPerformed

    private void DietCokeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DietCokeButtonActionPerformed
        order.add(2);
        JOptionPane.showMessageDialog(this, "Successfully added to order!!!!");
    }//GEN-LAST:event_DietCokeButtonActionPerformed

    private void PibbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PibbButtonActionPerformed
        order.add(3);
        JOptionPane.showMessageDialog(this, "Successfully added to order!!!!");
    }//GEN-LAST:event_PibbButtonActionPerformed

    private void LemonadeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LemonadeButtonActionPerformed
        order.add(4);
        JOptionPane.showMessageDialog(this, "Successfully added to order!!!!");
    }//GEN-LAST:event_LemonadeButtonActionPerformed

    private void SpriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpriteButtonActionPerformed
        order.add(5);
        JOptionPane.showMessageDialog(this, "Successfully added to order!!!!");
    }//GEN-LAST:event_SpriteButtonActionPerformed

    private void SweetTeaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SweetTeaButtonActionPerformed
        order.add(6);
        JOptionPane.showMessageDialog(this, "Successfully added to order!!!!");
    }//GEN-LAST:event_SweetTeaButtonActionPerformed

    private void RootBeerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RootBeerButtonActionPerformed
        order.add(7);
        JOptionPane.showMessageDialog(this, "Successfully added to order!!!!");
    }//GEN-LAST:event_RootBeerButtonActionPerformed

    private void DasaniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DasaniButtonActionPerformed
        order.add(8);
        JOptionPane.showMessageDialog(this, "Successfully added to order!!!!");
    }//GEN-LAST:event_DasaniButtonActionPerformed

    private void CheckoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutButtonActionPerformed
        CheckOutScreen checkout = new CheckOutScreen();
        om.addMiscToOrder(order);
        checkout.setVisible(true);
        dispose();
    }//GEN-LAST:event_CheckoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DrinkSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrinkSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrinkSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrinkSelectionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrinkSelectionScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CheckoutButton;
    private javax.swing.JButton CokeButton;
    private javax.swing.JButton DasaniButton;
    private javax.swing.JButton DietCokeButton;
    private javax.swing.JButton LemonadeButton;
    private javax.swing.JButton PibbButton;
    private javax.swing.JButton RootBeerButton;
    private javax.swing.JButton SpriteButton;
    private javax.swing.JButton SweetTeaButton;
    // End of variables declaration//GEN-END:variables
}
