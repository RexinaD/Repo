import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private double salary;
    void read(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    void calsalary(){
    
        double hra;
        double da;
        double pf;
        
        hra = 0.10*salary;
        da=0.50*salary;
        pf=0.70*salary;
        salary=salary+hra+da+pf;
    }
    void display(){
        System.out.println("your salary details are");
        System.out.println(" name is " +this.name);
        System.out.println(" id is " +this.id);
        System.out.println(" gross salary " +this.salary);

        
    }
}
class EmployeeTest{
    public static void main(String args[]){
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your employee id");
        int id=sc.nextInt();
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("enter your salary");
        double salary=sc.nextDouble();
        emp.read(id,name,salary);
        emp.calsalary();
        emp.display();
    }



    }


