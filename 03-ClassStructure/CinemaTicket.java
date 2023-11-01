public class CinemaTicket {
    static String cinemaName="Morning Star Cinema";
    String film;
    int row;
    int seat;
    double price;

    public CinemaTicket(String film,int row,int seat){
        this.film = film;
        this.row = row;
        this.seat = seat;
        // if(row==1 || row==2 ){
        //     this.price=10;
        // }else{
        //     this.price=25;
        // }
        this.price=(row<=2) ? 10:25;
    }
    public String toString() {
        return String.format(String.format("Kino: %s\nFilm:%s\nRow:%d\nSeat:%s\nPrice:%s",
        cinemaName, this.film, this.row,this.seat,this.price));
 }
public static void main(String[] args){
        CinemaTicket ticket1 = new CinemaTicket("Gladiator",2, 3);
        CinemaTicket ticket2 = new CinemaTicket("Gladiator",7, 7);
        System.out.println("\n"+ticket1+"\n");
        System.out.println(ticket2);


     }
}
