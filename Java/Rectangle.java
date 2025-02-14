import java.util.Scanner;
/*
public class Rectangle{
    void area(float len, float bre) {
        float a = len * bre;
        System.out.println("Aera is "+ a);
    }
    void peri(float len, float bre) {
        float s = len + bre;
        float p = 2 * s;
        System.out.println("Perimeter is "+p);
    }
    public static void main(String[] args) {
        float l, b;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Length: ");
        l = scn.nextFloat();
        System.out.print("Enter Bredth: ");
        b = scn.nextFloat();
        Rectangle obj1 = new Rectangle();
        obj1.area(l,b);
        obj1.peri(l,b);
    }
}
*/
public class Rectangle{
    void rect(char pref,float len, float bre){
        if(pref=='A')
        {
            float a = len * bre;
            System.out.println("Area is "+ a);
        }
        else if(pref=='P')
        {
            float s = len + bre;
            float p = 2 * s;
            System.out.println("Perimeter is "+p);
        }
        else{
            System.out.println("Wrong Input");
        }
    }
    public static void main(String[] args) {
        char p;
        float l, b;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Choice(A/P): ");
        p = scn.next().charAt(0);
        System.out.print("Enter Length: ");
        l = scn.nextFloat();
        System.out.print("Enter Breadth: ");
        b = scn.nextFloat();
        Rectangle obj1 = new Rectangle();
        obj1.rect(p,l,b);
    }
}