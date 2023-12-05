public class Ebook extends Book {
    protected String filename;

    public Ebook(String title, String author, String filename) {
        super(title, author);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    public void display(){
        System.out.println("Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nFilename: "+getFilename());
    }
    
    public static void main(String[] args) {
        Book b1 = new Book("Wieża Jaskółki", "Sapkowski");
        Ebook eb1 = new Ebook("Hobbit", "Tolkien", "Books");
        Ebook eb2 = new Ebook("Czas Pogardy", "Sapkowski", "Wiedźmin");
        eb1.display();
        eb2.display();
        b1.display();
    }
    
}
