import java.util.Scanner;
public class fixingNum2 {
    public static void main (String [] args){
        /*
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
                    /*
                    System.out.println("Select the first number.");
                    double num1 = scanner.nextDouble();
                    System.out.println("Select the second number.");
                    double num2 = scanner.nextDouble();
                    System.out.println("Select one assignment: + - * / % ");
                    String assignment = String.valueOf(scanner.nextLine());
                    //char assignment = scanner.next().charAt(0);
                    System.out.println(assignment);
                    */
/*
                    if (assignment == "+") {//(assignment.equals("+")) {
                        double result = num1 + num2;
                        System.out.println(num1+scanner.next()+num2+" = "+result);
                    }
                    else if (assignment == "-") {//(assignment.equals("-")){
                        double result = num1 - num2;
                        System.out.println(num1+scanner.next()+num2+" = "+result);
                    }
                    else if (assignment == "*") {//(assignment.equals("*")){
                        double result = num1 * num2;
                        System.out.println(num1+scanner.next()+num2+" = "+result);
                    }
                    else if (assignment == "/") {//(assignment.equals("/")){
                        double result = num1 / num2;
                        System.out.println(num1+scanner.next()+num2+" = "+result);
                    }
                    else if (assignment == "%") {//(assignment.equals("%")){
                        double result = num1 % num2;
                        System.out.println(num1+scanner.next()+num2+" = "+result);
                    }
                    else {
                        System.out.println("Wrong input.");
                    }

                    break;
                case 3:
                    System.out.println("Menu 3: Factorial calculator");

                    break;
                default:
                    System.out.println("Not a vaild number.");
                    break;
            }
        }
        System.out.println("Good bye :) ");

        scanner.close();
*/
    }
}
