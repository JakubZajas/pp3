public class Book{
    protected String title;
    protected String author;
    protected Publisher publisher; 

    public void display(){
        System.out.println("Title:"+getTitle()+"\nAuthor:"+getAuthor());
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Hobbit", "Tolkien");
        Book b2 =  new Book("Harry Potter", "idk");
        b1.display();
        b2.display();
    }

}