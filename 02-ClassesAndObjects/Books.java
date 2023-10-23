public class Books {
    public static void main(String[] args){
        BooksDescription s1 = new BooksDescription();
        s1.title="Hobbit";
        s1.author="Tolkien";
        s1.publishedDate=1975;
        s1.type="Fantasy";
        s1.numberOfPages=780;
        s1.currentPage=0;

        s1.displayTitle();
        s1.openBook();
        s1.turnPageRight();
        s1.turnPageRight();
        s1.turnPageRight();
        s1.turnPageRight();
        s1.closeBook();

        BooksDescription s2 = new BooksDescription();
        s2.title="Witcher";
        s2.author="Sapkowski";
        s2.publishedDate=1970;
        s2.type="Fantasy";
        s2.numberOfPages=1000;
        s2.currentPage=0;

        s2.displayTitle();
        s2.openBook();
        s2.turnPageRight();
        s2.turnPageRight();
        s2.closeBook();
    }
}
