/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ifundip.appdemo.service;

import java.sql.*;

/**
 *
 * @author maspa
 */
public class MariaDBConnectionService {

    public Connection getConnection() throws Exception{
        //me-load kelas driver
        Class.forName("org.mariadb.jdbc.Driver");
        Connection mariadbConnection = DriverManager.getConnection("jdbc:mariadb://localhost/restful", "root", "");
        return null;
    }
}
