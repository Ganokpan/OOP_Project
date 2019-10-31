/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPJFrame;

public class Home1 extends javax.swing.JFrame {

    public Home1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLogin = new javax.swing.JButton();
        JMenu = new javax.swing.JButton();
        JMember = new javax.swing.JButton();
        Jstock = new javax.swing.JButton();
        JGraph = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JLogin.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        JLogin.setText("เข้าสู่ระบบ");
        JLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLoginActionPerformed(evt);
            }
        });

        JMenu.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        JMenu.setText("สั่งอาหาร");
        JMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuActionPerformed(evt);
            }
        });

        JMember.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        JMember.setText("หน้าต่างสมาชิก");
        JMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMemberActionPerformed(evt);
            }
        });

        Jstock.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        Jstock.setText("สต็อกสินค้า");
        Jstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JstockActionPerformed(evt);
            }
        });

        JGraph.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        JGraph.setText("Graph");
        JGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JGraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jstock, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JMember, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JLogin)
                .addGap(240, 240, 240)
                .addComponent(JMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JMember, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jstock, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLoginActionPerformed
        Login login = new Login();
        login.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_JLoginActionPerformed

    private void JMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuActionPerformed
        Menu jmenu = new Menu();
        jmenu.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_JMenuActionPerformed

    private void JMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMemberActionPerformed
        Member jmember = new Member();
        jmember.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_JMemberActionPerformed

    private void JstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JstockActionPerformed
        Stock jstock = new Stock();
        jstock.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_JstockActionPerformed

    private void JGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JGraphActionPerformed
        graph Jgraph = new graph();
        Jgraph.setVisible(true);
        
        setVisible(false);
    }//GEN-LAST:event_JGraphActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JGraph;
    public javax.swing.JButton JLogin;
    public javax.swing.JButton JMember;
    public javax.swing.JButton JMenu;
    public javax.swing.JButton Jstock;
    // End of variables declaration//GEN-END:variables
}
