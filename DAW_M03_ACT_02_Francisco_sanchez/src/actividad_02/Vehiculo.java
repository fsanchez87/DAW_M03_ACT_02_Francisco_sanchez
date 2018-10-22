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
public abstract class Vehiculo {
    
    // atributos
    protected String matricula;
    
    //constructor
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    
    //geter y setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    /**
     *
     * @param dias
     * @return
     */
    public abstract double calcularPrecioAlquiler (int dias);
    
    
}
