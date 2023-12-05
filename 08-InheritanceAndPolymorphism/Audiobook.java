public class Audiobook extends Book {
    int minutes;
    int seconds;
    
    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
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
        System.out.printf("Title: %s \nAuthor: %s \nDuration: %d minutes and %d seconds",getTitle(),getAuthor(),getMinutes(),getSeconds());
    }

    public static void main(String[] args) {
        Book b1 = new Book("Hobbit tam i z powrotem", "Tolkien");
        Audiobook a1 = new Audiobook("Hobbit", "Tolkien", 155, 32);
        Audiobook a2 = new Audiobook("Władca Pierścieni", "Pierścieni", 167, 44);
        b1.display();
        a1.display();
        a2.display();
    }
    
}
