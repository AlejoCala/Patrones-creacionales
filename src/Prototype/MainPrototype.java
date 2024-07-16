/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import Prototype.Figures.Circle;
import Prototype.Figures.Rectangle;
import Prototype.Interface.Shape;

/**
 *
 * @author Pc-Smart
 * Prototype permite clonar objetos complejos sin necesidad de saber sus clases exactas, 
 * facilitando la creación de nuevos objetos basados en prototipos existentes.
 */
public class MainPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear prototipos
        Circle circlePrototype = new Circle(10);
        Rectangle rectanglePrototype = new Rectangle(20, 30);

        // Clonar prototipos
        Shape clonedCircle = circlePrototype.clone();
        Shape clonedRectangle = rectanglePrototype.clone();

        // Dibujar las figuras clonadas
        clonedCircle.draw();
        clonedRectangle.draw();
    }
    
}
