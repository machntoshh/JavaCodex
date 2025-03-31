package IntermediateLevel;

public class Main {
    public static void main(String[] args) {
        // criar uma pessoa - meu mano pessoa é um objeto

        Pessoa Eric = new Pessoa(); // inicializei um obj usando o molde de classe Pessoa
        Eric.nome = "Eric Marques";
        Eric.idade = 22;
        Eric.ikigai = "Programador Java";
        System.out.println("Nome é " + Eric.nome + ", sua idade é " + Eric.idade + " e seu ikigai é o de " + Eric.ikigai);

        Pessoa Miguel = new Pessoa();
        Miguel.nome = "Miguel Marques";
        Miguel.idade = 11;
        Miguel.ikigai = "Brincar";
        System.out.println("Nome é " + Miguel.nome + ", sua idade é " + Miguel.idade + " e seu ikigai é o de " + Miguel.ikigai);
    }
}
