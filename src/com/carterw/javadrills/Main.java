package com.carterw.javadrills;

public class Main {

    public static void main(String[] args) {

//      Part One - Variables and Data Types
	    String firstName = "Obiwan";
	    String lastName = "Kenobi";
	    int birthYear = 57;
	    String homeworld = "Stewjon";
	    double height = 1.82; // in meters
        double weight = 81; // in kilos
        double purse = 150.0;

        // Part Two - Mathematical Operators
        purse -= 24.3;
        purse -= 45;
        purse *= 2;
        purse -= purse * .1;

        // Part Three - Conditional Love
        boolean lightsaber = true;
        if (lightsaber) {
            System.out.println("This one is mine!");
        } else {
            System.out.println("Pass...");
        }

        String shipName = "Millinium Falcon";
        if (shipName.equals("Millinium Falcon")) {
            System.out.println("Let's go!");
        } else {
            System.out.println("I better hide somewhere");
        }

        double price = 5.5;
        double size = 28.0;
        if (price < 5) {
            System.out.println("I'll take it!");
        } else {
            System.out.println("That's too expensive.");
        }

        if (price < 1 || size >= 24) {
            System.out.println("I will order it!");
        } else {
            System.out.println("I don't want that");
        }


//      Part Four - FizzBuzz Deep Dive
//        fizzBuzz100();


    }

    private static void fizzBuzz100() {
        for (int i = 1; i <= 100; i++) { // this line will loop through numbers 1 through 100
            if ((i % 3) == 0) // this will check if the current number is divisible by three. If it is, it will print "fizz"
                System.out.println("fizz");
            else if ((i % 5) == 0) // this will check if the current number is divisible by five. If it is, it will print "buzz"
                System.out.println("buzz");
            else if (((i % 5) == 0) && ((i % 3) == 0)) // this will check if the current number is divisible by three and five. If it is, it will print "fizzbuzz"
                // THIS IS THE BUG. This case must be evaluated first. For example, we expect the number 15 to display fizzbuzz, however in this example it
                // only prints fizz, because it is never evaluated for being divisible by 5.
                System.out.println("fizzbuzz");
            else // if the number is not divisible by three or five, we will just print the number.
                System.out.println(i);
        }
    }

    //      Part Five - Functions

    private static void helloWorld() {
        System.out.println("Hello, World!");
    }

    private static void greeting(String name) {
        System.out.println("Hello, " + name);
    }

    private static int add(int num1, int num2) {
        return num1 + num2;
    }

    private static String faveColorFinder(String color) {
        if (color.equals("red")) {
            return "red is a great color";
        } else if (color.equals("green")) {
            return "Green is a solid favorite color";
        } else if (color.equals("black")) {
            return "So trendy";
        } else {
            return "You need to evaluate your favorite color choice";
        }
    }

    private static String thatsOdd(int num) {
        if (num % 2 == 0) {
            return "That's not odd!";
        } else {
            return "That is odd indeed!";
        }
    }

    private static String[] bigOrSmall(int[] arr) {
        String[] answers = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) {
                answers[i] = "big";
            } else if(arr[i] <= 100) {
                answers[i] = "small";
            }
        }

        return answers;
    }
}
