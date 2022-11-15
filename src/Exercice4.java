public class Exercice4 {
    public static void main(String[] args) {
        int nbLignes = Integer.parseInt(args[0]);
        int nbColonnes = Integer.parseInt(args[1]);
        int T[][] = new int [nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes ; i++) {
            int x = i;
            for (int j = 0; j < nbLignes; j++) {
                T[i][j] = x;
                x++;
            }
        }
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbLignes ; j++) {
                System.out.print(T[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
