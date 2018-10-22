/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02;

import java.util.Scanner;


public class pruebaVehiculos {

    public static void main(String[] args) {

       // creamos el array de 5 posiciones 
       Vehiculo[] vehiculos = new Vehiculo[4];
       
       // creamos los vehículos
       vehiculos[0] = new Coche("1234ASD", 5);
       vehiculos[1] = new Microbus("2364ZXC", 12);
       vehiculos[2] = new VehiculoCarga(7,"7894QWE");
       vehiculos[3] = new Camion(4000, "9874SDF");
       
       
       //menu
       Scanner sc = new Scanner(System.in);
       
        System.out.println("\n\n A L Q U I L E R");
        System.out.println("====================");
        System.out.println("Listado de vehículos: ");
        
        for (int i = 0; i < vehiculos.length; i++) {
            String cadena = "\nMatrícula: " + vehiculos[i].getMatricula();
            cadena += "\n---------------------";

            System.out.println(cadena);
        }
        
        System.out.print("\nIntroduzca la matrícula del vehículo que quiere alquilar: ");
        String codigoMatricula = sc.nextLine();
        
        
        int i = -1;
        String codigo = " ";
        do {
            i++;
            if (i < vehiculos.length) {
                codigo = vehiculos[i].getMatricula();
            }
        } while (!(codigo.equals(codigoMatricula)) && (i < vehiculos.length));
        
        System.out.print("\nIntroduzca los días que quiere alquilar: ");
        int diasAlquiler = sc.nextInt();
        
        System.out.println("El coste de alquiler es: " + vehiculos[i].calcularPrecioAlquiler(diasAlquiler) + " €");
    }   

}
