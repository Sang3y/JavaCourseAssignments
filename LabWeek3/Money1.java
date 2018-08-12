import java.util.Scanner; 

public class Money1 { 

public static void main(String[] args) 

{ 

Scanner input = new Scanner(System.in); 

//creating object a1 that interacts with the class Money 

Money a1 = new Money(); 

System.out.print("Enter the dollar: "); 

//asks user the value for the mutator setMoney 

a1.setMoney(input.nextInt()); 

System.out.print("Enter the cents: "); 

//asks user the value for the mutator setCents 

    a1.setCents(input.nextInt()); 

    //prints out the return value from the accessor getDollar, given from the user 

    System.out.println("The entered value for dollar is " + a1.getDollar()); 

    //prints out the return value from the accessor getCents, given from user 

    System.out.println("The entered value for cents is " + a1.getCents()); 

    //prints out the return value from the methods setdollardouble, will change the integer value to double 

    System.out.println("The monetary value is now "+ a1.setdoublemonetary()); 

 

    System.out.println(); 

 

    // different object a2  

    Money a2 = new Money(); 

    System.out.print("Enter the dollar for second try: "); 

    a2.setMoney(input.nextInt()); 

    System.out.print("Enter the cents for second try: "); 

    a2.setCents(input.nextInt()); 

    System.out.println("The entered value for dollar is " + a2.getDollar()); 

    System.out.println("The entered value for cents is " + a2.getCents()); 

    System.out.println("The dollar value is now "+ a2.setdoublemonetary()); 

 

} 

} 
               
/*
Enter the dollar: 50 

Enter the cents: 100 

The entered value for dollar is 50 

The entered value for cents is 100 

The monetary value is now 51.0 

 

Enter the dollar for second try: 100 

Enter the cents for second try: 88 

The entered value for dollar is 100 

The entered value for cents is 88 

The dollar value is now 100.88 
*/