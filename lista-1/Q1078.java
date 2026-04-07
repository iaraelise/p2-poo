import java.util.Scanner;

public class Q1078 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: ");

        int n = input.nextInt();

        input.close();

        for (int i = 1; i <= 10; i++) {
            int mult = n * i;

            System.out.println(i + " x " + n + " = " + mult);
        }
    }
}
