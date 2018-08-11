//Lab Question 1: FahrenheitToCelsiusConverter


//header that allows the programmer to ask user for input 

import java.util.Scanner; 

//public class called MyProgram 

public class MyProgram 

 { 

//asking user for input 

static Scanner Input = new Scanner(System.in); 

public static void main(String[] args) 

{ 

//prints out the string that asks the user for Fahrenheit 

System.out.println("Temperature of Fahrenheit to Celsius converter\nEnter the Fahrenheit temperature"); 

//gets input from the user 

double farhenheit = Input.nextDouble(); 

//double variable that takes the inputted celsius degree and converts celsius to farhenheit 

double celsius = (farhenheit-32)*5/9; 

//prints the answer 

System.out.print("The temperature for celsius is " + celsius); 

} 

} 

 

 

 

 

 

//Lab Question 2: Swap Values with temporary variable

import java.util.Scanner; 

public class Swapper 

 { 

               static Scanner Input = new Scanner(System.in); 

 
 

public static void main(String[] args) 

{ 

//declaring integer variables a and b 

int a,b; 

//prints out the string that asks the user to input a and b 

System.out.println("This Program swaps integer a to b and b to a"); 

System.out.println(" Enter a = "); 

//allows the user to input the value for integer a 

a = Input.nextInt();  

System.out.println("Enter b = "); 

//allows the user to input the value for inter b 

b= Input.nextInt(); 

//temeporary varible that copies the value for a 

int c = a; 

//changes the value of to b 

a=b; 

//changes the value of b to c 

b=c; 

//prints out the swap values 

System.out.println("a is now "+ a + "\nb is now 1" + c); 

} 

} 

 
 

 
 

 