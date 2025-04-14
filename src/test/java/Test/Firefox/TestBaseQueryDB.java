package Test.Firefox;

import org.testng.annotations.Test;
import dbConexion.QueryDB;

public class TestBaseQueryDB {

    @Test(priority = 1)
    public void Test() throws Exception {

        /* Estructura de pruebas en TestNg / Maven Junit
                1.-Datos de Entrada
                2.-Cuerpo de la Prueba
                3.-Resultado de la Prueba
                4.-Clear de la Prueba
        */
        QueryDB queryDB = new QueryDB();
        queryDB.getAllUsers();
            System.out.print(queryDB);

    }

}