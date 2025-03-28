package BasicLevel.DesafioKonoha;

import java.util.Scanner;

public class cadastroNinjasExemProf {
    public static void main(String[] args) {

        // Entrada dos dados
        Scanner scanner = new Scanner(System.in);

        // Fazer o array
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            // Menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja >> ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Cadastro feito");
                    } else {
                        System.out.println("Sem mais vagas...");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado");
                        
                    } else {
                        System.out.println("Lista de ninjas: ");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println("Ninja: " + ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Aplicação fechada, até mais!");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }


    }
}
