import java.sql.*;

public class VotingRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } finally {
            System.out.println("Driver loaded successfuly");
        }
        String url = "jdbc:mysql://localhost:3306/voting";
        String userName = "root";
        String psw = "root9880244807";
        String insertQuery="INSERT INTO Voting (vote_id, voter_name, candidate_name, voting_date)VALUES (1, 'Mahesh', 'Rohit Sharma', '2025-12-08');";

        

        Connection connection=null;
        PreparedStatement preparedStatement=null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            System.out.println("Connection established successfully: " + connection);

            preparedStatement = connection.preparedStatement(query);

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Mahesh");
            preparedStatement.setString(3,"Rohit Sharma");
            preparedStatement.setString(4,"2025-12-08");
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
