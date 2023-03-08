package com.mycompany.speda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class AksiSpeda {
    public static void main(String[] args){
        Speda sepedaBalap = new Speda(2,"balap","poligon");
        int gearSepeda = sepedaBalap.gear;
        System.out.println(gearSepeda);
        sepedaBalap.ngerem();
    }
       
}
