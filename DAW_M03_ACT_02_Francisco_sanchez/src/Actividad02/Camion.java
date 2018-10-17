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
public class Camion extends VehiculoCarga{
    // atributos
    private String tipoVehiculo = "Camion";
    private static final int suplementoAlquilerCamion = 40;
    
    public Camion(String matricula,String tipoVehiculo, int pma) {
        super(matricula, tipoVehiculo, pma);
    }
    
    // métodos
    public double costeAlquilerCamion(){
        double costeAlquilarCamion = costeAlquilarVehiculoCarga() + suplementoAlquilerCamion;
        return costeAlquilarCamion;
    }
    
     @Override
    public String toString() {
        String cadena = "\nMatricula: " + this.matricula;
        cadena += "\nTipo de vehículo: " + this.tipoVehiculo;
        cadena += "\nDias de alquiler: " + this.diasAlquiler;
        cadena += "\nPma: " + this.pma;
        cadena += "\nCoste del alquiler: " + costeAlquilerCamion()+ "€";
        cadena += "\n------------------------------------------\n";

        return cadena;
    }
}
