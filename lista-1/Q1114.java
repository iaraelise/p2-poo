import java.util.Scanner;

public class Q1114 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int password = input.nextInt();

        while (password != 2002) {
            System.out.println("Senha Invalida");

            password = input.nextInt();
        }

        input.close();

        System.out.println("Acesso Permitido");
    }
}