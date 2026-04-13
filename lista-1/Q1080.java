import java.util.Scanner;

public class Q1080 {
    public static void main(String[] args) {

        int maior = 0;
        int posicao = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe 100 valores:");

        for(int i = 1; i <= 100; i++) {
            int valor = input.nextInt();

            if(valor > maior) {
                maior = valor;
                posicao = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao);

    }
}