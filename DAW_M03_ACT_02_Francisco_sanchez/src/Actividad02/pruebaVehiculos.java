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
        System.out.println("\n\n A L Q U I L E R");
        System.out.println("====================");
        System.out.println("Listado de vehículos: ");

        for (int i = 0; i < vehiculos.length; i++) {
            String cadena = "\nTipo de Vehículo: " + vehiculos[i].getTipoVehiculo();
            cadena += "\nMatrícula: " + vehiculos[i].getMatricula();
            cadena += "\n---------------------------";

            System.out.println(cadena);
        }
        int x = 0;
        int consulta = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nIntroduzca la matrícula del vehículo que quiere alquilar: ");
        String selccion = sc.nextLine();
        String seleccionMatricula = selccion.toUpperCase();

        for (int i = 0; i < vehiculos.length; i++) {
            if (seleccionMatricula.equals(vehiculos[i].getMatricula())) {
                x = 1;
                consulta = i;
                break;
            } else {
                x = 0;

            }
        }

        if (x == 1) {

            if ("Coche".equals(vehiculos[consulta].getTipoVehiculo())) {

                System.out.println("\nHa elegido un " + vehiculos[consulta].getTipoVehiculo());
                System.out.println("\n¿Cuantos días quiere alguilarlo?");
                int dias = sc.nextInt();
                
                vehiculos[consulta].setDiasAlquiler(dias);

                System.out.println("\nEl coste de alquiler es: " + vehiculos[consulta]);

            }

        } else if (x == 0) {
            System.out.println("Error");

        }

    }

}
