/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercadooo.model;

/**
 *
 * @author gleip
 */
public class Refrigerante extends ItemTaxavel{
    
    public Refrigerante(double valor) {
        super("Refrigente", valor);
    }

    @Override
    public double taxa() {
        return 0.15;
    }
    
}
