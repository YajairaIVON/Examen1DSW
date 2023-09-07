/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.empresabotanical.modelo.entidades;

import udem.edu.co.empresabotanical.modelo.abstractas.Fruta;

/**
 *
 * @author b12s309
 */
public class Mora extends Fruta{
    
      // atributos
    private String nombre;
    private String color;
    private int edad;

    @Override
    public String toString() {
        return "Mora{" + "nombre=" + nombre + ", color=" + color + ", edad=" + edad + '}';
    }

    //Constructor
    public Mora(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }
    
}