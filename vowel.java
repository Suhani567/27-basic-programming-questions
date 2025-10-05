import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();

        String vowels = " ";
        int count = 0;
        for(int i =0;i<ch.length();i++){
        if(ch.charAt(i)== 'a'|| ch.charAt(i)=='e' || ch.charAt(i)=='i'|| ch.charAt(i) == 'o'|| ch.charAt(i)=='u'){
            count++;
            vowels += ch.charAt(i) + " ";
        }
    }
    System.out.println("vowels are : " + vowels);
    System.out.println("vowel count is : " + count);
    }
}
