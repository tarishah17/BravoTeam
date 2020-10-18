package studentlist;

import java.util.Scanner;

/**
 * This class is for a simple example of array of objects
 *
 * @author Paul Bonenfant
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("A simple app");

        // create an array of 2 Students
        Student[] students = new Student[2];

        for (int i = 0; i < students.length; i++) {

            System.out.println("Enter a name");
            String name = input.nextLine();
            
            Student student = new Student(name);            
            students[i] = student;                   
        }

        String format = "Student name is %s\n";
        
        for (Student student: students) {
        
            System.out.printf(format, student.getName());
            
        }
        
    }

}
