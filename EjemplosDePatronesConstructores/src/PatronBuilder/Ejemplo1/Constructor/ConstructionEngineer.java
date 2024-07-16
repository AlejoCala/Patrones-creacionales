/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuilder.Ejemplo1.Constructor;

import PatronBuilder.Ejemplo1.Builder.HouseBuilder;
import PatronBuilder.Ejemplo1.DTO.House;

/**
 *
 * @author Pc-Smart
 */
public class ConstructionEngineer {
    private HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        this.houseBuilder.buildFoundation();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
        return this.houseBuilder.getHouse();
    }
}
