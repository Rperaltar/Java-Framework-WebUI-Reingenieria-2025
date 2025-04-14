package actionsScreenPlay.Interfaces;

import java.io.IOException;

public interface ModelReportInterface {

    /*
    #################################################
    #            Patron de Diseño                   #
    #           ScreeenPlayActions                  #
    #                                               #
    # Se crean una interface de Metodos             #
    # mediante la Implementación - ModelReport      #
    #                                               #
    #  Con el Objetivo de                           #
    #  inicializar las funcionalidades de           #
    #  de los Objetos mediante JAVA - Void          #
    #                                               #
    #################################################
    */


    void ApachePoiExcel(String excelPath);
    String readData(int row, int column);
    void ReadTxtFile(String fileName) throws IOException;

}
