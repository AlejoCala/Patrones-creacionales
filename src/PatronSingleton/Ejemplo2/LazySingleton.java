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
public class LazySingleton {
    // Volatile garantiza la visibilidad de los cambios en la instancia
    private static volatile LazySingleton instance;

    // Constructor privado para evitar la instanciación desde fuera
    private LazySingleton() {}

    // Método público para obtener la única instancia, con double-checked locking
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    // Métodos adicionales que desees implementar
    public void showMessage() {
        System.out.println("Prueba LazySingleton!");
    }
}
