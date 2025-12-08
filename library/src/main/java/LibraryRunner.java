import java.sql.*;

public class LibraryRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Driver loaded successfuly");
        }
        String url = "jdbc:mysql://localhost:3306/library";
        String userName = "root";
        String psw = "root";
        String insertQuery="iNSERT INTO LibraryInfo (BookName, Author, AvailableCopies) VALUES(?,?, ?)";

        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            System.out.println("Connection established successfully: " + connection);
            preparedStatement = connection.preparedStatement(query);
            preparedStatement.setString(1, "Wings of Fire");
            preparedStatement.setString(2,  "A.P.J. Abdul Kalam");

            preparedStatement.setInt(3,2);


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

