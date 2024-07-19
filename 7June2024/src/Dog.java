public class Dog {
    
    String name;
    int age;
    
    // if we commment this it will give error
    // java says if you dont make any constructor then they will give default constructor by themself
    // to use default constructor you need to comment all the constructor you cant comment only one

    public Dog(){       // constructor
        System.out.println("no arguments constructor");
    }

    public Dog(String naam, int umar){
        System.out.println("parameterized constructor being called");

        this.name = naam;
        this.age = umar;
    }


    void printObject(){
        System.out.println(this.name + " , " + this.age);
    }


    public static void main(String[] args) {
        
        Dog dogObj1 = new Dog();
        dogObj1.printObject();

        Dog dogObj2 = new Dog();
        dogObj2.printObject();

        Dog dogObj3 = new Dog("Scooby", 5);
        dogObj3.printObject();
    }
}
