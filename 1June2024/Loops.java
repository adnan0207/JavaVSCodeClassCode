public class Loops {
    public static void main(String[] args) {
        
        // System.out.println("1");
        // System.out.println("2");
        // System.out.println("3");
        // System.out.println("4");
        // System.out.println("5");
        // System.out.println("6");
        // System.out.println("7");
        // System.out.println("8");
        // System.out.println("9");
        // System.out.println("10");
        // not god way 
        // what if we want to write till 100 we would use loop

        for(int i=1; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("Line after for loop");

        for(int j=1; j<=10; j++){
            System.out.println(j + ") Hello I am inside for loop");
        }

        System.out.println("Line after 2nd for loop");

        int counter = 1;

        while(counter<=10){
            System.out.println(counter + " this is inside while loop");
            counter++;
        }

        System.out.println("Line after while loop");

        int newCounter = 1;

        do{
            System.out.println(newCounter + " This is do while loop working");
            newCounter++;
        }while(newCounter<=10);

        System.out.println("Line after do while loop");

        // in do while loop the loop runs at least one time no matter what

        int otherCounter = 15;

        do{
            System.out.println(otherCounter + " This is other example of do while loop");
            otherCounter++;
        }while(otherCounter<=10);

        System.out.println("Line after 2nd do while loop");
    }
}
