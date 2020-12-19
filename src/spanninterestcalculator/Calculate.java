/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spanninterestcalculator;

/**
 *
 * @author Shanell Spann
 */
import java.util.Scanner;
import java.text.DecimalFormat;


public class Calculate 
{
    double accruedAmount;
    double pAmount;
    double interestAmount;
    double rate;
    double r = 10; /* using the equal & a value here is called initializing*/
    double time = 3;
    int months = 36;
    String firstName;
    char runAgain = 'N';
    
    Scanner keyboard = new Scanner(System.in);
    
    public Calculate() /* constructor method*/
    {
        do
        {
        
        getUserInput();
        calculateInterest();
        }while(runAgain == 'Y'); /* single EQUAL = assignment ... double EQUAL == compare ... do while shows loop*/
    }
    
    public void getUserInput() /*method -- anything inside of the parenthesis 
                                is called a PARAMETER LIST which you MUST pass in order*/
    {
        keyboard.nextLine(); /*use this to avoid the scanner from wrecking the code & clearing keyboard buffer*/
        System.out.println("Enter First Name: ");
        firstName = keyboard.nextLine(); /*always type the right side of EQUAL before left*/
        System.out.println("Enter Principal Amount: ");
        pAmount = keyboard.nextDouble();
        System.out.println("Enter a rate with no decimal: ");
        r = keyboard.nextDouble();
        System.out.println("Enter Number of Months: ");
        months = keyboard.nextInt(); /*call specifically the data type of the data name "INT vs DOUBLE*/
    }
    
    public void calculateInterest() /*method*/
    {
        time = months / 12; 
        rate = r / 100;
        accruedAmount = pAmount *(1 + (rate * time));
        
        DecimalFormat df = new DecimalFormat("0.00"); /*saying you want TWO decimal points 
                                                       after decimal to print int he console*/
        System.out.println("Accrued Balance Is: $" + df.format(accruedAmount));
        
        System.out.println("Would you like to run the app again? Y or N");
        runAgain = keyboard.next().toUpperCase().charAt(0); /*code to get ONE character*/
    }
    
    
    
}

//
//SEQUENCE = 1 statement after another
//ITERATION = Looping (boolean ... once boolean is true then the program stops)
//              while() ... boolean expression is true
//              do while() .... boolean expression is false = QUIT & discontinue looping
//SELECTION = decisions (if, then, else)