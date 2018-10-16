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
    private static final String posicion = "Delantero"; // posición stática

    // atributos de instancia
    private static int golesTotales = 0; // contador para almacenar goles
    private int goles = 0;

    // construtor de la clase
    public Delantero(String nombre, int dorsal, String equipo, int goles) {
        super(nombre, dorsal, equipo);
        this.goles = goles;
        Delantero.golesTotales += goles; // añade goles al contador
    }

    // getter y setter    
    void setGoles(int goles) {
        this.goles = goles;
        Delantero.golesTotales += goles;
    }

    // métodos de la clase //////////
    // muestras las goles totales
    public int getGolesTotales() {
        return Delantero.golesTotales;
    }

    @Override
    public String toString() {
        String cadena = "\nNombre: " + this.nombre;
        cadena += "\nDorsal: " + this.dorsal;
        cadena += "\nEquipo: " + this.equipo;
        cadena += "\nPosición: " + Delantero.posicion;
        cadena += "\nGoles totales: " + Delantero.golesTotales;
        cadena += "\n------------------------------------------\n";

        return cadena;
    }

}
