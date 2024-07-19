public class Program1 {
    public static void main(String[] args){
        int a = 10;
        int b = 2;

        Program1 obj1 = new Program1();

        int addition = obj1.add(a, b);
        int subtraction = obj1.sub(a, b);
        int multiplication = obj1.mul(a, b);
        int division = obj1.div(a, b);

        System.out.println("sum is : " + addition);
        System.out.println("differnce is : " + subtraction);
        System.out.println("product is : " + multiplication);
        System.out.println("Division is : " + division);
    }
    int add(int x, int y){
        return x+y;
    }
    int sub(int x, int y){
        return x-y;
    }
    int mul(int x, int y){
        return x*y;
    }
    int div(int x, int y){
        return x/y;
    }
}
