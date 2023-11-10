public class Book {
    private String title;
    private  int pages;
    
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
    
    public String  getTitle() {
        return title;
    }
    public int getPages() {
        return pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPages(int pages) {
        if(pages>=0){
            this.pages = pages;
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Hobbit", 0);
        System.out.println(b.getTitle());
        b.setPages(100);
        System.out.println(b.getPages());
        b.setPages(-10);
        System.out.println(b.getPages());

    }

}
