public class Dog {  // Class names should start with an uppercase letter
    static class StaticDog {  // Static class should be defined correctly
        static int eye = 2;  // This is fine as it is
    }

    public void dogBark() {  // Method names should follow camelCase
        System.out.println("bark " + StaticDog.eye);  // Corrected the reference to StaticDog
    }

    public static void main(String[] args) {  // Main method should be static and correctly declared
        StaticDog dog1 = new StaticDog();  // Create an instance of StaticDog
        StaticDog dog2 = new StaticDog();  // Another instance of StaticDog
        dog1.eye = 3;  // Change the static variable (affects all instances)
        System.out.println(dog1.eye);  // Should print 3
        System.out.println(dog2.eye);  // Should also print 3 since it's static
        System.out.println();
        Dog dog = new Dog();  // Create an instance of Dog to call non-static methods
        dog.dogBark();  // Call the dogBark method
    }
}
