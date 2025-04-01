package IntermediateLevel;

public class Main {
    public static void main(String[] args) {

        // Objeto Sasuke Uchiha
        Uchiha Sasuke = new Uchiha(); // utilizando a classe filha que ta puxando os valores de herança da mãe, como mãe, idade e ikigai
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 16;
        Sasuke.ikigai = "Ninja de Konoha";
        System.out.println(Sasuke.nome + " vai ativar seu Doujutsu");
        Sasuke.sharinganAtivado(); // aplicando metodo ao meu objeto
        int idadeDezoito = Sasuke.quantoPraDezoito(18); // aplicando metodo idade no Sasuke
        System.out.println("Falta " + idadeDezoito + " anos para " + Sasuke.nome + " ter 18");


        // Objeto Hinata Hyuga
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuuga";
        Hinata.idade = 19;
        Hinata.ikigai = "Se tornar a melhor Hyuuga";
        Hinata.byakugann();

        // ------------------------------------------------------------------------------------------------------------------

        Poderes poderUm = new Poderes();
        poderUm.poder = "Chamas azuis";
        poderUm.nivel = 99;
        poderUm.descricao = "Chamas fortes que consomem com rápidez";
        System.out.println(poderUm.poder + " " + poderUm.nivel + " " + poderUm.descricao);
    }
}
