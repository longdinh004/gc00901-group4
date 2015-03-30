/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tung
 */
public class productManager {
    private List<product> list = new ArrayList<>();
    private ResultSet rs;
    
    public List<product> ListAll() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUser = "sa";
            String dbPassword = "12345678";
            String url = "jdbc:sqlserver://ROCKY\\SQLEXPRESS:1433;databaseName=ProductManager";
            Connection conn = DriverManager.getConnection(url, dbUser, dbPassword);
            PreparedStatement ps = conn.prepareStatement("Select* from Products");
            rs = ps.executeQuery();
            while (rs.next()) {
                product pro = new product();
                pro.setId(rs.getInt("id"));
                pro.setName(rs.getString("name"));
                pro.setPrice(rs.getFloat("price"));
                list.add(pro);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
