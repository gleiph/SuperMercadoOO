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
public class Bala extends ItemTaxavel{
    
    public Bala(double valor) {
        super("Bala", valor);
    }

    @Override
    protected double taxa() {
        return 0.2;
    }
    
    
}
