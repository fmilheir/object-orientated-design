/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week1andweek2;

/**
 *
 * @author Pipo-Admin
 */
 public class Student
    {
        String name, course;
        double grade;
        
        
        public Student(String nameIn, String courseIn)
        {
            this.name = nameIn;
            this.course = courseIn;
            grade = 0;
        }
        
        public void populate()
        {
            System.out.println("Name: " + this.name + " Course:" + this.course + " Grade: " + this.grade);
        }
        
        public String getName()
        {
            return this.name;
        }
        public String getCourse()
        {
            return this.course;
        }
        public double getGrade()
        {
            return this.grade;
        }
        public boolean setMark(double ngrade)
        {
            if (ngrade >100 || ngrade < 0)
            {
                return false;
            }
            else
            {
                this.grade = ngrade;
                return true;
            }
        }
        public String getGrade()
        {
            if(this.grade >= 70)
                 return("First");
            else if(this.grade >= 60)
                 return("2/1");
            else if(this.grade >= 50)
                 return("2/2");
            else if(this.grade >= 40)
                 return("Third");
            else
                 return("Fail");
        }
        public boolean didPass()
        {
            if (this.grade >=40)
                return true;
            else
                return false;
        }
    }
    