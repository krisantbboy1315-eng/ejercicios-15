package gestionVehiculos;
import vehiculos.*;
public class App { public static void main(String[] args) { VehiculoAnfibio anfibio=new VehiculoAnfibio("Anfibio",1500,150); anfibio.recorrer(30); anfibio.cambiarMedio("agua"); anfibio.recorrer(20); anfibio.cambiarMedio("tierra"); anfibio.recorrer(10); VehiculoAereoVTOL vtol=new VehiculoAereoVTOL("VTOL",2500,400); vtol.mostrar(); vtol.despegarVertical(); vtol.volar(); } }
