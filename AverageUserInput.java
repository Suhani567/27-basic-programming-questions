import java.util.Scanner;

public class AverageUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();
            sum += num;
        }

        double avg = sum / n;
        System.out.println("Average: " + avg);

        sc.close();
    }
}
