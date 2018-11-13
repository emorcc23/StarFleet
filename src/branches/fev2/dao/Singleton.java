/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Álvaro Santos
 */
public class Singleton {

      private static final String JDBC_URL = "jdbc:mysql://localhost:3306/starfleetv2";

      private static Connection instance = null;

      private Singleton() {
      }

      public static Connection getConnection() throws SQLException {
            if (instance == null) {
                  Properties props = new Properties();
                  props.put("user", "root");
                  props.put("password", "");
                  instance = DriverManager.getConnection(JDBC_URL, props);
            }

            return instance;
      }
}
