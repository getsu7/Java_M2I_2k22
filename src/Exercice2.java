import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (a.contains(" ")) {
           String [] arrayA = a.split(" ");
           String [] arrayB = new String[arrayA.length];
            int counter = arrayA.length - 1;
           for (int i = 0; i < arrayA.length; i++) {
               arrayB[i] = arrayA[counter - i];
           }
           if (String.join(" ", arrayA).equals(String.join(" ", arrayB))) {
               System.out.println("PALINDROME BINGO!");
               return;
           }
            System.out.println("PAS PALINDROME, FAILED");
            return;
        }
        StringBuffer bf = new StringBuffer(a);
        if ( bf.reverse().toString().contentEquals(a)) {
                System.out.println("PALINDROME BINGO!");
        } else {
            System.out.println("PAS PALINDROME, FAILED");
        }
    }
}

