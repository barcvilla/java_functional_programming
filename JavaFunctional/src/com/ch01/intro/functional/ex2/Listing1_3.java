package com.ch01.intro.functional.ex2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barcvilla
 */
public class Listing1_3 
{
    public static void log(String m)
    {
        System.out.println(m);
    }
    
    public static int mult(int a, int b)
    {
        return a * b;
    }
    
    public static int add(int a, int b)
    {
        log(String.format("Returning %s as the result of %s + %s", a + b, a, b));
        return a + b;
    }
    
    public static void main(String[] args) 
    {
        int x = add(mult(2,3), mult(4, 5));
    }
}
