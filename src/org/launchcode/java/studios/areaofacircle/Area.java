package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = 0.0;
        double areaOfCircle = 0.0;

        Scanner in = new Scanner(System.in);

        while (radius <= 0) {
            System.out.println("Enter a radius: ");
            radius = in.nextDouble();

            if (radius < 0) {
                System.out.println("Invalid radius, try again.");
                radius = 0.0;
                continue;
            }

            areaOfCircle = 3.14 * (radius * radius);
        }

        System.out.println("The area of a circle with a radius of " + radius + " is: " + areaOfCircle);
    }
}
