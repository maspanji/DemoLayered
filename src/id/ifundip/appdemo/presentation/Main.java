/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ifundip.appdemo.presentation;

import java.sql.*;

/**
 *
 * @author maspa
 */
public class Main {
    
    public static void main(String[] args) throws Exception{
        //koneksi ke database
        Class.forName("org.mariadb.jdbc.Driver");
        Connection mariadbConnection = DriverManager.getConnection("jdbc:mariadb://localhost/restful","root","");
        String sql = "INSERT INTO product(product_name,product_price) VALUES(?,?)";
        PreparedStatement insertStatement = mariadbConnection.prepareStatement(sql);
        insertStatement.setString(1, "Produk baru 11.11");
        insertStatement.setInt(2, 50000);
        insertStatement.executeUpdate();
        mariadbConnection.close();
    }
    
}
