public class Method {

    public static void main(String[] args){

        Method obj1 = new Method();

        // obj1.openAccount(); // ab isme input dalne ke liye Customer ka object banana pdega aur usme value dalni padegi

        Customer customer1 = new Customer();
        customer1.firstName = "Adnan";
        customer1.lastName = "Khan";
        customer1.salary = 1500;
        customer1.age = 21;
        customer1.isMarried = false;
        customer1.aadharNumber = 34567;
        customer1.pancardNumber = "ABC123";

        obj1.openAccount(customer1);

    }
   
    AccountOpenInformation openAccount(Customer customer){

        // Conditional Statements

        if(customer.age>18){
            System.out.println("Yes you are eligible to open account as you are adult");
        }

        System.out.println("line after if block");

        if(customer.salary>10000){
            System.out.println("You can open account you have a valid salary");
        }

        System.out.println("line after 2nd if block");

        if(customer.isMarried == true){
            System.out.println("You are married");
        } else {
            System.out.println("You are unmarried");
        }

        System.out.println("line after if-else block");

        if(customer.aadharNumber == 12345){
            System.out.println("Conditon 1 is true");
        } else if(customer.aadharNumber == 23456){
            System.out.println("Condition 2 is true");
        } else if(customer.aadharNumber == 34567){
            System.out.println("Conditon 3 is true");
        } else{                                         // it is not compulsory to use the last else block
            System.out.println("None of the condition is true");
        }

        System.out.println("line after if-else-if block");

        if(customer.pancardNumber == "ABC123"){
            System.out.println("Conditon 1 is true");
        } else if(customer.pancardNumber == "PQR456"){
            System.out.println("Condition 2 is true");
        } else if(customer.pancardNumber == "XYZ789"){
            System.out.println("Conditon 3 is true");
        }
        System.out.println("line after if-else-if block without last else");

        return new AccountOpenInformation();
    }
}