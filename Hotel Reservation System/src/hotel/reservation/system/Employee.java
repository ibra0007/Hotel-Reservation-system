
package hotel.reservation.system;

public abstract class  Employee {
 static int emp_count = 0 ;
 int emp_id ;
 String emp_name ;
 String emp_password ;
   
public Employee (int i ,String n , String p ) {}
 
public Employee( /*int i*/  String n , String p )
{
//emp_id = i ;
emp_name = n ;
emp_password = p ;
//emp_count++ ;
}

 abstract public  void  Menu () ; 

 
public void print (){
System.out.println("\nID :"+ emp_id+  "\nName :" + emp_name +  "\nPassword :"+ emp_password) ;
}

    public static void setEmp_count(int emp_count) {
        Employee.emp_count = emp_count;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public static int getEmp_count() {
        return emp_count;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getEmp_password() {
        return emp_password;
    }

    boolean validatepassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void print(String empName, String empPassword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}




