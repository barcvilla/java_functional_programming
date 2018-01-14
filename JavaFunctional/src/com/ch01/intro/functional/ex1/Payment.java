/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch01.intro.functional.ex1;

/**
 * Clase para representar el pago
 * @author barcvilla
 */
public class Payment 
{
    public final CreditCard creditCard;
    public final int amount;
    
    public Payment(CreditCard creditCard, int amount)
    {
        this.creditCard = creditCard;
        this.amount = amount;
    }
}
