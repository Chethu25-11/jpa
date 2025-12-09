import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Reservation {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Driver loaded successfuly");
        }
        String url = "jdbc:mysql://localhost:3306/reservation_system";
        String userName = "root";
        String psw = "root";
        String insertQuery="INSERT INTO Reservation (reservation_id, customer_name, reservation_date, table_no, no_of_people) VALUES (?,?,?, ?, ?)";
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            System.out.println("Connection established successfully: " + connection);

            preparedStatement = connection.preparedStatement(query);
            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,"Rahul Kumar");
            preparedStatement.setString(3,"2025-12-08");
            preparedStatement.setInt(4,5);
            preparedStatement.setInt(5,4);
            preparedStatement.execute();
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
