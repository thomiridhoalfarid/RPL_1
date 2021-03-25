/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author hp
 */
public class QuestionPage extends javax.swing.JFrame {

    /**
     * Creates new form QuestionPage
     */
    public QuestionPage() {
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

        question_category_label = new javax.swing.JLabel();
        question_name_label = new javax.swing.JLabel();
        question_details_label1 = new javax.swing.JLabel();
        answer_count_label = new javax.swing.JLabel();
        profile_photo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answer_details_field = new javax.swing.JTextArea();
        ask_question_button = new javax.swing.JButton();
        reply_button = new javax.swing.JButton();
        answer_profile_label = new javax.swing.JTextField();
        Template = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        question_category_label.setBackground(new java.awt.Color(255, 255, 228));
        question_category_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        question_category_label.setForeground(new java.awt.Color(102, 102, 102));
        question_category_label.setText("DAA");
        question_category_label.setOpaque(true);
        getContentPane().add(question_category_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 30, 20));

        question_name_label.setBackground(new java.awt.Color(255, 255, 228));
        question_name_label.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        question_name_label.setForeground(new java.awt.Color(51, 51, 51));
        question_name_label.setText("Closest pair menggunakan algoritma divide and conquer");
        question_name_label.setOpaque(true);
        getContentPane().add(question_name_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 610, 30));

        question_details_label1.setBackground(new java.awt.Color(255, 255, 228));
        question_details_label1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        question_details_label1.setForeground(new java.awt.Color(102, 102, 102));
        question_details_label1.setText("Tolong berikan algoritma serta penjelasannya");
        question_details_label1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        question_details_label1.setOpaque(true);
        getContentPane().add(question_details_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 930, 70));

        answer_count_label.setBackground(new java.awt.Color(255, 255, 255));
        answer_count_label.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        answer_count_label.setForeground(new java.awt.Color(255, 127, 111));
        answer_count_label.setText("Answer (1)");
        answer_count_label.setOpaque(true);
        getContentPane().add(answer_count_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 130, 30));

        profile_photo.setBackground(new java.awt.Color(255, 255, 255));
        profile_photo.setText("profile_photo");
        profile_photo.setOpaque(true);
        getContentPane().add(profile_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 330, -1, 70));

        jScrollPane1.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jScrollPane1.setHorizontalScrollBar(null);

        answer_details_field.setColumns(20);
        answer_details_field.setRows(5);
        answer_details_field.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum");
        jScrollPane1.setViewportView(answer_details_field);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 850, 90));

        ask_question_button.setBackground(new java.awt.Color(216, 103, 90));
        ask_question_button.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ask_question_button.setForeground(new java.awt.Color(255, 255, 255));
        ask_question_button.setText("Ask A Question");
        ask_question_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ask_question_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(ask_question_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 320, 60));

        reply_button.setBackground(new java.awt.Color(255, 255, 255));
        reply_button.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        reply_button.setForeground(new java.awt.Color(216, 103, 90));
        reply_button.setText("Reply");
        reply_button.setMargin(new java.awt.Insets(0, 0, 0, 0));
        reply_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reply_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(reply_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 360, 90, 30));

        answer_profile_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        answer_profile_label.setForeground(new java.awt.Color(216, 103, 90));
        answer_profile_label.setText("Fauzan Muharik");
        answer_profile_label.setToolTipText("");
        answer_profile_label.setBorder(null);
        answer_profile_label.setMargin(new java.awt.Insets(0, 0, 0, 0));
        answer_profile_label.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer_profile_labelActionPerformed(evt);
            }
        });
        getContentPane().add(answer_profile_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 120, 30));

        Template.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learn/QuestionPage.png"))); // NOI18N
        getContentPane().add(Template, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1368, 528));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reply_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reply_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reply_buttonActionPerformed

    private void answer_profile_labelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer_profile_labelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer_profile_labelActionPerformed

    private void ask_question_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ask_question_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ask_question_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(QuestionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Template;
    private javax.swing.JLabel answer_count_label;
    private javax.swing.JTextArea answer_details_field;
    private javax.swing.JTextField answer_profile_label;
    private javax.swing.JButton ask_question_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel profile_photo;
    private javax.swing.JLabel question_category_label;
    private javax.swing.JLabel question_details_label1;
    private javax.swing.JLabel question_name_label;
    private javax.swing.JButton reply_button;
    // End of variables declaration//GEN-END:variables
}