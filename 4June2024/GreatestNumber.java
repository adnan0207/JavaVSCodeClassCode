public class GreatestNumber {
    public static void main(String[] args){

        int[] arr = new int[7];

        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 70;
        arr[3] = 15;
        arr[4] = 11;
        arr[5] = 8;
        arr[6] = 1;

        GreatestNumber obj = new GreatestNumber();

        int max = obj.findTheGreatest(arr);
        System.out.println("The Maximum number in your array is : " + max);
    }

    int findTheGreatest(int[] a){
        int max = 0;
        for(int i=0; i<a.length; i++){
            
            if(a[i]>=max){
                max = a[i];
            }
            
        }
        return max;
    }
}
