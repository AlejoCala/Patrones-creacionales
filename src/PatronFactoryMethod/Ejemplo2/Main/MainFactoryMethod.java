/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronFactoryMethod.Ejemplo2.Main;

import PatronFactoryMethod.Ejemplo2.ButtonOS.MacOSDialog;
import PatronFactoryMethod.Ejemplo2.ButtonOS.WindowsDialog;
import PatronFactoryMethod.Ejemplo2.Tools.Dialog;

/**
 *
 * @author Pc-Smart
 * 
 * permite crear objetos sin especificar la clase exacta de los objetos que se crearán, 
 * delegando la responsabilidad a las subclases para que definan la creación de 
 * objetos específicos.
 */
public class MainFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dialog dialog;

        // Crear y renderizar un botón Windows
        dialog = new WindowsDialog();
        dialog.renderButton();

        // Crear y renderizar un botón macOS
        dialog = new MacOSDialog();
        dialog.renderButton();
    }
    
}
