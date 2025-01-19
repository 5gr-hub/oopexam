
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class factorial {
    public static void fact(int z) {
 try {
    fact2(z); // Call fact2() and handle potential exceptions
      System.out.println(15);  // If fact2() executes without exceptions
   } catch (ArithmeticException e) { // Catch ArithmeticException
        System.out.println(20);
      } catch (Exception e) { // Catch any other exception
       System.out.println(25);
   }
    }
    public static void fact2(int z) throws IOException {
       System.out.println(30);
  if (z == 1) {
  throw new IOException(); // Throw IOException if z is 1
        }
        if (z == 0) {
          throw new ArithmeticException(); // Throw ArithmeticException if z is 0
        }
       System.out.println(35);
    }
    public static void main(String[] args) {
        fact(1); // Call fact() with input 1
        fact(2); // Call fact() with input 2
    }
}
   

