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
public class ItemTaxavel extends Item{
    
    public ItemTaxavel(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double total() {
        return super.valor * (1 + taxa()); 
    }
    
    protected double taxa(){
        return 0;
    }
    
}
