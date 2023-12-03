/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.HoaDon;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;

/**
 *
 * @author Thuylq
 */
public class HoaDonDAO {
    private List<HoaDon> list;

    public List<HoaDon> getAll() throws SQLException {
        list = new ArrayList<>();
        Connection conn = ConnnectToSQLServer.getConnection();
        String sql = "select * from HoaDon ";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {            
            int id = rs.getInt("ID");
            int nhanVienID = rs.getInt("NhanVienID");
            int khachHangID  = rs.getInt("KhachHangID");
            int KhuyenMaiID = rs.getInt("KhuyenMaiID");
            int TongTienHang = rs.getInt("TongTienHang");
            int TongTienDuocGiam = rs.getInt("TongTienDuocGiam");
            int TongTienPhaiTra = rs.getInt("TongTienPhaiTra");
            int Trangthai = rs.getInt("Trangthai");
            int TrangThaiXoa = rs.getInt("TrangThaiXoa");
            
            
            HoaDon hoadon = new HoaDon(id, nhanVienID, khachHangID, KhuyenMaiID, TongTienHang, TongTienDuocGiam, TongTienPhaiTra, Trangthai, TrangThaiXoa);
            list.add(hoadon);
        }
        rs.close();
        st.close();
        conn.close();
        return list;
    }

    public String addData(int nhanVienID, int khachHangID, int khuyenMaiID, int tongTienHang, int tongTienDuocGiam, int tongTienPhaiTra, int trangthai) throws SQLException {
        Connection conn = ConnnectToSQLServer.getConnection();
        String sql ="INSERT INTO [dbo].[HoaDon]\n" +
                    "           ([NhanVienId]\n" +
                    "           ,[KhachHangId]\n" +
                    "           ,[KhuyenMaiID]\n" +
                    "           ,[TongTienHang]\n" +
                    "           ,[TongTienDuocGiam]\n" +
                    "           ,[TongTienPhaiTra]\n" +
                    "           ,[Trangthai]\n" +
                    "           ,[TrangThaiXoa])\n" +
                    "     VALUES\n" +
                    "           (?, ?, ?, ?, ?, ?, ?, 0)";
        PreparedStatement preSt = conn.prepareStatement(sql);
        preSt.setInt(1, nhanVienID);
        preSt.setInt(2, khachHangID);
        preSt.setInt(3, khuyenMaiID);
        preSt.setInt(4, tongTienHang);
        preSt.setInt(5, tongTienDuocGiam);
        preSt.setInt(6, tongTienPhaiTra);
        preSt.setInt(7, trangthai);

        int rs = preSt.executeUpdate();

        preSt.close();
        conn.close();

        if (rs > 0) {
            return "Thêm thành công!";
        }
        return null;
    }

    public String updateData(int nhanVienID, int khachHangID, int khuyenMaiID, int tongTienHang, int tongTienDuocGiam, int tongTienPhaiTra, int trangthai, int id) throws SQLException {
        Connection conn = ConnnectToSQLServer.getConnection();
        String sql = "UPDATE [dbo].[HoaDon]\n"
                    + "   SET [NhanVienId] = ?\n"
                    + "      ,[KhachHangId] = ?\n"
                    + "      ,[KhuyenMaiID] = ?\n"
                    + "      ,[TongTienHang] = ?\n"
                    + "      ,[TongTienDuocGiam] = ?\n"
                    + "      ,[TongTienPhaiTra] = ?\n"
                    + "      ,[Trangthai] = ?\n"
                    + "      ,[TrangThaiXoa] = 0\n"
                    + " WHERE ID = ?";
        PreparedStatement preSt = conn.prepareStatement(sql);
        preSt.setInt(1, nhanVienID);
        preSt.setInt(2, khachHangID);
        preSt.setInt(3, khuyenMaiID);
        preSt.setInt(4, tongTienHang);
        preSt.setInt(5, tongTienDuocGiam);
        preSt.setInt(6, tongTienPhaiTra);
        preSt.setInt(7, trangthai);
        preSt.setInt(8, id);
        
        int rs = preSt.executeUpdate();

        preSt.close();
        conn.close();

        if (rs > 0) {
            return "Thanh toán thành công!";
        }
        return null;
    }
    public String removeData(int id) throws SQLException {
        Connection conn = ConnnectToSQLServer.getConnection();
        String sql = "UPDATE hoadon SET TRANGTHAIXOA = 1 WHERE ID = ?";
        PreparedStatement preSt = conn.prepareCall(sql);
        preSt.setInt(1, id);
        int rs = preSt.executeUpdate();
        return "Xóa thành công!";
    }
     public List<HoaDon> searchDataByTranghai(int trangthai) throws SQLException{
        Connection conn = ConnnectToSQLServer.getConnection();
        String sql = "select * from hoadon where trangthai = ?";
        PreparedStatement preSt = conn.prepareCall(sql);
        preSt.setInt(1, trangthai);
        ResultSet rs = preSt.executeQuery();
        
        while (rs.next()) {            
             int id = rs.getInt("ID");
            int nhanVienID = rs.getInt("NhanVienID");
            int khachHangID  = rs.getInt("KhachHangID");
            int KhuyenMaiID = rs.getInt("KhuyenMaiID");
            int TongTienHang = rs.getInt("TongTienHang");
            int TongTienDuocGiam = rs.getInt("TongTienDuocGiam");
            int TongTienPhaiTra = rs.getInt("TongTienPhaiTra");
            int Trangthai = rs.getInt("Trangthai");
             int TrangThaiXoa = rs.getInt("TrangThaiXoa");
            HoaDon hoaDon = new HoaDon(id, nhanVienID, khachHangID, KhuyenMaiID, TongTienHang, TongTienDuocGiam, TongTienPhaiTra, Trangthai, TrangThaiXoa);
            list.add(hoaDon);
        }
        rs.close();
        preSt.close();
        conn.close();
        return list;
        
    }
}
