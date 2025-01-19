
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Odd {
    int x;
    public void read() {
        Scanner scanner = new 
            Scanner(System.in);
        System.out.print("Enter an integer:");
        x = scanner.nextInt();
    }
    public void checkOddEven() {
        if (x % 2 == 0) {
            System.out.println(x + " is even.");
        }
        else {
            System.out.println(x + " is odd.");
        }
    }
    
    public static void main(String[] args) {
        Odd obj = new Odd();
        obj.read();
        obj.checkOddEven();
    }
    
}
