public class Arrays {
    public static void main(String[] args){

        int[] integerArray = new int[10];

        integerArray[0] = 1;
        integerArray[1] = 2;
        integerArray[2] = 3;
        integerArray[3] = 4;
        integerArray[4] = 5;
        integerArray[5] = 6;
        integerArray[6] = 7;
        integerArray[7] = 8;
        integerArray[8] = 9;
        integerArray[9] = 10;

        System.out.println("Length of integerArray is " + integerArray.length);

        System.out.println(integerArray[7]);

        System.out.println("Now inputs using loop");

        int[] integerArrayTwo = new int[10];

        for(int i=0; i<10; i++){
            integerArrayTwo[i] = i*10;
        }

        System.out.println("INPUT DONE");

        System.out.println("Printing whole array in loop");

        for(int i=0; i<10; i++){
            System.out.println(integerArrayTwo[i]);
        }

        System.out.println("STRING ARRAY");

        String[] strArray = new String[3];
        strArray[0] = "Adnan";
        strArray[1] = "Abhay";
        strArray[2] = "Mukul";

        for(int i=0; i<strArray.length; i++){
            System.out.println(strArray[i]);
        }
    }
}
