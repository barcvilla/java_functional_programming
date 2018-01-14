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
public class DonutShop {
    public static Donut buyDonut(CreditCard creditCard)
    {
        Donut donut = new Donut();
        creditCard.charge(Donut.PRICE); //aqui el cobro de la tarjet es un efecto secundario
        return donut;
    }
}
