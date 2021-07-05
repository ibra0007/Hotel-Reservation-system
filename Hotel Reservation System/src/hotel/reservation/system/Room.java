
package hotel.reservation.system;
import java.util.ArrayList;
import java.util.List;
public class Room {
static int r_count = 0 ;
int r_number ;
String r_type ;
Reservation reservation ;
boolean resetvation ;
public List<Reservation> getRList(){
        return re_List;
    }
public void setRList(List<Reservation> ReservtionList)
{
this.re_List = ReservtionList;
}

List<Reservation> re_List= new ArrayList<>();
public Room(String t)
 {
 this.r_type=t;
 r_count++;
 this.r_number=r_count;
 }

    public void setR_number(int r_number) {
        this.r_number = r_number;
    }

    public void setR_type(String r_type) {
        this.r_type = r_type;
    }

    public int getR_number() {
        return r_number;
    }

    public String getR_type() {
        return r_type;
    }

public boolean isReserved ()
{
    return this.getRList()!=null&& !this.getRList().isEmpty();        
}
public void reserve (Reservation reservation)
{
this.re_List.add(reservation);
}
public void free()
{
this.re_List=null;
}

    void printRoom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
  

