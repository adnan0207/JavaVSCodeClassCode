public class StaticConcepts {

    // static method could be called without making objects
    static int add(int x, int y){
        int sum;    
        sum = x+y;
        return sum;
    }

    void demoMethod(){
        add(10, 20);    // we can call a static method in a non static method
    }

    void oneMoreDemo(){     // here we are able to call demoMethod(); cause both are non static
        demoMethod();
    }

    static void demo(){

    }

    void method1(){
        
    }

    void method2(){
        method1();
    }

    void method3(){
        method1();
        method2();
        demo();
    }
    static void method4(){
        demo();
        add(12, 50);
        // method3();  // this cant be called as "method3()" is non static and we are calling in a static method "method4()"
        // to call "method3()" we need to make object
        StaticConcepts obj1 = new StaticConcepts();
        obj1.method3();
    }


    // main method is made static cause it could be called without making object cause when java run it JVM wont make object it could be called easily by its name
    public static void main(String[] args) {

        // demoMethod();       // we can not call non static method in a static method
        // oneMoreDemo();      // as "public static void main(String[] args)" has static keyword in it
        
        add(20, 50);       // we are able to call as it is static

    }
}
