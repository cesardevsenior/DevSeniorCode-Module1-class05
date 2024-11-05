package functions;

import java.lang.Math;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // ejemplosMath();
        // exampleRandom();
        exampleString();
    }

    private static void exampleString() {
        var name = "Cesar Augusto Diaz";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(0, 8));
        System.out.printf("El caracter en la posicion 6 es '%c'%n", name.charAt(6));

        var input = "  aswaa  12121212         ;      ";
        System.out.println(input.trim());
        System.out.println(input.contains("12"));
        System.out.println(input.indexOf("12"));
        System.out.println(input.lastIndexOf("12"));

        var lastSpaceIndex = name.lastIndexOf(" ");
        System.out.println(name.substring(lastSpaceIndex +1));
        System.out.println(name.substring(19));


    }

    private static void exampleRandom() {
        var random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10) + 1); // 0 - n-1
        }
    }

    private static void exampleMath() {
        System.out.println(Math.min(5, 7));
        System.out.println(Math.sqrt(125));
        System.out.println(Math.pow(2, 3));
    }
}