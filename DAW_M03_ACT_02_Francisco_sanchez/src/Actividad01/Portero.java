/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad01;

/**
 *
 * @author fsanchez
 */
public class Portero extends Jugador{
    
    // atributos de la clase
    private static int paradasTotales = 0; // varible estática para almacenar
    private static final String posicion = "Portero";
    
    // atributos de instancia
    private int paradas = 0;
    
    // construtor de la clase
    public Portero(String nombre, int dorsal, String equipo, int paradas) {
        super(nombre, dorsal, equipo);
        this.paradas = paradas; 
        Portero.paradasTotales += paradas;
    }
    
    // getter y setter    
    void setParadas(int paradas){
        this.paradas = paradas;
        Portero.paradasTotales += paradas;
    }
    
    // métodos de la clase
    public int getParadasTotales(){
        return Portero.paradasTotales;
    }

    @Override
    public String toString() {
        String cadena = "\nNombre: " + this.nombre;
        cadena += "\nDorsal: " + this.dorsal;
        cadena += "\nEquipo: " + this.equipo;
        cadena += "\nPosicioón: " + Portero.posicion;
        cadena += "\nParadas totales: " + Portero.paradasTotales;        
        cadena += "\n------------------------------------------\n\n";

        return cadena; 
    }
    
    

    
}
