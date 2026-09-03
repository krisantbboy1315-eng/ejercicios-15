package vehiculos;
public class VehiculoAcuatico extends Vehiculo { public VehiculoAcuatico(String n,double p,double po){super(n,p,po);} public double velocidadMaxima(){return potencia-peso/200;} public double consumo(){return 15+peso/2000;} }
