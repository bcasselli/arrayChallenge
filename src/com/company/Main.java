package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

            System.out.println("Enter grade 1: ");
            int a = scn.nextInt();
            System.out.println("Enter grade 2: ");
            int b = scn.nextInt();
            System.out.println("Enter grade 3: ");
            int c = scn.nextInt();


        int grades [] = new int [] {a, b, c,};
        grades[0] = a;
        grades[1] = b;
        grades[2] = c;

        int sum = 0;

        for(int i = 0; i < grades.length; i++ )
            sum = sum + grades[i];
        int average = sum/grades.length;
        System.out.println(average);

    }
}
