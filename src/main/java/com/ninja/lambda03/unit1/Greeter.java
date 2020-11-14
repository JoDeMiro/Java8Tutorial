package com.ninja.lambda03.unit1;

public class Greeter {

    private void doGreet() {
        System.out.println("Hello Java");
    }

    private void doGreet(Greeting greeting) {
        greeting.doGreet();
    }

    public static void main(String[] args) {

        // Just a simple method
        Greeter greeter = new Greeter();
        greeter.doGreet();

        // In Java 7 pass a behaviour, an Interface
        Greeting greetingOne = new Greeting() {
            @Override
            public void doGreet() {
                System.out.println("One possible implementation of doGreet");
            }
        };

        // Call itt directly
        greetingOne.doGreet();

        // Passing a behaviour to the doGreet method, which expects an Interface or Class
        greeter.doGreet(greetingOne);

        greeter.doGreet(new Greeting() {
            @Override
            public void doGreet() {
                System.out.println("This is a real anonymous class");
            }
        });


        NiceGreeting niceGreeting = new NiceGreeting();
        greeter.doGreet(niceGreeting);

        AngryGreeting angryGreeting = new AngryGreeting();
        greeter.doGreet(angryGreeting);


        greeter.doGreet(new NiceGreeting());    // without ref var

        greeter.doGreet(new AngryGreeting());   // without ref var


        // Lambda

        // Inner Class Implementation
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void doGreet() {
                System.out.println("Hello Inner Class Implementation of Greeting");
            }
        };

        innerClassGreeting.doGreet();


        // Lambda Implementation
        Greeting lambdaGreeting = () -> System.out.println("Hello Lambda Implementation of Greeting");

        lambdaGreeting.doGreet();

    }
}


