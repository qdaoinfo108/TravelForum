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
import java.sql.Timestamp;
import javax.servlet.http.HttpServletRequest;
import model.Account;

/**
 *
 * @author Admin
 */
public class LoginAccount {

    public static String CheckLogin(HttpServletRequest request, Connection conn, Account acc) {
        PreparedStatement ptmt = null;

        String test = "thatbai";
        String sql = "SELECT account_username,account_password from account";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("account_username");
                String password = rs.getString("account_password");

                if (acc.getUser().equals(name) && tools.MD5.MaHoaMD5(acc.getPass()).equals(password)) {
                    test = "thanhcong";
                }
            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
            request.setAttribute("msglogin", e.getMessage());
        }

        return test;

    }

    public static int CheckRoleAccount(String user) {
        Connection conn = connect.ConnectDB.getConnection();
        PreparedStatement ptmt = null;

        String sql = "SELECT account_role from account where account_username='" + user + "''";
        int roleid = 1;

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();

            while (rs.next()) {
                roleid = rs.getInt("account_role");

            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }
        return roleid;

    }

    /// lafm tiep
    public static Timestamp getTimestamp(String token) {
        Connection conn = connect.ConnectDB.getConnection();
        PreparedStatement ptmt = null;
        Timestamp date = null;
        String sql = "SELECT account_date from account where account_url_forgetpass='" + token + "'";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                date = rs.getTimestamp("account_date");

            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }

        return date;

    }

    public static String showEmail(String url) {
        PreparedStatement ptmt = null;
        Connection conn = connect.ConnectDB.getConnection();
        String fullname = "";
        String sql = "SELECT account_username from account where account_url_forgetpass='" + url + "'";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                fullname = rs.getString("account_username");

            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }

        return fullname;

    }

    public static String showHoTen(HttpServletRequest request, Connection conn, Account acc) {
        PreparedStatement ptmt = null;

        String fullname = "";
        String sql = "SELECT account_name from account where account_username='" + acc.getUser() + "'";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                fullname = rs.getString("account_name");

            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
            request.setAttribute("msglogin", e.getMessage());
        }

        return fullname;

    }

    public static String getImgAccount(String email) {
        PreparedStatement ptmt = null;
        Connection conn = connect.ConnectDB.getConnection();

        String img = "";
        String sql = "SELECT account_image from account where account_username='" + email + "'";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                img = rs.getString("account_image");

            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }

        return img;

    }
    
    public static String getNameAccount(String email) {
        PreparedStatement ptmt = null;
        Connection conn = connect.ConnectDB.getConnection();

        String img = "";
        String sql = "SELECT account_name from account where account_username='" + email + "'";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                img = rs.getString("account_name");

            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }

        return img;

    }

    public static boolean themURLTime(String url, Timestamp time, String user) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "UPDATE account SET account_url_forgetpass = ?, account_date = ? where account_username='" + user + "'";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, url);
            ps.setTimestamp(2, time);
            boolean kq = ps.execute();
            conn.close();
            return kq;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean changePss(String url, String newPass) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "UPDATE account SET account_password=? where account_url_forgetpass='" + url + "'";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, tools.MD5.MaHoaMD5(newPass));
            boolean kq = ps.execute();
            conn.close();
            return kq;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean changeInfo(String email, String newPass, String newName, String newImg) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "UPDATE account SET account_password=?, account_name=?,account_image=? where account_username='" + email + "'";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, tools.MD5.MaHoaMD5(newPass));
            ps.setString(2, newName);
            ps.setString(3, newImg);
            boolean kq = ps.execute();
            conn.close();
            return kq;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean themTaiKhoan(Account acc) {
        Connection conn = connect.ConnectDB.getConnection();
        String sql = "INSERT INTO account(account_username,account_password,account_name) VALUES(?,?,?)";

        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, acc.getUser());
            ps.setString(2, tools.MD5.MaHoaMD5(acc.getPass()));
            ps.setString(3, acc.getName());
            boolean kq = ps.execute();
            conn.close();
            return kq;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static long sosanhDate(String url) {
        Timestamp time = dao.LoginAccount.getTimestamp(url);
        Connection conn = connect.ConnectDB.getConnection();

        PreparedStatement ptmt = null;

        long soPhut = 0;
        String sql = "SELECT DATEDIFF (minute	, '" + time + "', getdate ()) AS tongPhut From account";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                soPhut += rs.getLong("tongPhut");
            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }
        return soPhut;
    }

    public static Account getInfoAccount(String email) {
        Connection connection = ConnectDB.getConnection();
        String sql = "Select * from account where account_username='" + email + "'";
        Account c = new Account();
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                c.setName(rs.getString("account_name"));
                c.setImage(rs.getString("account_image"));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return c;
    }

    public static void main(String[] args) {
//        HttpServletRequest request = null;
//        Connection conn = connect.ConnectDB.getConnection();
//        Account acc1 = new Account();
//        acc1.setUser("qdao.cntt@gmail.com");
//        String s1 = showHoTen(request, conn, acc1);
//        System.err.println(s1);

//        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date d = new Date();
//        java.sql.Date sDate = convertUtilToSql(d);
//        df.format(sDate);
//===============================================
//        Calendar cal = Calendar.getInstance();
//        cal.add(Calendar.MINUTE, +30);
//        //-------------------------------------------------------------------
//        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//        Date thoiGian = cal.getTime();
//        String s1 = sdf2.format(thoiGian);
//        java.sql.Timestamp t1 = new java.sql.Timestamp(thoiGian.getTime());
//        System.out.println(new java.sql.Timestamp(cal.getTimeInMillis()));
//
//        System.err.println(themURLTime("hihiih", t1, "qdao.cntt@gmail.com"));
//          System.err.println(getTimestamp("ACD265B125C8D9E000BC116B3C5D22D6B7D274B67426CC872A"));
//          Timestamp time = dao.LoginAccount.getTimestamp("ACD265B125C8D9E000BC116B3C5D22D6B7D274B67426CC872A");
//        System.err.println(dao.LoginAccount.getTimestamp("8D13D999D7723BB546AC9B1522EA505297783C54C71A2BB69D").toString());
//        System.out.println(sosanhDate("8D13D999D7723BB546AC9B1522EA505297783C54C71A2BB69D"));
//        System.err.println(changeInfo("qdao.cntt11@gmail.com", "123", "abc", "vx"));
//        Account a = getInfoAccount("qdao.cntt11@gmail.com");
        Account acc = new Account();
        acc.setName("Đạo");
        acc.setPass("quocdao108");
        acc.setUser("qdao.cntt@gmail.com");
        System.err.println(themTaiKhoan(acc));
    


//    public static boolean checkTaiKhoan(String user) {
//        Connection connection = DBConnection.getConnection();
//        String sql = "select name from member where name='" + user + "'";
//        try {
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                return true;
//            }
//
//        } catch (SQLException ex) {
//        }
//        return false;
    }
}
