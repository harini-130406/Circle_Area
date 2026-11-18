
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        if (radius < 0) {
            System.out.println("Invalid radius!");
            sc.close();
            return;
        }

        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + area);

        sc.close();
    }
}
