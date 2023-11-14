import java.util.ArrayList;
import java.util.List;

public class Figura {
    public double  perimetro, area;
    public List<Puntos> listaPuntos = new ArrayList<>();
    public Figura() {

    }
    public Figura(double perimetro, double area, List<Puntos> listaPuntos) {
        this.perimetro = perimetro;
        this.area = area;
        this.listaPuntos = listaPuntos;
    }

    double calcularDistancia(Puntos punto1, Puntos punto2){
        double dist = Math.sqrt(Math.pow(punto1.getX()-punto2.getX(),2)+Math.pow(punto1.getX()- punto2.getY(),2));
        return dist;
    }

    public void imprimirArea(String figura){

        System.out.println("El area del "+figura+"es:"+area);
    }

    public void imprimirPerimetro(String figura){

        System.out.println("El perimetro del "+figura+"es:"+perimetro);
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<Puntos> getListaPuntos() {
        return listaPuntos;
    }

    public void setListaPuntos(List<Puntos> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }

}
