/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethod.Ejemplo2.Connection;

import AbstractFactoryMethod.Ejemplo2.Interface.Command;
import AbstractFactoryMethod.Ejemplo2.Interface.Connection;
import AbstractFactoryMethod.Ejemplo2.Interface.DatabaseFactory;

/**
 *
 * @author Pc-Smart
 */
// Fábrica Concreta para PostgreSQL
public class PostgreSQLDatabaseFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return new PostgreSQLConnection();
    }

    @Override
    public Command createCommand() {
        return new PostgreSQLCommand();
    }
}

