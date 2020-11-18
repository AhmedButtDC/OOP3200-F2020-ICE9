package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        Vector2D point1 = new Vector2D();
        System.out.print("Enter the first point (x, y): ");

        point1.setX(keyboard.nextFloat());
        keyboard.next();
        point1.setY(keyboard.nextFloat());

        System.out.println("\n--------------------------------------------------------------");
        System.out.println("You Entered " + point1 + " for the first point");
        System.out.println("--------------------------------------------------------------\n");
        Vector2D point2 = new Vector2D();
        System.out.print("Enter the second point (x, y): ");

        point2.setX(keyboard.nextFloat());
        keyboard.next();
        point2.setY(keyboard.nextFloat());

        System.out.println("\n--------------------------------------------------------------");
        System.out.println("You Entered " + point2 + " for the second point") ;
        System.out.println( "--------------------------------------------------------------\n");

        System.out.println("Magnitude of first point is: %.3f" + point1.getMagnitude());
        System.out.println("Magnitude of second point is: %.3f" + point2.getMagnitude());
        System.out.println("Distance between first point and second point is: " + Vector2D.distance(point1, point2));
        System.out.println("--------------------------------------------------------------\n");
    }
}
