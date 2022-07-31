import java.util.*;

public class BookStore {
    ArrayList<Book> books = new ArrayList<>();
    String genres[] = {"fiction", "religion", "adventure", "cooking", "travel", "autobiographies","non-fiction"};

    // adding book in the bookStore
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }
    List<Book> findBookByGenre(String genre) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                foundBooks.add(book);
            }
        }
        if (foundBooks.size() == 0) {
            System.out.println("No Book found for this " + genre);
            return null;
        }
        return foundBooks;
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public Book changePrice(String name,double price){
        for(Book book:books){
            if(book.getName().equalsIgnoreCase(name)){
               book.setPrice(price);
               return book;
            }
        }
        return null;
    }
    public List<Book> findAll(){
        return books;
    }

}
