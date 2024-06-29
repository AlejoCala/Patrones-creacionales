/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethod.Ejemplo1GUI;

import AbstractFactoryMethod.Ejemplo1GUI.DarkTheme.DarkGUIFactory;
import AbstractFactoryMethod.Ejemplo1GUI.Interface.GUIFactory;
import AbstractFactoryMethod.Ejemplo1GUI.LightTheme.LightGUIFactory;

/**
 *
 * @author Pc-Smart
 */
public class MainFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application app;
        GUIFactory factory;

        // Crear una aplicación con tema claro
        factory = new LightGUIFactory();
        app = new Application(factory);
        app.paint();

        // Crear una aplicación con tema oscuro
        factory = new DarkGUIFactory();
        app = new Application(factory);
        app.paint();
    }
    
}
