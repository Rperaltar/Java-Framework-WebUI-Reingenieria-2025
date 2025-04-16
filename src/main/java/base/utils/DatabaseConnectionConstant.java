package base.utils;


import java.sql.Connection;

public class DatabaseConnectionConstant {

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
    public static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Northwind;user=;password=;encrypt=true;trustServerCertificate=true;";
    public static final String USER = "sa";
    public static final String PASSWORD = "123456";

    /**
     * Represents a database connection instance.
     * This field is used to establish and manage the connection to the database.
     */
    public Connection connection;

}