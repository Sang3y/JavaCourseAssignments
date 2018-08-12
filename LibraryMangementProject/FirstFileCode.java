//Serializable library 

import java.io.Serializable; 

 

//implements Serializable, stores a copy of the object and send it to another process 

public class BookRecord implements Serializable{ 

 

//private instances variable, book attributes 

private String NameOfTheBook, NameofWriter; 

private int isbnNumber; 

private double booksCost; 

 

//default constructor  

public BookRecord() 

{ 

NameOfTheBook = ""; 

NameofWriter = ""; 

isbnNumber = 0; 

booksCost = 0; 

} 

 

//Constructor that takes parameter 

public BookRecord(String NameOfTheBook, String NameofWriter, int isbnNumber, double booksCost) 

{ 

this.NameOfTheBook = NameOfTheBook; 

this.NameofWriter = NameofWriter; 

this.isbnNumber = isbnNumber; 

this.booksCost = booksCost; 

} 

 

//this method returns a string representation of this object 

public String stringreturner() 

{ 

String st = "\n"; 

return st +"\nName of the book: " +NameOfTheBook+ "\nName of the writer: " + NameofWriter+ "\nISBN Number: " + isbnNumber + "\nCost of The Book: $" + booksCost; 

} 

 

 

 

} 