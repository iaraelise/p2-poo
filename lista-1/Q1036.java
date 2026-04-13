import java.util.Scanner;

public class Q1036 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe três valores:");

        // ENTRADA DE DADOS

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        input.close();

        // OPERAÇÕES

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0 || delta < 0) {
            System.out.println("Impossível calcular!");
        }
        else {
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }
    }
}