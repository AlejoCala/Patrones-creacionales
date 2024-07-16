/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronSingleton.Ejemplo1;

/**
 *
 * @author Pc-Smart
 * El patrón Singleton asegura que una clase solo tenga una instancia y proporciona un punto de acceso global a ella.
 */
public class MainSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EagerSingleton singleton = EagerSingleton.getInstance();
        singleton.showMessage();
    }
    
}
