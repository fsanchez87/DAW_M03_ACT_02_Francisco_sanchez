/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad02;

import java.util.Scanner;

/**
 *
 * @author fsanchez
 */
public class pruebaVehiculos {

    public static void main(String[] args) {

        //Creamos el array de 5 posiciones
        Vehiculo[] vehiculos = new Vehiculo[4];

        //Creamos los vehículos
        vehiculos[0] = new Coche("5836DFD", "Coche", 7);
        vehiculos[1] = new Microbus("4786OHYD", "Microbus", 12);
        vehiculos[2] = new VehiculoCarga("1547JHG", "Vehículo de carga", 15);
        vehiculos[3] = new Camion("5235REY", "Camion", 20);
       
        // Creamos el Menú
        Scanner sc = new Scanner(System.in);
        
        do {  
            System.out.println("\n\n A L Q U I L E R");
            System.out.println("====================");
            System.out.println("Listado de vehículos: ");
            
            for (int i = 0; i < vehiculos.length; i++) {
                String cadena = "\nTipo de Vehículo: " + vehiculos[i].getTipoVehiculo();
                cadena += "\nMatrícula: " + vehiculos[i].getMatricula();
                cadena += "\n---------------------------";
                
                System.out.println(cadena);
            }

            System.out.print("\nIntroduzca la matrícula del vehículo que quiere alquilar: ");
            String opcion = sc.nextLine();
            
        } while (true);
    }

}
