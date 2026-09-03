package gestionBanco;
import banco.*;
public class App { public static void validar(double saldo,double monto,double acumulado,boolean sospechosa) throws ExcepcionTransaccion { if(sospechosa)throw new TransaccionSospechosaException(); if(saldo<monto)throw new SaldoInsuficienteException(); if(acumulado+monto>5000000)throw new LimiteDiarioExcedidoException(); } public static void main(String[] args) { try { validar(500000,2000000,4000000,true); } catch(ExcepcionTransaccion e) { e.mostrar(); if(e instanceof Seguridad)System.out.println("Se notifica a fraude."); } } }
