/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.MauSac;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author zudd4
 */
public class MauSacDAO {

    private List<MauSac> list;

    public List<MauSac> getAll() throws SQLException {
        list = new ArrayList<>();
        Connection conn = ConnnectToSQLServer.getConnection();
        String sql = "SELECT [ID]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[MauSac]";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("ID");
            String ten = rs.getString("Ten");

            MauSac mauSac = new MauSac(id, ten);
            list.add(mauSac);
        }
        rs.close();
        st.close();
        conn.close();
        return list;
    }

    public String addData(String ten) throws SQLException {
        Connection conn = ConnnectToSQLServer.getConnection();
        String sql = "INSERT INTO MauSac(Ten)\n"
                + "OUTPUT inserted.ID\n"
                + "VALUES(?);";
        PreparedStatement preSt = conn.prepareCall(sql);
        preSt.setString(1, ten);

        int rs = preSt.executeUpdate();
        preSt.close();
        conn.close();
        return "Thêm thành công!";
    }
     public String updateData(int id, String ten) throws SQLException{
         Connection conn = ConnnectToSQLServer.getConnection();
        String sql = "update MauSac set Ten = ? where ID = ?";
        PreparedStatement preSt = conn.prepareCall(sql);
        preSt.setString(1, ten);
        preSt.setInt(2, id);
        
        


        // Execute the update query
        int rowsUpdated = preSt.executeUpdate();

        preSt.close();
        conn.close();

        if (rowsUpdated > 0) {
            return "Sửa thành công!";
        } else {
            return "Không có sản phẩm nào được sửa!";
        }
    }
}
