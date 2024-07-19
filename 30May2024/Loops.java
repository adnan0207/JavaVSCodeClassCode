public class Loops {
    public static void main(String[] args){

        // x=1; ------------ initialization
        // x<=10; ---------- condition
        // x=x+1; ---------- increment or decrement

        int x;
        for(x=1; x<=10; x=x+1){                 // if we remove the condition then it will be infine loop would never stop
            System.out.println("Hello you are inside a loop");
        }

        System.out.println("line after loop");
    }    
}
