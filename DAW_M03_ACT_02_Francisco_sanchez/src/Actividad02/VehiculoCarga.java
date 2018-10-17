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
public class VehiculoCarga extends Vehiculo {

    //atributos
    private String tipoVehiculo = "Vehículo de carga";
    private static final int suplementoAlquilerVehiculoCarga = 20;
    protected int pma; //peso máximo autorizado

    // constructor
    public VehiculoCarga(String matricula, String tipoVehiculo, int pma) {
        super(matricula, tipoVehiculo);
        this.pma = pma;
    }

    int getPma() {
        return this.pma;
    }

    void setPma(int pma) {
        this.pma = pma;
    }

    // metodos
    public double costeAlquilarVehiculoCarga() {
        double costeAlquilarVehiculoCarga;
        costeAlquilarVehiculoCarga = (alquilerBase() + ((suplementoAlquilerVehiculoCarga * pma) / 10));
        return costeAlquilarVehiculoCarga;
    }

    @Override
    public String toString() {
        String cadena = "\nMatricula: " + this.matricula;
        cadena += "\nTipo de vehículo: " + this.tipoVehiculo;
        cadena += "\nDias de alquiler: " + this.diasAlquiler;
        cadena += "\nPma: " + this.pma;
        cadena += "\nCoste del alquiler: " + costeAlquilarVehiculoCarga() + "€";
        cadena += "\n------------------------------------------\n";

        return cadena;
    }

}
