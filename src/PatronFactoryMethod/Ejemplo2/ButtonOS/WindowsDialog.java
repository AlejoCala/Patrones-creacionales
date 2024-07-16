/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronFactoryMethod.Ejemplo2.ButtonOS;

import PatronFactoryMethod.Ejemplo2.Tools.Button;
import PatronFactoryMethod.Ejemplo2.Tools.Dialog;

/**
 *
 * @author Pc-Smart
 */
// Creador Concreto 1
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
