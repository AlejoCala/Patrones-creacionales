/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethod.Ejemplo1GUI.LightTheme;

import AbstractFactoryMethod.Ejemplo1GUI.Interface.CheckBox;

/**
 *
 * @author Pc-Smart
 */
class LightCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Generando tema Light Checkbox...");
    }
}
