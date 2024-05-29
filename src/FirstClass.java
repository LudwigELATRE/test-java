package src;

import java.util.Random;

public class FirstClass {

    final int CONSTANT = 10;

    public static void main(String[] args) {


        Random randomNumbers = new Random();

        int a = randomNumbers.nextInt(10);

        // Utilisation de la méthode length() de la classe String
        int b = "Hello World".length();

        if (a > 5) {
            System.out.println("a is greater than 5");
            System.out.println(a);
        } else {
            System.out.println("a is less than 5");
            System.out.println(a);
        }
        System.out.println("La longueur de la chaîne est : " + b);
    }
}
