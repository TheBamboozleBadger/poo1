/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipofutbol.model;

/**
 *
 * @author pc
 */
public class Jugador extends Persona{
    
    private boolean esTitular;

    public Jugador(boolean esTitular, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.esTitular = esTitular;
    }
    
    
    
}
