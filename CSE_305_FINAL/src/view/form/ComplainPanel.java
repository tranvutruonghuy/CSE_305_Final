/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.form;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.StudentAccount;
import utils.ComplaintBoxDAO;
import utils.StudentAccountDAO;
import view.main.Main2;

/**
 *
 * @author LOC
 */
public class ComplainPanel extends javax.swing.JPanel {

    private StudentAccount account = Main2.account;
    private ArrayList<StudentAccount> listOfStudent = StudentAccountDAO.restoreListFromFile("src/account.txt");

    public ComplainPanel() {
        initComponents();
        addPlaceHolderStyleTextArea(complainDetailsTextArea);
    }

    public void addPlaceHolderStyleTextArea(JTextArea textArea) {
        Font font = textArea.getFont();
        font = font.deriveFont(Font.ITALIC);
        textArea.setFont(font);
        textArea.setForeground(Color.gray);
    }

    public void removePlaceHolderStyleTextArea(JTextArea textArea) {
        Font font = textArea.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        textArea.setFont(font);
        textArea.setForeground(Color.black);
    }

    public void addPlaceHolderStyleTextField(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }

    public void removePlaceHolderStyleTextFiled(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseDate = new com.toedter.calendar.JDateChooser();
        busNameComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        complainDetailsTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button1 = new view.swing.Button();
        someComplainButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        chooseDate.setBackground(new java.awt.Color(255, 255, 255));
        chooseDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        chooseDate.setDateFormatString("dd-MM-yyyy");
        chooseDate.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N

        busNameComboBox.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        busNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "University", "Library", "Airport", "Dormitory", "Sport Community" }));
        busNameComboBox.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Submit your complain");

        complainDetailsTextArea.setColumns(20);
        complainDetailsTextArea.setRows(5);
        complainDetailsTextArea.setText("Complain details");
        complainDetailsTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                complainDetailsTextAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                complainDetailsTextAreaFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(complainDetailsTextArea);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Bus name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Report day");

        button1.setBackground(new java.awt.Color(0, 102, 102));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Submit");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        someComplainButton.setText("See some complain");
        someComplainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                someComplainButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(someComplainButton)
                        .addGap(66, 66, 66)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(chooseDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(busNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(someComplainButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void complainDetailsTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_complainDetailsTextAreaFocusGained
        if (complainDetailsTextArea.getText().equals("Complain details")) {
            complainDetailsTextArea.setText(null);
            complainDetailsTextArea.requestFocus();
            removePlaceHolderStyleTextArea(complainDetailsTextArea);

        }
    }//GEN-LAST:event_complainDetailsTextAreaFocusGained

    private void complainDetailsTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_complainDetailsTextAreaFocusLost
        if (complainDetailsTextArea.getText().length() == 0) {
            addPlaceHolderStyleTextArea(complainDetailsTextArea);
            complainDetailsTextArea.setText("Complain details");
        }
    }//GEN-LAST:event_complainDetailsTextAreaFocusLost

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        if (chooseDate.getDate() == null || complainDetailsTextArea.getText().length() == 0) {
            JOptionPane.showMessageDialog(busNameComboBox, "Please enter full information!");
        } else {
            Date date = chooseDate.getDate();
            String[] data = new String[3];
            data[0] = busNameComboBox.getSelectedItem().toString();
            data[1] = date.getDate() + "-" + (date.getMonth() + 1) + "-" + (date.getYear() + 1900);
            data[2] = complainDetailsTextArea.getText();
            ComplaintBoxDAO.saveDataAsChar(data, "src/complain.txt");
            JOptionPane.showMessageDialog(busNameComboBox, "Your complain has been save!");
            chooseDate.setDate(null);
            complainDetailsTextArea.setText("");
            
        }

    }//GEN-LAST:event_button1ActionPerformed

    private void someComplainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_someComplainButtonActionPerformed
        ComplainFrame newForm = new ComplainFrame();
        newForm.setVisible(true);
    }//GEN-LAST:event_someComplainButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> busNameComboBox;
    private view.swing.Button button1;
    private com.toedter.calendar.JDateChooser chooseDate;
    private javax.swing.JTextArea complainDetailsTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton someComplainButton;
    // End of variables declaration//GEN-END:variables
}
