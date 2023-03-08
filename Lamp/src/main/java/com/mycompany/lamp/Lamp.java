/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lamp;

/**
 *
 * @author ASUS
 */
public class Lamp {

    boolean nyala = false;

    public void hidupkan() {
        nyala = true;
        System.out.println("True");
    }

    public void matikan() {
        nyala = false;
        System.out.println("False");
    }
}
