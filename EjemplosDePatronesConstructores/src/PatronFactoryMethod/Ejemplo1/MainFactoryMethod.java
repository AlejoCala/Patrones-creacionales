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
public class MainFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DocumentCreator creator;

        // Crear y abrir un documento Word
        creator = new WordDocumentCreator();
        creator.openDocument();

        // Crear y abrir un documento PDF
        creator = new PdfDocumentCreator();
        creator.openDocument();
    }
    
}
