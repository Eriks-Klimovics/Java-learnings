package lv.acodemy;

import java.security.spec.RSAOtherPrimeInfo;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Ja u Mami programmist!");

        /*
        First line
        Second line
        Third line
         */

        // byte 8- bit
        byte age = 127;
        System.out.println(age);

        // short 16-bit
        short currentYear = 2025;
        short temperature = -273;
        short distance = 1600;
        System.out.println(distance);

        // int 32-bit
        int score = 9000;
        int population = 144400000;
        int result = (10*10) - 42;
        System.out.println(result);


        // long 64bit
        long starsInGalaxy = 100_000_000_000L; // 100000000000
        long bigNumber = 954191326549452759L;
        long currentMillis = System.currentTimeMillis();
        System.out.println(currentMillis);


        //float 32-bit
        float pi = 3.14f;
        float piNumber = (float) Math.PI; //casting
        float discount = 25.5f;

        //double 64-bit
        double accountBalance = 999999.9999997777;
        double squareRoot = Math.sqrt(2);
        System.out.println(squareRoot);
        double piDouble = Math.PI;

        System.out.println(pi);
        System.out.println(piDouble);


        // char (symbol)
        char initial = 'N';
        char digit = '7';
        char symbol = '#';

        // See unicode table
        char smiley = '\u263A';
        System.out.println(smiley);


        String cool = "\uD83D\uDE0E";
        System.out.println(cool);

        //boolean (true/false)
        boolean isJavaFun = true;
        boolean isTired = true;
        boolean passed = (40 > 60); //false
        System.out.println(passed);






    }
}
