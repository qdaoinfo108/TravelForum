/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.City;
import model.History;

/**
 *
 * @author Admin
 */
public class HistoryDAO {
    
    public static ArrayList<History> getListHistory(String email) {
        Connection connection = ConnectDB.getConnection();
        String sql = "Select * from history where account_username='"+email+"'";
        ArrayList<History> arr = new ArrayList<History>();
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                History h = new History();
                h.setHistory_id(rs.getInt("history_id"));
                h.setAccount_username(rs.getString("account_username"));
                h.setDate(rs.getTimestamp("history_date"));
                h.setMoney(rs.getDouble("history_money"));
                h.setViewTotal(rs.getInt("history_viewtotal"));
                
                arr.add(h);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return arr;
    }
    
    public static boolean themHistory(History history) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "INSERT INTO history VALUES(?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, history.getAccount_username());
            ps.setInt(2, history.getViewTotal());
            ps.setDouble(3, history.getMoney());
            ps.setTimestamp(4, history.getDate());
            boolean kq = ps.execute();
            conn.close();
            return kq;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
