// project 05 Select Students for Vaccine
/*
  1. determine if student is older than 15 (to receive vaccine)
  2. enter # of students
  3. input students by name and age
  4. use Arrays
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the Number of students: ");   // System.out --> the monitor (the system's output)
        Scanner scanny = new Scanner(System.in);                // create 'scanny' a Scanner object that takes it's value from the System.in (keyboard - input)
        int numStudents = scanny.nextInt();                     // create 'int' 'numStudents' which is equal to the input from 'scanny'
        String[] student = new String[numStudents];             // create String Array named 'student' which has a length equal to the 'numStudent' input ('scanny' value)
        int[] age = new int[numStudents];                       // create 'int' Array named 'age' that also has a length equal to 'numStudent' object

        Scanner scanName = new Scanner(System.in);
        Scanner scanAge = new Scanner(System.in);

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Please enter student name: ");
            student[i] = scanName.nextLine();
            System.out.println("Enter the student's age: ");
            age[i] = scanAge.nextInt();
        }
        for (int i = 0; i < numStudents; i++) {
            if (age[i] >= 15) {
                System.out.println(student[i] + " can receive a vaccine.");
                System.out.println("The student is now " + age[i]);
            }
            scanny.close();
            scanName.close();
            scanAge.close();
        }
    }
}
