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
// Builder Concreto para Casa de Madera
public class WoodenHouseBuilder implements HouseBuilder {
    private House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Wooden foundation");
        System.out.println("Building wooden foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Wooden structure");
        System.out.println("Building wooden structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Wooden roof");
        System.out.println("Building wooden roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Wooden interior");
        System.out.println("Building wooden interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}