/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.Figures;

import Prototype.Interface.Shape;

/**
 *
 * @author Pc-Smart
 */
// Prototipo Concreto: Rectángulo
public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.width, this.height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width " + width + " and height " + height);
    }
}
