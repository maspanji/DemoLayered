/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ifundip.appdemo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import id.ifundip.appdemo.service.MariaDBConnectionService;
/**
 *
 * @author maspa
 */
public class MariaDBProductImpl implements ProductDAO{

    public void simpanProduct(Product product) throws Exception{
        MariaDBConnectionService mariadb = new MariaDBConnectionService();
        Connection mariadbConn = mariadb.getConnection();
        String sql = "INSERT INTO product(product_name,product_price) VALUES(?,?)";
        //ekseskusi SQL
        PreparedStatement insertStatement = mariadbConn.prepareStatement(sql);
        insertStatement.setString(1, product.getProductName());
        insertStatement.setInt(2, product.getPrice());
        insertStatement.executeUpdate();
        //menutup koneksi
        mariadbConn.close();
    }
    
}
