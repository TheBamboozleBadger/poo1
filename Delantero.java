/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipofutbol.model;

/**
 *
 * @author pc
 */
public class Delantero extends Jugador{
    
    private int golesAnotados;

    public Delantero(int golesAnotados, boolean esTitular, String nombre, String apellido, int edad) {
        super(esTitular, nombre, apellido, edad);
        this.golesAnotados = golesAnotados;
    }

    public int getGolesAnotados() {
        return golesAnotados;
    }
    
    
    
}
