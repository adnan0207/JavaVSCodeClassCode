public class PrintPatternAndEscapeSequence {
    public static void main(String[] args){
        // patternAlgo1();
        // patternAlgo2();
        // differnceBetweenPrintAndPrintln();
        // escapeSequence();
        // pattern2Algo();
        // pattern3Algo();
        patternAlgo2WithWhileLoop();
    }

    static void patternAlgo1(){
        // *
        // **    
        // ***   
        // ****  
        // ***** 
        // ******
        for(int i=1; i<=6; i++){

            if(i==1){
            System.out.println("*");
            }
            
            if(i==2){
            System.out.println("**");
            }

            if(i==3){
            System.out.println("***");
            }

            if(i==4){
            System.out.println("****");
            }

            if(i==5){
            System.out.println("*****");
            }

            if(i==6){
            System.out.println("******");
            }

        }
    }

    static void patternAlgo2(){
        // *
        // **    
        // ***   
        // ****  
        // ***** 
        // ******
        for(int i=1; i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void patternAlgo2WithWhileLoop(){
        // *
        // **    
        // ***   
        // ****  
        // ***** 
        // ******
        int i=1;
        while(i<=6){

            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }

            System.out.print("\n");
            i++;
        }
    }

    static void pattern2Algo(){
        // ******
        // ***** 
        // ****  
        // ***   
        // **    
        // *   
        for(int i=6; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void pattern3Algo(){
        // *
        // **    
        // ***   
        // ****  
        // ***** 
        // ******
        // ******
        // ***** 
        // ****  
        // ***   
        // **    
        // *   
        for(int i=1; i<=6; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=6; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    static void differnceBetweenPrintAndPrintln(){
        System.out.println("Hello Adnan How are you?? this println will print a NewLine Character");
        System.out.println("Hello Adnan This is other line, this println will print a NewLine Character");

        System.out.print("Hi (this is with print so no NewLine Character)");
        System.out.print("Whatsup (this is with print so no NewLine Character)");
        System.out.print("what is time (this is with print so no NewLine Character)");

        // escape sequence
        // \n -> new line character
        System.out.print("\n");
        System.out.print("HIIIIII");
    }

    static void escapeSequence(){
        System.out.println("Line 1");
        System.out.print("Line 2");
        System.out.print("Line 2");
        System.out.print("\n");
        System.out.print("Line 3");
        System.out.println("Line 3");
        System.out.print("Line 4");
        System.out.print("Line 4 \n");
        System.out.print("Line 5 \n");
        System.out.print("\n");
        System.out.print("Line 7");
        System.out.print("Line 7 \n  Line 8");
    }
}
