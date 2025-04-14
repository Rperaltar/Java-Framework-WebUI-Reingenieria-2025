package dbConexion;


import java.sql.*;

public class DBConnection {

    public void DBConnection(){
    }

    // public void DB_Connection_sql()
    public static void main(String[] args){

        // Replace server name, username, and password with your credentials
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Northwind;user=;password=;encrypt=true;trustServerCertificate=true;";

        ResultSet resultSet = null;

        // Connect to your database.
        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement();)
        {
            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT * FROM [dbo].[Employees] ";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " +
                        resultSet.getString(2) + " " +
                        resultSet.getString(3 ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}