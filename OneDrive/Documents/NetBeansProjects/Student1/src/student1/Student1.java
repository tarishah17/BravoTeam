package student1;

import java.util.Scanner;

/**
 * This class +++Insert Description Here+++
 *
 * @author Shaharyar Tariq
 */
public class Student1 {

    public static void main(String[] args) {
        /**
         * Scanner input = new Scanner(System.in);
         *
         * System.out.println("Please enter student name: ");
         *
         * String sName = input.nextLine();
         *
         * Student student = new Student(sName); student.setStudentId(1234567);
         *
         * System.out.println("Student Information is: "); System.out.println(student.getName());
         * System.out.println(student.getStudentId());
         */

        /*
        Create a second class to exercise your model classThis class should create an array of 
        Student Objects of length 5 and populate it with five of your classmates’ names 
        (shudder, you will have to introduce yourself to at least 4 people today)
        In your main method, iterate over the Array and print out each student’s name
         */
        Student[] studentList = new Student[5];
        studentList[0] = new Student("Kobe");
        studentList[1] = new Student("Joe");
        studentList[2] = new Student("Bob");
        studentList[3] = new Student("Jeff");
        studentList[4] = new Student("George");

        System.out.println("Lets print the names: ");

        for (Student s : studentList) {
            System.out.println(s.getName());
        }
    }

}
