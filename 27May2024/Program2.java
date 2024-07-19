public class Program2 {
    public static void main(String[] args){

        Program2 obj1 = new Program2();

        Program2 obj2;
        obj2 = new Program2();

        int x = obj1.doubleTheNumber(20);
        System.out.println(x);

        int y = obj1.doubleTheNumber(30);
        System.out.println(y);
        
        int z = obj2.doubleTheNumber(150);
        System.out.println(z);
    }
    int doubleTheNumber(int x){
        return 2*x;
    }
}
