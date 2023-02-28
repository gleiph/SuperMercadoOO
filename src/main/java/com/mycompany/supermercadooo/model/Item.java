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
public class Item {

    private String nome;
    private double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double total() {

        if (this.nome.equals("Chocolate")) {
            return this.valor * (1 + 0.1);
        } else if (this.nome.equals("Bala")) {
            return this.valor * (1 + 0.2);
        } else if (this.nome.equals("Refrigerante")) {
            return this.valor * (1 + 0.15);
        } else if (this.nome.equals("Cerveja")) {
            return this.valor * (1 + 0.05);
        } else if (this.nome.equals("Cafe")) {
            return this.valor * (1 + 0.25);
        } else if (this.nome.equals("Agua")) {
            return this.valor;
        } else {
            return 0;
        }

    }

}
