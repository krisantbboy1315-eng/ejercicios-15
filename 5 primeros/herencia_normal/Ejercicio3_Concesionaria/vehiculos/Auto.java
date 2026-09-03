package vehiculos;

public class Auto extends Vehiculo {

    private final int cantidadPuertas;

    public Auto(String marcaVehiculo, String modeloVehiculo, double velocidadTope, int cantidadPuertas) {
        super(marcaVehiculo, modeloVehiculo, velocidadTope);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto -> Marca: " + marcaVehiculo +
                ", Modelo: " + modeloVehiculo +
                ", Velocidad maxima: " + velocidadTope + " km/h" +
                ", Puertas: " + cantidadPuertas;
    }
}
