/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch01.intro.functional.ex1;

/**
 * 
 * @author barcvilla
 */
public class Purchase {
   public Donut donut;
   public Payment payment;
   
   public Purchase(Donut donut, Payment payment)
   {
       this.donut = donut;
       this.payment = payment;
   }
}
