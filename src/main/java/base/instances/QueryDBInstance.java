package base.instances;


import dbConexion.DatabaseConnection;

public class QueryDBInstance {

    /**
     * A final instance of the DatabaseConnection class used to manage
     * the connection to the database. This ensures that the connection
     * remains consistent and cannot be reassigned after initialization.
     */
    public final DatabaseConnection dbConnection;

    /**
     * Constructor for the QueryDB class.
     * Initializes a new instance of the DatabaseConnection and assigns it to the dbConnection field.
     */
    public QueryDBInstance() {
        this.dbConnection = new DatabaseConnection();
    }

}