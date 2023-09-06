/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package bookshop;

import oders.allorders;
import oders.confirmedorders;
import oders.pendingorders;
import oders.press_order;

/**
 *
 * @author brevin
 */
public class orders extends javax.swing.JInternalFrame {

    /**
     * Creates new form allOrdersTable
     */
    public orders() {
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

        jPanel1 = new javax.swing.JPanel();
        press_order = new javax.swing.JButton();
        confirmed_orders = new javax.swing.JButton();
        all_orders = new javax.swing.JButton();
        pending_orders = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();

        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(1185, 695));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        press_order.setBackground(new java.awt.Color(51, 51, 255));
        press_order.setForeground(new java.awt.Color(255, 255, 255));
        press_order.setText("Order");
        press_order.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 255), null, null));
        press_order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        press_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                press_orderActionPerformed(evt);
            }
        });

        confirmed_orders.setBackground(new java.awt.Color(51, 51, 255));
        confirmed_orders.setForeground(new java.awt.Color(255, 255, 255));
        confirmed_orders.setText("Confirmed orders");
        confirmed_orders.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 255), null, null));
        confirmed_orders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmed_orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmed_ordersActionPerformed(evt);
            }
        });

        all_orders.setBackground(new java.awt.Color(51, 51, 255));
        all_orders.setForeground(new java.awt.Color(255, 255, 255));
        all_orders.setText("All orders");
        all_orders.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 255), null, null));
        all_orders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        all_orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_ordersActionPerformed(evt);
            }
        });

        pending_orders.setBackground(new java.awt.Color(51, 51, 255));
        pending_orders.setForeground(new java.awt.Color(255, 255, 255));
        pending_orders.setText("Pending oders");
        pending_orders.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 255), null, null));
        pending_orders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pending_orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pending_ordersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(press_order, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(all_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(confirmed_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(pending_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(482, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(press_order, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmed_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(all_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pending_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desktop))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void press_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_press_orderActionPerformed
        
        desktop.removeAll();
        desktop.repaint();
        press_order po = new press_order();
        desktop.add(po);
        po.setVisible(true);
        
    }//GEN-LAST:event_press_orderActionPerformed

    private void confirmed_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmed_ordersActionPerformed
        
        desktop.removeAll();
        desktop.repaint();
        confirmedorders confirmed = new confirmedorders();
        desktop.add(confirmed);
        confirmed.show();
        
    }//GEN-LAST:event_confirmed_ordersActionPerformed

    private void all_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_ordersActionPerformed
        
        desktop.removeAll();
        desktop.repaint();
        allorders all = new allorders();
        desktop.add(all);
        all.show();
        
    }//GEN-LAST:event_all_ordersActionPerformed

    private void pending_ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pending_ordersActionPerformed
        
        desktop.removeAll();
        desktop.repaint();
        pendingorders pending = new pendingorders();
        desktop.add(pending);
        pending.show();
        
    }//GEN-LAST:event_pending_ordersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton all_orders;
    private javax.swing.JButton confirmed_orders;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pending_orders;
    private javax.swing.JButton press_order;
    // End of variables declaration//GEN-END:variables
}