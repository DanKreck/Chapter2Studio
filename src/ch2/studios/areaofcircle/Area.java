package ch2.studios.areaofcircle;

import java.util.Scanner;


public class Area {

    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();


        while (radius < 0){
            System.out.println("Please enter a positive number: ");
            radius = input.nextDouble();
        }

        System.out.println("Area of the circle is: " + Circle.getArea(radius));
    }
}
