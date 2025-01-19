/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        //Create an ISBN object
        ISBN isbn = new
            ISBN ("0 941831 39 6");
        
        //Create a Book object
        Book book = new Book(
        "Object-oriented Programming with Java",
                "David j. Barnez and Micheal Kolling",
                "Prentice Hall",
                "Ntinda",
                "2025",
                49.99,
                isbn
        );
        
        //Print book details
        book.printDetails();
        
        //Update the ISBN
        book.setBookISBN(new ISBN("978-1-23-456789-0"));
        
        //Print updated details
        System.out.println("\nUpdated Book Details:");
        }    
}
