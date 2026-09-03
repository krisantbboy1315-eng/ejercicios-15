package vehiculos;
public class VehiculoAereo extends Vehiculo { public VehiculoAereo(String n,double p,double po){super(n,p,po);} public double velocidadMaxima(){return potencia-peso/300+20;} public double consumo(){return 25+peso/3000;} public void volar(){System.out.println(nombre+" vuela horizontalmente.");} }
