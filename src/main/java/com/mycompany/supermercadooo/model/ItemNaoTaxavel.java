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
public class ItemNaoTaxavel extends Item{
    
    public ItemNaoTaxavel(double valor) {
        super(valor);
    }

    @Override
    public double total() {
        return super.valor;
    }
    
    
    
}
