package BasicLevel.DataStructures;

public class arrayInJava {
    public static void main(String[] args) {

        // arrays e listas são diferentes
        // arrays sempre tem tipos definidos e listas são flexiveis
        // arrays são tipo referência

        String[] hunters = new String[3]; // esse array vai receber só 3 entradas
        hunters[0] = "Sun Jin Woo";
        hunters[1] = "Cha Hae Ji";
        hunters[2] = "Go";
        System.out.println(hunters[2]);
        System.out.println(hunters); // estou pedindo, perguntando qual o tipo de referência de memória


        // tipos diferentes de array, dão respostas diferentes


        int[] idade = new int[2]; // new int, novo objeto de memória com referência de 2 campos
        idade[0] = 22;
        idade[1] = 11;
        System.out.println(idade[1]);
        System.out.println(idade);


        boolean[] realOuFeiki = new boolean[2];
        // que tipo de memória vai retornar?
        System.out.println(realOuFeiki[0]);

    }
}
