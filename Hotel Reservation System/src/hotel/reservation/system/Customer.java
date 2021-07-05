
package hotel.reservation.system;


public class Customer {
    static int c_count = 0 ;
    int c_id ;
    String c_name ;
    int reservations [] ;
    
    public Customer(int i , String n , int[] r) {
    this.c_id = i ;
    this.c_name = n ;
    this.reservations = r ;
    c_count ++ ;
    }
    public Customer(int i , String n) {
    this.c_id = i ;
    this.c_name = n ;
    c_count ++ ;
    }

    Customer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getC_id() {
        return c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public int[] getReservations() {
        return reservations;
    }
    
    public static String[] add_reservation(int size ,String z , String reser[] ){
    int i ; 
    String re[] = new String [size + 1];
    for (i=0 ; i<size ; i++) 
    re[i] =  reser[i] ;
    re[size] = z ;
    return re ;
    }  

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
