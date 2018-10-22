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
public class Coche extends VehiculoPasajeros{
    
    //atributos
    private double precioPorPlaza = 1.5;

    public Coche(String matricula, int plazas) {
        super(matricula, plazas);
    }
    
    @Override
    public double calcularPrecioAlquiler(int dias) {
        
        return 50 * dias + plazas * precioPorPlaza;

    }
    
}
