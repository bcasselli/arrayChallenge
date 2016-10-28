package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("How many students will be entered?: ");
        int numStudents = input.nextInt();


        String students[] = new String[numStudents];
        double grades[][] = new double[numStudents][];


        for (int i = 0; i < students.length; i++) {
            students[i] = collectStudents(i);

            System.out.println("How many grades will be entered for this student?: ");
            int numGrades = input.nextInt();

            grades[i] = studentGrades(numGrades);
        }


        System.out.printf("%-16s%-12s%-12s%-12s%-12s", "Student's Name",
                "High Score", "Low Score", "Average", "Grade");
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            double average = aveScore(grades[i]);
            System.out.printf("%-16s%-12.0f%-12.0f%-12.0f%-12s", students[i],
                    highScore(grades[i]), lowScore(grades[i]),
                    average, letter(average));
            System.out.println();

        }
    }


    public static String collectStudents(int i) {
        Scanner input = new Scanner(System.in);//create scanner



        System.out.println("Enter the " + numName(i + 1) + " student's name: ");
        String student = input.next();
        return student;

    }


    public static double[] studentGrades(int numGrades) {
        Scanner input = new Scanner(System.in);//create scanner
        double grades[] = new double[numGrades];

        for (int o = 0; o < numGrades; o++) {
            System.out.println("Enter the " + numName(o + 1) + " grade: ");
            grades[o] = input.nextDouble();

        }
        return grades;
    }

    public static double highScore(double array[]) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    public static double lowScore(double array[]) {
        Arrays.sort(array);
        return array[0];
    }

    public static double aveScore(double array[]) {
        double average = 0.0;

        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }

        return average / array.length;
    }


    public static String letter(double average) {
        String letterGrade = "";
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        return letterGrade;
    }


    public static String numName(int order) {
        String outputName = "";
        switch (order) {
            case 1:
                outputName = "first";
                break;
            case 2:
                outputName = "second";
                break;
            case 3:
                outputName = "third";
                break;
            case 4:
                outputName = "fourth";
                break;
            case 5:
                outputName = "fifth";
                break;
            case 6:
                outputName = "sixth";
                break;
            case 7:
                outputName = "seventh";
                break;
            case 8:
                outputName = "eigth";
                break;
            case 9:
                outputName = "ninth";
                break;
            case 10:
                outputName = "tenth";
                break;
            default:
                outputName = order + (order < 20 ? "th" : (order % 10 == 1 ? "st" :
                        (order % 10 == 2 ? "nd" : (order % 10 == 3 ? "rd" : "th"))));
                break;

        }
        return outputName;
    }
}
