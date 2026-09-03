package banco;
// La interfaz agrega la parte de seguridad, porque Java no permite dos herencias de clase.
public class TransaccionSospechosaException extends ExcepcionTransaccion implements Seguridad { public TransaccionSospechosaException(){super("FRAUDE-004","CRITICA","Transaccion sospechosa");} public boolean notificarFraude(){return true;} }
