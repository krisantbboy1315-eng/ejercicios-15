package banco;
public class ExcepcionBancaria extends Exception { protected String codigo; protected String severidad; public ExcepcionBancaria(String codigo,String severidad,String mensaje){super(mensaje);this.codigo=codigo;this.severidad=severidad;} public void mostrar(){System.out.println(codigo+" - "+severidad+": "+getMessage());} }
