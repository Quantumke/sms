/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sms;

/**
 *
 * @author benson
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        F1T1C1 = new javax.swing.JMenuItem();
        F1C2F1 = new javax.swing.JMenuItem();
        F1T1ET = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        F1T2C1 = new javax.swing.JMenuItem();
        F1T2C2 = new javax.swing.JMenuItem();
        F1T2ET = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Academic reports");

        jMenu3.setText("Accademic progress");

        jMenu5.setText("Form 1");

        jMenu10.setText("First Term");

        F1T1C1.setText("CAT 1");
        F1T1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1T1C1ActionPerformed(evt);
            }
        });
        jMenu10.add(F1T1C1);

        F1C2F1.setText("CAT 2");
        F1C2F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1C2F1ActionPerformed(evt);
            }
        });
        jMenu10.add(F1C2F1);

        F1T1ET.setText("End Term");
        F1T1ET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1T1ETActionPerformed(evt);
            }
        });
        jMenu10.add(F1T1ET);

        jMenu5.add(jMenu10);

        jMenu9.setText("Second Term");

        F1T2C1.setText("CAT 1");
        F1T2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1T2C1ActionPerformed(evt);
            }
        });
        jMenu9.add(F1T2C1);

        F1T2C2.setText("CAT 2");
        F1T2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1T2C2ActionPerformed(evt);
            }
        });
        jMenu9.add(F1T2C2);

        F1T2ET.setText("End Term");
        F1T2ET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1T2ETActionPerformed(evt);
            }
        });
        jMenu9.add(F1T2ET);

        jMenu5.add(jMenu9);

        jMenu8.setText("Third Term");

        jMenu13.setText("CAT 1");
        jMenu8.add(jMenu13);

        jMenu14.setText("CAT 2");
        jMenu8.add(jMenu14);

        jMenuItem7.setText("CAT 3");
        jMenu8.add(jMenuItem7);

        jMenu5.add(jMenu8);

        jMenu3.add(jMenu5);

        jMenuItem1.setText("Form 2");
        jMenu3.add(jMenuItem1);

        jMenu6.setText("Form 3");
        jMenu3.add(jMenu6);

        jMenu4.setText("Form 4");
        jMenu3.add(jMenu4);

        jMenu1.add(jMenu3);

        jMenu7.setText("Disciplinary progress");
        jMenu1.add(jMenu7);

        jMenuItem2.setText("Reviews");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void F1T1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1T1C1ActionPerformed
        // TODO add your handling code here:
        
        F1T1C1 a = new F1T1C1();
        a.setVisible(true);
       
        
    }//GEN-LAST:event_F1T1C1ActionPerformed

    private void F1C2F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1C2F1ActionPerformed
        // TODO add your handling code here:
        F1T1C2 b = new F1T1C2();
        b.setVisible(true);
    }//GEN-LAST:event_F1C2F1ActionPerformed

    private void F1T1ETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1T1ETActionPerformed
        // TODO add your handling code here:
        
        F1T1ET c = new F1T1ET();
        c.setVisible(true);
    }//GEN-LAST:event_F1T1ETActionPerformed

    private void F1T2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1T2C2ActionPerformed
        // TODO add your handling code here:
        F1T2C2  e = new F1T2C2();
      e.setVisible(true);
    }//GEN-LAST:event_F1T2C2ActionPerformed

    private void F1T2ETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1T2ETActionPerformed
        // TODO add your handling code here:
        FIT2ET f = new FIT2ET();
        f.setVisible(true);
        
        
    }//GEN-LAST:event_F1T2ETActionPerformed

    private void F1T2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1T2C1ActionPerformed
        // TODO add your handling code here:
        F1T2C1 d = new F1T2C1();
        d.setVisible(true);
    }//GEN-LAST:event_F1T2C1ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem F1C2F1;
    private javax.swing.JMenuItem F1T1C1;
    private javax.swing.JMenuItem F1T1ET;
    private javax.swing.JMenuItem F1T2C1;
    private javax.swing.JMenuItem F1T2C2;
    private javax.swing.JMenuItem F1T2ET;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
