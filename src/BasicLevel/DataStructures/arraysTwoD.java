package BasicLevel.DataStructures;

public class arraysTwoD {
    public static void main(String[] args) {
        // array 2d -> array dentro do array

        String[][] ninjasAldeia = new String[3][3];
        // virou praticamente uma matriz
        ninjasAldeia[0][0] = "Konoha"; // linha 0 coluna 0 primeira casa
        ninjasAldeia[0][1] = "Naruto";
        ninjasAldeia[0][2] = "Sasuke";

        ninjasAldeia[1][0] = "Sunagakure";
        ninjasAldeia[1][1] = "Gaara";
        ninjasAldeia[1][2] = "Temari";

        ninjasAldeia[2][0] = "Kirigakure";
        ninjasAldeia[2][1] = "Haku";
        ninjasAldeia[2][2] = "Zabuza";

        for (int i = 0; i < ninjasAldeia.length; i++) {
            System.out.println("Aldeia: " + ninjasAldeia[i][0] + " - Ninja 1: " + ninjasAldeia[i][1] + " - Ninja 2: " + ninjasAldeia[i][2]);
        }
    }
}
