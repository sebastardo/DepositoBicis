/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastardo;

/**
 *
 * @author User
 */
public class Accesorio {
    // Se deben contemplar los siguientes accesorios //
    //
    
    private double peso;
    private double carga;
    private boolean luminoso;

    public Accesorio(double peso, double carga, boolean luminoso) {
        this.peso = peso;
        this.carga = carga;
        this.luminoso = luminoso;
    }

    public double getPeso() {
        return peso;
    }

    public double getCarga() {
        return carga;
    }

    public boolean isLuminoso() {
        return luminoso;
    }
    
    
    
}
