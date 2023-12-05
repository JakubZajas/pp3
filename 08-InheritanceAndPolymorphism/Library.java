import java.util.ArrayList
;
public class Library {
    static ArrayList<Book> collection = new ArrayList<>();

    public static void addBook(Book b){
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
        Book  b1 = new Book("Hobbit: Tam i z powrotem", "Tolkien");
        Book b2 = new Book("Wieża Jaskółki", "Sapkowski");
        Ebook eb2 = new Ebook("Czas Pogardy", "Sapkowski", "Wiedźmin");
        Audiobook a2 = new Audiobook("Władca Pierścieni", "Pierścieni", 167, 44);

        Library.addBook(a2);
        Library.addBook(b1);
        Library.addBook(b2);
        Library.addBook(eb2);

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
