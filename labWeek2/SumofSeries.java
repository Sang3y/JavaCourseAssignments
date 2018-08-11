/*
5.Write a program to print sum of the series below. 

1!/n! + 2!/(n-1)! + 3!/(n-2)!.....n!/1! 

 */

import java.util.Scanner;  

public class xandypower  

{  

    public static void main(String[] args)  

    {  

        //initializing double variable n, sum and d; 

        double n,sum=0,d;  

        Scanner input = new Scanner(System.in);  

        System.out.println("Enter a number that will solve the series 1!/n! + 2!/(n-1)! + 3!/(n-2)!.....n!/1!");  

        n= input.nextInt();  

         //assigning value of n to d 

        d=n;  

        //for loop that continues from 1 to n that user inputs 

        for(double i = 1; i<=n; i++)  

        {  

            //initializing double variable fnum and fden, the value is assigned back to 1 after the loop makes another round 

            double fnum=1, fden=1;  

            //for loops that continues from 1 and is incremented till i 

            for(double j=1; j<=i; j++)  

            {  

                //multiplies fnum and j that results the factorial  

                fnum = fnum*j;  

            }  

            //for loop from 1, incremented to d 

            for(double k=1; k<=d; k++)  

            {  

                //product of fden and k and results the factorial 

                fden= fden*k;  

            }  

            //adds sum and the division of fnum and fden and continues till the loop ends 

            sum = sum+(fnum/fden);  

            //decrements d for the loop of fden 

            d--;  

        }  

        //prints the result after the end of the loop 

        System.out.println("The sum is: " + sum);  

    }  

   

}  

 /*

Output: 

Enter a number that will solve the series 1!/n! + 2!/(n-1)! + 3!/(n-2)!.....n!/1! 

3 

The sum is: 7.166666666666667 
*/