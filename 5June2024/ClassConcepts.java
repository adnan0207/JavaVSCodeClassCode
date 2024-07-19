public class ClassConcepts {
    
    // Instance variable (int a, int b): directly present inside a class and every object made from this class will have seperate copy of them
    int a;
    int b;

    // Static variable (int c): class level variable all the objects are gonna share single copy
    static int c;


    // System.out.println(sum);    // not possible to use cause it is a class, a class only have variables and methods


    int add(int x, int y){
        // Local variable (int sum): present inside a function and its life exist only till the function is executed
        int sum;    
        // System.out.println(sum);    // it will give error cause in java local variables are not given any default value, they could only be used after declaration as well as initialization 
        sum = x+y;
        // System.out.println(sum);    // This is valid
        return sum;
    }
    
}
