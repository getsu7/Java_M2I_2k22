import java.util.*;

public class Exercice3 {
    public static void main(String[] args){
        System.out.println("Entrez la taille de la liste:");
        Scanner sc = new Scanner(System.in);
        int suiteSize = 0;
        try{
            suiteSize = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Input erroné: " + e );
            main(null);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < suiteSize; i++) {
            System.out.println("Entrez la valeur n°" + (i + 1));
            try {
                list.add(i, sc.nextInt());
            } catch (Exception e) {
                System.out.println("Input erroné: " + e);
                main(null);
            }
        }
        list.sort(null);
        ArrayList<Integer> listWithoutDuplicates = removeDuplicateElements(list);
        for (Integer num : listWithoutDuplicates) {
            System.out.print(num + " | ");
        }
    }
    public static <Integer> ArrayList<Integer> removeDuplicateElements(ArrayList<Integer> list){
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<Integer>();
        for (Integer element : list) {
            if (!listWithoutDuplicates.contains(element)) {
                listWithoutDuplicates.add(element);
            }
        }
        return listWithoutDuplicates;
    }
}
