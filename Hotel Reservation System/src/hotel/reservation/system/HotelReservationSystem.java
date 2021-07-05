
package hotel.reservation.system;

//static int size = 100 ;
import java.util.Scanner;


public class HotelReservationSystem {

        public static void main(String[] args) {

Data.employee.add(1, new Manager ("IBRA","IB123"));
Data.employee.add(2, new Receptionist ("FOUAD","FOU123"));
Data.employee.add(3, new Receptionist ("User","User1"));
Data.customer.add(1, new Customer (1,"ibra",new int[] {0,2} ));
Data.room[0] = new Room("Royal") ;
Data.room[1] = new Room("Royal") ;
Data.room[3] = new Room("Royal") ;
Data.room[4] = new Room("Suit") ;
Data.room[5] = new Room("Suit") ;
Data.room[6] = new Room("Suit") ;
Data.room[7] = new Room("Presidential") ;
Data.room[8] = new Room("Presidential") ;
Data.room[9] = new Room("BB") ;
Data.room[10] = new Room("BB") ;

Scanner input = new Scanner(System.in) ;
System.out.println("Enter username ");
String username = input.next() ;
int x = -1 ;
for(int i = 0 ; i<10 ; i++) 
{
if (Data.employee.get(1) !=null)
{
if (Data.employee.get(1).emp_name.equals(username))
{
 x = 1 ;
 break ;
}
}
}
if (x == -1)
{
System.out.println("User dose not exist");
System.exit(0);
}
boolean menu= true ;
while(menu){
System.out.println("Enter password");
String password =input.next() ;

if (Data.employee.get(x).validatepassword(password))
{
Data.employee.get(x).Menu();
break;
}
else
{
System.out.print("wrong password");
}
}
while(menu)
{
Data.employee.get(x).Menu();
int Choise = input.nextInt();
if(Data.employee.get(x)==Data.employee.get(0))
{
switch (Choise)
{
case 1 : 
for(int r=0;r<10;r++)
{
Data.room[r].printRoom(); 
}
break ;
case 2 : 
System.out.println("\n Please Enter Empolyee name :");
String empName = input.next();
System.out.println("\n Please Enter Empolyee password :");
String empPassword = input.next();
int em=3;
Data.employee.add(em, new Receptionist(empName,empPassword));
Data.employee.get(em).print(empName,empPassword);
break ;
case 3 :
for(int i=1; i <Data.employee.size();i++)
{ 
Data.employee.get(i).print();
} 
break ;
case 4 :
System.out.println("if u want to delete any id, enter the id ");
int ibra1= input.nextInt();
if(ibra1>1||ibra1<Data.employee.size())
Data.employee.remove(ibra1);
break ; 
case 5 : 
int ibra2 = input.nextInt();
System.out.print("Enter ID");
Data.reservation.add(ibra2,new Reservation() );
break;
case 6 : 
Data.reservation.get(1).print();
break ;  
case 7 : 
int ibra3 = input.nextInt();
Data.reservation.remove(ibra3);
break ;
case 8 :
int ibra4 = input.nextInt();
Data.customer.add(ibra4,new Customer());
break ;
case 9 :
Data.customer.get(1).print();
break ;
case 10 :
System.out.println(" enter id to delete it ");
int ibra5 = input.nextInt();
Data.customer.remove(ibra5);
break ;
case 11 : 
if(input.nextInt()==1)
{
main(args);
}
break ;
case 12 : 
System.exit(0);
break;
default:
System.out.println("Selection Incorrect");
break;     
}
}    
}
}
}

//        List<Employee> list = new ArrayList<>();
// Employee x, y,z,c ;
// 
// list.add( x = new Employee(1, "Ravi","Delhi"));
// list.add( y = new Employee(2, "Raj","Mumbai"));
// list.add( z = new Employee(3, "Rekha","Chennai"));
// list.add( c = new Employee(4, "Ram","Siliguri"));
// 
// for (Employee s : list) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
// {
// System.out.print("\nID "+ x.emp_id + "\nName " + x.emp_name + "\npassword "+x.emp_password );
//// System.out.println(x.getId()+" "+x.getName()+" " +x.getpassword());
// }
// //End of main() method
    
    

