package IntermediateLevel;

public class Pessoa { // molde de classe, básicamente
    String nome;
    int idade;
    String ikigai;

    // Criando um mét0do público personalizado
    /*
    *  void n retorna valor nenhum
    * */
    public void sharinganAtivado() {
        System.out.println("Sharingan!!!");
    }

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
