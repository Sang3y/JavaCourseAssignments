/*
6.Write a program to get a number "n" from user and print the pattern below. 

1 

12 

123 

1234..n 

1234..(n-1) 

.... 

123 

12 

1 
*/
import java.util.Scanner;  

public class printtraiangle  

{  

Scanner Input= new Scanner(System.in);  

public static void main(String[] args) 

    {  

     

    int x;  

    System.out.print("Enter a number:");  

    Scanner Input= new Scanner(System.in);  

    int i = 0;  

    x = Input.nextInt();  

    // for loop that continues from 0 to x which is inputed by user 

    for (i=0; i<x;i++) 

        {  

        // for loop, that revolts from 1 till i 

        for(int j = 1; j<=i; j++) 

            {  

            // prints j till the loop ends 

                System.out.print(j);  

            }  

        //numbers start from the next line 

            System.out.println();  

        }  

            // loop from x that is decremented till i hits 0 

            for(;i>=0; i--) 

                {  

                    for(int j =1; j <=i;j++ ) 

                    { 

                        System.out.print(j);  

                    }  

                    System.out.println();  

                }  

    }  

}  
/*
Output: 

Enter a number:6 

  

1 

12 

123 

1234 

12345 

123456 

12345 

1234 

123 

12 

1 
*/