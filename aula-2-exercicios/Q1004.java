import java.util.Scanner;

public class Q1004 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe dois valores:");

        int a = input.nextInt();
        int b = input.nextInt();

        input.close();

        int produto = a * b;

        System.out.println("Produto: " + produto);
    }
}
