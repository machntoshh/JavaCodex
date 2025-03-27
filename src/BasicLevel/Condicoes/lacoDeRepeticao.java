package BasicLevel.Condicoes;

public class lacoDeRepeticao {
    public static void main(String[] args) {
        /*
        *   Vão repetir infitamente ou até atingir o param desejado
        *   (while)
        *   (for)
        * */

        int shadowNumbers = 0;
        int maxShadowNumbers = 30;

        // while
        while (shadowNumbers < 10) {
            shadowNumbers++; // número de shadowNumbers + 1 enquanto n chegar a 10
            System.out.println("Jin woo chamou " + shadowNumbers + " sombras");
        }

        // for
        for (int i = 0; i <= maxShadowNumbers ; i++) {
            System.out.println("Jin woo chamou " + i + " sombras");
        }
    }
}
