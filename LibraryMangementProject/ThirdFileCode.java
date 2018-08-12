import java.io.File; 

import java.io.FileInputStream; 

import java.io.FileNotFoundException; 

import java.io.FileOutputStream; 

import java.io.IOException; 

import java.io.ObjectInputStream; 

import java.io.ObjectOutputStream; 

import java.util.Scanner; 

public class PrincipleClass { 

// declaring static variable that belongs to this class itself 

static Scanner keyboard=  new Scanner(System.in); 

static Boolean executing = true; 

static String filename =""; 

static MainLibrary library = new MainLibrary(); 

 

public static void main(String[] args) 

{ 

int option; 

System.out.println("Welcome to Library Management System"); 

System.out.println("In this program you can add new books to the library, display the listed books, save a library file with the books you listed, and load a saved library file"); 

//keeps running until called false 

while(executing) 

{ 

 

System.out.println("\nTo attach a book to the library, Enter 1"); 

System.out.println("To display all the list of books added, Enter 2"); 

System.out.println("To Save and quit, Enter 3"); 

System.out.println("To load a library file, Enter 4"); 

System.out.print("Enter your option : "); 

option = keyboard.nextInt(); 

 

//if user inputs 1 then execute this, loads a library file 

switch(option) 

{ 

case 4: 

Scanner namefile = new Scanner (System.in); 

System.out.println("To load a file, enter the name: "); 

filename += namefile.nextLine(); 

 

//FileInputStream reads data from a file 

FileInputStream read= null; 

 

//reads an object from an input stream 

ObjectInputStream objectInput =null; 

 

//gives access to the file, with extension of .ser because of serialized object 

File file = new File(filename+".ser"); 

//executes if the file exists 

if(file.exists())  

{ 

try  

{ 

read = new FileInputStream(file); 

objectInput = new ObjectInputStream(read); 

library = (MainLibrary) objectInput.readObject(); 

read.close(); 

objectInput.close(); 

} 

catch(IOException e) 

{ 

e.printStackTrace(); 

} 

catch (ClassNotFoundException e)  

{ 

e.printStackTrace(); 

} 

System.out.println("Your file '"+ filename + " has been loaded"); 

} 

else 

{ 

System.out.println("\nNo File found."); 

System.out.println("Add a book then save and exit the file, so file could be loaded\n"); 

} 

break; 

 

 

//if user inputs 2 then execute this, adds book to the library 

    // this case allows user to add book to the library  

case 1: 

 

 String NameOfTheBook = ""; 

 String NameofWriter= ""; 

     int isbnNumber; 

         double booksCost; 

         

         Scanner space = new Scanner(System.in); 

         Scanner white = new Scanner(System.in); 

         System.out.print("\nEnter the name of the book: "); 

  

         NameOfTheBook += space.nextLine(); 

          

         System.out.print("Enter the name of the writer: "); 

         NameofWriter+= white.nextLine(); 

      

         System.out.print("Enter the ISBN number: "); 

         isbnNumber = keyboard.nextInt(); 

          

         System.out.print("Enter the cost: "); 

         booksCost = keyboard.nextDouble(); 

          

         BookRecord management= new BookRecord( NameOfTheBook,NameofWriter,isbnNumber, booksCost); 

     library.appendsBook(management); 

     break; 

 

 

// shows all the books added to the lists 

case 2: 

System.out.println(library.CollectedBooks()); 

break; 

 

 

// saves and quit 

case 3: 

 

//asks the user which file to save then the program quits 

System.out.println("You are saving the data to a file, Enter the file name"); 

filename = keyboard.next()+".ser"; 

executing =false; 

//"write" file output stream for writing data to file 

FileOutputStream write = null; 

 

ObjectOutputStream output = null; 

try { 

write = new FileOutputStream(filename); 

output = new ObjectOutputStream(write); 

output.writeObject(library); 

write.close(); 

output.close(); 

} catch (FileNotFoundException e) { 

// TODO Auto-generated catch block 

e.printStackTrace(); 

} catch (IOException e) { 

// TODO Auto-generated catch block 

e.printStackTrace(); 

} 

 

 

} 

 

} 

System.out.println("Your file has been saved"); 

} 

} 