// this is an example of single line commment

/* 
 * this 
 * is 
 * an
 * example
 * of
 * multi
 * line
 * comment
*/

/* 
variables are named memory locations

variables are data containers

if we want to perform any operation on any data in our program then we store that data in a variables


to store a data in variable first we need to declare it

rule 1 variable declaration
        data_type name_of_variable;
        eg  int number;
            float no1;
            char characterVariable;

then we need to initialize the variable with a value or data

rule 2 variable initialization
        name_of_variable = value;
        eg  number = 1;
            no1 = 1.25;
            characterVariable = 'A';

we can declare and initialize the variable in a single line also

rule - data_type name_of_variable = value;
        eg  int number = 5;
            float no = 1.5;
            char ch = 'A';
*/


public class Variables {
    public static void main(String[] args) {
        
        int x = 5;
        System.out.println("Value of variable x is : " + x);

        x = x + 20;
        System.out.println("Modified value for x will be : " + x);

        // float and double are used to store real numbers
        float no1 = 15.2f;
        System.out.println("float : " + no1);

        double no2 = 65.6;
        System.out.println("double : " + no2);

        char ch = 'a';
        System.out.println("char : " + ch);

        // byte int long are used to store whole numbers
        byte no3 = 5;
        System.out.println("byte : " + no3);

        int no4 = 5131;
        System.out.println("int : " + no4);

        long no5 = 151651561;
        System.out.println("long : " + no5);

        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("boolean : " + isTrue);
        System.out.println("boolean : " + isFalse);

    }    
}
