/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.NhanVienDAO;
import Utils.DongHo;
import Utils.Session;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zudd4
 */
public class TrangChuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    private String loggedInUser = Session.getInstance().getLoggedInUsername();
    NhanVienDAO nhanVienDAO = new NhanVienDAO();
    
    public TrangChuJFrame() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        btnDoiMatKhau.setVisible(false);
        btnDangXuat.setVisible(false);
        txtXinChao.setText("Xin chào: " + nhanVienDAO.searchHoVaTen(loggedInUser));
        int chucVu = Integer.parseInt(nhanVienDAO.searchChucVu(loggedInUser));
        txtChucVu.setText("Chức vụ: " + getChucVu(chucVu));
        dongHo();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        btnTaiKhoan = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        txtXinChao = new javax.swing.JLabel();
        txtChucVu = new javax.swing.JLabel();
        txtDongHo = new javax.swing.JLabel();
        txtTile = new javax.swing.JLabel();
        txtLogo = new javax.swing.JLabel();
        btnBanHang = new javax.swing.JButton();
        btnQuanLySanPham = new javax.swing.JButton();
        btnQuanLyKhachHang = new javax.swing.JButton();
        btnQuanLyHoaDon = new javax.swing.JButton();
        btnQuanLyNhanVien = new javax.swing.JButton();
        btnQuanLyVoucher = new javax.swing.JButton();
        btnTrangChu = new javax.swing.JButton();
        btnQuanLyThuocTinh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(166, 227, 233));
        Background.setForeground(new java.awt.Color(253, 247, 228));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTaiKhoan.setBackground(new java.awt.Color(203, 241, 245));
        btnTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Gear.png"))); // NOI18N
        btnTaiKhoan.setText("TÀI KHOẢN");
        btnTaiKhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnTaiKhoan.setBorderPainted(false);
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });
        Background.add(btnTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 594, 284, 78));

        btnDoiMatKhau.setBackground(new java.awt.Color(203, 241, 245));
        btnDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Key.png"))); // NOI18N
        btnDoiMatKhau.setText("ĐỔI MẬT KHẨU");
        btnDoiMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnDoiMatKhau.setBorderPainted(false);
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });
        Background.add(btnDoiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 678, 284, -1));

        btnDangXuat.setBackground(new java.awt.Color(203, 241, 245));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Exit.png"))); // NOI18N
        btnDangXuat.setText("ĐĂNG XUẤT");
        btnDangXuat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnDangXuat.setBorderPainted(false);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        Background.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 715, 284, -1));

        txtXinChao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtXinChao.setText("Xin chào,");
        Background.add(txtXinChao, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 752, -1, -1));

        txtChucVu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtChucVu.setText("Chức vụ: ");
        Background.add(txtChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 774, -1, -1));

        txtDongHo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDongHo.setForeground(new java.awt.Color(255, 0, 0));
        txtDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Alarm.png"))); // NOI18N
        txtDongHo.setText("09:11:2001");
        Background.add(txtDongHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 750, -1, -1));

        txtTile.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        txtTile.setText("HỆ THỐNG QUẢN LÝ BẢN ÁO");
        Background.add(txtTile, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, -1, -1));

        txtLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo2Clothes.png"))); // NOI18N
        Background.add(txtLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 491, 91));

        btnBanHang.setBackground(new java.awt.Color(203, 241, 245));
        btnBanHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBanHang.setText("BÁN HÀNG");
        btnBanHang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnBanHang.setBorderPainted(false);
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });
        Background.add(btnBanHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 284, 78));

        btnQuanLySanPham.setBackground(new java.awt.Color(203, 241, 245));
        btnQuanLySanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuanLySanPham.setText("QUẢN LÝ SẢN PHẨM");
        btnQuanLySanPham.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnQuanLySanPham.setBorderPainted(false);
        btnQuanLySanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLySanPhamActionPerformed(evt);
            }
        });
        Background.add(btnQuanLySanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 90, 284, 78));

        btnQuanLyKhachHang.setBackground(new java.awt.Color(203, 241, 245));
        btnQuanLyKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuanLyKhachHang.setText("QUẢN LÝ KHÁCH HÀNG");
        btnQuanLyKhachHang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnQuanLyKhachHang.setBorderPainted(false);
        btnQuanLyKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyKhachHangActionPerformed(evt);
            }
        });
        Background.add(btnQuanLyKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 174, 284, 78));

        btnQuanLyHoaDon.setBackground(new java.awt.Color(203, 241, 245));
        btnQuanLyHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuanLyHoaDon.setText("QUẢN LÝ HÓA ĐƠN");
        btnQuanLyHoaDon.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnQuanLyHoaDon.setBorderPainted(false);
        btnQuanLyHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyHoaDonActionPerformed(evt);
            }
        });
        Background.add(btnQuanLyHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 258, 284, 78));

        btnQuanLyNhanVien.setBackground(new java.awt.Color(203, 241, 245));
        btnQuanLyNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuanLyNhanVien.setText("QUẢN LÝ NHÂN VIÊN");
        btnQuanLyNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnQuanLyNhanVien.setBorderPainted(false);
        btnQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNhanVienActionPerformed(evt);
            }
        });
        Background.add(btnQuanLyNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 342, 284, 78));

        btnQuanLyVoucher.setBackground(new java.awt.Color(203, 241, 245));
        btnQuanLyVoucher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuanLyVoucher.setText("QUẢN LÝ VOUCHER");
        btnQuanLyVoucher.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnQuanLyVoucher.setBorderPainted(false);
        btnQuanLyVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyVoucherActionPerformed(evt);
            }
        });
        Background.add(btnQuanLyVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 426, 284, 78));

        btnTrangChu.setBackground(new java.awt.Color(203, 241, 245));
        btnTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTrangChu.setText("Trang chủ");
        btnTrangChu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnTrangChu.setBorderPainted(false);
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });
        Background.add(btnTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 10, 83, 28));

        btnQuanLyThuocTinh.setBackground(new java.awt.Color(203, 241, 245));
        btnQuanLyThuocTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQuanLyThuocTinh.setText("QUẢN LÝ THUỘC TÍNH");
        btnQuanLyThuocTinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, -1, -1, new java.awt.Color(0, 0, 0)));
        btnQuanLyThuocTinh.setBorderPainted(false);
        btnQuanLyThuocTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyThuocTinhActionPerformed(evt);
            }
        });
        Background.add(btnQuanLyThuocTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 510, 284, 78));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        // TODO add your handling code here:
        if (!btnDoiMatKhau.isVisible() && !btnDangXuat.isVisible()) {
            btnDoiMatKhau.setVisible(true);
            btnDangXuat.setVisible(true);
        } else {
            btnDoiMatKhau.setVisible(false);
            btnDangXuat.setVisible(false);
        }
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        // TODO add your handling code here:
        DoiMatKhauJFrame doiMatKhauJFrame = null;
        try {
            doiMatKhauJFrame = new DoiMatKhauJFrame();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        doiMatKhauJFrame.setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        DangNhapJFrame dangNhapJFrame = null;
        try {
            dangNhapJFrame = new DangNhapJFrame();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        dangNhapJFrame.setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        // TODO add your handling code here:
        BanHangJFrame banHangJFrame = null;
        banHangJFrame = new BanHangJFrame();
        this.setVisible(false);
        banHangJFrame.setVisible(true);
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void btnQuanLySanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLySanPhamActionPerformed
        // TODO add your handling code here:
        QuanLySanPham quanLySanPham = null;
        try {
            quanLySanPham = new QuanLySanPham();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        quanLySanPham.setVisible(true);
    }//GEN-LAST:event_btnQuanLySanPhamActionPerformed

    private void btnQuanLyKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyKhachHangActionPerformed
        // TODO add your handling code here:
        QuanLyKhachHang quanLyKhachHang = null;
        quanLyKhachHang = new QuanLyKhachHang();
        this.setVisible(false);
        quanLyKhachHang.setVisible(true);
    }//GEN-LAST:event_btnQuanLyKhachHangActionPerformed

    private void btnQuanLyHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyHoaDonActionPerformed
        // TODO add your handling code here:
        QuanLiHoaDon quanLiHoaDon = null;
        try {
            quanLiHoaDon = new QuanLiHoaDon();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        quanLiHoaDon.setVisible(true);
    }//GEN-LAST:event_btnQuanLyHoaDonActionPerformed

    private void btnQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNhanVienActionPerformed
        // TODO add your handling code here:
        QuanLiNhanVien quanLiNhanVien = null;
        try {
            quanLiNhanVien = new QuanLiNhanVien();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        quanLiNhanVien.setVisible(true);
    }//GEN-LAST:event_btnQuanLyNhanVienActionPerformed

    private void btnQuanLyVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyVoucherActionPerformed
        // TODO add your handling code here:
        QuanLiVoucher quanLiVoucher = null;
        quanLiVoucher = new QuanLiVoucher();
        this.setVisible(false);
        quanLiVoucher.setVisible(true);
    }//GEN-LAST:event_btnQuanLyVoucherActionPerformed

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TrangChuJFrame trangChuJFrame = null;
        try {
            trangChuJFrame = new TrangChuJFrame();
        } catch (SQLException ex) {
            Logger.getLogger(DoiMatKhauJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        trangChuJFrame.setVisible(true);
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnQuanLyThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyThuocTinhActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        QuanLiThuocTinh quanLiThuocTinh = null;
        try {
            quanLiThuocTinh = new QuanLiThuocTinh();
        } catch (SQLException ex) {
            Logger.getLogger(DoiMatKhauJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        quanLiThuocTinh.setVisible(true);
    }//GEN-LAST:event_btnQuanLyThuocTinhActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TrangChuJFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TrangChuJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private String getChucVu(int chucVu) {
        if(chucVu == 0) {
            return "Quản lý";
        } else {
            return "Nhân viên";
        }
    }
    
    private void dongHo() {
        DongHo dongHo = new DongHo(txtDongHo);
        dongHo.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnQuanLyHoaDon;
    private javax.swing.JButton btnQuanLyKhachHang;
    private javax.swing.JButton btnQuanLyNhanVien;
    private javax.swing.JButton btnQuanLySanPham;
    private javax.swing.JButton btnQuanLyThuocTinh;
    private javax.swing.JButton btnQuanLyVoucher;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JLabel txtChucVu;
    private javax.swing.JLabel txtDongHo;
    private javax.swing.JLabel txtLogo;
    private javax.swing.JLabel txtTile;
    private javax.swing.JLabel txtXinChao;
    // End of variables declaration//GEN-END:variables
}
