/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipofutbol.model;

/**
 *
 * @author damia
 */
public class Mediocampista extends Jugador{
    
    private int asistencias;
    
    public Mediocampista(int asistencias, boolean esTitular, String nombre, String apellido, int edad) {
        super(esTitular, nombre, apellido, edad);
        this.asistencias = asistencias;
        
    }

    public int getAsistencias() {
        return asistencias;
    }
    
}
