import java.util.Scanner;
public class Sum {
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        a = sc.nextInt();
        System.out.print("Enter The Second Number: ");
        b = sc.nextInt();
        c = a+b;
        System.out.print("Sum of "+a+" and "+b+ " is: " + c);
    }
}
