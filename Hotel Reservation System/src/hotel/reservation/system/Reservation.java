
package hotel.reservation.system;
import java.util.Date;

public class Reservation {
static int reserv_count ;
int reserv_id ;
Date date_created ;
int duration ;
Employee employee ;
Customer customer ;
Room room ;
public Reservation(int id, int ReservationCount) {
        this.reserv_id = id;
        Reservation.reserv_count = ReservationCount;
    }
 public Reservation(int ReservationCount) {
        Reservation.reserv_count = ReservationCount;
        reserv_id =ReservationCount;
        ReservationCount++;
    }
 
public Reservation (int r_id    ,String username, String password  )  {

}
public void menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Reservation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public void Print (){
System.out.println("\n ID :"+ reserv_id+  "\n Date :" + date_created +  "\n Duration :"+ duration) ;
}

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
