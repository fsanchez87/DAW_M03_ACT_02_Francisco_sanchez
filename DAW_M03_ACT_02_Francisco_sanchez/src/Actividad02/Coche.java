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
class Coche extends Vehiculo{
    
    // atributos
    private static final String tipoVehiculo = "Coche";
    private static final double suplementoAlquilerCoche = 1.5;
    protected int numeroPlazas;

    public Coche(String matricula, int diasAlquiler, int numeroPlazas) {
        super(matricula, diasAlquiler);
        this.numeroPlazas = numeroPlazas;
    }
    
    //getter y setter
    int getNumeroPlazas(){
        return this.numeroPlazas;
    }
    
    void setNumeroPlazas(int numeroPlazas){
        this.numeroPlazas = numeroPlazas;
    }
    
    //métodos
    public double costeAlquilerCoche(){
        double costeAlquilarcoche;
        costeAlquilarcoche = alquilerBase() + (getNumeroPlazas()*suplementoAlquilerCoche);
        return costeAlquilarcoche;
        
    }
    @Override
    public String toString() {
        String cadena = "\nMatricula: " + Coche.matricula;
        cadena += "\nDias de alquiler: " + this.diasAlquiler;
        cadena += "\nNúmero de plazas: " + this.numeroPlazas;
        cadena += "\nCoste del alquiler: " + costeAlquilerCoche() + "€";
        cadena += "\n------------------------------------------\n\n";

        return cadena;
    }    
    
    
    
}
