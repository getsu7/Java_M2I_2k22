import java.util.HashMap;
public class Stock {
    private HashMap<Integer, Article> listOfArticle;
    public Stock(){
        this.listOfArticle = new HashMap<Integer, Article>();
    }
    Stock(Stock stock){
        listOfArticle = stock.listOfArticle;
    }
    public boolean isExist(Article article){
        return listOfArticle.containsKey(article.getCode());
    }
    public void add(Article article){
        if (!isExist(article)) {
            listOfArticle.put(article.getCode(), article);
            System.out.println("Article added to stock");
            return;
        }
        System.out.println("this article already exist");
    }
    public void priceOf(Article article){
        if (!isExist(article)){
            System.out.println(listOfArticle.get(article.getCode()).getPrice());
            return;
        }
        System.out.println("Article not found");
    }
    public void sell(Article article){
        if (isExist(article)){
            Article sellingArticle = listOfArticle.get(article.getCode());
            article.setStock(article.getStock() - 1);
            System.out.println("This article have been sold: " + sellingArticle.getPrice() + "$");
            return;
        }
        System.out.println("Article not found");
    }
    public void buy(Article article){
        if (isExist(article)){
            Article buyingArticle = listOfArticle.get(article.getCode());
            article.setStock(article.getStock() + 1);
            System.out.println("This article cost you: " + buyingArticle.getPrice() + "$");
            return;
        }
        this.add(article);
        System.out.println("This article have been created and added to your stock");
    }
    public boolean delete(Article article){
        if (isExist(article)){
            if (article.getStock() == 0){
                listOfArticle.remove(article.getCode());
                System.out.println("Article deleted");
                return true;
            }
            System.out.println("This article cannot be delete, cause stock (" + article.getStock() + ") should be equals to 0");
            return false;
        }
        System.out.println("Article not found");
        return false;
    }
    public void listAll(){
        System.out.println("__--liste de tous les aticles--__");
        for (Article article: listOfArticle.values()){
            System.out.println("__Article n°"+ article.getCode() +
                    "__\n -Price: " + article.getPrice() +
                    "\n -Quantity: " + article.getStock());
        }
        System.out.println("--__END__--");
    }
}
