public class TestArticle {
    public static void main(String[] args) {
        System.out.println("BIENVENUE DANS UNE BOULANGERIE DU VIEUX-LYON");
        Article baguette = new Article(12.50, 0);
        Article pain = new Article(26.50, 50);
        Article cafe = new Article(8, 30);
        Stock boulangerie = new Stock();
        boulangerie.add(cafe);
        boulangerie.add(pain);
        boulangerie.add(baguette);

//        System.out.println("On veut ajouter un article qui existe deja");
//        boulangerie.add(baguette);
        boulangerie.listAll();
        System.out.println("Un client se ramène et achète un café (excessivement chère) pour son date");
        boulangerie.sell(cafe);
        boulangerie.listAll();
        System.out.println("Monsieur va acheter des croissants surgelées chez Thiriette");
        boulangerie.add(new Article(5, 999));
        boulangerie.delete(baguette);
        boulangerie.listAll();
    }
}
