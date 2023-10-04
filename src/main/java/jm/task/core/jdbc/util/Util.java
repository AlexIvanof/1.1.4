package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
  static  String dbURL= "jdbc:mysql://localhost:3306/namebd";
  static  String db_driver= "com.mysql.cj.jdbc.Driver";
  static  String username= "root";
  static  String password= "root";
public static Connection getConnectuin(){
    Connection connection=null;
    try {
        Class.forName(db_driver);
        connection = DriverManager.getConnection(dbURL, username, password);
        System.out.println("Connection ok");
    }catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
            System.out.println("Connection ERROR");
        }
        return connection;
    }
}

