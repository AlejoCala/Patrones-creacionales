/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype.Interface;

/**
 *
 * @author Pc-Smart
 */
// Interfaz de Prototipo
public interface Shape extends Cloneable {
    Shape clone();
    void draw();
}
