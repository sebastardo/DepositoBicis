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
public class Canasto extends Accesorio {
    // Canasto: de cada canasto se informa el volumen. El peso se calcula como volumen / 10, la carga como volumen * 2. No es luminoso.

    public Canasto(double volumen) {
        
        super(volumen/10, volumen*2, false);
    }
    
}
