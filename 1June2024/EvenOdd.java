public class EvenOdd {
    public static void main(String[] args) {

        int number = 52;

        EvenOdd obj1 = new EvenOdd();
        boolean isEven = obj1.checkEvenOdd(number);

        System.out.println("Is number " + number + " Even?");
        System.out.println("Ans. " + isEven);

        obj1.printEvenNumberBetweenOnetoHundred();

        obj1.printEvenAndOddBetweenOneToHunder();
    }   
    
    boolean checkEvenOdd(int x){

        int remainder = x % 2;
        if(remainder == 0){
            System.out.println("It is an even number");
            return true;
        } else {
            System.out.println("It is an odd number");
            return false;
        }
    }

    void printEvenNumberBetweenOnetoHundred(){
        for(int i=1; i<=100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    void printEvenAndOddBetweenOneToHunder(){
        for(int i=1; i<=100; i++){
            if(i % 2 == 0){
                System.out.println(i + " is even");
            } else{
                System.out.println(i + " is odd");
            }
        }
    }
}
