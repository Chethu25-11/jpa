import java.sql.*;

public class ProductRead {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:mysql://localhost:3306/ecom";
        String userName = "root";
        String psw = "root";

        Connection connection = null;
        PreparedStatement preparedStatement =null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, userName, psw);
           preparedStatement=connection.prepareStatement("select * from product_info");
              resultSet = preparedStatement.executeQuery();
              if (resultSet!=null){
                  System.out.println("connection established successfully"+resultSet);
                  while (resultSet.next()){
                      System.out.println("Product ID: " + resultSet.getInt("Product_id"));
                      System.out.println("Product Name: " + resultSet.getString("Product_Name"));
                      System.out.println("Product Price: " + resultSet.getInt("Product_Price"));
                      System.out.println("Product Quantity: " + resultSet.getInt("Quantity"));
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
