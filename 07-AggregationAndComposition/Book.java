public class Book {
    String title;
    int pages;
    boolean isClosed;
    Author author;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public Book(String title, int pages, Author author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }
    
    public void nextPage(){
        pages++;
    }
    public void previousPage(){
        pages--;
    }
    public void close(){
        isClosed=true;
    }
    public void open(){
        isClosed=false;
    }
    public void pages(int n){
        pages=n;
    }
}
