/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Book {
    private final String title;
    private final String author;
    private final String publisher;
    private String city;
    private final String dateOfPublication;
    private double price;
    private ISBN isbnNum;
    public Book(String title, String author, String publisher, String dateOfPublication, String string, double price, ISBN isbnNum) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.dateOfPublication = dateOfPublication;
        this.price = price;
        this.isbnNum = isbnNum;
    }
    public void setBookISBN(ISBN isbnNum) {
        this.isbnNum = isbnNum;
    }
    public String getAuthor(){
        return author;
    }
    public ISBN getBookISBN() {
        return isbnNum;
    }
    public void printDetails() {
        System.out.println("Book Title:" + title);
        System.out.println("Book Author:" + author);
        System.out.println("Publisher:" + publisher);
        System.out.println("ISBN:" + isbnNum.getISBN());
    }
    
}
