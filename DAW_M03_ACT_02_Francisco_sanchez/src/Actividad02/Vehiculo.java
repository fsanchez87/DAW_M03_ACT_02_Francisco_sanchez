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
public abstract class Vehiculo {

    //atributos
    protected static String matricula = "0000XXXX";
    protected static int precioBase = 50;
    protected int diasAlquiler = 0;

    //constructor
    public Vehiculo(String matricula, int diasAlquiler) {
        this.matricula = matricula;
        this.diasAlquiler = diasAlquiler;
    }

    // getter y setter
    String getMatricula() {
        return this.matricula;
    }

    void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    int getDiasAlquiler() {
        return this.diasAlquiler;
    }

    void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    
    int getPrecioBase(){
        return this.precioBase;
    }

    // metodos
    
    // calcula el coste de alquiler básico
    public double alquilerBase(){
        double costeBase;
        costeBase = diasAlquiler * precioBase;
        return costeBase;
    }
    
    @Override
    public String toString() {
        String cadena = "\nMatricula: " + this.matricula;
        cadena += "\nDias de alquilerl: " + this.diasAlquiler;
        cadena += "\n------------------------------------------\n\n";

        return cadena;
    }

}
