public class TableOfTwoAllLoops {
    public static void main(String[] args) {
        int number = 2;

        // 1. For loop
        System.out.println("Multiplication Table of " + number + " using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        System.out.println(); 

        // 2. While loop
        System.out.println("Multiplication Table of " + number + " using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }

        System.out.println(); 

        // 3. Do-while loop
        System.out.println("Multiplication Table of " + number + " using do-while loop:");
        int j = 1;
        do {
            System.out.println(number + " x " + j + " = " + (number * j));
            j++;
        } while (j <= 10);

        System.out.println(); 

        // 4. For-each loop
        System.out.println("Multiplication Table of " + number + " using for-each loop:");
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int n : numbers) {
            System.out.println(number + " x " + n + " = " + (number * n));
        }
    }
}
