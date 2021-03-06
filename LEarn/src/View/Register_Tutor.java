/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.SignUpController;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author nabillaaura
 */

public class Register_Tutor extends javax.swing.JFrame {
    
    public final JFileChooser openFileChooser;
    private File proofFile;
    private SignUpController controller;
    
    /**
     * Creates new form Register_Tutor
     */
    public Register_Tutor() {
        initComponents();
        
        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("c:\\tmp"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("Image File", "jpg"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("PDF File", "pdf"));
        openFileChooser.setAcceptAllFileFilterUsed(false);
    }
    
    public Register_Tutor(SignUpController controller) {
        this.controller = controller;
        initComponents();
        
        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File("c:\\tmp"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("PDF File", "pdf"));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("Image File", "jpg"));
        openFileChooser.setAcceptAllFileFilterUsed(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TF_NamaLengkapTutor = new javax.swing.JTextField();
        TF_Username = new javax.swing.JTextField();
        PF_Password = new javax.swing.JPasswordField();
        PF_reTypePassword = new javax.swing.JPasswordField();
        CB_Bank = new javax.swing.JComboBox();
        TF_NomorRekening = new javax.swing.JTextField();
        TF_NamaRekening = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TF_Biodata = new javax.swing.JTextArea();
        B_CreateAccount = new javax.swing.JButton();
        B_UploadFile = new javax.swing.JButton();
        jLabelFileUpload = new javax.swing.JLabel();
        jLabel1_NamaLengkap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TF_NamaLengkapTutor.setBackground(new java.awt.Color(224, 187, 218));
        jPanel1.add(TF_NamaLengkapTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 290, 30));

        TF_Username.setBackground(new java.awt.Color(224, 187, 218));
        jPanel1.add(TF_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 290, 30));

        PF_Password.setBackground(new java.awt.Color(224, 187, 218));
        PF_Password.setToolTipText("");
        PF_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PF_PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(PF_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 290, 30));

        PF_reTypePassword.setBackground(new java.awt.Color(224, 187, 218));
        PF_reTypePassword.setToolTipText("");
        PF_reTypePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PF_reTypePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(PF_reTypePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 290, 30));

        CB_Bank.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Bank", "Mandiri", "BCA", "BRI" }));
        CB_Bank.setToolTipText("");
        jPanel1.add(CB_Bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 90, 30));

        TF_NomorRekening.setBackground(new java.awt.Color(224, 187, 218));
        TF_NomorRekening.setText("Nomor Rekening");
        TF_NomorRekening.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TF_NomorRekeningFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_NomorRekeningFocusLost(evt);
            }
        });
        jPanel1.add(TF_NomorRekening, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 190, 30));

        TF_NamaRekening.setBackground(new java.awt.Color(224, 187, 218));
        jPanel1.add(TF_NamaRekening, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 290, 30));

        TF_Biodata.setBackground(new java.awt.Color(224, 187, 218));
        TF_Biodata.setColumns(20);
        TF_Biodata.setLineWrap(true);
        TF_Biodata.setRows(3);
        jScrollPane1.setViewportView(TF_Biodata);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 290, 60));

        B_CreateAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_CreateAccount.png"))); // NOI18N
        B_CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(B_CreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 140, 50));

        B_UploadFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_SelectFile_Purple.png"))); // NOI18N
        B_UploadFile.setText("Upload File");
        B_UploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_UploadFileActionPerformed(evt);
            }
        });
        jPanel1.add(B_UploadFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 100, 30));

        jLabelFileUpload.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelFileUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 130, 30));

        jLabel1_NamaLengkap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Background_RegisterTutor.png"))); // NOI18N
        jLabel1_NamaLengkap.setText("jLabel1");
        jPanel1.add(jLabel1_NamaLengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PF_reTypePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PF_reTypePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PF_reTypePasswordActionPerformed

    private void PF_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PF_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PF_PasswordActionPerformed

    private void TF_NomorRekeningFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_NomorRekeningFocusGained
        // TODO add your handling code here:
        if (TF_NomorRekening.getText().equals("Nomor Rekening")){
            TF_NomorRekening.setText("");
        }
    }//GEN-LAST:event_TF_NomorRekeningFocusGained

    private void TF_NomorRekeningFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_NomorRekeningFocusLost
        // TODO add your handling code here:
        if (TF_NomorRekening.getText().equals("")){
            TF_NomorRekening.setText("Nomor Rekening");
        }
    }//GEN-LAST:event_TF_NomorRekeningFocusLost

    private void B_UploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_UploadFileActionPerformed
        int returnValue = openFileChooser.showOpenDialog(this);
        
        if(returnValue == JFileChooser.APPROVE_OPTION){
            try{
                proofFile = openFileChooser.getSelectedFile();
                jLabelFileUpload.setText(proofFile.getName());
            }catch(Exception e){
                jLabelFileUpload.setText("Failed to load PDF file");
            }
        }else{
            jLabelFileUpload.setText("No File Chosen");
        }
    }//GEN-LAST:event_B_UploadFileActionPerformed

    private void B_CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CreateAccountActionPerformed
        String bio = TF_Biodata.getText();
        String nama = TF_NamaLengkapTutor.getText();
        String namaRekening = TF_NamaRekening.getText();
        String norek = TF_NomorRekening.getText();
        String username = TF_Username.getText();
        String password = PF_Password.getText();
        String rePassword = PF_reTypePassword.getText();
        String bank = String.valueOf(CB_Bank.getSelectedItem());
        if(nama.isEmpty() || username.isEmpty() || password.compareTo(rePassword) != 0 )
            return;
        
        FileInputStream proofstream = null;
        try {
            proofstream = new FileInputStream(proofFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Register_Tutor.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller.RegisterTutor(username, nama, password, bio, bank, namaRekening, namaRekening, proofstream);
        
    }//GEN-LAST:event_B_CreateAccountActionPerformed

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
            java.util.logging.Logger.getLogger(Register_Tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Tutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_CreateAccount;
    private javax.swing.JButton B_UploadFile;
    private javax.swing.JComboBox CB_Bank;
    private javax.swing.JPasswordField PF_Password;
    private javax.swing.JPasswordField PF_reTypePassword;
    private javax.swing.JTextArea TF_Biodata;
    private javax.swing.JTextField TF_NamaLengkapTutor;
    private javax.swing.JTextField TF_NamaRekening;
    private javax.swing.JTextField TF_NomorRekening;
    private javax.swing.JTextField TF_Username;
    private javax.swing.JLabel jLabel1_NamaLengkap;
    private javax.swing.JLabel jLabelFileUpload;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
