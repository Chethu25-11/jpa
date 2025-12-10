import java.sql.*;

public class LibraryRead {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/library";
        String userName = "root";
        String psw = "root";

        Connection connection = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            preparedStatement=connection.prepareStatement("select * from select * from LibraryInfo");
            resultSet = preparedStatement.executeQuery();
            if (resultSet!=null){
                System.out.println("connection established successfully"+resultSet);
                while (resultSet.next()){
                    System.out.println("vote id: " + resultSet.getInt("vote_id"));
                    System.out.println("voter name: " + resultSet.getString("voter_name"));
                    System.out.println(" candidate name: " + resultSet.getInt("candidate_name"));
                    System.out.println("voting date: " + resultSet.getInt("voting_date"));
                    System.out.println("---------------------------------------------------------------");
                }
            }


        }catch(SQLException e){
            throw new RuntimeException(e);
        }finally {
            if (connection!=null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

        }
    }
}
