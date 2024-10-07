import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Corrida c = new Corrida();

        System.out.println("Digite a distância percorrida na corrida em quilômetros:");
        c.setDistancia(sc.nextDouble());

        System.out.println("Digite o tempo de espera em minutos:");
        c.setTempoEspera(sc.nextInt());

        System.out.println("Digite o valor cobrado pela corrida:");
        c.setTarifaBase(sc.nextDouble());

        System.out.println("Digite o valor do preço em horário de alta demanda:");
        c.setFatorDemanda(sc.nextDouble());

        double valorFinal = c.calcularValorCorrida();
        System.out.printf("Valor final: R$ %.2f\n", valorFinal);

        c.exibirDetalhesCorrida();

    }
}