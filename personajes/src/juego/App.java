package juego;
import personajes.*;
public class App { public static void main(String[] args) { Personaje guerrero=new Envenenado("Brak"); Personaje hibrido=new Aturdido("Eira",20); for(int i=1;i<=3;i++){System.out.println("Turno "+i); int danio=guerrero.atacar();hibrido.recibirDanio(danio);System.out.println("Eira vida: "+hibrido.getVida());danio=hibrido.atacar();guerrero.recibirDanio(danio);System.out.println("Brak vida: "+guerrero.getVida());} } }
