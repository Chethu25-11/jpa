package com.xworkz.ecom.product;

import java.sql.*;

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
        PreparedStatement preparedStatement=null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            System.out.println("Connection established successfully: " + connection);
         preparedStatement=connection.prepareStatement(insertQuery);


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
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
  }

}
}




