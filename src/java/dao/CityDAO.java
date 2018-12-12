/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.City;
import connect.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CityDAO {
    public static ArrayList<City> getListCity() {
        Connection connection = ConnectDB.getConnection();
        String sql = "Select * from city";
        ArrayList<City> arr = new ArrayList<City>();
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                City c = new City();
                c.setCity_id(rs.getInt("city_id"));
                c.setCity_name(rs.getString("city_name"));
                c.setCity_image(rs.getString("city_image"));
                arr.add(c);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return arr;
    }
    
    public static String getNameCity(String city) {
        PreparedStatement ptmt = null;
        Connection conn = connect.ConnectDB.getConnection();

        String img = "";
        String sql = "SELECT city_name from city where city_id='" + city + "'";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                img = rs.getString("city_name");

            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }

        return img;

    }
     public static String getNameCityInt(int city) {
        PreparedStatement ptmt = null;
        Connection conn = connect.ConnectDB.getConnection();

        String img = "";
        String sql = "SELECT city_name from city where city_id=" + city ;

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                img = rs.getString("city_name");

            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }

        return img;

    }
    public static void main(String[] args) {
        ArrayList<City> list = dao.CityDAO.getListCity();
                    for (int i = 0; i < list.size(); i++) {
                        System.err.println(list.get(i).getCity_name());
                    }
    }
}
