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
public class Camion extends VehiculoCarga{

//atributos
private double precioFijo = 40;

//constructor
public Camion(int PMA, String matricula) {
    super(PMA, matricula);
}

//metodos
@Override
public double calcularPrecioAlquiler(int dias) {
    
    return ((50.0 * dias) + ((precioPorTonelada * PMA) / 10)) + precioFijo;

} 

}
