import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner num1=new Scanner(System.in);
        int a=num1.nextInt();
        Scanner num2=new Scanner(System.in);
        int b=num2.nextInt();
        int result = power(a,b);
        System.out.println(a + "^" + b + "=" + result);
    }

    public static int power(int a, int b) {
        if (b != 0) {
            return (a * power(a, b- 1));
        }
        else {
            return 1;
        }
    }
}