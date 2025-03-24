package Condicoes;
import java.util.Scanner;

public class userScanner {
    public static void main(String[] args) {
        /*
        *  Scanner é uma palavra reservada | deixar o usuário colocar os dados, resumindo
        *  Objetivo = user irá criar um Sorcerer
        * */

        Scanner textBox = new Scanner(System.in); // criado um novo scanner que RECEBE valores do usuário

        System.out.println("Qual nome do Feiticeiro Jujutsu: ");
        String nomeSorcerer = textBox.nextLine(); // metodo que trata recebimento de um valor String pelo usuário
        System.out.println("Ah claro, " + nomeSorcerer + "! " + "bem vindo...");

        System.out.println("E qual sua idade mesmo?");
        int idadeSorcerer = textBox.nextInt(); // metodo que trata input do usuário no valor INT
        System.out.println("Entendi, você tem " + idadeSorcerer + " Anos");

        if (idadeSorcerer < 18) {
            System.out.println("Pelo que parece você é menor de idade " + nomeSorcerer + "...");
        } else {
            System.out.println("Você é maior de idade " + nomeSorcerer);
        }


        textBox.close();
        // sempre fechar o Scanner para não vazar dados e der um erro
    }
}
