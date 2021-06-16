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
public class LandpageTutor extends javax.swing.JFrame {

    /**
     * Creates new form DetailQuestion
     */
    public LandpageTutor() {
        initComponents();
        Panel_Menu_Profil.setVisible(false);
        
        String nama = "nuril";
        Label_Username.setText(nama);
        WithdrawalPopUp.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Panel_Menu_Profil = new javax.swing.JPanel();
        B_Profil = new javax.swing.JButton();
        B_Logout = new javax.swing.JButton();
        Label_Username = new javax.swing.JLabel();
        Panel_Navbar = new javax.swing.JPanel();
        B_Pembayaran = new javax.swing.JButton();
        B_ProfilMenu = new javax.swing.JButton();
        B_Home = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1_NamaTutor = new javax.swing.JTextField();
        jButton1_User = new javax.swing.JButton();
        jTextField2_Saldo = new javax.swing.JTextField();
        B_Tarik = new javax.swing.JButton();
        Panel_Kategori = new javax.swing.JPanel();
        B_Kategori_1 = new javax.swing.JButton();
        B_Kategori_2 = new javax.swing.JButton();
        B_Kategori_3 = new javax.swing.JButton();
        B_Kategori_4 = new javax.swing.JButton();
        B_Kategori_5 = new javax.swing.JButton();
        B_Kategori_6 = new javax.swing.JButton();
        B_Kategori_7 = new javax.swing.JButton();
        B_Kategori_8 = new javax.swing.JButton();
        TF_Search = new javax.swing.JTextField();
        B_Search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 187, 218));
        jPanel1.setForeground(new java.awt.Color(224, 187, 218));
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

        B_Pembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Pembayaran_default.png"))); // NOI18N
        B_Pembayaran.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        B_Pembayaran.setBorderPainted(false);
        B_Pembayaran.setPreferredSize(new java.awt.Dimension(153, 51));
        B_Pembayaran.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                B_PembayaranFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                B_PembayaranFocusLost(evt);
            }
        });
        B_Pembayaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_PembayaranMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_PembayaranMouseExited(evt);
            }
        });
        B_Pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PembayaranActionPerformed(evt);
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
                .addComponent(B_Pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(B_Pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(Panel_Navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        jPanel2.setBackground(new java.awt.Color(224, 187, 218));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1_NamaTutor.setBackground(new java.awt.Color(224, 187, 218));
        jTextField1_NamaTutor.setText("Nama Tutor");
        jPanel2.add(jTextField1_NamaTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 120, 30));
        jPanel2.add(jButton1_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 80, 50));

        jTextField2_Saldo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2_Saldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2_Saldo.setText("523000");
        jTextField2_Saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_SaldoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2_Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 200, 40));

        B_Tarik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Tarik_default.png"))); // NOI18N
        B_Tarik.setPreferredSize(new java.awt.Dimension(116, 33));
        B_Tarik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_TarikMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_TarikMouseExited(evt);
            }
        });
        B_Tarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_TarikActionPerformed(evt);
            }
        });
        jPanel2.add(B_Tarik, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        Panel_Kategori.setBackground(new java.awt.Color(224, 187, 218));
        Panel_Kategori.setLayout(new java.awt.GridBagLayout());

        B_Kategori_1.setBackground(new java.awt.Color(255, 255, 255));
        B_Kategori_1.setFont(B_Kategori_1.getFont().deriveFont(B_Kategori_1.getFont().getStyle() & ~java.awt.Font.BOLD, B_Kategori_1.getFont().getSize()+7));
        B_Kategori_1.setText("Kalkulus");
        B_Kategori_1.setPreferredSize(new java.awt.Dimension(180, 150));
        B_Kategori_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Kategori_1ActionPerformed(evt);
            }
        });
        Panel_Kategori.add(B_Kategori_1, new java.awt.GridBagConstraints());

        B_Kategori_2.setBackground(new java.awt.Color(255, 255, 255));
        B_Kategori_2.setFont(B_Kategori_2.getFont().deriveFont(B_Kategori_2.getFont().getStyle() & ~java.awt.Font.BOLD, B_Kategori_2.getFont().getSize()+7));
        B_Kategori_2.setText("Struktur Data");
        B_Kategori_2.setPreferredSize(new java.awt.Dimension(180, 150));
        B_Kategori_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Kategori_2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        Panel_Kategori.add(B_Kategori_2, gridBagConstraints);

        B_Kategori_3.setBackground(new java.awt.Color(255, 255, 255));
        B_Kategori_3.setFont(B_Kategori_3.getFont().deriveFont(B_Kategori_3.getFont().getStyle() & ~java.awt.Font.BOLD, B_Kategori_3.getFont().getSize()+7));
        B_Kategori_3.setText("DAP");
        B_Kategori_3.setPreferredSize(new java.awt.Dimension(180, 150));
        B_Kategori_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Kategori_3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        Panel_Kategori.add(B_Kategori_3, gridBagConstraints);

        B_Kategori_4.setBackground(new java.awt.Color(255, 255, 255));
        B_Kategori_4.setFont(B_Kategori_4.getFont().deriveFont(B_Kategori_4.getFont().getStyle() & ~java.awt.Font.BOLD, B_Kategori_4.getFont().getSize()+7));
        B_Kategori_4.setText("Bahasa Inggris");
        B_Kategori_4.setPreferredSize(new java.awt.Dimension(180, 150));
        B_Kategori_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Kategori_4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        Panel_Kategori.add(B_Kategori_4, gridBagConstraints);

        B_Kategori_5.setBackground(new java.awt.Color(255, 255, 255));
        B_Kategori_5.setFont(B_Kategori_5.getFont().deriveFont(B_Kategori_5.getFont().getStyle() & ~java.awt.Font.BOLD, B_Kategori_5.getFont().getSize()+7));
        B_Kategori_5.setText("PBD");
        B_Kategori_5.setPreferredSize(new java.awt.Dimension(180, 150));
        B_Kategori_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Kategori_5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        Panel_Kategori.add(B_Kategori_5, gridBagConstraints);

        B_Kategori_6.setBackground(new java.awt.Color(255, 255, 255));
        B_Kategori_6.setFont(B_Kategori_6.getFont().deriveFont(B_Kategori_6.getFont().getStyle() & ~java.awt.Font.BOLD, B_Kategori_6.getFont().getSize()+7));
        B_Kategori_6.setText("PBO");
        B_Kategori_6.setPreferredSize(new java.awt.Dimension(180, 150));
        B_Kategori_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Kategori_6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        Panel_Kategori.add(B_Kategori_6, gridBagConstraints);

        B_Kategori_7.setBackground(new java.awt.Color(255, 255, 255));
        B_Kategori_7.setFont(B_Kategori_7.getFont().deriveFont(B_Kategori_7.getFont().getStyle() & ~java.awt.Font.BOLD, B_Kategori_7.getFont().getSize()+7));
        B_Kategori_7.setText("TBA");
        B_Kategori_7.setPreferredSize(new java.awt.Dimension(180, 150));
        B_Kategori_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Kategori_7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        Panel_Kategori.add(B_Kategori_7, gridBagConstraints);

        B_Kategori_8.setBackground(new java.awt.Color(255, 255, 255));
        B_Kategori_8.setFont(B_Kategori_8.getFont().deriveFont(B_Kategori_8.getFont().getStyle() & ~java.awt.Font.BOLD, B_Kategori_8.getFont().getSize()+7));
        B_Kategori_8.setText("COA");
        B_Kategori_8.setPreferredSize(new java.awt.Dimension(180, 150));
        B_Kategori_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Kategori_8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        Panel_Kategori.add(B_Kategori_8, gridBagConstraints);

        jPanel2.add(Panel_Kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 750, 310));

        TF_Search.setBorder(null);
        jPanel2.add(TF_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 370, 40));

        B_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Search_default.png"))); // NOI18N
        B_Search.setBorder(null);
        B_Search.setMaximumSize(new java.awt.Dimension(67, 37));
        B_Search.setPreferredSize(new java.awt.Dimension(70, 34));
        B_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_SearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B_SearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B_SearchMouseExited(evt);
            }
        });
        B_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SearchActionPerformed(evt);
            }
        });
        jPanel2.add(B_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 67, 34));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pertanyaan yang belum terjawab");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 630));

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
        controller.ProfileTutor();
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

    private void B_PembayaranFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_B_PembayaranFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_B_PembayaranFocusGained

    private void B_PembayaranFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_B_PembayaranFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_B_PembayaranFocusLost

    private void B_PembayaranMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_PembayaranMouseEntered
        // TODO add your handling code here:
        Panel_Menu_Profil.setVisible(false);
        B_Pembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Pembayaran_hover.png")));
    }//GEN-LAST:event_B_PembayaranMouseEntered

    private void B_PembayaranMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_PembayaranMouseExited
        // TODO add your handling code here:
        B_Pembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Pembayaran_default.png")));
    }//GEN-LAST:event_B_PembayaranMouseExited

    private void B_PembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PembayaranActionPerformed
        // TODO add your handling code here:
        controller.WithdrawalHistory();
    }//GEN-LAST:event_B_PembayaranActionPerformed

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

    private void B_TarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_TarikActionPerformed
        // TODO add your handling code here:
        WithdrawalPopUp.setVisible(true);
    }//GEN-LAST:event_B_TarikActionPerformed

    private void B_Kategori_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Kategori_1ActionPerformed
        // TODO add your handling code here:
        controller.SearchByCategory(B_Kategori_1.getText());
    }//GEN-LAST:event_B_Kategori_1ActionPerformed

    private void B_Kategori_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Kategori_2ActionPerformed
        // TODO add your handling code here:
        controller.SearchByCategory(B_Kategori_2.getText());
    }//GEN-LAST:event_B_Kategori_2ActionPerformed

    private void B_Kategori_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Kategori_3ActionPerformed
        // TODO add your handling code here:
        controller.SearchByCategory(B_Kategori_3.getText());
    }//GEN-LAST:event_B_Kategori_3ActionPerformed

    private void B_Kategori_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Kategori_4ActionPerformed
        // TODO add your handling code here:
        controller.SearchByCategory(B_Kategori_4.getText());
    }//GEN-LAST:event_B_Kategori_4ActionPerformed

    private void B_Kategori_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Kategori_5ActionPerformed
        // TODO add your handling code here:
        controller.SearchByCategory(B_Kategori_5.getText());
    }//GEN-LAST:event_B_Kategori_5ActionPerformed

    private void B_Kategori_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Kategori_6ActionPerformed
        // TODO add your handling code here:
        controller.SearchByCategory(B_Kategori_6.getText());
    }//GEN-LAST:event_B_Kategori_6ActionPerformed

    private void B_Kategori_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Kategori_7ActionPerformed
        // TODO add your handling code here:
        controller.SearchByCategory(B_Kategori_7.getText());
    }//GEN-LAST:event_B_Kategori_7ActionPerformed

    private void B_Kategori_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Kategori_8ActionPerformed
        // TODO add your handling code here:
        controller.SearchByCategory(B_Kategori_8.getText());
    }//GEN-LAST:event_B_Kategori_8ActionPerformed

    private void B_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SearchMouseClicked
        // TODO add your handling code here:
        //        B_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Search_clicked.png")));
    }//GEN-LAST:event_B_SearchMouseClicked

    private void B_SearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SearchMouseEntered
        // TODO add your handling code here:
        B_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Search_hover.png")));
    }//GEN-LAST:event_B_SearchMouseEntered

    private void B_SearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_SearchMouseExited
        // TODO add your handling code here:
        B_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Search_default.png")));
    }//GEN-LAST:event_B_SearchMouseExited

    private void B_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SearchActionPerformed
        // TODO add your handling code here:
        controller.SearchByWord(TF_Search.getText());
    }//GEN-LAST:event_B_SearchActionPerformed

    private void jTextField2_SaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_SaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_SaldoActionPerformed

    private void B_TarikMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_TarikMouseEntered
        // TODO add your handling code here:
        B_Tarik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Tarik_hover.png")));
    }//GEN-LAST:event_B_TarikMouseEntered

    private void B_TarikMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_TarikMouseExited
        // TODO add your handling code here:
        B_Tarik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icon/B_Tarik_default.png")));
    }//GEN-LAST:event_B_TarikMouseExited

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
            java.util.logging.Logger.getLogger(LandpageTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LandpageTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LandpageTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LandpageTutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandpageTutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Home;
    private javax.swing.JButton B_Kategori_1;
    private javax.swing.JButton B_Kategori_2;
    private javax.swing.JButton B_Kategori_3;
    private javax.swing.JButton B_Kategori_4;
    private javax.swing.JButton B_Kategori_5;
    private javax.swing.JButton B_Kategori_6;
    private javax.swing.JButton B_Kategori_7;
    private javax.swing.JButton B_Kategori_8;
    private javax.swing.JButton B_Logout;
    private javax.swing.JButton B_Pembayaran;
    private javax.swing.JButton B_Profil;
    private javax.swing.JButton B_ProfilMenu;
    private javax.swing.JButton B_Search;
    private javax.swing.JButton B_Tarik;
    private javax.swing.JLabel Label_Username;
    private javax.swing.JPanel Panel_Kategori;
    private javax.swing.JPanel Panel_Menu_Profil;
    private javax.swing.JPanel Panel_Navbar;
    private javax.swing.JTextField TF_Search;
    private javax.swing.JButton jButton1_User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1_NamaTutor;
    private javax.swing.JTextField jTextField2_Saldo;
    // End of variables declaration//GEN-END:variables
}
