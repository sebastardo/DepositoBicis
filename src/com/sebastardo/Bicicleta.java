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
    private int peso;
    private boolean tieneLuz;

    public Bicicleta(int rodado, int centimetros, String marca, List<Accesorio> accesorios) {
        this.rodado = rodado;
        this.centimetros = centimetros;
        this.marca = marca;
        this.accesorios = accesorios;
        
        this.altura = rodado*2.5+15;
        this.velocidadCrucero = (altura > 120) ? this.rodado + 6 : this.rodado + 2;
        
        // TODO:
        // peso: es la suma de rodado / 2 más el peso total de los accesorios. -> sumar el peso de todos con un stream. ej: compras.stream().mapToDouble(c->c.getPrecio()).sum();
        // tieneLuz: es verdadero si al menos uno de los accesorios es luminoso. -> EJ: compras.stream().anyMatch(c-> c.isComida());
        
        
        // Se deben contemplar los siguientes accesorios //
        //
        // Farolito: pesa 0.5 kg, no lleva carga (o sea, lleva 0 kg de carga), es luminoso.
        // Canasto: de cada canasto se informa el volumen. El peso se calcula como volumen / 10, la carga como volumen * 2. No es luminoso.
        // Morral de bici: para cada uno se informa el largo (en centímetros), y si tiene ojo de gato o no. El peso es fijo, 1.2 kg. 
        // La carga se calcula como largo / 3. Es luminoso si tiene ojo de gato.
    }
    
    
}
