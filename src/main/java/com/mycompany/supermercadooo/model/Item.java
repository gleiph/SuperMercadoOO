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
//Chocolate, Bala, Refrigerante, Cerveja e Agua
public abstract class Item {

    protected double valor;

    public Item(double valor) {
       this.valor = valor;
    }

    protected abstract double total(); 
}
