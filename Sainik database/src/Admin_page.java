
import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MONAEM
 */
public class Admin_page extends javax.swing.JFrame {

    /**
     * Creates new form Admin_page
     */
    public Admin_page() {
        initComponents();
        ImageIcon background = new ImageIcon(getClass().getResource("army_log.png"));
        this.setIconImage(background.getImage());
        getContentPane().setBackground(new Color(244, 244, 242));
        this.setBounds(10, 10, 1200, 800);
        
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serbutton = new javax.swing.JButton();
        Regbutton = new javax.swing.JButton();
        Application = new javax.swing.JButton();
        ree = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ree1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(10, 10, 1500, 1000));
        setSize(new java.awt.Dimension(0, 0));

        serbutton.setBackground(new java.awt.Color(153, 255, 153));
        serbutton.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        serbutton.setForeground(new java.awt.Color(0, 0, 0));
        serbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/client-account-template-icon.png"))); // NOI18N
        serbutton.setText("Details");
        serbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        serbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serbuttonActionPerformed(evt);
            }
        });

        Regbutton.setBackground(new java.awt.Color(153, 255, 153));
        Regbutton.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        Regbutton.setForeground(new java.awt.Color(0, 0, 0));
        Regbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/user-add-icon.png"))); // NOI18N
        Regbutton.setText("Registration");
        Regbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Regbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegbuttonActionPerformed(evt);
            }
        });

        Application.setBackground(new java.awt.Color(153, 255, 153));
        Application.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        Application.setForeground(new java.awt.Color(0, 0, 0));
        Application.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/report-icon.png"))); // NOI18N
        Application.setText("Application");
        Application.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Application.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Application.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplicationActionPerformed(evt);
            }
        });

        ree.setBackground(new java.awt.Color(153, 255, 153));
        ree.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        ree.setForeground(new java.awt.Color(0, 0, 0));
        ree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Message-icon.png"))); // NOI18N
        ree.setText("Request");
        ree.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reeActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_112.jpg"))); // NOI18N

        back.setBackground(new java.awt.Color(204, 0, 0));
        back.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Actions-dialog-close-icon.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 72)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin Panel");

        ree1.setBackground(new java.awt.Color(153, 255, 153));
        ree1.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        ree1.setForeground(new java.awt.Color(0, 0, 0));
        ree1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/student-icon.png"))); // NOI18N
        ree1.setText("Info Search");
        ree1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ree1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ree1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Regbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Application, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ree, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ree1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(back)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Regbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Application, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(ree, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(ree1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serbuttonActionPerformed
        Adminser op = new Adminser();
        op.setVisible(true);
        op.setBounds(300, 00, 1200, 1020);

        this.setVisible(false);
    }//GEN-LAST:event_serbuttonActionPerformed

    private void RegbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegbuttonActionPerformed
        Registration op = new Registration();
        op.setVisible(true);
        op.setBounds(10, 10, 1500, 1000);

        this.setVisible(false);
    }//GEN-LAST:event_RegbuttonActionPerformed

    private void ApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplicationActionPerformed
        admin_apli op = new admin_apli();
        op.setVisible(true);
        op.setBounds(200, 00, 1600, 790);

        this.setVisible(false);
    }//GEN-LAST:event_ApplicationActionPerformed

    private void reeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reeActionPerformed
        Request op = new Request();
        op.setVisible(true);
        op.setBounds(300, 50, 1150, 740);

        this.setVisible(false);            
    }//GEN-LAST:event_reeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Admin_login_page op = new Admin_login_page();
        op.setVisible(true);
        op.setBounds(300, 50, 1150, 700);

        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void ree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ree1ActionPerformed
        ad_search op = new ad_search();
        op.setVisible(true);
        op.setBounds(300, 50, 1200, 700);

        this.setVisible(false);
    }//GEN-LAST:event_ree1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Application;
    private javax.swing.JButton Regbutton;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton ree;
    private javax.swing.JButton ree1;
    private javax.swing.JButton serbutton;
    // End of variables declaration//GEN-END:variables
}
