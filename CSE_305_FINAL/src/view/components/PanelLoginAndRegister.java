package view.component;

import java.awt.Image;
import javax.swing.ImageIcon;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {

    public PanelLoginAndRegister() {
        initComponents();
        login.setVisible(false);
        register.setVisible(true);
        images();
    }

    private ImageIcon scaleImage(String path) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return scaledIcon;
    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }

    private void images() {
        userLabel.setIcon(scaleImage("src/view/images/user.png"));
        showPassLabel.setIcon(scaleImage("src/view/images/show.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        userNameAccount1 = new javax.swing.JTextField();
        passwordLB1 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        signInButton = new javax.swing.JButton();
        fogotLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        showPassLabel = new javax.swing.JLabel();
        register = new javax.swing.JPanel();
        userNameAccount = new javax.swing.JTextField();
        createAccLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        nameAccount1 = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        passwordLB = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Sign in");
        login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 140, 60));

        usernameLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameLabel1.setForeground(new java.awt.Color(0, 102, 102));
        usernameLabel1.setText("User Name");
        login.add(usernameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        userNameAccount1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userNameAccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameAccount1ActionPerformed(evt);
            }
        });
        login.add(userNameAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 330, 30));

        passwordLB1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLB1.setForeground(new java.awt.Color(0, 102, 102));
        passwordLB1.setText("Password");
        login.add(passwordLB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        passwordField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordField1.setEchoChar('\u25cf');
        login.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 330, 30));

        signInButton.setBackground(new java.awt.Color(0, 102, 0));
        signInButton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("SIGN IN");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        login.add(signInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 120, 50));

        fogotLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        fogotLabel.setText("Forgot your password?");
        login.add(fogotLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 170, -1));

        userLabel.setPreferredSize(new java.awt.Dimension(30, 30));
        login.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 30, 30));

        showPassLabel.setPreferredSize(new java.awt.Dimension(30, 30));
        showPassLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showPassLabelMousePressed(evt);
            }
        });
        login.add(showPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 40, 30));

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));
        register.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userNameAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameAccountActionPerformed(evt);
            }
        });
        register.add(userNameAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 290, 30));

        createAccLabel.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        createAccLabel.setForeground(new java.awt.Color(0, 102, 0));
        createAccLabel.setText("Create Account");
        register.add(createAccLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 230, 58));

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 102, 102));
        usernameLabel.setText("User Name");
        register.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        nameAccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameAccount1ActionPerformed(evt);
            }
        });
        register.add(nameAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 290, 30));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 102, 102));
        nameLabel.setText("Name");
        register.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        passwordLB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLB.setForeground(new java.awt.Color(0, 102, 102));
        passwordLB.setText("Password");
        register.add(passwordLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));
        register.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 290, 30));

        signUpButton.setBackground(new java.awt.Color(0, 102, 102));
        signUpButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("SIGN UP");
        signUpButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 0, 5, 0));
        register.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 140, 40));

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void userNameAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameAccountActionPerformed

    private void nameAccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameAccount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameAccount1ActionPerformed

    private void userNameAccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameAccount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameAccount1ActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        
    }//GEN-LAST:event_signInButtonActionPerformed
    private boolean check = false;
    private void showPassLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassLabelMousePressed
        if (!check) {
                        passwordField1.setEchoChar((char) 0);
                        showPassLabel.setIcon(scaleImage("src/view/images/hide.png"));
                        check = true;
                        
                } else {
                        check = false;
                        passwordField1.setEchoChar('\u25cf');
                        showPassLabel.setIcon(scaleImage("src/view/images/show.png"));
                }
    }//GEN-LAST:event_showPassLabelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createAccLabel;
    private javax.swing.JLabel fogotLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel login;
    private javax.swing.JTextField nameAccount1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JLabel passwordLB;
    private javax.swing.JLabel passwordLB1;
    private javax.swing.JPanel register;
    private javax.swing.JLabel showPassLabel;
    private javax.swing.JButton signInButton;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userNameAccount;
    private javax.swing.JTextField userNameAccount1;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    // End of variables declaration//GEN-END:variables

}
