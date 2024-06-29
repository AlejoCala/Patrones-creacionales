/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethod.Ejemplo1GUI.LightTheme;

import AbstractFactoryMethod.Ejemplo1GUI.Interface.Button;
import AbstractFactoryMethod.Ejemplo1GUI.Interface.CheckBox;
import AbstractFactoryMethod.Ejemplo1GUI.Interface.GUIFactory;

/**
 *
 * @author Pc-Smart
 */
// Fábrica Concreta para el Tema Claro
public class LightGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new LightCheckbox();
    }
}
