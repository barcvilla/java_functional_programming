/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch01.intro.nofunctional.ex1;

/**
 *
 * @author barcvilla
 */
public class CreditCard {
    private int total;
    
    public int getTotal()
    {
        return total;
    }
    
    public void charge(int price)
    {
        this.total = this.total + price;
    }
}
