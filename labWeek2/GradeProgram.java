//1.Write a program to get a score from the user. Print the letter grade such as A, B C .. based on the score. 

import java.util.Scanner;  

public class xandypower 

{  

public static void main(String[] args) 

        {  

int grade;  

Scanner Input= new Scanner(System.in);  

System.out.println("Enter you grade number");  

grade = Input.nextInt();  

if(grade>=60) 

            {  

             System.out.println("you passed the class");  

             if(grade>=90) 

                {  

                 System.out.println("you grade is A");  

                }  

                 else if(grade >=80&& grade<90) 

                 {  

                     System.out.println("your grade is B");  

                 }  

                 else if (grade >=70 && grade<80) 

                 {  

                     System.out.println("your grade is C");  

                 }  

                 else if (grade >60&& grade<70) 

                 {  

                     System.out.println("your grade is D");  

                 }  

            }  

    else 

    {  

        System.out.println("You failed the class");  

    }  

        }  

}  
/*
Output 

Enter you grade number 

80 

you passed the class 

your grade is B 
*/