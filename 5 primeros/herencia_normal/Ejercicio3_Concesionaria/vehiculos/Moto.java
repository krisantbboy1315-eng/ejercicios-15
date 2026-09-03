package vehiculos;

public class Moto extends Vehiculo {

    private final double cilindrajeMotor;

    public Moto(String marcaVehiculo, String modeloVehiculo, double velocidadTope, double cilindrajeMotor) {
        super(marcaVehiculo, modeloVehiculo, velocidadTope);
        this.cilindrajeMotor = cilindrajeMotor;
    }

    @Override
    public String toString() {
        return "Moto -> Marca: " + marcaVehiculo +
                ", Modelo: " + modeloVehiculo +
                ", Velocidad maxima: " + velocidadTope + " km/h" +
                ", Cilindraje: " + cilindrajeMotor + " cc";
    }
}
