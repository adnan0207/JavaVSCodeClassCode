public class InputWithoutImport {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);    
        // here in this code we are using fully qualified name directly so we do not need to import it seperately
        
        System.out.print("Please enter a number : ");
        int a = sc.nextInt();
        System.out.println("The number user has entered is : " + a);
    }
}
