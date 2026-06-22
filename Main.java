import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
           
            System.out.println("\n=================================");
            System.out.println("        BASIC CALCULATOR        ");
            System.out.println("=================================");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit Program");
            System.out.println("=================================");
            System.out.print("Select an option (1-5): ");
            choice = input.nextInt();

           
            if (choice >= 1 && choice <= 4) {
               
                System.out.print("\nEnter positive number 1: ");
                int n1 = input.nextInt();
                
                System.out.print("Enter positive number 2: ");
                int n2 = input.nextInt();

                
                Calculator calc = new Calculator(n1, n2);
                
                        

                System.out.println("\n--- Calculation Result ---");
                switch (choice) {
                    case 1:
                        calc.Addition();
                        break;
                    case 2:
                        calc.Substrstion();
                        break;
                    case 3:
                        calc.Multiplication();
                        break;
                    case 4:
                        calc.Division();
                }
                System.out.println("--------------------------");

            } else if (choice == 5) {
                System.out.println("\nThank you for using Basic Calculator. Goodbye!");
            } else {
                System.out.println("\nError: Invalid menu choice! Please select an option between 1 and 5.");
            }

        } while (choice != 5); 

        input.close();
    }
}