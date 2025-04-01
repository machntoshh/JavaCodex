package IntermediateLevel;

public class Main {
    public static void main(String[] args) {
        // criar uma pessoa - meu mano pessoa é um objeto
        // Objeto Eric Marques
        Pessoa Eric = new Pessoa(); // inicializei um obj usando o molde de classe Pessoa
        Eric.nome = "Eric Marques";
        Eric.idade = 22;
        Eric.ikigai = "Programador Java";
        System.out.println("Nome é " + Eric.nome + ", sua idade é " + Eric.idade + " e seu ikigai é o de " + Eric.ikigai);

        // Objeto Miguel Marques
        Pessoa Miguel = new Pessoa();
        Miguel.nome = "Miguel Marques";
        Miguel.idade = 11;
        Miguel.ikigai = "Brincar";
        System.out.println("Nome é " + Miguel.nome + ", sua idade é " + Miguel.idade + " e seu ikigai é o de " + Miguel.ikigai);

        String miguelFalandoBulhufas = Miguel.textoRandom();
        System.out.println(miguelFalandoBulhufas);

        // Objeto Sasuke Uchiha
        Pessoa Sasuke = new Pessoa();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 16;
        Sasuke.ikigai = "Ninja de Konoha";
        System.out.println(Sasuke.nome + " vai ativar seu Doujutsu");
        // aplicando metodo ao meu objeto
        Sasuke.sharinganAtivado();
        // aplicando metodo idade no Sasuke
        int idadeDezoito = Sasuke.quantoPraDezoito(18);
        System.out.println("Falta " + idadeDezoito + " anos para " + Sasuke.nome + " ter 18");

        // ------------------------------------------------------------------------------------------------------------------

        Poderes poderUm = new Poderes();
        poderUm.poder = "Chamas azuis";
        poderUm.nivel = 99;
        poderUm.descricao = "Chamas fortes que consomem com rápidez";
        System.out.println(poderUm.poder + " " + poderUm.nivel + " " + poderUm.descricao);
    }
}
