package com.company;
import java.util.Scanner;

public class Rectangle implements Shape {
    double lenght=0, width=0, area =0;

    Rectangle() {
        System.out.println("Enter length of the rectangle");
        Scanner scan = new Scanner(System.in);
        lenght= scan.nextDouble();
        System.out.println("Enter width of the rectangle");
        width = scan.nextDouble();
    }

    @Override
    public double calculateArea() {
        return area = lenght*width;
    }
}
