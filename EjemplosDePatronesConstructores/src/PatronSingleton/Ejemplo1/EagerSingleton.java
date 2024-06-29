package PatronSingleton.Ejemplo1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pc-Smart
 */
public class EagerSingleton {
    
    // Crear la única instancia de la clase en el momento de la carga
    private static final EagerSingleton instance = new EagerSingleton();

    // Constructor privado para evitar la instanciación desde fuera
    private EagerSingleton() {}

    // Método público para obtener la única instancia
    public static EagerSingleton getInstance() {
        return instance;
    }

    // Métodos adicionales que desees implementar
    void showMessage() {
        System.out.println("Prueba EagerSingleton!");
    }
}