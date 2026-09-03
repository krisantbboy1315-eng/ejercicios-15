package figuras;
public class Rectangulo extends Figura { protected double ancho,alto; public Rectangulo(double ancho,double alto){this.ancho=ancho;this.alto=alto;} public double area(){return ancho*alto;} public double perimetro(){return 2*(ancho+alto);} public Rectangulo escalar(double f){return new Rectangulo(ancho*f,alto*f);} }
