/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethod.Ejemplo2.Connection;

import AbstractFactoryMethod.Ejemplo2.Interface.Command;

/**
 *
 * @author Pc-Smart
 */
public class MySQLCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Executing MySQL command...");
    }
}
