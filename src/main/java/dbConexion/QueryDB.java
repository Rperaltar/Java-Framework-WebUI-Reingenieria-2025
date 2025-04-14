package dbConexion;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryDB {
    private final DatabaseConnection dbConnection;

    public QueryDB() {
        this.dbConnection = new DatabaseConnection();
    }

    public void getAllUsers() {
        String query = "SELECT \"Order Details\".OrderID, \"Order Details\".ProductID, Products.ProductName, \n" +
                "\t\"Order Details\".UnitPrice, \"Order Details\".Quantity, \"Order Details\".Discount, \n" +
                "\t(CONVERT(money,(\"Order Details\".UnitPrice*Quantity*(1-Discount)/100))*100) AS ExtendedPrice\n" +
                "FROM Products INNER JOIN \"Order Details\" ON Products.ProductID = \"Order Details\".ProductID";
        try (Connection connection = dbConnection.connect();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println("OrderID: " + resultSet.getInt("OrderID"));
                System.out.println("ProductID: " + resultSet.getString("ProductID"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}