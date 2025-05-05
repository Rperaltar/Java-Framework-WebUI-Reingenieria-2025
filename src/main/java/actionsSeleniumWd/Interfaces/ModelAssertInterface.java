package actionsSeleniumWd.Interfaces;

public interface ModelAssertInterface {

  /*
    ######################################################
    #            Patron de Diseño                        #
    #           ScreeenPlayActions                       #
    #                                                    #
    # Se crean una interface de Metodos                  #
    # mediante la Implementación - ModelAssertInterface  #
    #                                                    #
    #  Con el Objetivo de                                #
    #  inicializar las funcionalidades de                #
    #  de los Objetos mediante JAVA - Void               #
    #                                                    #
    ######################################################
    */



    void assertTrue(boolean condition, String message);
    void assertFalse(boolean condition);
    void assertFalse(boolean condition, String message);
    void assertEquals(boolean actual, boolean expected);
    void assertEquals(Object actual, Object expected);
    void assertEquals(Object[] actual, Object[] expected);
    void assertEquals(String condition, String message);
    void assertEquals(Object actual, Object expected, String message);
    void verifyTrue(boolean condition, String message);
    void verifyFalse(boolean condition);
    void verifyFalse(boolean condition, String message);
    void verifyEquals(boolean actual, boolean expected);
    void verifyEquals(String actual, String expected);
    void verifyEquals(int actual, int expected);
    void verifyEquals(Object actual, Object expected);
    void verifyEquals(Object[] actual, Object[] expected);


}
