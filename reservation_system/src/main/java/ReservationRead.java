import java.sql.*;

public class ReservationRead {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/reservation_system";
        String userName = "root";
        String psw = "root";

        Connection connection = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            preparedStatement=connection.prepareStatement("select * from Reservation");
            resultSet = preparedStatement.executeQuery();
            if (resultSet!=null){
                System.out.println("connection established successfully"+resultSet);
                while (resultSet.next()){
                    System.out.println("reservation id: " + resultSet.getInt("reservation_id"));
                    System.out.println("customer name: " + resultSet.getString("customer_name"));
                    System.out.println("reservation date: " + resultSet.getInt("reservation_date"));
                    System.out.println("table no: " + resultSet.getInt("table_no"));
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
