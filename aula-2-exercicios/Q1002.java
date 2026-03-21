import java.util.Scanner;

public class Q1002 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Informe o valor do raio: ");
        
        double raio = input.nextDouble();

        input.close();

        double area = pi * Math.pow(raio, 2);

        System.out.printf("Área: %.4f", area);
    }
}
