/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethod.Ejemplo1GUI;

import AbstractFactoryMethod.Ejemplo1GUI.Interface.Button;
import AbstractFactoryMethod.Ejemplo1GUI.Interface.CheckBox;
import AbstractFactoryMethod.Ejemplo1GUI.Interface.GUIFactory;

/**
 *
 * @author Pc-Smart
 */
// Cliente que utiliza la Abstract Factory
class Application {
    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
