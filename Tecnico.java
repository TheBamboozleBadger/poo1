/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipofutbol.model;

/**
 *
 * @author damia
 */
public class Tecnico extends Persona{
    
    private int experiencia;
    private boolean esNacional;

    public Tecnico(int experiencia, boolean esNacional, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.experiencia = experiencia;
        this.esNacional = esNacional;
    }
}
