package com.xworkz.ecom.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Driver loaded successfuly");
        }
        String url = "jdbc:mysql://localhost:3306/ecom";
        String userName = "root";
        String psw = "root";
        String insertQuery="insert into product_info values(1,\"pen\",20,10)";
        Connection connection=null;
        Statement statement=null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            System.out.println("Connection established successfully: " + connection);

            statement = connection.createStatement();
            boolean ref = statement.execute(insertQuery);
            System.out.println("Data inserted successfully: " + ref);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Connection attempt finished");

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
  }

}
}




