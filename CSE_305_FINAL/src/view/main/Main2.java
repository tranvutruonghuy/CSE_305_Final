package view.main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.SpecialDateScheduleTableModel;
import model.StudentAccount;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import utils.BusService;
import view.form.ComplainPanel;
import view.components.Menu;
import view.event.EventMenuSelected;

import view.form.ChooseBusByRoute;
import view.form.ChooseBusByNumber;
import view.form.ChoosingDestinationPanel;

import view.form.ComplaintBoxTable;
import view.form.Form1;
import view.form.Form2;
import view.form.SpecialDayForm;
import view.form.WelcomeForm;
import view.model.ModelMenu;

public class Main2 extends javax.swing.JFrame {
    
    private Menu menu = new Menu();
    private JPanel main2 = new JPanel();
    private MigLayout layout;
    private Animator animator;
    private boolean menuShow;
    private EventMenuSelected event;
    public static StudentAccount account;
    public static List<StudentAccount> listOfStudentAccount;
    public static BusService busService;
    
    public Main2() {
        initComponents();
        this.setTitle("Bus application");
        init();
        
    }
    
    public void setListOfStudentAccount(List<StudentAccount> listOfStudentAccount) {
        this.listOfStudentAccount = listOfStudentAccount;
    }
    
    private void init() {
        busService = new BusService();
        layout = new MigLayout("fill", "0[]10[]0", "0[fill]0");
        body.setLayout(layout);
        main2.setOpaque(false);
        main2.setLayout(new BorderLayout());
        menu.addEventLogout(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main main = new Main();
                main.setVisible(true);
                shutdown();
            }
        });
        menu.addEventMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!animator.isRunning()) {
                    animator.start();
                }
            }
        });
        menu.setEvent(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                switch (index) {
                    case 0 -> {
                        Form1 f1 = new Form1();
                        f1.setAccount(account);
                        showForm(f1);
                    }
                    case 1 ->
                        showForm(new ChoosingDestinationPanel());
                    case 2 ->
                        showForm(new Form2());
                    case 3 ->
                        showForm(new ChooseBusByNumber());
                    case 4 ->
                        showForm(new ChooseBusByRoute());
                    
                    case 5 -> {
                        SpecialDayForm form = new SpecialDayForm();
                                             
                        showForm(form);
                    }
                    
                    case 6 -> {
                        ComplainPanel form = new ComplainPanel();
                        showForm(form);
                    }
                    default -> {
                    }
                }
            }
        });
        menu.addMenu(new ModelMenu("Profile", scaleImage("src/view/images/user.png")));
        menu.addMenu(new ModelMenu("Find bus", scaleImage("src/view/images/findbus.png")));
        menu.addMenu(new ModelMenu("Bus route", scaleImage("src/view/images/route.png")));
        menu.addMenu(new ModelMenu("Find bus by number", scaleImage("src/view/images/find.png")));
        menu.addMenu(new ModelMenu("Find bus by bustop", scaleImage("src/view/images/findbustop.png")));
        menu.addMenu(new ModelMenu("Special day", scaleImage("src/view/images/date.png")));
        menu.addMenu(new ModelMenu("Help", scaleImage("src/view/images/customersupport.png")));
        
        body.add(menu, "w 50!");
        body.add(main2, "w 100%");
        
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menuShow) {
                    width = 50 + (150 * (1f - fraction));
                    menu.setAlpha(1f - fraction);
                } else {
                    width = 50 + (150 * fraction);
                    menu.setAlpha(fraction);
                }
                layout.setComponentConstraints(menu, "w " + width + "!");
                body.revalidate();
            }
            
            @Override
            public void end() {
                menuShow = !menuShow;
            }
            
        };
        animator = new Animator(400, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        showForm(new WelcomeForm());
    }
    
    private ImageIcon scaleImage(String path) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        return scaledIcon;
    }
    
    private void shutdown() {
        this.dispose();
    }
    
    private void showForm(Component com) {
        main2.removeAll();
        main2.add(com);
        main2.repaint();
        main2.revalidate();
    }
    
    public void setEvent(EventMenuSelected event) {
        this.event = event;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        body.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    // End of variables declaration//GEN-END:variables
}
