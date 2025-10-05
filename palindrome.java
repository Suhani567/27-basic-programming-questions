import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int original = a;

        int rev = 0 ;
        
        while(a>0){
            int rem = a%10;
            rev = rev*10 + rem;
            a = a/10;
        }
        if(rev == original ){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();

    }
}
