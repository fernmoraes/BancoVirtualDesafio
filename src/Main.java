import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String userName = "Fernando Navajas Moraes";
        double bankBalance = 5000.00;
        String accountType = "Corrente";
        int option = 0;

        System.out.println("-------------------------------");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + userName);
        System.out.println("Tipo de conta: " + accountType);
        System.out.println("Saldo na conta: " + bankBalance);
        System.out.println("-------------------------------");

        while (option != 4) {

            System.out.println("Operações");
            System.out.println("1- Verificar Saldo");
            System.out.println("2- Receber Valor");
            System.out.println("3- Transferir Valor");
            System.out.println("4- Encerrar");
            option = leitura.nextInt();

            if (option == 1){
                System.out.println("Seu saldo é de: " + bankBalance);
            } else if (option == 2){
                System.out.println("Insira o valor a ser recebido: ");
                bankBalance += leitura.nextDouble();
            } else if (option == 3) {
                System.out.println("Insira o valor a ser transferido: ");
                double value = leitura.nextDouble();
                if (value > bankBalance){
                    System.out.println("Você não possui fundo suficiente");
                } else {
                    bankBalance -= value;
                }
            }else if (option != 4){
                System.out.println("Opção inválida");
            }

        }

        System.out.println("Programa Encerrado");
    }
}
