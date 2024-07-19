public class PrimeNumber {
    public static void main(String[] args){

        System.out.println("This is a prime number program");

        PrimeNumber obj = new PrimeNumber();

        obj.checkForPrime(101);

        System.out.println("Other way to check");

        obj.checkForPrimeOtherWay(121);
    }

    boolean checkForPrime(int number){

        if(number == 1){
            System.out.println(number + " is not a prime number");
            return false;
        }

        int remainder;
        for(int i=2; i<=number-1; i++){
            remainder = number%i;

            if(remainder == 0){
                System.out.println(number + " is not a prime number");
                return false;
            }
        }

        System.out.println(number + " is a prime number");
        return true;
    }

    void checkForPrimeOtherWay(int number){

        if(number == 1){
            System.out.println(number + " is not a prime number");
            return;
        }

        int remainder;
        for(int i=2; i<=number-1; i++){
            remainder = number%i;

            if(remainder == 0){
                System.out.println(number + " is not a prime number");
                return;
            }
        }

        System.out.println(number + " is a prime number");
        return;
    }
}
