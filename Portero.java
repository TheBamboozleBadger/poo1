/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipofutbol.model;

/**
 *
 * @author pc
 */
public class Portero extends Jugador{
    
    private int golesRecibidos;

    public Portero(int golesRecibidos, boolean esTitular, String nombre, String apellido, int edad) {
        super(esTitular, nombre, apellido, edad);
        this.golesRecibidos = golesRecibidos;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    
    
    
    
}
