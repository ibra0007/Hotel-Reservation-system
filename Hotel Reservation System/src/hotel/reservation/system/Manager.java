
package hotel.reservation.system;

import java.util.Scanner;


public class Manager extends Employee {
    
    public Manager(/*int i*/ String n, String p) {
        super( n, p);
    }

  
Scanner input = new Scanner  (System.in) ;
 

    @Override
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    @Override
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    @Override
    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }

    @Override
    public int getEmp_id() {
        return emp_id;
    }

    @Override
    public String getEmp_name() {
        return emp_name;
    }

    @Override
    public String getEmp_password() {
        return emp_password;
    }

    @Override
    public void Menu (){
System.out.println("- View all rooms");
System.out.println("- Make new reservation");
System.out.println("- View all reservation");
System.out.println("- Add new coustomer");
System.out.println("- View all coustomers");
System.out.println("- Delete coustomer by id ");
System.out.println("- Sign out");
//
System.out.println("- Add new receptionst ");
System.out.println("- View all receptionst ");
System.out.println("- Delete receptionst by id ");
System.out.println("- Delete all receptionst ");
}
    

    @Override
    public void print(){
System.out.println("Manager userName is :"+ getUsername()+"Manager password is :"+getPassword() );
}

    private String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}