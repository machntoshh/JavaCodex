package BasicLevel.DesafioKonoha;
import java.util.Scanner;

public class cadastroNinjas {
    public static void main(String[] args) {

        // colocar a opção deletar Ninja depois

        Scanner scanner = new Scanner(System.in);

        int NUMERO_TOTAL = 10;
        String[] ninjas = new String[NUMERO_TOTAL];
        int index = 0;

        // Enquanto for verdade, executar abaixo
        while (true) {
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        int valorEscolhido = scanner.nextInt();
        scanner.nextLine();

        switch (valorEscolhido) {
            case 1:
                if (index < ninjas.length) {
                    System.out.println("Qual ninjas vão ser cadastrados: ");
                    String cadastro = scanner.nextLine();
                    ninjas[index] = cadastro;
                    index++;
                    System.out.println("Ninja cadastrado");
                } else {
                    System.out.println("Limite atingido por missão");
                }
                break;
            case 2:
                System.out.println("Ninjas cadastrados para a missão: ");
                for (int i = 0; i < index; i++) {
                    System.out.println("Ninja: " + (i + 1) + ": " + ninjas[i]);
                }
                break;
            case 3:
                System.out.println("Até mais!");
                scanner.close();
                return;
            default:
                System.out.println("Opção inválida");
                break;
        }
        }
    }
}
