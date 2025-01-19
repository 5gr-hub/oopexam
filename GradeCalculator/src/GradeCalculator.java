
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new 
        Scanner(System.in);
        
        int[] units = new int[6];
                int totalMarks = 0;
                
                System.out.println("Enter marks for 6 units:");
                for (int i = 0; i < 6; i++) {
                    units[i] = scanner.nextInt();
                    totalMarks += units[i];
                }
                
                double average = (double)
                        totalMarks / 6;
                
                char grade;
                if (average > 70) {
                    grade = 'A';
                }
                else if (average >= 60) {
                    grade = 'B';
                }
                else if (average >= 50){
                    grade = 'C';
                }
                else if (average >= 40) {
                    grade = 'D';
                }
                else {
                    grade = 'E';
                        }
                System.out.println("Average:" + average);
                System.out.println("Grade:"+ grade);
    }
}
