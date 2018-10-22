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
public abstract class VehiculoPasajeros extends Vehiculo {

    //atributos
    protected int plazas;

    //constructor
    public VehiculoPasajeros(String matricula, int plazas) {
        super(matricula);
        this.plazas = plazas;
    }

    //getter y setter
    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    //metodos
    @Override
    public double calcularPrecioAlquiler(int dias) {

        return 50 * dias;

    }
}
