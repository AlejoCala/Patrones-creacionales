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
// Producto Concreto 2
class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Abriendo PDF ...");
    }
}
