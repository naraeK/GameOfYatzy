import java.util.Scanner;

public class additionalCalculator {
    public static void main (String [] args ){

        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number < 0) {
            System.out.println("Choose a positive integer: ");
            while(!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Choose a positive integer: ");
            }
            number = scanner.nextInt();
        }
        scanner.close();

        // Additional Calculator from 0 to the chosen number
        int sum = 0;
        for(int i=0; i<= number; i++){
            sum += i;
        }
        System.out.println("\n The total sum is "+sum);
    }
}
