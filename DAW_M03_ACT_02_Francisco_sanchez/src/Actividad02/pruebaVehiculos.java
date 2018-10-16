/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad02;

/**
 *
 * @author fsanchez
 */
public class pruebaVehiculos {
    public static void main(String[] args) {
        
        Coche c1 = new Coche("5836GNW", 7, 5);
        
        System.out.println(c1.toString());
        System.out.println(c1.diasAlquiler);
        System.out.println(c1.alquilerBase());
    }
    
}
