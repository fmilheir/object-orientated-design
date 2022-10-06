/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week1andweek2;

/**
 *
 * @author Pipo-Admin
 */
import java.util.Scanner;
public class week1_exercise_8 
{
    public static void main(String[] args)
    {
        String name, course, temp;
        int a;
        double grade;
        boolean b;

        name = "";
        course = "";
        temp = "";

        a = 0;
        grade = 0.0;
        b = false;

        Scanner my_scaner = new Scanner (System.in);
        while (a < 4)
        {
            System.out.println("please insert your name:");
            name = my_scaner.nextLine();

            //course of the student
            System.out.println("Plese enter your course");
            course = my_scaner.nextLine();
            //
            Student s = new Student(name,course);
            while (b == false)
            {
                System.out.println("plese enter the grades");
                temp = my_scaner.nextLine();
                grade = Integer.parseInt(temp);
                b = s.setMark(grade);
            }
            s.populate();
            a++;
        }
    }
   
}
