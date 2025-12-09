import java.sql.*;

public class WeatherRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Driver loaded successfuly");
        }
        String url = "jdbc:mysql://localhost:3306/weather";
        String userName = "root";
        String psw = "root9880244807";
        String insertQuery="INSERT INTO WeatherInfo (City, Temperature, WeatherCondition) VALUES(?, ?, ?)";



        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            System.out.println("Connection established successfully: " + connection);
            preparedStatement = connection.preparedStatement(query);
           preparedStatement.setString(1,"Tumkur");
           preparedStatement.setInt(2, 30);
           preparedStatement.setInt(3,"Sunny");
           preparedStatement.execute();
            System.out.println("data inserted successfully");
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
