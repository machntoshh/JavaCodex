package IntermediateLevel;

public class Ninja { // molde de classe, básicamente
    String name;
    int age;
    String ikigai;

    /*
    *   Metodo para mostrar informações dos atributos
    * */
    public void mostrarAtributo() {
        String nome;
        int idade;
        String missao;
        String nivelDificuldade;
        String statusMissao;
    }

    // metodo geral q todos os ninjas vão ter (polimorfismo)
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + name + " e esse é meu ataque especial");
    }


    public String textoRandom() {
        return "ablubluble";
    }
    public int quantoPraDezoito(int idadeRequerida) {
        return idadeRequerida - age;
    }
}
