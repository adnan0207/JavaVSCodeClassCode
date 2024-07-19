public class SignatureUse {
    public static void main(String[] args) {
        
        String[] names = new String[5];

        names[0] = "Adnan";
        names[1] = "Abhay";
        names[2] = "Shivansh";
        names[3] = "Mukul";
        names[4] = "Jatin";

        SignatureUse obj = new SignatureUse();

        obj.main(names, 5);         // isme koi bhi integer daal diengy koi farak ni padega
        
    }    

    void main(String[] a, int x){

        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}
