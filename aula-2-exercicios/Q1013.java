import java.util.Scanner;

public class Q1013 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe três valores:");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        input.close();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " é maior.");
    }
}
