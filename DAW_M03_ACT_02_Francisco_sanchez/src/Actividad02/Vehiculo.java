package Actividad02;

/**
 *
 * @author fsanchez
 */
public abstract class Vehiculo {

    //atributos
    protected String tipoVehiculo = "Vehículo";
    protected String matricula = "0000XXXX";
    protected static int precioBase = 50;
    protected int diasAlquiler = 0;

    //constructor
    public Vehiculo(String matricula, String tipoVehiculo) {
        this.matricula = matricula;
        this.tipoVehiculo = tipoVehiculo;
        this.diasAlquiler = diasAlquiler;
    }

    // getter y setter
    String getTipoVehiculo() {
        return this.tipoVehiculo;
    }

    void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    String getMatricula() {
        return this.matricula;
    }

    void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    int getDiasAlquiler() {
        return this.diasAlquiler;
    }

    void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    // metodos
    // calcula el coste de alquiler básico
    public double alquilerBase() {
        double costeBase;
        costeBase = diasAlquiler * precioBase;
        return costeBase;
    }

    @Override
    public String toString() {
        String cadena = "\nMatricula: " + this.matricula;
        cadena += "\nDias de alquilerl: " + this.diasAlquiler;
        cadena += "\n------------------------------------------\n";

        return cadena;
    }

}
