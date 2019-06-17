/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamB;

import java.util.Scanner;

/**
 * A class that creates a new Employee and then shows their wage.
 * To be used for the SYST 17796 Midterm Exam.
 * @author 
 */
public class WageCalculator 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee("", 0,0);//no name yet
        e.checkForDuplicates();//check for duplicates
        System.out.println("Please enter the employee's wage");
        double wage = sc.nextDouble();
        System.out.println("please enter the employee's number of hours worked ");
        double hours = sc.nextDouble();
        Employee e2 = new Employee(e.name, wage, hours);
        System.out.println("$ " + e2.calculatePay());
        //add a new Employee Object with the given parameters
    }
}
