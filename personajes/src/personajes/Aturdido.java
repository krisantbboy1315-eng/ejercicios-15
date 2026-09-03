package personajes;
public class Aturdido extends Hibrido { private boolean primerTurno=true; public Aturdido(String n,int mana){super(n,mana);} public int atacar(){if(primerTurno){primerTurno=false;System.out.println(nombre+" esta aturdido.");return 0;}return super.atacar();} }
