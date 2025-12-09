import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReservationUpdate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/reservation_system";
        String userName = "root";
        String psw = "root";
        String QueryUpdate="update Reservation set reservation_id=? where customer_name=?";
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            preparedStatement = connection.prepareStatement(QueryUpdate);
            preparedStatement.setInt(1,2);
            preparedStatement.setString(2, "Rahul Kumar");

            int num = preparedStatement.executeUpdate();
            System.out.println("to check" + num);


            System.out.println("data inserted successfully");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (connection!=null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }

        }
    }
}
