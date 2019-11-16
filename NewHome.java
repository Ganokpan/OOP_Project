/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPJFrame;

/**
 *
 * @author User
 */
public class NewHome extends javax.swing.JFrame {

    /**
     * Creates new form NewHome
     */
    public NewHome() {
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

        jLabel1 = new javax.swing.JLabel();
        Nomember = new javax.swing.JButton();
        Member = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        graph = new javax.swing.JMenu();
        Graph = new javax.swing.JMenuItem();
        Jtable = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Angsana New", 1, 36)); // NOI18N
        jLabel1.setText("ร้านไก่ทอด");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 13, -1, 43));

        Nomember.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        Nomember.setText("สั่งอาหาร");
        Nomember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomemberActionPerformed(evt);
            }
        });
        getContentPane().add(Nomember, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 84, 151, 43));

        Member.setFont(new java.awt.Font("Angsana New", 0, 24)); // NOI18N
        Member.setText("สมาชิก");
        Member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberActionPerformed(evt);
            }
        });
        getContentPane().add(Member, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 84, 151, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OOPJFrame/chicken.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 470, 210));

        graph.setText("อื่นๆ");
        graph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphActionPerformed(evt);
            }
        });

        Graph.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        Graph.setText("กราฟ");
        Graph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraphActionPerformed(evt);
            }
        });
        graph.add(Graph);

        Jtable.setFont(new java.awt.Font("Angsana New", 0, 18)); // NOI18N
        Jtable.setText("สต้อกสินค้า");
        Jtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtableActionPerformed(evt);
            }
        });
        graph.add(Jtable);

        jMenuBar1.add(graph);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NomemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomemberActionPerformed
       Menu jmenu = new Menu();
        jmenu.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_NomemberActionPerformed

    private void MemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberActionPerformed
        Login login = new Login();
        login.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_MemberActionPerformed

    private void graphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphActionPerformed

    }//GEN-LAST:event_graphActionPerformed

    private void GraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraphActionPerformed
        graph Graph = new graph();
        Graph.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_GraphActionPerformed

    private void JtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtableActionPerformed
       Stock Stock = new Stock();
        Stock.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_JtableActionPerformed

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
            java.util.logging.Logger.getLogger(NewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem Graph;
    public javax.swing.JMenuItem Jtable;
    public javax.swing.JButton Member;
    public javax.swing.JButton Nomember;
    public javax.swing.JMenu graph;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}