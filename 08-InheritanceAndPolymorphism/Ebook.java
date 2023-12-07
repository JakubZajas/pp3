public class Ebook extends Book {
    protected String filename;

    public Ebook(String title, Writer author, Publisher publisher, String filename) {
        super(title, author, publisher);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    public void display(){
        System.out.println("Title: "+getTitle()+"\nAuthor: "+getAuthor().getFirstName()+"\nFilename: "+getFilename()+"\nPublisher: "+getPublisher().getName());
    }
    
    public static void main(String[] args) {
        Writer w1 = new Writer("Tolkien", "Jakiś tam", "Fantasy");
        Publisher p1 = new Publisher("Halleluja", "Los Angeles");
        Publisher p2 = new Publisher("Totalny Pogchamp", "Radom");
        Book b1 = new Book("Wieża Jaskółki", w1,p2);
        Ebook eb1 = new Ebook("Hobbit", w1, p1,"Books");
        Ebook eb2 = new Ebook("Czas Pogardy", w1, p2,"Wiedźmin");
        eb1.display();
        eb2.display();
        b1.display();
    }
    
}
