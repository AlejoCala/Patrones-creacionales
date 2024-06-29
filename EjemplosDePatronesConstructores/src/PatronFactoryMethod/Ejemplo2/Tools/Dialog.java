/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronFactoryMethod.Ejemplo2.Tools;

/**
 *
 * @author Pc-Smart
 */
// Clase Creadora Abstracta
public abstract class Dialog {
    public abstract Button createButton();

    // Otros métodos que pueden ser comunes a todas las subclases
    public void renderButton() {
        Button btn = createButton();
        btn.render();
    }
}
