/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lamp;

/**
 *
 * @author ASUS
 */
public class MainLamp {
     public static void main(String[] args) {
        Lamp lampuKamar = new Lamp();
    
        // Nyalakan lampu kamar
        System.out.println("Apakah Lampu Menyala?");
        lampuKamar.hidupkan();
    
        // Matikan lampu kamar
        System.out.println("Apakah Lampu Menyala?");
        lampuKamar.matikan();
    }

}
