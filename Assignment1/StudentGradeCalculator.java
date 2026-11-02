package Assignment1;


public class StudentGradeCalculator {
    public static void main(String[] args) {

        // Store the student's information
        String studentName = "Parker Lang";
        String major = "Software Development - Business Management Minor";
        String course = "CMPS 360";

        // Store three assignment grades
        double grade1 = 95;
        double grade2 = 82;
        double grade3 = 91;

        // Calculate the average of all three grades
        double average = (grade1 + grade2 + grade3) / 3;

        // Display the student's information and average
        System.out.println("Student: " + studentName);
        System.out.println("Major: " + major);
        System.out.println("Course: " + course);
        System.out.println("Average: " + average);

        // Determine whether the student passed or failed
        if (average >= 70) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}
