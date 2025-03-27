package BasicLevel.Condicoes;

import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {
        /*
        *   Switch cases geram casos especificos
        *   Objetivo = user vai escolher entre os switch cases
        * */

        Scanner valueBox = new Scanner(System.in); // objeto

        System.out.println("Quem vai participar dessa Dungeon >>");
        System.out.println("1 - Sun Jin Woo");
        System.out.println("2 - Cha hae Ji");
        System.out.println("3 - Igris");

        int userChoice = valueBox.nextInt();

        switch (userChoice) { // o que vai ser verificado é o userChoice
            case 1: // caso o input seja (1), executar código abaixo
                System.out.println("Você escolheu o Sun Jin Woo");
                break;
            case 2: // mesma coisa porém com o número (2)
                System.out.println("Você escolheu a Cha hae Ji");
                break;
            case 3:
                System.out.println("Você escolheu o Igris");
                break;
            default:
                System.out.println("Não existe nenhuma entrada com esse número");
        }


        valueBox.close();
    }
}
