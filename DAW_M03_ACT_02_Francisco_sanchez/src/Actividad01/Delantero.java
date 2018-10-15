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
public class Delantero extends Jugador{
    
    // atributos de la clase
    private static int golesTotales = 0; // varible estática para almacenar
    private static String posicion = "Portero";

    // atributos de instancia
    private int goles = 0;

    // construtor de la clase
    
    public Delantero(String nombre, int dorsal, String equipo, int goles) {
        super(nombre, dorsal, equipo);
        this.goles = goles;
        this.golesTotales += goles;
    }
    
    // getters y setter
    void setGoles (int goles){
        this.goles = goles;
        this.golesTotales += goles;
    }
    
    // métodos de la clase
    public int getGolesTotales() {
        return this.golesTotales;
    }
    
    
}
