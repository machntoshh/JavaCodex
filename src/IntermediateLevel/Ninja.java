package IntermediateLevel;

public class Ninja { // molde de classe, básicamente
    String nome;
    int idade;
    String ikigai;


    /*
    *   Metodo string vai retornar uma string
    * */
    public String textoRandom() {
        return "ablubluble";
    }

    /*
     *   Metodo int vai retornar um int
     * */
    public int quantoPraDezoito(int idadeRequerida) {
        return idadeRequerida - idade;
    }
}
