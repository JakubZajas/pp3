public class CinemaTicket {
    static String cinemaName="Planet Cinema";
    String film;
    int row;
    int seat;
    double price;
     public String toString() {
         return String.format(String.format("%02d:%02d:%04.1f\n",
this.cinemaName, this.film, this.row,this.seat,this.price);
 }
public static void main(String[] args){
        System.out.println(CinemaTicket.cinemaName);
     }
}
