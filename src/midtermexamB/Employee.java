/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexamB;

import java.util.Scanner;

/**
 * This code is used as the basis for the SYST 17796 midterm exam. Do not edit this code. Use it to answer the questions in SLATE.
 * An Employee has a name, an hourly wage and a numHoursWorked representing
 * the total number of hours worked in a single pay period.
 * The system also keeps track of a list of current employees.
 * People can enter a new Employee from the Payroll and so long as
 * 
 * @author 
 */
public  class Employee 
{
    public String name;
    private double wage;
    private double hoursWorked;
    private int count =0;//counts the number of employee names in the array
    
    public String[] names = new String[100];
    
    public Employee(String givenName, double givenWage, double givenHours)
    {
       name = givenName;
       wage = givenWage;
       hoursWorked = givenHours;
    }
    
    public void checkForDuplicates()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee's name");
        String newEmployee = sc.nextLine();
        for(String s: names)
        {
            if(newEmployee.equals(s))
            {
                System.out.println("An employee with this name already exists");
            }
            else
            {
                names[count] = newEmployee;
                name = newEmployee;
                count++;
            }
        }
    }
    
    /**
     * A method that calculates the Employee's pay
     * and prints the final pay amount to the console.
     * @return 
     */
    public double calculatePay()
    {
        double pay = wage*hoursWorked;
        System.out.println("Your total pay is: "+ pay);
        return pay;
    }
}
