package com.company;
import java.util.Scanner;
public class Circle implements Shape {
     double radius=0;
     double area=0;

   Circle() {
        System.out.println("Enter radius of the circle");
        Scanner scan = new Scanner(System.in);
        radius= scan.nextDouble();
    }

    @Override
    public double calculateArea() {
      return area = Math.PI*radius*radius;
    }
}
