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
import java.sql.Statement;
import model.Like;

/**
 *
 * @author Admin
 */
public class LikeDAO {
    
    public static boolean like(model.Like like) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "INSERT INTO statuslike VALUES(?,?,?)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, like.getStatus_id());
            ps.setString(2, like.getUsername());
            ps.setBoolean(3, true);
            ps.execute();
            conn.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static boolean unLike(model.Like like) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "UPDATE statuslike SET statuslike_condition=? where status_id =" + like.getStatus_id() + " and account_username='"+ like.getUsername()+"'";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            
            ps.setBoolean(1, false);
            ps.execute();
            conn.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static int demLike(int id) {
        Connection conn = connect.ConnectDB.getConnection();

        PreparedStatement ptmt = null;

        int like = 0;
        String sql = "SELECT Count(account_username) AS liketotal From statuslike where statuslike_condition=1 and status_id = " + id;

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                like = rs.getInt("liketotal");
            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }
        return like;
    }
    
    public static Like getLike(String username, int id) {
        Connection connection = ConnectDB.getConnection();
        String sql = "select * from statuslike where status_id=" + id + " and account_username='" +username + "";
        Statement statement;
        Like  like = new Like();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            like.setUsername(resultSet.getString("account_username"));
            like.setStatus_id(resultSet.getInt("status_id"));
            like.setCondition(resultSet.getBoolean("statuslike_condition"));
            
        } catch (SQLException ex) {
            ex.getMessage();

        }
        return like;

    }
    public static void main(String[] args) {
//        System.err.println(demLike(7));
        Like l = new Like("qdao.cntt@gmail.com", 7, true);
        System.err.println(getLike(l.getUsername(),7));
    }
}
