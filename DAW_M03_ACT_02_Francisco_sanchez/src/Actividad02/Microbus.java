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
public class Microbus extends Coche{
    
    //atributos
    private static double suplementoAlquilerMicrobus = 2;
    
    public Microbus(String matricula, int diasAlquiler, int numeroPlazas) {
        super(matricula, diasAlquiler, numeroPlazas);
    }
    
    // metodos

    public double costeAlquilerMicrobus() {
        double costeAlquilerMicrobus;
        costeAlquilerMicrobus = alquilerBase() + (getNumeroPlazas() * suplementoAlquilerMicrobus);
        return costeAlquilerMicrobus;
    }
    
    public String toString() {
        String cadena = "\nMatricula: " + this.matricula;
        cadena += "\nDias de alquiler: " + this.diasAlquiler;
        cadena += "\nNúmero de plazas: " + this.numeroPlazas;
        cadena += "\nCoste del alquiler: " + costeAlquilerMicrobus() + "€";
        cadena += "\n------------------------------------------\n\n";

        return cadena;
    }
    
    
    
}
