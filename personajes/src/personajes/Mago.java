package personajes;
public class Mago extends Personaje { protected int mana; public Mago(String n,int mana){super(n,80);this.mana=mana;} public int atacar(){if(mana>=10){mana-=10;return 30;}return 5;} }
