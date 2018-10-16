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
public class Defensa extends Jugador{
    
    // atributos de la clase
    private static final String posicion = "Defensa"; // posición stática

    // atributos de instancia
    private static int recuperacionesTotales = 0; // contador para almacenar recuperaciones
    private int recuperaciones = 0;

    // construtor de la clase
    public Defensa(String nombre, int dorsal, String equipo, int recuperaciones) {
        super(nombre, dorsal, equipo);
        this.recuperaciones = recuperaciones;
        Defensa.recuperacionesTotales += recuperaciones; // añade recuperaciones al contador
    }

    // getter y setter    
    void setRecuperaciones(int recuperaciones) {
        this.recuperaciones = recuperaciones;
        Defensa.recuperacionesTotales += recuperaciones;
    }

    // métodos de la clase //////////
    // muestras las recuperaciones totales
    public int getRecuperaciones() {
        return Defensa.recuperacionesTotales;
    }

    @Override
    public String toString() {
        String cadena = "\nNombre: " + this.nombre;
        cadena += "\nDorsal: " + this.dorsal;
        cadena += "\nEquipo: " + this.equipo;
        cadena += "\nPosición: " + Defensa.posicion;
        cadena += "\nRecuperaciones totales: " + Defensa.recuperacionesTotales;
        cadena += "\n------------------------------------------\n";

        return cadena;
    }

}
