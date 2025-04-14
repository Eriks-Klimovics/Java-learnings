package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        // Array
        int[] numbers = new int[5]; // [0, 0, 0, 0, 0]
        String [] names = {"John", "Andrey", "Mark"}; // [John, Andrey, Mark]
        // index: [0]  - John
        // index: [1]  - Andrey
        // index: [2]  - Mark

        int[] ages = {19, 20, 30, 41, 50};
        // index: [0]  - 19
        // index: [1]  - 20
        // index: [2]  - 30
        // index: [3]  - 41
        // index: [4]  - 50

        String[] fruitBasket = new String[10];


        //Element access
        System.out.println(numbers[0]);
        numbers[0]=10;
        numbers[1]=20;
        numbers[2]=41;
        numbers[3]=71;
        numbers[4]=91;

        System.out.println(Arrays.toString(numbers));

        // Exercise

        fruitBasket[0] = "apple";
        fruitBasket[1] = "banana";
        fruitBasket[2] = "pineapple";
        fruitBasket[3] = "apricot";
        fruitBasket[4] = "fig";
        fruitBasket[5] = "grapes";
        fruitBasket[6] = "lime";
        fruitBasket[7] = "lemon";
        fruitBasket[8] = "mango";
        fruitBasket[9] = "melon";



        System.out.println(Arrays.toString(fruitBasket));

        // Loops
        // Print hello world 5 times
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("=======");

        // for loop
        for(int i = 0; i <5; i++){
            System.out.println("Hello World" + "index:" +i);
        }

        for(int i = 0; i < fruitBasket.length; i++) {
            System.out.println(fruitBasket[i]);
        }

        // for each;
        for(String fruit : fruitBasket) {
            System.out.println(fruit);
        }

        // Create int number array from 0 -> to 10;
        // Print in reverse order;

        int[] nums = {0, 1, 2,3,4,5,6,7,8,9,10};
        for(int i = nums.length  - 1; i>=0; i--) {
            System.out.print(nums[i] + " ");
        }


        // Concatenation
        String myName = "Erik";
        int myAge = 24;
        System.out.println("e");

        // String.format();
        System.out.println(
        String.format("My name is %s . I am %d years old", myName, myAge));

        // while loops
        /*
        while (condition) {
        // loop body
        }
         */

        int i = 0;
        while(i<5) {
            System.out.println("Number: " + i);
            i++;
        }

        /*
        String password = "123";
        !password.equals ("123") = true!
        !password.equals("123") = false
         */

        Scanner scanner = new Scanner(System.in);
        String password = "";

        while (!password.equals("secret")) {
            System.out.println("Enter your password:");
            password = scanner.nextLine();
        }
        System.out.println("Access granted!");



        int guessedNumber = 10;
        int guess;
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println("Guess number from 1 to 10");
            guess = myScanner.nextInt();
        } while (guess != guessedNumber);

        System.out.println("Guessed!");


        // Vivesti tablicu umnozhenija na 5
        // 5*1=5
        //5*2=10
        // do 10


        // Poschitatj summu chisel ot 1 do 100;




        // While: vivesti chisla ot 10 do 1;

    }
}
