/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_sharing;

import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class HalamanSearch extends javax.swing.JFrame {

    /**
     * Creates new form HalamanSearch
     */
    public HalamanSearch() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        OkButton = new javax.swing.JButton();
        ViphoLabel = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JTextField();
        LogoutButton = new javax.swing.JButton();
        AkunButton = new javax.swing.JButton();
        KlikokLabel = new javax.swing.JLabel();
        VButton = new javax.swing.JButton();
        FButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OkButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        OkButton.setText("OK");

        ViphoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViphoLabel.setText("VIPHO");

        SearchLabel.setBackground(new java.awt.Color(204, 204, 204));

        LogoutButton.setText("Logout");

        KlikokLabel.setText("Klik ok sekali lagi untuk search");

        VButton.setText("V");

        FButton.setText("F");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(AkunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(KlikokLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ViphoLabel)
                                .addGap(35, 35, 35)
                                .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OkButton)))
                        .addGap(38, 38, 38)
                        .addComponent(VButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogoutButton)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViphoLabel)
                    .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkButton)
                    .addComponent(VButton)
                    .addComponent(FButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KlikokLabel)
                .addGap(60, 60, 60)
                .addComponent(AkunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HalamanSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HalamanSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HalamanSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HalamanSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HalamanSearch().setVisible(true);
//            }
//        });
//    }
    
    private SearchController controller;
    private TagPersonController con;
    
    public void setController(SearchController controller){
        this.controller = controller;
        getLogoutButton().addActionListener(controller);
        getOkButton().addActionListener(controller);
        getAkunButton().addActionListener(controller);
        getVButton().addActionListener(controller);
        getFButton().addActionListener(controller);
    }
    
    public void setControllers(TagPersonController controllers){
        this.con = controllers;
        getLogoutButton().addActionListener(controllers);
        getOkButton().addActionListener(controllers);
        getAkunButton().addActionListener(controllers);
        getVButton().addActionListener(controllers);
        getFButton().addActionListener(controllers);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AkunButton;
    private javax.swing.JButton FButton;
    private javax.swing.JLabel KlikokLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton OkButton;
    private javax.swing.JTextField SearchLabel;
    private javax.swing.JButton VButton;
    private javax.swing.JLabel ViphoLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the LogoutButton
     */
    public javax.swing.JButton getLogoutButton() {
        return LogoutButton;
    }

    /**
     * @return the OkButton
     */
    public javax.swing.JButton getOkButton() {
        return OkButton;
    }

    public javax.swing.JButton getAkunButton() {
        return AkunButton;
    }

    /**
     * @return the KlikokLabel
     */
    public javax.swing.JLabel getKlikokLabel() {
        return KlikokLabel;
    }

    /**
     * @return the SearchLabel
     */
    public javax.swing.JTextField getSearchLabel() {
        return SearchLabel;
    }

    public JButton getVButton() {
        return VButton;
    }

    public JButton getFButton() {
        return FButton;
    }

    public JLabel getViphoLabel() {
        return ViphoLabel;
    }

    public void setViphoLabel(JLabel ViphoLabel) {
        this.ViphoLabel = ViphoLabel;
    }
    
    public void MouseListener(MouseListener e){
        ViphoLabel.addMouseListener(e);
    }
}
