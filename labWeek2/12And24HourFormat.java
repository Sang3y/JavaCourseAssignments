/*
7.Write a program to get number of seconds from user. 

Convert it to time in 12 Hr and 24Hr format and print it. 

 12:00:00 12 hr format 

23:00:00 24 hr format 
*/
 

import java.util.Scanner; 

public class twelveandtwentyfourformat  

{ 

    static Scanner Input = new Scanner(System.in); 

public static void main(String[] args) 

{ 

    System.out.print("Enter the seconds :"); 

    int sec, rec=0, hour=0, trans=0; 

    sec = Input.nextInt(); 

        int minute; 

        hour= sec/3600; 

        minute = sec%3600; 

        trans=minute/60; 

        rec=minute%60; 

        if(hour<=12) 

        { 

        System.out.println("12 hour format"); 

        System.out.println(hour+":"+trans+":"+rec); 

        System.out.println("24 hour format"); 

        System.out.println(hour+":"+trans+":"+rec); 

        } 

        else if(hour>12) 

        { 

         int j=0; 

          for(int i = 13; i<=hour; i++) 

          { 

           j= j+1; 

           if(j>12) 

            { 

              j= j-12; 

            } 

          } 

        System.out.println("12 hour format"); 

        System.out.println(j+":"+trans+":"+rec); 

        System.out.println("24 hour format"); 

        int count=0; 

        for(int k = 1; k<=hour; k++) 

        { 

         count = count+1; 

         if(count>24) 

         { 

             count = count-24; 

         } 

        } 

        System.out.println(count+":"+trans+":"+rec); 

        } 

} 

        } 

 

 
/*
Output: 

Enter the seconds :90600 

12 hour format 

1:10:0 

24 hour format 

13:10:0 
*/