public class Book{
    public String title;
    public Writer author;
    public Publisher publisher; 
    public int yearOfPublication;

    public void display(){
        System.out.println("Title:"+getTitle()+"\nAuthor:"+getAuthor().getFirstName()+"\nPublisher: "+getPublisher().getName());
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Writer getAuthor() {
        return author;
    }
    public void setAuthor(Writer author) {
        this.author = author;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    
    
    public Book(String title, Writer author, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }
    
    public static void main(String[] args) {
        Writer w1 = new Writer("Tolkien", "Jakiś tam", "Fantasy");
        Publisher p1 = new Publisher("Halleluja", "Los Angeles");
        Book b1 = new Book("Hobbit", w1,p1);
        Book b2 =  new Book("Harry Potter", w1,p1);
        b1.display();
        b2.display();
    }

}