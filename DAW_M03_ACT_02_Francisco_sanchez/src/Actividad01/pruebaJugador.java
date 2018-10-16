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
public class pruebaJugador {

    public static void main(String[] args) {

        // creamos las instancias
        Portero p1 = new Portero("Thibaut Courtois", 25, "Real Madrid", 5);
        Defensa d1 = new Defensa("Dani Carvajal", 2, "Real Madrid", 10);
        Delantero dl1 = new Delantero("Gareth Bale", 11, "Real Madrid", 9);

        // retorna los datos
        System.out.println(p1.toString() + d1.toString() + dl1.toString());

        // actualizamos
        System.out.println("\nActualizamos en 3 las paradas, recuperciones y goles."
                + "\nTambien actualizamos dorsal del portero, equipo del defensa y"
                + " nombre del delantero.");

        int actualizacion = 3;

        p1.setParadas(actualizacion);
        d1.setRecuperaciones(actualizacion);
        dl1.setGoles(actualizacion);
        p1.setDorsal(1);
        d1.setEquipo("Juventus");
        dl1.setNombre("Gareth Frank Bale");

        System.out.println(p1.toString() + d1.toString() + dl1.toString());

    }
}
