package BasicLevel.Condicoes;

public class condicoesIfeElse {
    public static void main(String[] args) {
        /*
        *  Objetivo: Passar o Jujutsu Sorcerer de classe de acordo com o número de missões
        *
        * */

        /* if (condição) {resultado}
        *  else if (condição) {resultado}
        *  else {resultado}
        *
        * */


        //  Sorcerer Itadori Yuji
        String nome = "Itadori";
        int idade = 16;
        String rank;
        short numMissoes = 9;


        if (numMissoes >= 12 && idade > 15) {
            System.out.println(nome + " está na classe >>");
            rank = "Special class";
            System.out.println(rank);
        } else if (idade <= 15){
            System.out.println(nome + " está na classe >>");
            rank = "First class";
            System.out.println(rank);
        } else if (numMissoes < 12) {
            System.out.println(nome + " está na classe >>");
            rank = "Second class";
            System.out.println(rank);
        } else {
            System.out.println(nome + " Não é um sorcerer");
        }
    }
}
