public class Article {
    private Integer code;
    private double price;
    private int stock;
    private static int nbCreatedArticles;

    public Article(double price, int stock){
        nbCreatedArticles += 1;
        this.code = nbCreatedArticles;
        this.price = price;
        this.stock = stock;
        System.out.println("Article created");
    }
    public Integer getCode(){
        return code;
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
