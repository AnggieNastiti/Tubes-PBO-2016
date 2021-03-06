/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_sharing;

import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class ViewVideo extends javax.swing.JFrame {

    /**
     * Creates new form ViewVideo
     */
    public ViewVideo() {
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

        TagPersonButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        DeleteTagButton = new javax.swing.JButton();
        DeleteVideoButton = new javax.swing.JButton();
        NamaVideoText = new javax.swing.JTextField();
        OkButton = new javax.swing.JButton();
        VButton = new javax.swing.JButton();
        FButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        VideoArea = new javax.swing.JTextArea();
        ViphoLabel = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TagPersonButton.setText("Remove Tag Person");
        TagPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TagPersonButtonActionPerformed(evt);
            }
        });

        LogoutButton.setText("Logout");

        DeleteTagButton.setText("Delete Tag");

        DeleteVideoButton.setText("Delete Foto");

        OkButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        OkButton.setText("OK");

        VButton.setText("V");

        FButton.setText("F");

        VideoArea.setColumns(20);
        VideoArea.setRows(5);
        VideoArea.setAlignmentX(3.0F);
        jScrollPane1.setViewportView(VideoArea);

        ViphoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ViphoLabel.setText("VIPHO");

        SearchLabel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViphoLabel)
                .addGap(35, 35, 35)
                .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OkButton)
                .addGap(18, 18, 18)
                .addComponent(VButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TagPersonButton)
                            .addComponent(NamaVideoText, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DeleteTagButton)
                            .addComponent(DeleteVideoButton)))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViphoLabel)
                    .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OkButton)
                    .addComponent(VButton)
                    .addComponent(FButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TagPersonButton)
                    .addComponent(DeleteTagButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaVideoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteVideoButton))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TagPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TagPersonButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TagPersonButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(ViewVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ViewVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ViewVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ViewVideo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewVideo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteTagButton;
    private javax.swing.JButton DeleteVideoButton;
    private javax.swing.JButton FButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField NamaVideoText;
    private javax.swing.JButton OkButton;
    private javax.swing.JTextField SearchLabel;
    private javax.swing.JButton TagPersonButton;
    private javax.swing.JButton VButton;
    private javax.swing.JTextArea VideoArea;
    private javax.swing.JLabel ViphoLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JButton getVButton() {
        return VButton;
    }

    public JButton getOkButton() {
        return OkButton;
    }

    public JButton getFButton() {
        return FButton;
    }

    public JButton getTagPersonButton() {
        return TagPersonButton;
    }

    public JButton getDeleteTagButton() {
        return DeleteTagButton;
    }

    public JButton getDeleteVideoButton() {
        return DeleteVideoButton;
    }

    public JButton getLogoutButton() {
        return LogoutButton;
    }

    public JTextField getSearchLabel() {
        return SearchLabel;
    }

    public JLabel getViphoLabel() {
        return ViphoLabel;
    }

    public void setViphoLabel(JLabel ViphoLabel) {
        this.ViphoLabel = ViphoLabel;
    }
    
    public void MouseListener (MouseListener e){
        ViphoLabel.addMouseListener(e);
    }
    
    ViewVideoController controller;

    public void setController(ViewVideoController controller) {
        this.controller = controller;
        getVButton().addActionListener(controller);
        getFButton().addActionListener(controller);
        getLogoutButton().addActionListener(controller);
        getTagPersonButton().addActionListener(controller);
        getDeleteTagButton().addActionListener(controller);
        getDeleteVideoButton().addActionListener(controller);
    }
    
            
}
