import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a distância percorrida e a quantidade de combustível gasto:");

        int distancia = input.nextInt();
        double combustivel = input.nextDouble();

        input.close();

        Consumo consumo = new Consumo(distancia, combustivel);

        System.out.println(consumo.consumoMedio());
    }
}
