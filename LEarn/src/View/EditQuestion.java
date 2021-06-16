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
 * @author nabillaaura
 */
public class EditQuestion extends javax.swing.JFrame {

    
    /**
     * Creates new form PostQuestions
     */
    public EditQuestion() {
        initComponents();
        Panel_Menu_Profil.setVisible(false);
        String name = "nuril";
        Label_Username.setText(name);
        
        // SET TEXT
        CB_KategoriPertanyaan.setSelectedIndex(1);
        TF_JudulPertanyaan.setText("Ini judul");
        TA_ContentPertanyaan.setText("Ini content");
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
        CB_KategoriPertanyaan = new javax.swing.JComboBox();
        TF_JudulPertanyaan = new javax.swing.JTextField();
        B_Update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_ContentPertanyaan = new javax.swing.JTextArea();
        Panel_Menu_Profil = new javax.swing.JPanel();
        B_Profil = new javax.swing.JButton();
        B_Logout = new javax.swing.JButton();
        Label_Username = new javax.swing.JLabel();
        Panel_Navbar = new javax.swing.JPanel();
        B_Pertanyaanku = new javax.swing.JButton();
        B_ProfilMenu = new javax.swing.JButton();
        B_Home = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(224, 187, 218));
        setMinimumSize(new java.awt.Dimension(890, 510));
        setSize(new java.awt.Dimension(890, 510));

        jPanel1.setBackground(new java.awt.Color(224, 187, 218));
        jPanel1.setForeground(new java.awt.Color(224, 187, 218));

        CB_KategoriPertanyaan.setBackground(new java.awt.Color(255, 248, 248));
        CB_KategoriPertanyaan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kategori Pertanyaan", "Bahasa Inggris", "COA", "DAP", "Kalkulus", "PBD", "PBO", "Struktur Data", "TBA" }));

        TF_JudulPertanyaan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TF_JudulPertanyaan.setText("Judul");
        TF_JudulPertanyaan.setOpaque(false);
        TF_JudulPertanyaan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TF_JudulPertanyaanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_JudulPertanyaanFocusLost(evt);
            }
        });

        B_Update.setBackground(new java.awt.Color(29, 4, 54));
        B_Update.setForeground(new java.awt.Color(29, 4, 54));
        B_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Update_default.png"))); // NOI18N
        B_Update.setBorder(null);
        B_Update.setBorderPainted(false);
        B_Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_UpdateMouseExited(evt);
            }
        });
        B_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_UpdateActionPerformed(evt);
            }
        });

        TA_ContentPertanyaan.setColumns(20);
        TA_ContentPertanyaan.setRows(5);
        TA_ContentPertanyaan.setText("Content");
        TA_ContentPertanyaan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TA_ContentPertanyaanFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TA_ContentPertanyaanFocusLost(evt);
            }
        });
        TA_ContentPertanyaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TA_ContentPertanyaanMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(TA_ContentPertanyaan);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 457, Short.MAX_VALUE)
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Ubah Pertanyaan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_KategoriPertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_JudulPertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(203, 203, 203)))
                .addComponent(Panel_Menu_Profil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Panel_Navbar, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(710, 710, 710)
                .addComponent(B_Update))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Panel_Menu_Profil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Panel_Navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(CB_KategoriPertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(TF_JudulPertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(B_Update)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

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

    private void B_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_UpdateActionPerformed

    private void TA_ContentPertanyaanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TA_ContentPertanyaanMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TA_ContentPertanyaanMouseEntered

    private void TA_ContentPertanyaanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TA_ContentPertanyaanFocusGained
        // TODO add your handling code here:
        if (TA_ContentPertanyaan.getText().equals("Content")){
            TA_ContentPertanyaan.setText("");
        }
    }//GEN-LAST:event_TA_ContentPertanyaanFocusGained

    private void TA_ContentPertanyaanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TA_ContentPertanyaanFocusLost
        // TODO add your handling code here:
        if (TA_ContentPertanyaan.getText().equals("")){
            TA_ContentPertanyaan.setText("Content");
        }
    }//GEN-LAST:event_TA_ContentPertanyaanFocusLost

    private void TF_JudulPertanyaanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_JudulPertanyaanFocusGained
        // TODO add your handling code here:
        if (TF_JudulPertanyaan.getText().equals("Judul")){
            TF_JudulPertanyaan.setText("");
        }
    }//GEN-LAST:event_TF_JudulPertanyaanFocusGained

    private void TF_JudulPertanyaanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_JudulPertanyaanFocusLost
        // TODO add your handling code here:
        if (TF_JudulPertanyaan.getText().equals("")){
            TF_JudulPertanyaan.setText("Judul");
        }
    }//GEN-LAST:event_TF_JudulPertanyaanFocusLost

    private void B_UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_UpdateMouseEntered
        // TODO add your handling code here:
        B_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Update_hover.png")));
    }//GEN-LAST:event_B_UpdateMouseEntered

    private void B_UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_UpdateMouseExited
        // TODO add your handling code here:
        B_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Update_default.png")));

    }//GEN-LAST:event_B_UpdateMouseExited

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
            java.util.logging.Logger.getLogger(EditQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Home;
    private javax.swing.JButton B_Logout;
    private javax.swing.JButton B_Pertanyaanku;
    private javax.swing.JButton B_Profil;
    private javax.swing.JButton B_ProfilMenu;
    private javax.swing.JButton B_Update;
    private javax.swing.JComboBox CB_KategoriPertanyaan;
    private javax.swing.JLabel Label_Username;
    private javax.swing.JPanel Panel_Menu_Profil;
    private javax.swing.JPanel Panel_Navbar;
    private javax.swing.JTextArea TA_ContentPertanyaan;
    private javax.swing.JTextField TF_JudulPertanyaan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}