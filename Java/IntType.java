import java.util.Scanner;
public class IntType {
    public static void main(String args[])
    {
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = scn.nextInt();
        if(num==0)
        {
            System.out.print("The Number is Zero");
        } else if (num<0)
        {
            System.out.print("The Number is Negetive");
        }
        else
        {
            System.out.print("The Number is Positive");
        }
    }
}
