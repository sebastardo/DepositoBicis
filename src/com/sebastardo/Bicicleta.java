/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebastardo;

import java.util.List;

/**
 *
 * @author Sebastian
 */
public class Bicicleta {

    private int rodado;
    private int centimetros;
    private String marca;
    // TODO: crear objeto Accesorio
    private List<Accesorio> accesorios;
    
    private double altura;
    private int velocidadCrucero;
    private int carga;
    private double peso;
    private boolean tieneLuz;

    public Bicicleta(int rodado, int centimetros, String marca, List<Accesorio> accesorios) {
        this.rodado = rodado;
        this.centimetros = centimetros;
        this.marca = marca;
        this.accesorios = accesorios;
        
        this.altura = rodado * 2.5+15;
        this.velocidadCrucero = (altura > 120) ? this.rodado + 6 : this.rodado + 2;
        
        this.peso = (rodado / 2) + accesorios.stream().mapToDouble(a->a.getPeso()).sum();
        
        this.tieneLuz = accesorios.stream().anyMatch(a->a.isLuminoso());
    }
    
    
}
