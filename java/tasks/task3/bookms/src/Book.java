public class Book {
    private String name;
    private String genre;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String name, String genre, String author, double price) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePriceAfterDiscount(){
        if(!genre.equals("fiction")){
            return price;
        }
        double result=price-(price*.25);
        return result;
    }
}
