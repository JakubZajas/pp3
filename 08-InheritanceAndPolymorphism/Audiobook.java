public class Audiobook extends Book {
    int minutes;
    int seconds;
    
    public Audiobook(String title, Writer author, Publisher publisher, int minutes, int seconds) {
        super(title, author, publisher);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public void display(){
        // System.out.println("\nTitle: "+getTitle()+"\nAuthor: "+getAuthor()+"\nDuration: "+getMinutes()+" minutes and "+getSeconds()+" seconds");
        System.out.printf("Title: %s \nAuthor: %s \nDuration: %d minutes and %d seconds",getTitle(),getAuthor().getFirstName(),getMinutes(),getSeconds());
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Tolkien", "Jakiś tam", "Fantasy");
        Publisher p1 = new Publisher("Halleluja", "Los Angeles");
        Publisher p2 = new Publisher("Totalny Pogchamp", "Radom");
        Book b1 = new Book("Hobbit tam i z powrotem", w1,p1);
        Audiobook a1 = new Audiobook("Hobbit", w1, p1,155, 32);
        Audiobook a2 = new Audiobook("Władca Pierścieni", w1, p2,167, 44);
        b1.display();
        a1.display();
        a2.display();
    }
    
}
