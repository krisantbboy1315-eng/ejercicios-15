package vehiculos;
public class VehiculoTerrestre extends Vehiculo { public VehiculoTerrestre(String n,double p,double po){super(n,p,po);} public double velocidadMaxima(){return potencia-peso/100;} public double consumo(){return 10+peso/1000;} }
