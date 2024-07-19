public class Program4{
    public static void main(String[] args){
        Program4 obj1 = new Program4();
        int a = obj1.doubleTheNumber(10);
        System.out.print("Double of 10 is = ");
        System.out.println(a);
    }

    int doubleTheNumber(int x){
        return (2*x);
    }
}