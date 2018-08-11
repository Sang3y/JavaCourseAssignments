//4.Write the program using for loop to find factorial of a given number using for loop. 

import java.util.Scanner;  

public class xandypower  

{  

static Scanner Input= new Scanner(System.in);  

public static void main(String[] args) 

    {  

    //initializing variable n and fact; 

    int n, fact =1;  

    System.out.println("Enter a number to find its factorial");  

    //asks user to input the value for n  

    n= Input.nextInt();  

    //for loop that continues from 1 till n that comes from the user 

    for(int i=1; i<=n; i++) 

    {  

        //multiples fact*i until the loops ends  

        fact= fact*i;  

    }  

    //prints fact that displays the factorial 

    System.out.println(fact);  

    }  

}  
/*
Output: 

Enter a number to find its factorial 

Factorial:5 

120 
*/