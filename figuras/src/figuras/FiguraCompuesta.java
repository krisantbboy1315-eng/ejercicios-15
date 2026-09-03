package figuras;
import java.util.ArrayList;
public class FiguraCompuesta extends Figura { private ArrayList<Figura> figuras=new ArrayList<>(); public void agregar(Figura f){figuras.add(f);} public double area(){double total=0;for(Figura f:figuras)total+=f.area();return total;} public double perimetro(){double total=0;for(Figura f:figuras)total+=f.perimetro();return total;} public FiguraCompuesta escalar(double factor){FiguraCompuesta nueva=new FiguraCompuesta();for(Figura f:figuras)nueva.agregar(f.escalar(factor));return nueva;} }
