import java.util.Scanner;

public class squareroottillinput {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i =1;i<=n ;i++){
            double root =0;
            while(root*root<=i){
                root = root + 0.1;
            }
             System.out.printf("Square root of %d is: %.1f%n", i, root);
        }
}
}
