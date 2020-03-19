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
public class Morral extends Accesorio{
    // Morral de bici: para cada uno se informa el largo (en centímetros), y si tiene ojo de gato o no. El peso es fijo, 1.2 kg
    // La carga se calcula como largo / 3. Es luminoso si tiene ojo de gato.
    
    public Morral(double carga,double largo, boolean ojoDeGato) {
        super(1.2, largo/3, ojoDeGato);
    }
    
}
