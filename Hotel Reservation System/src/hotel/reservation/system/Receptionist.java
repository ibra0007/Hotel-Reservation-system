
package hotel.reservation.system;


public class Receptionist extends Employee {

    public Receptionist(String n, String p) {
        super(n, p);
    }      
@Override
public void Menu()
{
System.out.println("- View all rooms");
System.out.println("- Make new reservation");
System.out.println("- View all reservation");
System.out.println("- Add new coustomer");
System.out.println("- View all coustomers");
System.out.println("- Delete coustomer by id ");
System.out.println("- Sign out");
}
}
