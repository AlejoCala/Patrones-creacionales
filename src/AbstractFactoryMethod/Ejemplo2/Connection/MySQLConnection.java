/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethod.Ejemplo2.Connection;

import AbstractFactoryMethod.Ejemplo2.Interface.Connection;

/**
 *
 * @author Pc-Smart
 */
public class MySQLConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }
}
