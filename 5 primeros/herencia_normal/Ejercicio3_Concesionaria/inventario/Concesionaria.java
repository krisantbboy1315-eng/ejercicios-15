package inventario;

import vehiculos.Vehiculo;

public class Concesionaria {

    private final Vehiculo[] inventario;

    public Concesionaria() {
        this.inventario = new Vehiculo[10];
    }

    public void registrarVehiculo(Vehiculo vehiculo, int indice) {
        if (indice >= 0 && indice < inventario.length) {
            inventario[indice] = vehiculo;
        }
    }

    public void generarReporte() {
        System.out.println("=== REPORTE DE INVENTARIO ===");
        for (Vehiculo v : inventario) {
            if (v != null) {
                System.out.println(v.toString());
            }
        }
    }
}
