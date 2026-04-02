import java.util.Scanner;

public class Q1012 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe três valores com duas casas decimais:");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        input.close();

        double pi = 3.14159;

        double areaTriangulo = a * c / 2;
        double areaCirculo = pi * Math.pow(c, 2);
        double areaTrapezio = (a + b) * c / 2;
        double areaQuadrado =  b * b;
        double areaRetangulo = a * b;

        System.out.printf("Área do triângulo: %.3f%n", areaTriangulo);

        System.out.printf("Área do circulo: %.3f%n", areaCirculo);

        System.out.printf("Área do trapézio: %.3f%n", areaTrapezio);

        System.out.printf("Área do quadrado: %.3f%n", areaQuadrado);

        System.out.printf("Área do retângulo: %.3f%n", areaRetangulo);
    }
}