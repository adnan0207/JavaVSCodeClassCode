public class Main {
    public static void main(String[] args){
        
        Vehicle car1 = new Vehicle();

        car1.noOfWheels = 4;
        car1.color = "White";
        car1.brandName = "Honda";
        car1.make = 2020;

        System.out.println("My vehicle has " + car1.noOfWheels + " wheels is of " + car1.color + " color and is made in the year " + car1.make + " and it is from " + car1.brandName);

        car1.run();

        Vehicle car2 = new Vehicle();

        car2.noOfWheels = 4;
        car2.color = "Black";
        car2.brandName = "BMW";
        car2.make = 2022;

        System.out.println("My vehicle has " + car2.noOfWheels + " wheels is of " + car2.color + " color and is made in the year " + car2.make + " and it is from " + car2.brandName);

        car2.run();

        Vehicle bike1 = new Vehicle();

        bike1.noOfWheels = 2;
        bike1.color = "Red";
        bike1.brandName = "TVS";
        bike1.make = 2015;

        System.out.println("My vehicle has " + bike1.noOfWheels + " wheels is of " + bike1.color + " color and is made in the year " + bike1.make + " and it is from " + bike1.brandName);

        bike1.run();
        
    }
}