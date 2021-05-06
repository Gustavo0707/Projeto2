package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 	int number1, number2, result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("type some number");
        number1 = scanner.nextInt();

        System.out.println("type other number");
        number2 = scanner.nextInt();

        result = number1 + number2;

        System.out.println("the sum of4 your number is " + result);
    }
}
