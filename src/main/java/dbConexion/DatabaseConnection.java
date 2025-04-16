package dbConexion;


import base.utils.DatabaseConnectionConstant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection extends DatabaseConnectionConstant {

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