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
// Creador Concreto 2
class PdfDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
