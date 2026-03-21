import java.util.Scanner;

public class Q1020 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a sua idade em dias: ");

        int idadeDias = input.nextInt();

        input.close();

        int ano = idadeDias / 365;
        int resto = idadeDias % 365;
        int meses = resto / 30;
        int dias = resto % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(meses + " mês(es)");
        System.out.println(dias + " dia(s)");
    }
}
