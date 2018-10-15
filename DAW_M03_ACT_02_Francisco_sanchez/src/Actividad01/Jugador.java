/*
Se desea realizar una aplicación en Java para gestionar la información los 
jugadores de fútbol. Todos ellos tienen información común, como pueden ser el 
nombre del jugador, su dorsal y el equipo en el que juegan. Obviamente, esta 
información no es la misma para todos los jugadores. Además, dependiendo de la 
posición en la que juegan, querremos almacenar datos adicionales, como pueden ser:

•	El número de paradas en caso de que el jugador sea portero.
•	El número de balones recuperados, para los defensas.
•	El número de goles, para los delanteros.

Crea la estructura de datos más apropiada, usando herencia, para poder gestionar
la información detallada anteriormente.

Realiza una clase que contenga el método main, en el que se vea cómo se crea un 
jugador de cada tipo. No hace falta que hagas ningún menú ni que pidas los datos
por consola
*/

package Actividad01;

/**
 *
 * @author Francisco Sánchez
 */
public abstract class Jugador {
    
    // atributos
    String nombre;
    int dorsal;
    String equipo;
    
    // construtor
    public Jugador(String nombre, int dorsal, String equipo) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.equipo = equipo;
    }

    // getter y setter
    String getNombre(){
        return this.nombre;
    }
    
    void setNombre(String nombre){
        this.nombre = nombre;
    }
            
    int getDorsal(){
        return this.dorsal;
    }
    
    void setDorsal(int dorsal){
        this.dorsal = dorsal;
    }
    
    String getEquipo(){
        return this.equipo;
    }
    
    void setEquipo(String equipo){
        this.equipo = equipo;
    }
    
    // métodos
    public String toString(){
        String cadena = "\nNombre: " + this.nombre;
        cadena += "\nDorsal: " + this.dorsal;
        cadena += "\nEquipo: " + this.equipo;
        cadena += "\n------------------------------------------\n\n";

        return cadena;        
    }       
}
