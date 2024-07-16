/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronSingleton.Ejemplo2;

/**
 *
 * @author Pc-Smart
 */
public class MainLazySingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LazySingleton singleton = LazySingleton.getInstance();
        singleton.showMessage();
    }
    
}
