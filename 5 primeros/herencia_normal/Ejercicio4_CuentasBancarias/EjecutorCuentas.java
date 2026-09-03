import cuentas.CuentaAhorros;
import cuentas.CuentaAhorroPremium;
import cuentas.CuentaCorriente;
import transacciones.Banco;

public class EjecutorCuentas {
    public static void main(String[] args) {
        CuentaAhorros ahorro = new CuentaAhorros("001", 1000000);
        CuentaCorriente corriente = new CuentaCorriente("002", 2000000);
        CuentaAhorroPremium premium = new CuentaAhorroPremium("003", 3000000);

        Banco entidad = new Banco();
        entidad.registrarCuenta(ahorro, 0);
        entidad.registrarCuenta(corriente, 1);
        entidad.registrarCuenta(premium, 2);

        entidad.procesarIntereses();
        entidad.listarCuentas();
    }
}
