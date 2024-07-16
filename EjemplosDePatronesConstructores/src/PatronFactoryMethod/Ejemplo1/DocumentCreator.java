/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronFactoryMethod.Ejemplo1;

/**
 *
 * @author Pc-Smart
 */
// Clase Creadora Abstracta
abstract class DocumentCreator {
    public abstract Document createDocument();

    // Otros métodos que pueden ser comunes a todas las subclases
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}
