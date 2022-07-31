import java.util.Collection;
import java.util.List;

public class Frontend {

    public void runUI(){
        BookStore bookStore=new BookStore();
        System.out.println("***********Adding all books************");
        Book book1=new Book("Bhagavad Gita","religious","Vyasa",1200);
        Book book1Stored=bookStore.addBook(book1);
        display(book1Stored);
        Book book2=new Book("Rich Dad Poor Dad","non-fiction","Robert Kiyosaki, Sharon Lechter",2200);
        Book book2Stored=bookStore.addBook(book2);
        display(book2Stored);
        Book book3=new Book("xyz","fiction","James ross",300);
        Book book3Stored=bookStore.addBook(book3);
        display(book3Stored);
        System.out.println("********************showing all books*******************");
        List<Book> books=bookStore.findAll();
        for(Book book:books){
            display(book);
        }

    }
    public void display(Book book){
        System.out.println(book.getName()+" "+book.getGenre()+" "+book.getAuthor()+" "+book.getPrice());
    }
    public void display(Collection<Book> books){
        for (Book book:books){
            if(book!=null){
                display(book);
            }
        }
    }
}
