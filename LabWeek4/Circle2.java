public class Circle2 { 

public static void main(String[] args) 

{ 

// creating object c1 and specifying the constructor with x, y and points; 

Circle c1 = new Circle(2,2,5.5); 

System.out.print("The area of the circle is: "); 

//returns the area of the circle 

c1.getArea(); 

System.out.print("The perimeter of the circle is: "); 

//returns the perimeter of a circle 

c1.getPerimeter(); 

//returns true if the the specified point is inside the main circle 

c1.contains(3.0, 3.0); 

// return true if the specified circle overlaps the main circle 

Circle circle = new Circle(3.0,5.0,2.3); 

c1.overlaps(circle); 

} 

} 

 

 
/*
Output: 

The area of the circle is: 95.03317777109123 

The perimeter of the circle is: 34.54 

The specified point is inside the circle 

The circle overlaps 
*/