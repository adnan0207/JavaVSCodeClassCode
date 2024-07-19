import java.util.Scanner;

public class InputWithImport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        System.out.println("The number you have entered is : " + x);
    }
}
