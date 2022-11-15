import java.util.Scanner;
public class Exercice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.print( "Entrez une chaine de caractère: " );
        String a = scanner.nextLine();

        String b = a.substring(1, a.length());

        System.out.println( "Votre chaine avant " + a );

        System.out.print( "Votre chaine après: " + b);
    }
}

