public class DifferentTypeOfVariables{
    
    // Instance variable
    int a;
    int b;

    // Static variable
    static int c;


    int add(int x, int y){
        // Local variable
        int sum;    
        sum = x+y;
        return sum;
    }


    public static void main(String[] args) {
        
        DifferentTypeOfVariables obj1 = new DifferentTypeOfVariables();
        DifferentTypeOfVariables obj2 = new DifferentTypeOfVariables();
        DifferentTypeOfVariables obj3 = new DifferentTypeOfVariables();

        obj1.a = 1;
        obj1.b = 2;

        System.out.println(obj1.a + " , " + obj1.b);
        System.out.println(obj1.c);
        obj1.c = 10;
        
        obj2.a = 11;
        obj2.b = 12;
        
        System.out.println(obj2.a + " , " + obj2.b);
        System.out.println(obj2.c);
        
        obj3.a = 15;
        obj3.b = 26;
        
        System.out.println(obj3.a + " , " + obj3.b);
        System.out.println(obj3.c);
        
        
        System.out.println(obj1.a + " , " + obj1.b);
        System.out.println(obj3.c);
        obj2.c = 120;
        System.out.println(obj3.c);
    }
}