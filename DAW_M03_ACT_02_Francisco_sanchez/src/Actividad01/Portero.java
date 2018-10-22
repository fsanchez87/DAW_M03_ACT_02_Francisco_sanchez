package Actividad01;

/**
 *
 * @author fsanchez
 */
public class Portero extends Jugador {

    // atributos de la clase
    private static final String posicion = "Portero"; // posición stática

    // atributos de instancia
    private static int paradasTotales = 0; // contador para almacenar paradas
    private int paradas = 0;

    // construtor de la clase
    public Portero(String nombre, int dorsal, String equipo, int paradas) {
        super(nombre, dorsal, equipo);
        this.paradas = paradas;
        Portero.paradasTotales += paradas; // añade paradas al contador
    }

    // getter y setter    
    void setParadas(int paradas) {
        this.paradas = paradas;
        Portero.paradasTotales += paradas;
    }

    // métodos de la clase //////////
    // muestras las paradas totales
    public int getParadasTotales() {
        return Portero.paradasTotales;
    }

    @Override
    public String toString() {
        String cadena = "\nNombre: " + this.nombre;
        cadena += "\nDorsal: " + this.dorsal;
        cadena += "\nEquipo: " + this.equipo;
        cadena += "\nPosición: " + Portero.posicion;
        cadena += "\nParadas totales: " + Portero.paradasTotales;
        cadena += "\n------------------------------------------\n";

        return cadena;
    }

}
