package dbConexion;


import base.utils.QueryDBConstant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryDB extends QueryDBConstant {

    /**
     * Retrieves all user-related order details from the database and prints the OrderID and ProductID
     * for each record in the result set.
     *
     * The query joins the "Order Details" table with the Products table to fetch details such as
     * OrderID, ProductID, ProductName, UnitPrice, Quantity, Discount, and calculates an ExtendedPrice.
     *
     * The method uses a database connection to execute the query and iterates through the result set
     * to print the OrderID and ProductID of each record.
     *
     * Exceptions:
     * - If a database access error occurs, an SQLException is caught and its stack trace is printed.
     *
     * Note:
     * - Ensure that the `dbConnection.connect()` method is properly implemented to establish a valid
     *   database connection.
     * - The database schema should match the query structure for successful execution.
     */
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