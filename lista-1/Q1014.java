import java.util.Scanner;

public class Q1014 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a distância total percorrida e o total de combustível gasto:");

        int distanciaTotal = input.nextInt();
        double combustivelGasto = input.nextDouble();

        input.close();

        double consumoMedio = distanciaTotal / combustivelGasto;

        System.out.printf("Consumo médio do automóvel: %.3f%n", consumoMedio);
    }
}
