/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class DetailQuestion extends javax.swing.JFrame {

    /**
     * Creates new form DetailQuestion
     */
    public DetailQuestion() {
        initComponents();
        Panel_Answer.setVisible(false);
        Label_Answered.setVisible(false);
        Panel_Menu_Profil.setVisible(false);
        
        initQuestion();
    }
    public void initQuestion(){
        String judul_pertanyaan = "ini judul";
        String content_pertanyaan = "ini content";
        String content_tanggal = "Sabtu, 24 April 2021";
        boolean isAnswered = true;
        
        Question_Title.setText(judul_pertanyaan);
        Question_Content.setText(content_pertanyaan);
        Question_Tanggal.setText(content_tanggal);
        
        if (isAnswered){
            initAnswer();
        }
    }
    public void initAnswer(){
        String tanggal_jawab = "Minggu,25 April 2021";
        String nama_tutor = "Anas Rasyid";
        String content_answer = "ini content jawaban";
        
        Label_Answered.setVisible(true);
        Panel_Answer.setVisible(true);
        Answer_Date.setText(tanggal_jawab);
        Answer_Tutor.setText(nama_tutor);
        Answer_Content.setText(content_answer);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Panel_Menu_Profil = new javax.swing.JPanel();
        B_Profil = new javax.swing.JButton();
        B_Logout = new javax.swing.JButton();
        Label_Username = new javax.swing.JLabel();
        Panel_Navbar = new javax.swing.JPanel();
        B_Pertanyaanku = new javax.swing.JButton();
        B_ProfilMenu = new javax.swing.JButton();
        B_Home = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Question_Content = new javax.swing.JTextArea();
        Question_Title = new javax.swing.JLabel();
        Label_Answered = new javax.swing.JLabel();
        B_Kategori = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Panel_Answer = new javax.swing.JPanel();
        Answer_Date = new javax.swing.JLabel();
        Answer_Tutor = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Answer_Content = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        Question_Tanggal = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 187, 218));
        jPanel1.setForeground(new java.awt.Color(224, 187, 218));
        jPanel1.setMinimumSize(new java.awt.Dimension(890, 510));
        jPanel1.setPreferredSize(new java.awt.Dimension(890, 510));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Menu_Profil.setBackground(new java.awt.Color(255, 248, 248));
        Panel_Menu_Profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_Menu_ProfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_Menu_ProfilMouseExited(evt);
            }
        });

        B_Profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil2_default.png"))); // NOI18N
        B_Profil.setPreferredSize(new java.awt.Dimension(153, 52));
        B_Profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_ProfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_ProfilMouseExited(evt);
            }
        });
        B_Profil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ProfilActionPerformed(evt);
            }
        });

        B_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Logout_default.png"))); // NOI18N
        B_Logout.setPreferredSize(new java.awt.Dimension(153, 51));
        B_Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_LogoutMouseExited(evt);
            }
        });
        B_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LogoutActionPerformed(evt);
            }
        });

        Label_Username.setFont(Label_Username.getFont().deriveFont(Label_Username.getFont().getSize()+7f));
        Label_Username.setText("Nuril K");

        javax.swing.GroupLayout Panel_Menu_ProfilLayout = new javax.swing.GroupLayout(Panel_Menu_Profil);
        Panel_Menu_Profil.setLayout(Panel_Menu_ProfilLayout);
        Panel_Menu_ProfilLayout.setHorizontalGroup(
            Panel_Menu_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Menu_ProfilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_Menu_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(B_Profil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Username))
                .addContainerGap())
        );
        Panel_Menu_ProfilLayout.setVerticalGroup(
            Panel_Menu_ProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Menu_ProfilLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(Label_Username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_Profil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(Panel_Menu_Profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        Panel_Navbar.setBackground(new java.awt.Color(224, 187, 218));
        Panel_Navbar.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
        Panel_Navbar.setPreferredSize(new java.awt.Dimension(153, 108));
        Panel_Navbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_NavbarMouseEntered(evt);
            }
        });

        B_Pertanyaanku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Pertanyaanku_default.png"))); // NOI18N
        B_Pertanyaanku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        B_Pertanyaanku.setBorderPainted(false);
        B_Pertanyaanku.setPreferredSize(new java.awt.Dimension(153, 51));
        B_Pertanyaanku.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                B_PertanyaankuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                B_PertanyaankuFocusLost(evt);
            }
        });
        B_Pertanyaanku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_PertanyaankuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_PertanyaankuMouseExited(evt);
            }
        });
        B_Pertanyaanku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PertanyaankuActionPerformed(evt);
            }
        });

        B_ProfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil_default.png"))); // NOI18N
        B_ProfilMenu.setBorder(null);
        B_ProfilMenu.setPreferredSize(new java.awt.Dimension(101, 45));
        B_ProfilMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_ProfilMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_ProfilMenuMouseExited(evt);
            }
        });
        B_ProfilMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ProfilMenuActionPerformed(evt);
            }
        });

        B_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Home_default.png"))); // NOI18N
        B_Home.setBorder(null);
        B_Home.setPreferredSize(new java.awt.Dimension(101, 77));
        B_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_HomeMouseExited(evt);
            }
        });
        B_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_HomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_NavbarLayout = new javax.swing.GroupLayout(Panel_Navbar);
        Panel_Navbar.setLayout(Panel_NavbarLayout);
        Panel_NavbarLayout.setHorizontalGroup(
            Panel_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NavbarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(B_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_Pertanyaanku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_ProfilMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        Panel_NavbarLayout.setVerticalGroup(
            Panel_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NavbarLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Panel_NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(B_ProfilMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Pertanyaanku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(Panel_Navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 248, 248));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Question_Content.setEditable(false);
        Question_Content.setColumns(20);
        Question_Content.setRows(5);
        Question_Content.setText("Content");
        Question_Content.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Question_ContentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Question_ContentFocusLost(evt);
            }
        });
        Question_Content.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Question_ContentMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(Question_Content);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 88, 550, 130));

        Question_Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Question_Title.setText("Judul Pertanyaan");
        jPanel4.add(Question_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 27, -1, -1));

        Label_Answered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/Icon_answered_blank.png"))); // NOI18N
        jPanel4.add(Label_Answered, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        B_Kategori.setBackground(new java.awt.Color(255, 255, 255));
        B_Kategori.setText("Kategori");
        B_Kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_KategoriActionPerformed(evt);
            }
        });
        jPanel4.add(B_Kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 55, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Jawaban");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 252, -1, -1));

        Panel_Answer.setBackground(new java.awt.Color(255, 255, 255));

        Answer_Date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Answer_Date.setText("Sabtu, 24 April 2020");

        Answer_Tutor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Answer_Tutor.setText("Nama Tutor menjawab");

        jScrollPane3.setBorder(null);

        Answer_Content.setEditable(false);
        Answer_Content.setColumns(20);
        Answer_Content.setRows(5);
        Answer_Content.setText("iya begini dan begitu");
        Answer_Content.setBorder(null);
        jScrollPane3.setViewportView(Answer_Content);

        javax.swing.GroupLayout Panel_AnswerLayout = new javax.swing.GroupLayout(Panel_Answer);
        Panel_Answer.setLayout(Panel_AnswerLayout);
        Panel_AnswerLayout.setHorizontalGroup(
            Panel_AnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AnswerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Panel_AnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AnswerLayout.createSequentialGroup()
                        .addComponent(Answer_Tutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_AnswerLayout.createSequentialGroup()
                        .addComponent(Answer_Date)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(194, 194, 194))
            .addGroup(Panel_AnswerLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        Panel_AnswerLayout.setVerticalGroup(
            Panel_AnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AnswerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Answer_Date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Answer_Tutor)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(Panel_Answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 540, 190));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Pertanyaan belum terjawab");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 287, -1, -1));

        Question_Tanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Question_Tanggal.setText("Sabtu, 24 April 2020");
        jPanel4.add(Question_Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_ProfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ProfilMouseEntered
        // TODO add your handling code here:
        B_ProfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil_hover.png")));
        Panel_Menu_Profil.setVisible(true);
        B_Profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil2_hover.png")));
    }//GEN-LAST:event_B_ProfilMouseEntered

    private void B_ProfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ProfilMouseExited
        // TODO add your handling code here:
        B_ProfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil_default.png")));
        B_Profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil2_default.png")));
    }//GEN-LAST:event_B_ProfilMouseExited

    private void B_ProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ProfilActionPerformed
        // TODO add your handling code here:
        controller.ProfileMember();
    }//GEN-LAST:event_B_ProfilActionPerformed

    private void B_LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_LogoutMouseEntered
        // TODO add your handling code here:
        B_ProfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil_hover.png")));
        Panel_Menu_Profil.setVisible(true);
        B_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Logout_hover.png")));
    }//GEN-LAST:event_B_LogoutMouseEntered

    private void B_LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_LogoutMouseExited
        // TODO add your handling code here:
        B_ProfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil_default.png")));
        B_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Logout_default.png")));
    }//GEN-LAST:event_B_LogoutMouseExited

    private void B_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LogoutActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.showConfirmDialog (null, "Anda yakin akan keluar?","Keluar",JOptionPane.YES_NO_OPTION);
        if(dialogButton == JOptionPane.YES_OPTION) {
            controller.Logout();}
        else {remove(dialogButton);}
    }//GEN-LAST:event_B_LogoutActionPerformed

    private void Panel_Menu_ProfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Menu_ProfilMouseEntered
        // TODO add your handling code here:
        B_ProfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil_hover.png")));
    }//GEN-LAST:event_Panel_Menu_ProfilMouseEntered

    private void Panel_Menu_ProfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Menu_ProfilMouseExited
        // TODO add your handling code here:
        B_ProfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil_default.png")));
        Panel_Menu_Profil.setVisible(false);
    }//GEN-LAST:event_Panel_Menu_ProfilMouseExited

    private void B_PertanyaankuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_B_PertanyaankuFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_B_PertanyaankuFocusGained

    private void B_PertanyaankuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_B_PertanyaankuFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_B_PertanyaankuFocusLost

    private void B_PertanyaankuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_PertanyaankuMouseEntered
        // TODO add your handling code here:
        Panel_Menu_Profil.setVisible(false);
        B_Pertanyaanku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Pertanyaanku_hover.png")));
    }//GEN-LAST:event_B_PertanyaankuMouseEntered

    private void B_PertanyaankuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_PertanyaankuMouseExited
        // TODO add your handling code here:
        B_Pertanyaanku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Pertanyaanku_default.png")));
    }//GEN-LAST:event_B_PertanyaankuMouseExited

    private void B_PertanyaankuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PertanyaankuActionPerformed
        // TODO add your handling code here:
        controller.ShowQuestionHistory();
    }//GEN-LAST:event_B_PertanyaankuActionPerformed

    private void B_ProfilMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ProfilMenuMouseEntered
        // TODO add your handling code here:
        B_ProfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil_hover.png")));
        Panel_Menu_Profil.setVisible(true);
    }//GEN-LAST:event_B_ProfilMenuMouseEntered

    private void B_ProfilMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_ProfilMenuMouseExited
        // TODO add your handling code here:
        B_ProfilMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Profil_default.png")));
    }//GEN-LAST:event_B_ProfilMenuMouseExited

    private void B_ProfilMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ProfilMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_ProfilMenuActionPerformed

    private void B_HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_HomeMouseEntered
        // TODO add your handling code here:
        B_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Home_hover.png")));
    }//GEN-LAST:event_B_HomeMouseEntered

    private void B_HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_HomeMouseExited
        // TODO add your handling code here:
        B_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Home_default.png")));
    }//GEN-LAST:event_B_HomeMouseExited

    private void B_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_HomeActionPerformed
        // TODO add your handling code here:
        controller.Home();
    }//GEN-LAST:event_B_HomeActionPerformed

    private void Panel_NavbarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_NavbarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Panel_NavbarMouseEntered

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        Panel_Menu_Profil.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void Question_ContentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Question_ContentFocusGained
        // TODO add your handling code here:
        if (Question_Content.getText().equals("Content")){
            Question_Content.setText("");
        }
    }//GEN-LAST:event_Question_ContentFocusGained

    private void Question_ContentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Question_ContentFocusLost
        // TODO add your handling code here:
        if (Question_Content.getText().equals("")){
            Question_Content.setText("Content");
        }
    }//GEN-LAST:event_Question_ContentFocusLost

    private void Question_ContentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Question_ContentMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Question_ContentMouseEntered

    private void B_KategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_KategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_KategoriActionPerformed

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
            java.util.logging.Logger.getLogger(DetailQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Answer_Content;
    private javax.swing.JLabel Answer_Date;
    private javax.swing.JLabel Answer_Tutor;
    private javax.swing.JButton B_Home;
    private javax.swing.JButton B_Kategori;
    private javax.swing.JButton B_Logout;
    private javax.swing.JButton B_Pertanyaanku;
    private javax.swing.JButton B_Profil;
    private javax.swing.JButton B_ProfilMenu;
    private javax.swing.JLabel Label_Answered;
    private javax.swing.JLabel Label_Username;
    private javax.swing.JPanel Panel_Answer;
    private javax.swing.JPanel Panel_Menu_Profil;
    private javax.swing.JPanel Panel_Navbar;
    private javax.swing.JTextArea Question_Content;
    private javax.swing.JLabel Question_Tanggal;
    private javax.swing.JLabel Question_Title;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
