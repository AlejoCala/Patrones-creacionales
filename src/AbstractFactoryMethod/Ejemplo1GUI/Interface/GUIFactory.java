/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethod.Ejemplo1GUI.Interface;

/**
 *
 * @author Pc-Smart
 */
// Interfaz de Fábrica Abstracta
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
