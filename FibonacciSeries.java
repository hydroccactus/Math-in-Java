import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of examples to generate: ");
        int numExamples = scanner.nextInt();

        for (int i = 0; i < numExamples; i++) {
            System.out.print("Input n for Example " + (i + 1) + ": ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
            } else {
                System.out.println("Fibonacci numbers up to the " + n + "-th term for Example " + (i + 1) + ":");
                int a = 1, b = 1;
                System.out.print(a + " " + b + " ");
                for (int j = 3; j <= n; j++) {
                    int next = a + b;
                    System.out.print(next + " ");
                    a = b;
                    b = next;
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
