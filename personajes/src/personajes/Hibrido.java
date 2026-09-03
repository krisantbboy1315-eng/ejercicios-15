package personajes;
public class Hibrido extends Guerrero { private int mana; public Hibrido(String n,int mana){super(n);this.mana=mana;} @Override public int atacar(){if(mana>=10){mana-=10;System.out.println(nombre+" usa magia.");return 30;}System.out.println(nombre+" usa espada.");return super.atacar();} }
