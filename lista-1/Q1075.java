import java.util.Scanner;

public class Q1075 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");

        int n = input.nextInt();

        input.close();

        for(int i = 1; i <= 10000; i++) {

            if( i % n == 2) {
                System.out.println(i);
            }
        }
    }
}