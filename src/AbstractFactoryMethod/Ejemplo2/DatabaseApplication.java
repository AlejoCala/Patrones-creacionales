/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethod.Ejemplo2;

import AbstractFactoryMethod.Ejemplo2.Interface.Command;
import AbstractFactoryMethod.Ejemplo2.Interface.Connection;
import AbstractFactoryMethod.Ejemplo2.Interface.DatabaseFactory;

/**
 *
 * @author Pc-Smart
 */
public class DatabaseApplication {
    private Connection connection;
    private Command command;

    public DatabaseApplication(DatabaseFactory factory) {
        connection = factory.createConnection();
        command = factory.createCommand();
    }

    public void connectAndExecute() {
        connection.connect();
        command.execute();
    }
}
