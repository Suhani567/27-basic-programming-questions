public class sumofdigit {
    public static void main(String[] args) {
        int num = 1352;
        int sum = 0 ;
        int temp = num;
        for(int i =0;i<=num;i++){
            int rem = temp%10;
            sum+=rem;
             temp= temp/10;
        }
        System.out.println("sum of digit "+sum);
    }
}
