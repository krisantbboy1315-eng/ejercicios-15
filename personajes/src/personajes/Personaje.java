package personajes;
public abstract class Personaje { protected String nombre; protected int vida; public Personaje(String n,int v){nombre=n;vida=v;} public abstract int atacar(); public void recibirDanio(int danio){vida-=danio;} public String getNombre(){return nombre;} public int getVida(){return vida;} }
