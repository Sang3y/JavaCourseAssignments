/*
Define a class named Money that stores a monetary amount. 
The class should have two private integer variables, 
one to store the number of dollars and another to store number of cents.
Add accessor and mutator methods to read and set both member variables. 
Add another method that returns the monetary amount as double. 
Write a program that tests all of your functions with at least two different money objects.
*/

public class Money{  

//declaring private integer variable dollars 

private int dollars;  

//declaring private integer variable cents 

private int cents;  

  //mutator that provides the methods to access the value for private variable dollars 

public void setMoney(int d)  

{  

dollars = d;  

}  

//mutator that provides the methods to access the value for private variable cents 

public void setCents(int c)  

{  

cents =c;  

}  

//accessor that returns the value of the private variable dollars 

public int getDollar()  

{  

return dollars;  

      

}  

//accessor that returns the value of the private variable cents 

public int getCents()  

{  

return cents;  

}  

//method that sets the dollars and cents to double, then returns it added up 

public double setdoublemonetary() 

{ 

double ddollars = dollars, dcents = cents, d; 

dcents = dcents/100; 

d = ddollars+dcents; 

return d; 

} 

}  

 
