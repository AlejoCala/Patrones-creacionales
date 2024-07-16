/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronBuilder.Ejemplo1.Builder;

import PatronBuilder.Ejemplo1.DTO.House;

/**
 *
 * @author Pc-Smart
 */
// Builder Concreto para Casa de Ladrillo
public class BrickHouseBuilder implements HouseBuilder {
    private House house;

    public BrickHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Concrete foundation");
        System.out.println("Building concrete foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Brick structure");
        System.out.println("Building brick structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Concrete roof");
        System.out.println("Building concrete roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Brick interior");
        System.out.println("Building brick interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
