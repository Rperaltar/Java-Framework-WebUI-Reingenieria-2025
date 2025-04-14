package Test.Firefox;


import org.testng.annotations.Test;
import dbConexion.DBConnection;

public class TestDB extends DBConnection {

    @Test
    public void TestDB(){
        DBConnection dbConnection = new DBConnection();
        dbConnection.DBConnection();
        System.out.println(dbConnection);

    }

}
