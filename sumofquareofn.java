import java.util.Scanner;

public class sumofquareofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i =1;i<=n;i++){
            System.out.print("Write the numbers " + i +" is: ");
            int num = sc.nextInt();
            int temp = num;

            while(temp>0){
                int rem = temp%10;
                sum += rem*rem;  
                temp = temp/10;
            }
        }
        System.out.println("Sum of square of "+ sum);

    }
}
