import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        emplo emp=new emplo();
        System.out.println("Enter employee details");
        emp.name= scan.next();
        emp.age= scan.nextInt();
        emp.phno= scan.nextLong();
        emp.address= scan.next();
        emp.specialisation= scan.next();
        emp.salary=scan.nextInt();

        manager man=new manager();
        System.out.println("Enter manager details");
        man.name= scan.next();
        man.age= scan.nextInt();
        man.phno= scan.nextLong();
        man.address= scan.next();
        man.department= scan.next();
        man.salary=scan.nextInt();

        System.out.println("The Employee Details are: \nName: "+emp.name+"\nAge: "+emp.age+"\nPhone number: "+emp.phno+"\nAddress: "+emp.address+"\nSpecialisation: "+emp.specialisation);
        emp.printSalary(emp.salary);
        System.out.println("The Manager Details are: \nName: "+man.name+"\nAge: "+man.age+"\nPhone number: "+man.phno+"\nAddress: "+man.address+"\nDepartment: "+man.department);
        man.printSalary(man.salary);
    }
}