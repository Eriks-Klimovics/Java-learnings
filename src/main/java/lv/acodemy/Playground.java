package lv.acodemy;

public class Playground {
    public static void main(String[] args) {


        Dog rex = new Dog();
        // netu imenu = null
        // netu age = 0
        //breedName = unknown breed

        // Encapsulation
        // name = "Rex"
        rex.setName("Rex");
        // age = 1
        rex.setAge(1);

        rex.bark();
        rex.feed();


        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        System.out.println(rex.getBreedName());



        Dog barsik = new Dog("Alabai");

        barsik.setName("Barsik");
        barsik.setAge(1);

        System.out.println(barsik.getName());
        System.out.println(barsik.getAge());

        // Print breed name through method
        System.out.println(barsik.getBreedName());


        // All argument constructor
        Dog myPjos = new Dog("Korgi", 1, "Corgi");
        System.out.println(myPjos);



        // Car
        Car mercedes = new Car("G63");
        System.out.println(mercedes);
        mercedes.drive();
        System.out.println(mercedes);
        mercedes.drive();
        mercedes.drive();
        mercedes.drive();
        mercedes.drive();
        mercedes.drive();
        System.out.println(mercedes);

        mercedes.refuel();
        System.out.println(mercedes);

        mercedes.service();
        System.out.println(mercedes);



    }
}
