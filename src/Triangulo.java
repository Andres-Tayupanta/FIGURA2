import java.util.Scanner;

public class Triangulo extends Figura {

    public Triangulo() {
    }

    void ingresarPuntos() {
        for (int i=0;i<3;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("INGRESE LA COMPONENTE X DEL PUNTO: "+i);
            double x = sc.nextDouble();
            System.out.println("INGRESE LA COMPONENTE Y DEL PUNTO: "+i);
            double y = sc.nextDouble();
            Puntos punto = new Puntos(x,y);
            this.listaPuntos.add(punto);

        }

    }

    double calcularPerimetro(){
        Punto punto1 = this.listaPuntos.get (1);
        Punto  punto2 = this.listaPuntos.get (2);
        Punto punto3 = this.listaPuntos.get (3);
        double l1 = punto1.calcularDistancia(punto2);
        double l2 = this.calcularDistancia(punto1,punto3);
        double l3 = punto2.calcularDistancia(punto3);
        this.perimetro =l1+l2+l3;
        return this.perimetro;


    }

    double calcularArea(){
        Punto p1 = this.listaPuntos.get(0);
        Punto p2 = this.listaPuntos.get(1);
        Punto p3 = this.listaPuntos.get(2);
        double l1 = p1.calcularDistancia(p2);
        double l2 = this.calcularDistancia(p1,p3);
        double l3 = p2.calcularDistancia(p3);
        double s = (l1+l2+l3)/2;
        this.area = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
        return  this.area;
    }
}
