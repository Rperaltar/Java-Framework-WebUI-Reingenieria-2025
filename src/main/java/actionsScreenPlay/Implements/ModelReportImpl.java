package actionsScreenPlay.Implements;

import actionsScreenPlay.Interfaces.ModelReportInterface;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModelReportImpl implements ModelReportInterface {

     /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelReportImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de Lectura de   #
    #  Archivos tipo .xlsx en Selenium.      #
    #                                        #
    ##########################################
    */


    //Variables -- para definir la lectura de el libro de Excel.xlsx y la hoja de Excel a leer
    public static XSSFWorkbook wb;
    public static XSSFSheet sheet;

    //Se crea un Objeto - que lea el Libro de Archivo "Excel.xlsx" de una Ruta especifica
    public void ApachePoiExcel(String excelPath) {
        try {
            FileInputStream fis = new FileInputStream(excelPath);
            wb = new XSSFWorkbook(fis);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    //Se crea un Objeto - que lea las columnas y registros del Archivo "Excel.xlsx"
    //tanto pára el dato como para la columna especifica a Obtener en el parseo de los Inputs a Inyectar
    public String readData(int row, int column) {

        sheet = wb.getSheet("pauta");
        String data = sheet.getRow(row).getCell(column).getStringCellValue();
        System.out.println(data);
        return data;
    }

   /*
   #########################################
   #                                       #
   #  Clase - FileReaderTXT                #
   #  Realiza La lectura del contenido     #
   #  General de un archivo tipo "File.txt"#
   #########################################
   */

    //Crea un Objeto de tipo Read - Este Metodo -
    //Realiza - La lectura del contenido General de un archivo tipo "File.txt"
    //el result del archivo lo devuelve en una lista en consola
    public void ReadTxtFile(String fileName) throws IOException {
        //Open the file
        FileInputStream fstream = new FileInputStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null) {
            // Print the content on the console
            System.out.println(strLine);
        }
        //Close the input stream
        fstream.close();

    }

}
