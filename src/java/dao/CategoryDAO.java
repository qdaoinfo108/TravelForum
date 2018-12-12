/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.ConnectDB;
import model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CategoryDAO {
    public static ArrayList<Category> getListCategory() {
        Connection connection = ConnectDB.getConnection();
        String sql = "Select * from category";
        ArrayList<Category> arr = new ArrayList<Category>();
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category c = new Category();
                c.setCategory_id(rs.getInt("category_id"));
                c.setCategory_name(rs.getString("category_name"));
                arr.add(c);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return arr;
    }
    
    public static String getNameCategory(String category) {
        PreparedStatement ptmt = null;
        Connection conn = connect.ConnectDB.getConnection();

        String img = "";
        String sql = "SELECT category_name from category where category_id='" + category + "'";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                img = rs.getString("category_name");

            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }

        return img;

    }
    
    
    public static String getNameCategoryInt(int category) {
        PreparedStatement ptmt = null;
        Connection conn = connect.ConnectDB.getConnection();

        String img = "";
        String sql = "SELECT category_name from category where category_id=" + category ;

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();
            while (rs.next()) {
                img = rs.getString("category_name");

            }
            ptmt.close();
            rs.close();
        } catch (Exception e) {
        }

        return img;

    }
    public static void main(String[] args) {
        ArrayList<Category> list = dao.CategoryDAO.getListCategory();
                    for (int i = 0; i < list.size(); i++) {
                        System.err.println(list.get(i).getCategory_name());
                    }
    }
}
