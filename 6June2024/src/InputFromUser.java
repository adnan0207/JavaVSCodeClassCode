import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {

        additionUser();

        int sum = additionAlreadyGivenInputs(20, 10);
        System.out.println("Your sum is : " + sum);
        
    }

    static void additionUser(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("Sum of " + a + " and " + b + " is : " + sum);

    }

    static int additionAlreadyGivenInputs(int a, int b){
        return a+b;
    }
    
}
