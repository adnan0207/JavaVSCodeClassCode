public class Program3 {
    public static void main(String[] args){

        Program3 object1;
        object1 = new Program3();

        int number;
        number = 5;

        int result = object1.tripleTheNumber(number);
        System.out.println(result);
    }
    int tripleTheNumber(int x){
        return 3*x;
    }
}
