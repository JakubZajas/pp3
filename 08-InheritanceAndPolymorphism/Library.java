import java.util.ArrayList
;
public class Library {
    static ArrayList<Book> collection = new ArrayList<>();

    public static void add(Book b){
        collection.add(b);
    }
    // public static void addEbook(Ebook e){
    //     collection.add(e);
    // }
    // public static void addAudiobook(Audiobook a){
    //     collection.add(a);
    // }
    
    public static void display(){
        for(Book i : collection){
            System.out.println("\n"+i.getClass());
            i.display();
        }
    }
    
    public static void main(String[] args) {
        Writer w1 = new Writer("Tolkien", "Jakiś tam", "Fantasy");
        Publisher p1 = new Publisher("Halleluja", "Los Angeles");
        Publisher p2 = new Publisher("Totalny Pogchamp", "Radom");
        Book  b1 = new Book("Hobbit: Tam i z powrotem", w1,p1);
        Book b2 = new Book("Wieża Jaskółki", w1,p2);
        Ebook eb2 = new Ebook("Czas Pogardy", w1,p1, "Wiedźmin");
        Audiobook a2 = new Audiobook("Władca Pierścieni", w1, p2,167, 44);

        Library.add(a2);
        Library.add(b1);
        Library.add(b2);
        Library.add(eb2);

        Library.display();

        // collection.add(b1);
        // collection.add(b2);
        // collection.add(eb2);
        // collection.add(a2);

        // for(Book i : collection){
        //     System.out.println("\n"+i.getClass());
        //     i.display();
        // }



    }
}
