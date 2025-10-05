public class swap1{
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        System.out.println("Before swapping: " + a);
        System.out.println(  b);
       
            a = a+b;
            b = a-b;
            a = a-b;

            System.out.println("After swapping: " + a );
            System.out.println(b);
        
    }
}