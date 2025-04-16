package dbConexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    /**
     * The connection URL for the SQL Server database.
     *
     * This URL specifies the following:
     * - The server is running on localhost at port 1433.
     * - The database name is "Northwind".
     * - User credentials (username and password) need to be provided.
     * - Encryption is enabled for the connection.
     * - The server certificate is trusted without validation.
     *
     * Note: Ensure to replace the placeholders for username and password with valid credentials.
     */
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Northwind;user=;password=;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String PASSWORD = "123456";

    /**
     * Represents a database connection instance.
     * This field is used to establish and manage the connection to the database.
     */
    private Connection connection;

    /**
     * Establishes and returns a database connection.
     * If the connection is null or closed, a new connection is created using the
     * specified URL, username, and password.
     *
     * @return an active {@link Connection} to the database
     * @throws SQLException if a database access error occurs or the connection
     *                      cannot be established
     */
    public Connection connect() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully.");
        }
        return connection;
    }

    /**
     * Closes the database connection if it is open.
     *
     * @throws SQLException if a database access error occurs while closing the connection.
     */
    public void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Connection closed successfully.");
        }
    }
}