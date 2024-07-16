/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuilder.Ejemplo1;

import PatronBuilder.Ejemplo1.Builder.BrickHouseBuilder;
import PatronBuilder.Ejemplo1.Builder.HouseBuilder;
import PatronBuilder.Ejemplo1.Builder.WoodenHouseBuilder;
import PatronBuilder.Ejemplo1.Constructor.ConstructionEngineer;
import PatronBuilder.Ejemplo1.DTO.House;

/**
 *
 * @author Pc-Smart
 * permite la construcción paso a paso de objetos complejos y 
 * cómo diferentes Builders concretos pueden construir diferentes 
 * tipos de objetos utilizando el mismo proceso de construcción.
 */
public class MainExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        ConstructionEngineer engineer1 = new ConstructionEngineer(woodenHouseBuilder);
        House woodenHouse = engineer1.constructHouse();
        System.out.println("House is: " + woodenHouse);

        HouseBuilder brickHouseBuilder = new BrickHouseBuilder();
        ConstructionEngineer engineer2 = new ConstructionEngineer(brickHouseBuilder);
        House brickHouse = engineer2.constructHouse();
        System.out.println("House is: " + brickHouse);
    }
    
}
