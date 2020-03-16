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
    // Farolito: pesa 0.5 kg, no lleva carga (o sea, lleva 0 kg de carga), es luminoso.
    // Canasto: de cada canasto se informa el volumen. El peso se calcula como volumen / 10, la carga como volumen * 2. No es luminoso.
    // Morral de bici: para cada uno se informa el largo (en centímetros), y si tiene ojo de gato o no. El peso es fijo, 1.2 kg. 
    // La carga se calcula como largo / 3. Es luminoso si tiene ojo de gato.
    private int peso;
    private int carga;
    private boolean luminoso;

    public Accesorio(int peso, int carga, boolean luminoso) {
        this.peso = peso;
        this.carga = carga;
        this.luminoso = luminoso;
    }

    public int getPeso() {
        return peso;
    }

    public int getCarga() {
        return carga;
    }

    public boolean isLuminoso() {
        return luminoso;
    }
    
    
    
}
