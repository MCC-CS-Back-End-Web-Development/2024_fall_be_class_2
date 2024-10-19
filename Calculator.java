import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our calculator\n");
        String goAgain = "y";
        while(goAgain.equalsIgnoreCase("y")){
            System.out.print("Please enter the first number: ");
            double firstNum = input.nextDouble();
            input.nextLine();

            System.out.print("Please enter the second number: ");
            double secondNum = input.nextDouble();
            input.nextLine();

            System.out.print("Please enter your operation: ");
            String operator = input.nextLine();

            System.out.print("\nResult of: " + firstNum + " " + operator + " " + secondNum + " = ");
            if(operator.equals("+")) {
                System.out.println(firstNum + secondNum + "\n");
            }
            else if(operator.equals("-")) {
                System.out.println(firstNum - secondNum + "\n");
            }
            else if(operator.equals("*")) {
                System.out.println(firstNum * secondNum + "\n");
            }
            else if(operator.equals("/")) {
                System.out.println(firstNum / secondNum + "\n");
            }
            else if(operator.equals("%")) {
                System.out.println(firstNum % secondNum + "\n");
            }

            System.out.print("Continue? (y/n): ");
            goAgain = input.nextLine();
            System.out.println();
        }
    }
}
