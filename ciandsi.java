import java.util.Scanner;

public class ciandsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int si = (p*r*t)/100;
        System.out.println("Simple Interest : " + si);


        double ci = p* Math.pow((1+r/100),t-p);
        System.out.println("Compound Interest : " + ci);
    }
}
