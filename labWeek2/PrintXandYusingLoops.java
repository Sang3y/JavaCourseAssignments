//3.Write a program to get x and y from user and print x power y using loops. Do not use functions. 

import java.util.Scanner; 

public class xandypower  

{ 

    public static void main(String[] args) 

    { 

         

        Scanner input= new Scanner(System.in); 

        //initializing integer variable x, y and mult 

        int x,y,mult=1; 

        System.out.println("Enter the coefficient then the power to get the result"); 

        System.out.print("Enter the coefficient:"); 

        x = input.nextInt(); 

        System.out.print("Enter the power:"); 

        y = input.nextInt(); 

        //for loop that revolts from 1 till y power that is inputed by user 

        for(int i = 1; i<=y; i++) 

        { 

            //multiples mult*x until the loop ends 

            mult = mult*x; 

        } 

        //result after the end of loop 

        System.out.println(x+"^"+y+" is "+mult); 

    } 

  

} 
/*
Output: 

Enter the coefficient then the power to get the result 

Enter the coefficient:5 

Enter the power:6 

5^6 is 15625 
*/