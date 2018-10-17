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
class Coche extends Vehiculo {

    // atributos
    public String tipoVehiculo = "Coche";
    private static final double suplementoAlquilerCoche = 1.5;
    protected int numeroPlazas;

    public Coche(String matricula, String tipoVehiculo, int numeroPlazas) {
        super(matricula, tipoVehiculo);
        this.numeroPlazas = numeroPlazas;
    }

    //getter y setter
    int getNumeroPlazas() {
        return this.numeroPlazas;
    }

    void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    
    void setTipoVehiculo(String tipoVehiculo){
        this.tipoVehiculo = tipoVehiculo;
    }
    
    //métodos
    public double costeAlquilerCoche() {
        double costeAlquilarcoche;
        costeAlquilarcoche = alquilerBase() + (getNumeroPlazas() * suplementoAlquilerCoche);
        return costeAlquilarcoche;

    }

    @Override
    public String toString() {
        String cadena = "\nMatricula: " + this.matricula;
        cadena += "\nTipo de vehículo: " + this.tipoVehiculo;
        cadena += "\nDias de alquiler: " + this.diasAlquiler;
        cadena += "\nNúmero de plazas: " + this.numeroPlazas;
        cadena += "\nCoste del alquiler: " + costeAlquilerCoche() + "€";
        cadena += "\n------------------------------------------\n";

        return cadena;
    }

}
