public class details {

    public static void main(String[] args)
    {
        System.out.println("Name \t Year of joining \t\t Address \t\t\t Salary");
        Employee e1 = new Employee();
        e1.details("Robert",1994,"  64C-WallsStreet",  24000);
        Employee e2 = new Employee();
        e2.details("Sam   ",2000,"  68D-WallsStreet",  30000);
        Employee e3 = new Employee();
        e3.details("John",1999,"  26B-WallsStreet",  65000);
    }
}