/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryMethod.Ejemplo2;

import AbstractFactoryMethod.Ejemplo2.Connection.MySQLDatabaseFactory;
import AbstractFactoryMethod.Ejemplo2.Connection.PostgreSQLDatabaseFactory;
import AbstractFactoryMethod.Ejemplo2.Interface.DatabaseFactory;

/**
 *
 * @author Pc-Smart
 * Abstract Factory permite crear familias de objetos relacionados sin especificar sus clases concretas, 
 * facilitando la creación de productos que funcionan bien juntos y promoviendo la consistencia en las interfaces.
 */
public class MainFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseApplication app;
        DatabaseFactory factory;

        // Conectar y ejecutar comandos en MySQL
        factory = new MySQLDatabaseFactory();
        app = new DatabaseApplication(factory);
        app.connectAndExecute();

        // Conectar y ejecutar comandos en PostgreSQL
        factory = new PostgreSQLDatabaseFactory();
        app = new DatabaseApplication(factory);
        app.connectAndExecute();
    }
    
}
