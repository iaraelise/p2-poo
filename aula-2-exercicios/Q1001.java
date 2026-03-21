import java.util.Scanner;

public class Q1001 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe dois valores:");

        int a = input.nextInt();
        int b = input.nextInt();

        input.close();
        
        int soma = a + b;

        System.out.println("Soma: " + soma);
    }
}