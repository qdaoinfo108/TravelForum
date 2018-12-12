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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import model.Status;

/**
 *
 * @author Admin
 */
public class StatusDAO {

    public static Status getStatusByID(int id) {
        Connection connection = ConnectDB.getConnection();
        String sql = "select * from status where status_id='" + id + "'";
        Statement statement;
        Status st = new Status();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                st.setStatus_id(resultSet.getInt("status_id"));
                st.setStatus_title(resultSet.getString("status_title"));
                st.setStatus_date(resultSet.getTimestamp("status_date"));
                st.setStatus_content(resultSet.getString("status_content"));
                st.setStatus_view(resultSet.getInt("status_view"));
                st.setStatus_view2(resultSet.getInt("status_view2"));
                st.setStatus_image(resultSet.getString("status_image"));
                st.setStatus_location(resultSet.getString("status_location"));
                st.setStatus_enable(resultSet.getBoolean("status_enable"));
                st.setCity(resultSet.getInt("city_id"));
                st.setCategory(resultSet.getInt("category_id"));
                st.setUsername(resultSet.getString("account_username"));
            }
        } catch (SQLException ex) {
            ex.getMessage();

        }
        return st;

    }

    public static ArrayList<Status> getAllStatus() {
        ArrayList<Status> listStatus = new ArrayList<>();
        Connection connection = ConnectDB.getConnection();
        String sql = "select * from status";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Status st = new Status();
                st.setStatus_id(resultSet.getInt("status_id"));
                st.setStatus_title(resultSet.getString("status_title"));
                st.setStatus_date(resultSet.getTimestamp("status_date"));
                st.setStatus_content(resultSet.getString("status_content"));
                st.setStatus_view(resultSet.getInt("status_view"));
                st.setStatus_image(resultSet.getString("status_image"));
                st.setStatus_location(resultSet.getString("status_location"));
                st.setStatus_enable(resultSet.getBoolean("status_enable"));
                st.setUsername(resultSet.getString("account_username"));
                st.setCategory(resultSet.getInt("category_id"));
                st.setCity(resultSet.getInt("city_id"));
                listStatus.add(st);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listStatus;
    }

    // them----------------------------------------------
    public static boolean add(Status stt) {

        Connection connection = ConnectDB.getConnection();
        String sql = "insert into status values(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, stt.getStatus_title());
            statement.setTimestamp(2, stt.getStatus_date());
            statement.setString(3, stt.getStatus_content());
            statement.setInt(4, 0);
            statement.setInt(5, 0);
            statement.setString(6, stt.getStatus_image());
            statement.setString(7, stt.getStatus_location());
            statement.setBoolean(8, false);
            statement.setString(9, stt.getUsername());
            statement.setInt(10, stt.getCategory());
            statement.setInt(11, stt.getCity());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    public static ArrayList<Status> getAllStatusFalse() {
        ArrayList<Status> listStatus = new ArrayList<>();
        Connection connection = ConnectDB.getConnection();
        String sql = "select * from status where status_enable=0";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Status st = new Status();
                st.setStatus_id(resultSet.getInt("status_id"));
                st.setStatus_title(resultSet.getString("status_title"));
                st.setStatus_date(resultSet.getTimestamp("status_date"));
                st.setStatus_content(resultSet.getString("status_content"));
                st.setStatus_view(resultSet.getInt("status_view"));
                st.setStatus_image(resultSet.getString("status_image"));
                st.setStatus_location(resultSet.getString("status_location"));
                st.setStatus_enable(resultSet.getBoolean("status_enable"));
                st.setUsername(resultSet.getString("account_username"));
                st.setCategory(resultSet.getInt("category_id"));
                st.setCity(resultSet.getInt("city_id"));
                listStatus.add(st);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listStatus;
    }

    public static ArrayList<Status> getAllStatusTrue() {
        ArrayList<Status> listStatus = new ArrayList<>();
        Connection connection = ConnectDB.getConnection();
        String sql = "select * from status where status_enable=1";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Status st = new Status();
                st.setStatus_id(resultSet.getInt("status_id"));
                st.setStatus_title(resultSet.getString("status_title"));
                st.setStatus_date(resultSet.getTimestamp("status_date"));
                st.setStatus_content(resultSet.getString("status_content"));
                st.setStatus_view(resultSet.getInt("status_view"));
                st.setStatus_image(resultSet.getString("status_image"));
                st.setStatus_location(resultSet.getString("status_location"));
                st.setStatus_enable(resultSet.getBoolean("status_enable"));
                st.setUsername(resultSet.getString("account_username"));
                st.setCategory(resultSet.getInt("category_id"));
                st.setCity(resultSet.getInt("city_id"));
                listStatus.add(st);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listStatus;
    }

    public static ArrayList<Status> getAllStatusTrueByAccount(String email) {
        ArrayList<Status> listStatus = new ArrayList<>();
        Connection connection = ConnectDB.getConnection();
        String sql = "select * from status where status_enable=1 and account_username='" + email + "'";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Status st = new Status();
                st.setStatus_id(resultSet.getInt("status_id"));
                st.setStatus_title(resultSet.getString("status_title"));
                st.setStatus_date(resultSet.getTimestamp("status_date"));
                st.setStatus_content(resultSet.getString("status_content"));
                st.setStatus_view(resultSet.getInt("status_view"));
                st.setStatus_view2(resultSet.getInt("status_view2"));
                st.setStatus_image(resultSet.getString("status_image"));
                st.setStatus_location(resultSet.getString("status_location"));
                st.setStatus_enable(resultSet.getBoolean("status_enable"));
                st.setUsername(resultSet.getString("account_username"));
                st.setCategory(resultSet.getInt("category_id"));
                st.setCity(resultSet.getInt("city_id"));
                listStatus.add(st);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listStatus;
    }

    public static ArrayList<Status> getAllStatusFalseByAccount(String email) {
        ArrayList<Status> listStatus = new ArrayList<>();
        Connection connection = ConnectDB.getConnection();
        String sql = "select * from status where status_enable=0 and account_username='" + email + "'";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Status st = new Status();
                st.setStatus_id(resultSet.getInt("status_id"));
                st.setStatus_title(resultSet.getString("status_title"));
                st.setStatus_date(resultSet.getTimestamp("status_date"));
                st.setStatus_content(resultSet.getString("status_content"));
                st.setStatus_view(resultSet.getInt("status_view"));
                st.setStatus_image(resultSet.getString("status_image"));
                st.setStatus_location(resultSet.getString("status_location"));
                st.setStatus_enable(resultSet.getBoolean("status_enable"));
                st.setUsername(resultSet.getString("account_username"));
                st.setCategory(resultSet.getInt("category_id"));
                st.setCity(resultSet.getInt("city_id"));
                listStatus.add(st);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listStatus;
    }

    public static boolean acceptStatus(int idstatus) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "UPDATE status SET status_enable = ? where status_id ='" + idstatus + "'";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setBoolean(1, true);
            boolean kq = ps.execute();
            conn.close();
            return kq;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static int tinhTongView2(String email) {
        Connection conn = connect.ConnectDB.getConnection();

        PreparedStatement ptmt = null;

        int tongview = 0;
        String sql = "SELECT SUM(status_view2) AS tongView FROM status WHERE account_username='" + email + "'";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                tongview += rs.getLong("tongView");
            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }
        return tongview;
    }

    public static boolean deleteView2(String email) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "UPDATE status SET status_view2 = ? where account_username='" + email + "'";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, 0);
            boolean kq = ps.execute();
            conn.close();
            return kq;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
        

    public static boolean tangView(int id) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "UPDATE status SET status_view = status_view+1,status_view2 = status_view2+1 where status_id=" + id;
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            boolean kq = ps.execute();
            conn.close();
            return kq;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    //;
    // them----------------------------------------------
//    //sua
//
//    public void update(Status stt) {
//
//        Connection connection = ConnectDB.getConnection();
//        String sql = "update status set status_title=?,status_date=?,status_content=?,status_bookmark=?,status_view=?,status_image=?,status_location=?,status_enable=? where status_id=?";
//        try {
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, stt.getStatus_title());
//            statement.setString(2, stt.getStatus_date());
//            statement.setString(3, stt.getStatus_content());
//            statement.setInt(4, stt.getStatus_bookmark());
//            statement.setInt(5, stt.getStatus_view());
//            statement.setString(6, stt.getStatus_image());
//            statement.setString(7, stt.getStatus_location());
//            statement.setBoolean(8, stt.isStatus_enable());
//            statement.setInt(9, stt.getStatus_id());
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//    //xoa
//
//    public void delete(String id) {
//        Connection connection = ConnectDB.getConnection();
//        String sql = "delete from status where id='" + id + "'";
//
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.executeUpdate();
//
//        } catch (Exception e) {
//        }
//    }
    public static void main(String[] args) {
        System.err.println(tangView(6));
    }
}
