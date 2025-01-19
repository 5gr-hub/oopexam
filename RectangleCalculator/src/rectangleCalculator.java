
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class rectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new
            Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        double length =
                scanner.nextDouble();
        System.out.print("Enter the width of the rectangle:");
        double width = 
                scanner.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        
        System.out.println("Area of the rectangle:" + area);
        System.out.println("Perimeter of the rectangle:" + perimeter);
    }
}
