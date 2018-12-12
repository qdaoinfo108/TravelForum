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
import java.util.ArrayList;
import model.Comment;

/**
 *
 * @author Admin
 */
public class CommentDAO {

    public static boolean themComment(model.Comment comment) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "INSERT INTO comment VALUES(?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setTimestamp(1, comment.getComment_date());
            ps.setString(2, comment.getComment_content());
            ps.setInt(3, comment.getStatus_id());
            ps.setString(4, comment.getAccount_username());
            ps.execute();
            conn.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static int demCommentByIDStatus(int id) {
        Connection conn = connect.ConnectDB.getConnection();

        PreparedStatement ptmt = null;

        int binhluan = 0;
        String sql = "SELECT Count(status_id) AS binhluan From comment where status_id = " + id;

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                binhluan = rs.getInt("binhluan");
            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }
        return binhluan;
    }

    public static ArrayList<Comment> listCommentByIDStatus(int id) {
        ArrayList<Comment> listComment = new ArrayList<>();
        Connection connection = ConnectDB.getConnection();
        String sql = "SELECT * From comment where status_id = " + id;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Comment cm = new Comment();
                cm.setStatus_id(resultSet.getInt("status_id"));
                cm.setComment_id(resultSet.getInt("comment_id"));
                cm.setComment_date(resultSet.getTimestamp("comment_date"));
                cm.setComment_content(resultSet.getString("comment_content"));
                cm.setAccount_username(resultSet.getString("account_username"));
                listComment.add(cm);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listComment;
    }

    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        //-------------------------------------------------------------------
//        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date thoiGian = cal.getTime();
//        java.sql.Timestamp t1 = new java.sql.Timestamp(thoiGian.getTime());
//        
//        model.Comment comment = new Comment();
//        comment.setAccount_username("qdao.cntt@gmail.com");
//        comment.setComment_content("abc");
//        comment.setComment_date(t1);
//        comment.setStatus_id(1);
//        themTaiKhoan(comment);

        System.err.println(demCommentByIDStatus(1));
    }

}
