import java.util.Scanner;

public class FactorialRecursion {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0)  // Base case: factorial of 0 is 1
            return 1;
        else
            return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calling the factorial method and printing the result
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
