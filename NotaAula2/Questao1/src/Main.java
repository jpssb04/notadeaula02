import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        double saldo = 0.0;
        double chequeEspecial = 1000.0;
        int controle = 3;
        int controle2;
        double selic = 10.75; /* Selic de Outubro de 2024 */
        double temp, rendimento;

        System.out.println("Digite o nome do titular:");
        String nomeTitular = sc2.nextLine();

        while (controle != 0) {
            System.out.println("Qual conta deseja visualizar?");
            System.out.println("0 - Sair\n1 - Conta Corrente\n2 - Conta Bancária");
            controle = sc.nextInt();

            switch (controle) {
                case (1):
                    System.out.println("Menu de opções:");
                    System.out.println("0 - Sair\n1 - Depositar\n2 - Sacar\n3 - Cheque Especial\n4 - Exibir Dados");
                    controle2 = sc.nextInt();

                    switch (controle2) {
                        case (0):
                            break;

                        case (1):
                            System.out.println("Digite o valor que deseja depositar:");
                            saldo += sc.nextDouble();
                            System.out.println("Valor depositado com sucesso.");
                            break;

                        case (2):
                            System.out.println("Digite o valor que deseja sacar:");
                            temp = sc.nextDouble();
                            if (saldo - temp >= 0){
                                saldo -= temp;
                                System.out.println("Valor sacado com sucesso.");
                            }
                            else {
                                System.out.println("Você não pode sacar essa quantia.");
                            }
                            break;

                        case (3):
                            System.out.println("Digite o valor que deseja sacar:");
                            temp = sc.nextDouble();
                            if (saldo - temp >= -chequeEspecial){
                                saldo -= temp;
                                System.out.println("Valor sacado com sucesso.");
                            }
                            else {
                                System.out.println("Você não pode sacar essa quantia.");
                            }
                            break;

                        case (4):
                            System.out.println("Nome titular: " + nomeTitular);
                            System.out.printf("Saldo: R$ %.2f\n", saldo);
                    }
                    break;

                case (2):
                    System.out.println("Menu de opções:");
                    System.out.println("0 - Sair\n1 - Depositar\n2 - Sacar\n3 - Calcular Rendimento\n4 - Exibir Dados");
                    controle2 = sc.nextInt();

                    switch (controle2) {
                        case (0):
                            break;

                        case (1):
                            System.out.println("Digite o valor que deseja depositar:");
                            saldo += sc.nextDouble();
                            System.out.println("Valor depositado com sucesso.");
                            break;

                        case (2):
                            System.out.println("Digite o valor que deseja sacar:");
                            temp = sc.nextDouble();
                            if (saldo - temp >= 0){
                                saldo -= temp;
                                System.out.println("Valor sacado com sucesso.");
                            }
                            else {
                                System.out.println("Você não pode sacar essa quantia.");
                            }
                            break;

                        case (3):
                            if (selic > 8.5){
                                rendimento = 0.005 * saldo;
                                System.out.printf("Rendimento: R$ %.2f\n", rendimento);
                            }
                            else {
                                rendimento = 0.007 * selic * saldo;
                                System.out.printf("Rendimento: R$ %.2f\n", rendimento);
                            }
                            break;

                        case (4):
                            System.out.println("Nome titular: " + nomeTitular);
                            System.out.printf("Saldo: R$ %.2f\n", saldo);
                    }
                    break;

                default:
                    break;
            }
        }
    }
}