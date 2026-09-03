package personajes;
public class Envenenado extends Guerrero { public Envenenado(String n){super(n);} public int atacar(){vida-=4;System.out.println(nombre+" pierde 4 de vida por veneno.");return super.atacar();} }
