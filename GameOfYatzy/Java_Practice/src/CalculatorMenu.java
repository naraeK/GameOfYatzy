import java.util.Scanner;

class Factorial {
    int fac(int n){
        if (n <= 1) { // WHY NOT  (n < 0)  ?
            return 1;
        }
        else
            return n * fac(n-1);
    }
}

public class CalculatorMenu {
    public static void main (String [] args){
        /*
          2. Make a menu using switch and while loops. Menu from 1 to 3
          3. Add task 1 to menu option 1 in the same file.
     ->   4. Create a calculator for menu 2. Input of numbers and assignments to be input by user.
          3. Create a method to calculate factorial of a number using recursion.
        4. Make sure all menu options logic are in there own private methods.
        5. Extract all methods to their own separate class files and call the methods(instantiate them) from the main user menu.
        6. Make one of the class methods "static" and see that you should be be able to instantiate this method.  Figure out how to call this method.
         */
        Scanner scanner = new Scanner(System.in);
        int menu = 1;// = scanner.nextInt();
        boolean executeLoop = true;
        while (menu != 0 && executeLoop){
            System.out.println("Select a number between 1-3. Exit for 0.");
            menu = scanner.nextInt();
            switch (menu) {
                case 0:
                    executeLoop = false;
                    break;
                case 1:
                    System.out.println("Menu 1: Accumulate sum calculator");
                    int number = -1;
                    while (number < 0) {
                        System.out.println("Choose a positive integer: ");
                        while(!scanner.hasNextInt()) {
                            scanner.next();
                            System.out.println("Choose a positive integer: ");
                        }
                        number = scanner.nextInt();
                    }
                    //scanner.close();

                    // Additional Calculator from 0 to the chosen number
                    int sum = 0;
                    for(int i=0; i<= number; i++){
                        sum += i;
                    }
                    System.out.println("\n The total sum is "+sum);
                    break;
                case 2:
                    System.out.println("Menu 2: self-defined calculator");
                    System.out.println("Select assignment by the number: 1. + 2. - 3. * 4. / 5. %");
                    int assignment = scanner.nextInt();
                    System.out.println("Select the first number.");
                    double num1 = scanner.nextDouble();
                    System.out.println("Select the second number.");
                    double num2 = scanner.nextDouble();
                    switch (assignment) {
                        case 1:
                            double addNum = num1 + num2;
                            System.out.println( num1 + " + " + num2 + " = " + addNum);
                            break;
                        case 2:
                            double subtractNum = num1 - num2;
                            System.out.println( num1 + " - " + num2 + " = " + subtractNum);
                            break;
                        case 3:
                            double multiNum = num1 * num2;
                            System.out.println( num1 + " * " + num2 + " = " + multiNum);
                            break;
                        case 4:
                            while (num2 == 0) {
                                System.out.println("Select non-zero for the second number.");
                                num2 = scanner.nextDouble();
                            }
                            double devNum = num1 / num2;
                            System.out.println( num1 + " / " + num2 + " = " + devNum);
                            break;
                        case 5:
                            while (num2 == 0) {
                                System.out.println("Select non-zero for the second number.");
                                num2 = scanner.nextDouble();
                            }
                            double modNum = num1 % num2;
                            System.out.println( num1 + " % " + num2 + " = " + modNum);
                            break;
                    }

                    break;
                case 3:
                    System.out.println("Menu 3: Factorial calculator");
                    Factorial Fac = new Factorial();
                    int input = -1;
                    while (input < 0) {
                        System.out.println("Choose a positive integer: ");
                        while(!scanner.hasNextInt()) {
                            scanner.next();
                            System.out.println("Choose a positive integer: ");
                        }
                        input = scanner.nextInt();
                    }
                    int output = Fac.fac(input);
                    System.out.println(input+"! = "+ output);
                    break;
                default:
                    System.out.println("Not a vaild number.");
                    break;
            }
        }
        System.out.println("Good bye :) ");

        scanner.close();
    }
}
