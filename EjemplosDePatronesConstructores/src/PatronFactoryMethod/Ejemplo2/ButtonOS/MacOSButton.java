/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronFactoryMethod.Ejemplo2.ButtonOS;

import PatronFactoryMethod.Ejemplo2.Tools.Button;

/**
 *
 * @author Pc-Smart
 */
// Producto Concreto 2
class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Metodo para renderizar boton Mac...");
    }
}
