import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductCreate {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            String url = "jdbc:mysql://localhost:3306/ecom";
        String userName = "root";
        String psw = "root";
        String insertQuery="insert into product_info (product_id,name,price) values (?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement =null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "bottle");
            preparedStatement.setInt(3, 80);
            preparedStatement.execute();
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
