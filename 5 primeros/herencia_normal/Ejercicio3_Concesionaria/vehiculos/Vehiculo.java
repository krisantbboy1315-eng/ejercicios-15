package vehiculos;

public class Vehiculo {

    protected String marcaVehiculo;
    protected String modeloVehiculo;
    protected double velocidadTope;

    public Vehiculo(String marcaVehiculo, String modeloVehiculo, double velocidadTope) {
        this.marcaVehiculo = marcaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.velocidadTope = velocidadTope;
    }

    @Override
    public String toString() {
        return "Marca: " + marcaVehiculo +
                ", Modelo: " + modeloVehiculo +
                ", Velocidad maxima: " + velocidadTope + " km/h";
    }
}
