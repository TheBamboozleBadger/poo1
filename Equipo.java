/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equipofutbol.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class Equipo {
    
    private String nombre;
    private String pais;
    private Mascota mascota;
    private Portero portero;
    private List<Delantero> delanteros;
    private List<Defensa> defensas;
    private List<Mediocampista> mediocampistas;
    

    public Equipo(String nombre, String pais, String nombreM, String especie, String aspecto) {
        this.nombre = nombre;
        this.pais = pais;
        this.mascota = new Mascota(nombreM, especie, aspecto);
        this.portero = null;
        this.delanteros = new ArrayList<>();
        this.defensas = new ArrayList<>(); 
        this.mediocampistas = new ArrayList<>();
        
    }
    public boolean setPortero(Portero portero) {
        if (this.portero == null) {
            this.portero = portero;
            return true;
        }
        return false;
    }
    public boolean inscribirDefensa(Defensa defensa) {
        if (this.defensas.size() < 4) { 
            this.defensas.add(defensa);
            return true;
        }
        return false;
    }

    public boolean inscribirMediocampista(Mediocampista mediocampista) {
        if (this.mediocampistas.size() < 4) { 
            this.mediocampistas.add(mediocampista);
            return true;
        }
        return false;
    }

    public boolean inscribirDelantero(Delantero delantero) {
        if (this.delanteros.size() < 2) { 
            this.delanteros.add(delantero);
            return true;
        }
        return false;
    }
    
    public boolean tiene11Jugadores() {
        int totalJugadores = 0;
        if (portero != null) totalJugadores += 1;
        totalJugadores += defensas.size();
        totalJugadores += mediocampistas.size();
        totalJugadores += delanteros.size();
        
        return totalJugadores == 11;
    }
    
    
    public void imprimir() {
        System.out.println("==================================");
        System.out.println("EQUIPO: " + nombre + " (" + pais + ")");
        System.out.println("Mascota: " + mascota.getNombre());
        
        if (tiene11Jugadores()) {
            System.out.println("ESTADO: !Equipo completo y validado con 11 jugadores!");
        } else {
            System.out.println("ESTADO: Equipo incompleto. Faltan jugadores.");
        }
        
        System.out.println("Portero: " + (portero != null ? "1/1" : "0/1"));
        System.out.println("Defensas: " + defensas.size() + "/4");
        System.out.println("Mediocampistas: " + mediocampistas.size() + "/4");
        System.out.println("Delanteros: " + delanteros.size() + "/2");
        System.out.println("==================================");
    }
}
