import java.util.Scanner;

public class Q1009 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome, salário fixo e o total de vendas efetuadas no mês:");

        String nome = input.next();
        double salario = input.nextDouble();
        double totalVendas = input.nextDouble();

        input.close();

        double comissao = totalVendas * 15 / 100;
        double salarioTotal = salario + comissao;

        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário com comissão: R$ %.2f", salarioTotal);
    }
}
