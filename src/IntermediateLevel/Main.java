package IntermediateLevel;

public class Main {
    public static void main(String[] args) {

        // Objeto Sasuke Uchiha
        Uchiha Sasuke = new Uchiha(); // utilizando a classe filha que ta puxando os valores de herança da mãe, como mãe, age e ikigai
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.age = 16;
        Sasuke.ikigai = "Ninja de Konoha";
        System.out.println(Sasuke.name + " vai ativar seu Doujutsu");
        Sasuke.sharinganAtivado(); // aplicando metodo ao meu objeto
        int idadeDezoito = Sasuke.quantoPraDezoito(18); // aplicando metodo age no Sasuke
        System.out.println("Falta " + idadeDezoito + " anos para " + Sasuke.name + " ter 18");


        // Objeto Itachi
        Uchiha Itachi = new Uchiha();
        Itachi.mostrarAtributo();


        // Objeto Hinata Hyuga
        Hyuga Hinata = new Hyuga();
        Hinata.name = "Hinata Hyuuga";
        Hinata.age = 19;
        Hinata.ikigai = "Se tornar a melhor Hyuuga";
        Hinata.byakugann();


        // Objeto Sakura Haruno
        Haruno Sakura = new Haruno();
        Sakura.name = "Sakura Haruno";
        Sakura.age = 18;
        Sakura.ikigai = "Se tornar a melhor Ninja de cura de Konoha";
        Sakura.ativarCura();


        // Objeto Himawari Uzumaki
        Himawari Himawari = new Himawari();
        Himawari.name = "Himawari Hyuuga Uzumaki";
        Himawari.age = 14;
        Himawari.ikigai = "Ser o melhor dos irmãos";
        Himawari.AtivarKarma();
        Himawari.AtivarJougan();
        Himawari.byakugann();


        // ------------------------------------------------------------------------------------------------------------------

        /*
        Poderes poderUm = new Poderes();
        poderUm.poder = "Chamas azuis";
        poderUm.nivel = 99;
        poderUm.descricao = "Chamas fortes que consomem com rápidez";
        System.out.println(poderUm.poder + " " + poderUm.nivel + " " + poderUm.descricao);*/
    }
}
