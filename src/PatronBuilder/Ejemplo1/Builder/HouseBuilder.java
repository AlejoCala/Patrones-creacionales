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
// Interfaz de Builder
public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getHouse();
}
