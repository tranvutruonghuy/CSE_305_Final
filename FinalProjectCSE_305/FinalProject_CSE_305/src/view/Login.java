


import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Wunhh
 */
public class Login extends javax.swing.JFrame {

        /**
         * Creates new form Login
         */
        public Login() {
                initComponents();
                this.setLocationRelativeTo(null);
                initialScaleImage();

        }

        public void initialScaleImage() {
        ImageIcon icon = new ImageIcon("FinalProjectCSE_305//FinalProject_CSE_305//src//images//Bus1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        //
        ImageIcon icon1 = new ImageIcon("FinalProjectCSE_305//FinalProject_CSE_305//src//Images//hide.png");
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(hiddenButton1.getWidth(), hiddenButton1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
        hiddenButton1.setIcon(scaledIcon1);
        //
        ImageIcon icon3 = new ImageIcon("FinalProjectCSE_305//FinalProject_CSE_305//src//Images//user.png");
        Image img3 = icon3.getImage();
        Image imgScale3 = img3.getScaledInstance(userLabel.getWidth(), userLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
        userLabel.setIcon(scaledIcon3);

    }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTF1 = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        donthaveLabel = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        passwordTF = new javax.swing.JPasswordField();
        hiddenButton1 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOGIN");

        label.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setText("Password");

        loginButton.setBackground(new java.awt.Color(0, 102, 102));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");

        donthaveLabel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        donthaveLabel.setText("Don't have an account?");

        signupButton.setBackground(new java.awt.Color(0, 102, 102));
        signupButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Sign up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        passwordTF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        passwordTF.setEchoChar('\u25cf');

        hiddenButton1.setPreferredSize(new java.awt.Dimension(45, 45));
        hiddenButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hiddenButton1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Welcome! Let's get started!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(donthaveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(signupButton))
                            .addComponent(usernameTF1)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hiddenButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2)))
                .addContainerGap(1086, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameTF1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(passwordLabel)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hiddenButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donthaveLabel)
                    .addComponent(signupButton))
                .addGap(35, 35, 35))
            .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void hiddenButton1MousePressed(java.awt.event.MouseEvent evt) {                                           
        if (!check) {
                        passwordTF.setEchoChar((char) 0);
                        ImageIcon icon2 = new ImageIcon("FinalProjectCSE_305//FinalProject_CSE_305//src//Images//show.png");
                        Image img2 = icon2.getImage();
                        Image imgScale2 = img2.getScaledInstance(hiddenButton1.getWidth(), hiddenButton1.getHeight(),
                                        Image.SCALE_SMOOTH);
                        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
                        hiddenButton1.setIcon(scaledIcon2);
                        check = true;
                } else {
                        check = false;
                        passwordTF.setEchoChar('\u25cf');
                        ImageIcon icon1 = new ImageIcon("FinalProjectCSE_305//FinalProject_CSE_305//src//Images//hide.png");
                        Image img1 = icon1.getImage();
                        Image imgScale1 = img1.getScaledInstance(hiddenButton1.getWidth(), hiddenButton1.getHeight(),
                                        Image.SCALE_SMOOTH);
                        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
                        hiddenButton1.setIcon(scaledIcon1);
                }
    }                                          

        private boolean check = false;

        private void hiddenButtonMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_hiddenButtonMousePressed
                if (!check) {
                        passwordTF.setEchoChar((char) 0);
                        ImageIcon icon2 = new ImageIcon("PJ305_1//src//Images//show.png");
                        Image img2 = icon2.getImage();
                        Image imgScale2 = img2.getScaledInstance(userLabel.getWidth(), userLabel.getHeight(),
                                        Image.SCALE_SMOOTH);
                        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
                        userLabel.setIcon(scaledIcon2);
                        check = true;
                } else {
                        check = false;
                        passwordTF.setEchoChar('\u25cf');
                        ImageIcon icon1 = new ImageIcon("PJ305_1//src//Images//hide.png");
                        Image img1 = icon1.getImage();
                        Image imgScale1 = img1.getScaledInstance(userLabel.getWidth(), userLabel.getHeight(),
                                        Image.SCALE_SMOOTH);
                        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
                        userLabel.setIcon(scaledIcon1);
                }
        }// GEN-LAST:event_hiddenButtonMousePressed

        private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_signupButtonActionPerformed
                Register register = new Register();
                this.setVisible(false);
                register.setVisible(true);
        }// GEN-LAST:event_signupButtonActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Login().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel donthaveLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel hiddenButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JButton signupButton;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField usernameTF1;
    // End of variables declaration                   
}
