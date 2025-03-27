package BasicLevel.Condicoes;

public class ternaryOps {
    public static void main(String[] args) {
        /*
        *   Maneira de reduzir o código
        *   variável = (condição) ? valorTrue : valorFalse | pegou a ideia?
        *   if <- ?
        *   else <- :
        * */

        Short numMissoes = 11;
        String nivel = (numMissoes >= 10) ? "Esse hunter tem mais de 10 missões" : "Esse hunter tem menos de 10 missões";
        System.out.println(nivel);
    }
}
