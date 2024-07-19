/* 
methods

a way to perform some task

syntax      return_datatype name_of_method (Parameters/Arguments){
                // code or logic
            }

eg          int addTwoNumber(int x, int y){
                return x+y;
            }
*/

public class Method {
    public static void main(String[] args) {
        
        // without input method
        Method obj1 = new Method();
        obj1.welcomeMsg();

        // with input method
        obj1.customWelcomeMsg("Hello my name is adnan");
        obj1.customWelcomeMsg("I am a custom msg");

        // we write f after a real no to make it consider as float
        // 156.54f

        float fl = obj1.add(10.5f, 10.5f);
        System.out.println("Adding 2 float : " + fl);

        double dou = obj1.addOfDoubles(10.5, 10.5);
        System.out.println("Adding 2 doubles" + dou);


        float perc = obj1.calculatePerc(99, 100);     
        System.out.println("You have got " + perc + " percent marks");

        float per = obj1.calculatePercNew(99f, 100f);     // we change to inputs to float
        System.out.println("You have got " + per + " percent marks");




        boolean isAccountOpened = obj1.openAccount("Adnan", "Khan", 1000, 21, false, 954845454865l, "ATSPE3153G");
        System.out.println("Is your account opened : " + isAccountOpened);


        // passing object as a parameter

        boolean isMyAccountMade = obj1.openAccountForCustomer(new Customer());
        System.out.println("Is my account made : " + isMyAccountMade);
    }

    void welcomeMsg(){
        System.out.println("Hello you are welcome");
    }

    void customWelcomeMsg(String msg){
        System.out.println(msg);
    }

    float add(float a, float b){
        float sum;
        sum = a+b;
        return sum;
    }

    double addOfDoubles(double a, double b){
        double sum;
        sum = a+b;
        return sum;
    }

    float calculatePerc(int marks, int totalMarks){     
        float percentage;
        float divisionResult = marks/totalMarks;
        System.out.println("division result : " + divisionResult);
        percentage = (divisionResult)*100;
        return percentage;
    }

    float calculatePercNew(float marks, float totalMarks){     // now parameters become float
        float percentage;
        float divisionResult = marks/totalMarks;
        System.out.println("division result : " + divisionResult);
        percentage = (divisionResult)*100;
        return percentage;
    }


    

    boolean openAccount(String firstName, String lastName, long salary, int age, boolean isMarried, long aadharNumber, String pancardNumber){
        return false;
    }

    boolean openAccountForCustomer(Customer customer1){
        return false;
    }
   
    // idhar apan object return kr rhe h kyuki method sirf ek cheez return krta h aur object m ek se zyada value daal sakte h
    AccountOpenInformation openAccountForCustomerModifiedVersion(Customer customer){
        return new AccountOpenInformation();
    }

}
