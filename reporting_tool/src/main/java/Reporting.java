import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Reporting {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Driver loaded successfuly");
        }
        String url = "jdbc:mysql://localhost:3306/reporting_tool";
        String userName = "root";
        String psw = "root";
        String insertQuery="INSERT INTO Reporting (report_id, report_title, report_date, created_by) VALUES (?,?,?,?)";
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            System.out.println("Connection established successfully: " + connection);

            preparedStatement = connection.preparedStatement(query);
           preparedStatement.setInt(1,1);
           preparedStatement.setString(2,"Monthly Sales Summary");
           preparedStatement.setString(3,"2025-12-08");
           preparedStatement.setString(4,"Ramesh" );
            System.out.println("Data inserted successfully");
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
