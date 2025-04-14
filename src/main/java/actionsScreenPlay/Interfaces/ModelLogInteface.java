package actionsScreenPlay.Interfaces;

public interface ModelLogInteface {

    /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    # Se crean una interface de Metodos                  #
    # mediante la Implementación - ModelLogInteface      #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades de                #
    #  de los Objetos mediante JAVA - Void               #
    #                                                    #
    ######################################################
    */

    // Need to create these methods, so that they can be called
    void startTestCase(String sTestCaseName);
    void endTestCase(String sTestCaseName);
    void info(String message);
    void warn(String message);
    void error(String message);
    void fatal(String message);
    void debug(String message);

}
