import java.util.ArrayList;

public class Bookcase {
    private ArrayList<Book> books;

    // Method to add a book to the bookcase
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book from the bookcase
    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList bookList(){
        ArrayList<String> list = new ArrayList<>();
        if(books!=null){
            for(Book book:books){
                list.add(book.getTitle());
            }
        }
        return list;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public Bookcase() {
    }
    
}
