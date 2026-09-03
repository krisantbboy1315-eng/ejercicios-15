package figuras;
// Se usa Figura directamente: un cuadrado no debe permitir ancho y alto diferentes.
public class Cuadrado extends Figura { private double lado; public Cuadrado(double lado){this.lado=lado;} public double area(){return lado*lado;} public double perimetro(){return 4*lado;} public Cuadrado escalar(double f){return new Cuadrado(lado*f);} }
