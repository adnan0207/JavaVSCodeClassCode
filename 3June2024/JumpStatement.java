public class JumpStatement {
    public static void main(String[] args){

        for(int i=0; i<=10; i++){

            if (i == 5) {
                continue;       // jb i ki value 5 hogi toh loop uss wali itration ko skip kr dega aur next itration m chale jaata h
            } else {
            System.out.println("Hello World " + i);
            }

            System.out.println("NON CONDITIONAL STATEMENT " + i);
        }

        for(int i=0; i<=10; i++){

            if (i == 5) {
                System.out.println("Hello Adnan");
                continue;  
            } else {
            System.out.println("Hello World " + i);
            }

            System.out.println("NON CONDITIONAL STATEMENT " + i);
        }

        int count = 0;
        while (count <= 10) {

            if (count == 3) {
                count++;
                continue;
            } else {
                System.out.println("Inside While Loop " + count);
            }
            
            System.out.println("NON CONDITIONAL STATEMENT OF WHILE LOOP " + count);
            count++;
        }

        for(int i=0; i<=10; i++){

            if (i == 5) {
                break;       // jb i ki value 5 hogi toh loop se exit kr dega
            } else {
            System.out.println("Hello World " + i);
            }

            System.out.println("After IF ELSE in for loop");
        }
        System.out.println("Line after for loop with break statement");

        for(int i=0; i<=10; i++){
            System.out.println("This loop has break without if else");
            break;
        }
        System.out.println("LINE AFTER ANOTHER FOR LOOP WITH BREAK BUT NO IF ELSE");
    }    
}
