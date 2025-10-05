public class sumusingarrandf {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println("sum of array is "+arraysum(arr));

    }
        public static int arraysum(int[] arr){
            int sum = 0;
            for(int i =0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum;
        }
    }

