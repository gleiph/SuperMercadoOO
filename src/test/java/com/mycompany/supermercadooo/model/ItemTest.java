/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.supermercadooo.model;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author gleip
 */
public class ItemTest {

    
    
    @Test
    public void testChocolateCorreto() {

        Item item = new Item("Chocolate", 10);
        Assert.assertEquals(11.0, item.total(), 0.0);
    }

    @Test
    public void testChocolateIncorreto() {

        Item item = new Item("Chocolate", 10);
        Assert.assertNotEquals(12.0, item.total(), 0.0);
    }

    @Test
    public void testBalaCorreto() {

        Item item = new Item("Bala", 10);
        Assert.assertEquals(12.0, item.total(), 0.0);
    }

    @Test
    public void testBalaIncorreto() {

        Item item = new Item("Bala", 10);
        Assert.assertNotEquals(13.0, item.total(), 0.0);
    }
    
    @Test
    public void testRefrigeranteCorreto() {

        Item item = new Item("Refrigerante", 10);
        Assert.assertEquals(11.5, item.total(), 0.0);
    }

    @Test
    public void testRefrigeranteIncorreto() {

        Item item = new Item("Refrigerante", 10);
        Assert.assertNotEquals(12.5, item.total(), 0.0);
    }
    
    @Test
    public void testCervejaCorreto() {

        Item item = new Item("Cerveja", 10);
        Assert.assertEquals(10.5, item.total(), 0.0);
    }

    @Test
    public void testCervejaIncorreto() {

        Item item = new Item("Cerveja", 10);
        Assert.assertNotEquals(12.0, item.total(), 0.0);
    }
    
     @Test
    public void testAguaCorreto() {

        Item item = new Item("Agua", 10);
        Assert.assertEquals(10, item.total(), 0.0);
    }

    @Test
    public void testAguaIncorreto() {

        Item item = new Item("Agua", 10);
        Assert.assertNotEquals(12.0, item.total(), 0.0);
    }
    
    @Test
    public void testProdutoInexistente(){
        Item item = new Item("Nada", 10);
        Assert.assertEquals(0, item.total(), 0.0);
    }
}
