package com.company;
import java.util.Scanner;
import com.company.*;

public class Main {
    public static void main(String[] args) {
        int size =0, shape =0;
        double area =0;
        System.out.println("Enter size of the array");
        Scanner scan = new Scanner(System.in);
        size = scan.nextInt();
        Shape[] shapes=new Shape[size];
        for(int i=0; i<size; ++i) {
            System.out.println("Which shape do you want to create? 1-Circle, 2-Triangle, 3-Rectangle");
            shape = scan.nextInt();
            switch (shape) {
                case 1:
                    shapes[i] = new Circle();
                    area+= shapes[i].calculateArea();
                    break;
                case 2:
                    shapes[i] = new Triangle();
                    area+=shapes[i].calculateArea();
                    break;
                case 3:
                    shapes[i] = new Rectangle();
                    area+=shapes[i].calculateArea();
                    break;
                default:
                    System.out.println("ERROR: Invalid select");
                    break;
            }
        }
        System.out.println("Area = "+area);
    }
}
