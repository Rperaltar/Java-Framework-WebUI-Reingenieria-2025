package actionsScreenPlay.Implements;

import actionsScreenPlay.Interfaces.ModelLogInteface;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ModelLogImpl implements ModelLogInteface {

      /*
    ##########################################
    #            Patron de Diseño            #
    #           ScreeenPlayActions           #
    #                                        #
    #  Clase - ModelKeysImpl              #
    #  Se crean una Implementación Objetos   #
    #  mediante una interface que hace que   #
    #  Estos metodos se inicialicen.         #
    #                                        #
    #  Con el Objetico de crear              #
    #  Metodos JAVA a partir de logs         #
    #  en Selenium.                          #
    #                                        #
    ##########################################
    */

    //Metodo generico para crear un Objeto log
    private static Logger log = LogManager.getLogger(ModelLogImpl.class.getName());

    //SE CREA OBJETO PARA LOG
    public void startTestCase(String sTestCaseName){

        log.info("****************************************************************************************");
        log.info("****************************************************************************************");
        log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");
        log.info("****************************************************************************************");
        log.info("****************************************************************************************");

    }
    //Este metodo imprime un log al final de los casos de prueba
    public void endTestCase(String sTestCaseName){
        log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
        log.info("X");
        log.info("X");
        log.info("X");
        log.info("X");

    }

    // Metodos para llamar diferentes mensajes de tipo Log
    public void info(String message) {
        log.info(message);
    }
    public void warn(String message) {
        log.warn(message);
    }
    public void error(String message) {
        log.error(message);
    }
    public void fatal(String message) {
        log.fatal(message);
    }
    public void debug(String message) {
        log.debug(message);
    }
}
