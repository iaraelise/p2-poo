import java.util.Scanner;

public class Q1006 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe três notas:");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        input.close();

        double media = (a * 2 + b * 3 + c * 5) / 10;

        System.out.printf("Média %.1f", media);
    }
}