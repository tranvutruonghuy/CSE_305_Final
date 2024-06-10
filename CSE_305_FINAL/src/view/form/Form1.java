package view.form;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.StudentAccount;
import utils.ScaleImages;
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
        refreshLabel.setIcon(ScaleImages.scaleImage("src/view/images/sync.png", 30, 30));
        nameTF.setText(this.account.getName());
        userNameTF.setText(this.account.getUsername());
        IRNTF.setText(this.account.getIrn());
        expenseTF.setText(Double.toString(this.account.getExpense()));
        if (this.account.getGender().equalsIgnoreCase("n/a")) {
            maleButton.setSelected(false);
            femaleButton.setSelected(false);
        } else if (this.account.getGender().equalsIgnoreCase("male")) {
            maleButton.setSelected(true);
            femaleButton.setSelected(false);
        } else if (this.account.getGender().equalsIgnoreCase("female")) {
            femaleButton.setSelected(true);
            maleButton.setSelected(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        updateButton = new view.swing.Button();
        refreshLabel = new javax.swing.JLabel();

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
        femaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(0, 102, 102));
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        refreshLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                refreshLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(personalInforLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(IRNLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(expenseLabel)
                                    .addComponent(genderLB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNameTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(IRNTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(expenseTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(refreshLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(maleButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                                        .addComponent(femaleButton)))
                                .addGap(115, 115, 115)))))
                .addGap(126, 126, 126))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(personalInforLabel)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IRNTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IRNLabel))
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expenseLabel)
                    .addComponent(expenseTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLB)
                    .addComponent(maleButton)
                    .addComponent(femaleButton))
                .addGap(27, 27, 27)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        femaleButton.setSelected(false);
    }//GEN-LAST:event_maleButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String name = this.account.getName();
        String username = this.account.getName();
        String irn = IRNTF.getText();
        double expense = this.account.getExpense();
        String gender = "N/a";
        if (maleButton.isSelected()) {
            gender = "male";
        } else if (femaleButton.isSelected()) {
            gender = "female";
        }
        
        //check if somethg is null
        if (irn.length() == 0 || gender.length() == 0|| (!maleButton.isSelected() && !femaleButton.isSelected())){
            JOptionPane.showMessageDialog(background, "Some information can't be empty!");
            return;
        }
        
        for (StudentAccount e : listOfStudent) {
            if (e.getName().equals(name) && e.getUsername().equals(username)) {
                e.setGender(gender);
                e.setIrn(irn);
                e.setExpense(expense);
                StudentAccountDAO.updateFile(listOfStudent, "src/account.txt");
                this.account = e;
                JOptionPane.showMessageDialog(background, "Updated successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
                Main2.listOfStudentAccount = StudentAccountDAO.restoreListFromFile("src/account.txt");
                return;
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void refreshLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshLabelMousePressed

        listOfStudent = StudentAccountDAO.restoreListFromFile("src/account.txt");
        for (StudentAccount e : listOfStudent) {
            if (e.getName().equals(account.getName()) && e.getUsername().equals(account.getUsername())) {
                account = e;
                break;
            }
        }
        init();
    }//GEN-LAST:event_refreshLabelMousePressed

    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleButtonActionPerformed
        maleButton.setSelected(false);
    }//GEN-LAST:event_femaleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IRNLabel;
    private view.swing.MyTextField IRNTF;
    private javax.swing.JPanel background;
    private javax.swing.JLabel expenseLabel;
    private view.swing.MyTextField expenseTF;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JLabel genderLB;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel nameLabel;
    private view.swing.MyTextField nameTF;
    private javax.swing.JLabel personalInforLabel;
    private javax.swing.JLabel refreshLabel;
    private view.swing.Button updateButton;
    private view.swing.MyTextField userNameTF;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}
