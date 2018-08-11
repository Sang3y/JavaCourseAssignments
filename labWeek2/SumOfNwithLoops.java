//2.Write a program to find sum of n numbers starting from 1. 1+2+3+...n 

import java.util.Scanner;  

public class xandypower  

{  

static Scanner Input= new Scanner(System.in);  

public static void main(String[] args) 

    {  

    //initializing integer variable n and num 

    int n, num = 0;  

    System.out.println("Enter a number to find its sum from 1+2..n");  

    n= Input.nextInt();  

    //loop that keeps on from 1 until n that is inputed by user 

    for(int i = 1; i<=n; i++) 

    {  

        //adds num+i until the loop ends 

        num = num+i;  

    }  

    System.out.println("The sum is : " + num);  

    }  

}  
/*
Output 

Enter a number to find its sum from 1+2..n 

5 

The sum is : 15
*/