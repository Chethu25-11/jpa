import java.sql.*;

public class WeatherRead {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/weatherforecasting";
        String userName = "root";
        String psw = "root";

        Connection connection = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            preparedStatement=connection.prepareStatement("select * from WeatherInfo;");
            resultSet = preparedStatement.executeQuery();
            if (resultSet!=null){
                System.out.println("connection established successfully"+resultSet);
                while (resultSet.next()){
                    System.out.println("City: " + resultSet.getInt("City"));
                    System.out.println("Temperature: " + resultSet.getString("Temperature"));
                    System.out.println("WeatherCondition: " + resultSet.getInt("WeatherCondition"));

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
