/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.form;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import model.AssociatedRouteOfABusSop;
import utils.BusService;

/**
 *
 * @author Wunhh
 */
public class ChooseBusByNumber extends javax.swing.JPanel {

    /**
     * Creates new form ChooseBusByNumber
     */
    public ChooseBusByNumber() {
        initComponents();
        this.table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    DetailBusInformation detail = new DetailBusInformation();
                    detail.setVisible(true);
                    int index = table.getSelectedRow();
                    String busNumber = table.getValueAt(index, 0).toString();
                    String from = table.getValueAt(index, 1).toString();
                    String to = table.getValueAt(index, 2).toString();
                    String startTime = table.getValueAt(index, 3).toString();
                    detail.setText(busNumber, from, to, startTime);
                }
            }

        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        chooseBusComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        findButton = new view.swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));

        welcomeLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        welcomeLabel.setForeground(new java.awt.Color(0, 102, 102));
        welcomeLabel.setText("Please choose bus number");

        chooseBusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bus 0", "Bus 1", "Bus 2", "Bus 3", "Bus 4", " ", " " }));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Route Number", "Departure Station", "Destination Station", "Departure Time"
            }
        ));
        jScrollPane1.setViewportView(table);

        findButton.setBackground(new java.awt.Color(0, 102, 102));
        findButton.setForeground(new java.awt.Color(255, 255, 255));
        findButton.setText("Find");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(welcomeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(chooseBusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseBusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        int choose = chooseBusComboBox.getSelectedIndex();
        table.removeAll();      
        table.setModel(new AssociatedRouteOfABusSop(new BusService().getAssociatedRoutesByBusNumber(choose)));
    }//GEN-LAST:event_findButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chooseBusComboBox;
    private view.swing.Button findButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
