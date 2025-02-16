import java.util.Scanner;
public class Prime {
    public static void main(String args[]) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");

        if (sc.hasNextInt()) {
            int p = sc.nextInt();

            if (p <= 1) {
                System.out.println("Not prime");
            } else {
                for (int i = 1; i <= p; i++) {
                    if (p % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        sc.close();
    }
}