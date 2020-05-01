package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter how many miles you've driven:");
        float miles = input.nextFloat();

        System.out.println("Please enter how many gallons of gas you've consumed:");
        float gallons = input.nextFloat();
        input.close();

        float mpg = miles/gallons;
        System.out.println("You are consuming gas at a rate of " + mpg + " miles-per-gallon");
    }
}
