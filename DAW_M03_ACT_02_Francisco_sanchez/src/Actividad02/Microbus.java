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
public class Microbus extends Coche {

    //atributos
    private String tipoVehiculo = "Microbus";
    private static final double suplementoAlquilerMicrobus = 2;

    public Microbus(String matricula, String tipoVehiculo, int numeroPlazas) {
        super(matricula, tipoVehiculo, numeroPlazas);
    }

    // metodos
    public double costeAlquilerMicrobus() {
        double costeAlquilerMicrobus;
        costeAlquilerMicrobus = alquilerBase() + (getNumeroPlazas() * suplementoAlquilerMicrobus);
        return costeAlquilerMicrobus;
    }

    public String toString() {
        String cadena = "\nMatricula: " + this.matricula;
        cadena += "\nTipo de vehículo: " + this.tipoVehiculo;
        cadena += "\nDias de alquiler: " + this.diasAlquiler;
        cadena += "\nNúmero de plazas: " + this.numeroPlazas;
        cadena += "\nCoste del alquiler: " + costeAlquilerMicrobus() + "€";
        cadena += "\n------------------------------------------\n";

        return cadena;
    }

}
