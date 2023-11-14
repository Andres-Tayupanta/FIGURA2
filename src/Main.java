public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo ();
        /*Circulo c1 = new Circulo ();
        c1.ingresarPuntos();
        double areaC1= c1.calcularArea();
        double perimetroC1 = c1.getPerimetro();
        c1.imprimirArea("Circulo 1");
        c1.imprimirPerimetro("Circulo 1");

        Triangulo T1 = new Triangulo();
        T1.ingresarPuntos();
        double areaT1 = T1.calcularArea();
        double perimetroT1 = T1.calcularPerimetro();
        T1.imprimirArea("Triangulo 1");
        T1.imprimirPerimetro("Triangulo 1");*/

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.ingresarPuntos();
        double areaCuadrado = cuadrado.calcularArea();
        double perimetroCuadradro = cuadrado.calcularPerimetro();
        cuadrado.imprimirArea("Cuadrado 1");
        cuadrado.imprimirPerimetro("Cuadrado 1");


        Cubo cubo1 = new Cubo();
        cubo1.ingresarPuntos();
        cubo1.calcularVolumenCubo();

       /* Esfera esfera1 = new Esfera();
        esfera1.ingresarPuntos();
        esfera1.calcularVolumen();*/
    }
}