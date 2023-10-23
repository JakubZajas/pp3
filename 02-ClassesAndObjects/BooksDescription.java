public class BooksDescription {
    String title;
    String author;
    int publishedDate;
    String type;
    int numberOfPages;
    int currentPage;

    void openBook(){
        currentPage = 1;
        System.out.println(currentPage);
    }
    void closeBook(){
        currentPage=0;
        System.out.println(currentPage);
    }
    void turnPageRight(){
        currentPage+=1;
        System.out.println(currentPage);
    }
    void turnPageLeft(){
        currentPage-=1;
        System.out.println(currentPage);
    }
    void displayTitle(){
        System.out.println(title);
    }
}
