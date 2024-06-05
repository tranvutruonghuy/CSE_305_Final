package view.form;

import java.io.File;
import java.util.List;
import model.StudentAccount;
import utils.StudentAccountDAO;
import view.main.Main2;

public class Form1 extends javax.swing.JPanel {

    private StudentAccount account = Main2.account;
    private List<StudentAccount> listOfStudent = Main2.listOfStudentAccount;

    public Form1() {

        initComponents();
        setOpaque(false);
        init();
    }

    public void setAccount(StudentAccount account) {
        this.account = account;
    }

    private void init() {

        nameTF.setText(this.account.getName());
        userNameTF.setText(this.account.getUsername());
        IRNTF.setText(this.account.getIrn());
        expenseTF.setText(Double.toString(this.account.getExpense()));
        if (this.account.getGender().equalsIgnoreCase("n/a")) {
            maleButton.setSelected(false);
            femaleButton.setSelected(false);
        } else if (this.account.getGender().equalsIgnoreCase("male")) {
            maleButton.setSelected(true);
        } else if (this.account.getGender().equalsIgnoreCase("female")) {
            femaleButton.setSelected(true);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        personalInforLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        nameTF = new view.swing.MyTextField();
        usernameLabel = new javax.swing.JLabel();
        userNameTF = new view.swing.MyTextField();
        IRNLabel = new javax.swing.JLabel();
        IRNTF = new view.swing.MyTextField();
        expenseLabel = new javax.swing.JLabel();
        expenseTF = new view.swing.MyTextField();
        genderLB = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        button1 = new view.swing.Button();

        background.setBackground(new java.awt.Color(255, 255, 255));

        personalInforLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        personalInforLabel.setForeground(new java.awt.Color(0, 102, 102));
        personalInforLabel.setText("Personal Information");

        nameLabel.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        nameLabel.setText("Name:");

        usernameLabel.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        usernameLabel.setText("Username:");

        IRNLabel.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        IRNLabel.setText("IRN:");

        expenseLabel.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        expenseLabel.setText("Expense:");

        genderLB.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        genderLB.setText("Gender:");

        maleButton.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        femaleButton.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        femaleButton.setText("Female");

        button1.setBackground(new java.awt.Color(0, 102, 102));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Update");
        button1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
                backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(backgroundLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(personalInforLabel,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 434,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(backgroundLayout.createSequentialGroup()
                                                .addGroup(backgroundLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(backgroundLayout.createSequentialGroup()
                                                                .addGap(70, 70, 70)
                                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(nameLabel)
                                                                        .addComponent(IRNLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                67,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(expenseLabel)
                                                                        .addComponent(genderLB,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                79,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                backgroundLayout.createSequentialGroup()
                                                                        .addContainerGap()
                                                                        .addComponent(usernameLabel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                79,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(backgroundLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(backgroundLayout.createSequentialGroup()
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(backgroundLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(userNameTF,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(nameTF,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(IRNTF,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(expenseTF,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)))
                                                        .addGroup(backgroundLayout.createSequentialGroup()
                                                                .addGap(88, 88, 88)
                                                                .addComponent(maleButton)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        156, Short.MAX_VALUE)
                                                                .addComponent(femaleButton)
                                                                .addGap(115, 115, 115)))))
                                .addGap(126, 126, 126))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(315, 315, 315)));
        backgroundLayout.setVerticalGroup(
                backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(personalInforLabel)
                                .addGap(18, 18, 18)
                                .addGroup(
                                        backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(
                                        backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(usernameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(IRNTF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(IRNLabel))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(expenseLabel)
                                                .addComponent(expenseTF, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(
                                        backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(genderLB)
                                                .addComponent(maleButton)
                                                .addComponent(femaleButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(13, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_maleButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_maleButtonActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_button1ActionPerformed
        String name = nameTF.getText();
        String username = userNameTF.getText();
        String irn = IRNTF.getText();
        double expense = Double.parseDouble(expenseTF.getText());
        String gender = "N/a";
        if (maleButton.isSelected()) {
            gender = "male";
        } else if (femaleButton.isSelected()) {
            gender = "female";
        }
        for (StudentAccount e : listOfStudent) {
            if (e.getName().equals(name) && e.getUsername().equals(username)) {
                e.setGender(gender);
                e.setIrn(irn);
                e.setExpense(expense);
                // StudentAccountDAO.updateFile(listOfStudent, "src/account.txt");
                return;
            }
        }
    }// GEN-LAST:event_button1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IRNLabel;
    private view.swing.MyTextField IRNTF;
    private javax.swing.JPanel background;
    private view.swing.Button button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel expenseLabel;
    private view.swing.MyTextField expenseTF;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JLabel genderLB;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel nameLabel;
    private view.swing.MyTextField nameTF;
    private javax.swing.JLabel personalInforLabel;
    private view.swing.MyTextField userNameTF;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}
