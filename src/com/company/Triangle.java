package com.company;
import java.util.Scanner;

public class Triangle implements Shape {
    double a = 0, b = 0 ,c = 0, area =0, p=0;

    Triangle(){
        System.out.println("Enter 1st side of the triangle");
        Scanner scan = new Scanner(System.in);
        a= scan.nextDouble();
        System.out.println("Enter 2nd side of the triangle");
        b = scan.nextDouble();
        System.out.println("Enter the length of base of the triangle");
        c = scan.nextDouble();
    }

    @Override
    public double calculateArea() {
        if(a==b&&a==c) {
           return area = (a*a*Math.sqrt(3))/4; //equilateral triangle
        }
        else{
            p=(a+b+c)/2; //half-meter
            return area = Math.sqrt(p*(p-a)*(p-b)*(p-c)); //Geron`s formula
        }
    }
}
