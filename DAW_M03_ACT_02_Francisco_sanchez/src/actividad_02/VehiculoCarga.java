/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02;

/**
 *
 * @author fsanc
 */
public class VehiculoCarga extends Vehiculo {

    //atributos
    protected int PMA;
    protected double precioPorTonelada = 20;

    //constructor
    public VehiculoCarga(int PMA, String matricula) {
        super(matricula);
        this.PMA = PMA;
    }

    @Override
    public double calcularPrecioAlquiler(int dias) {
        
        return ((50.0 * dias) + ((precioPorTonelada * PMA) / 10));

    }

}
