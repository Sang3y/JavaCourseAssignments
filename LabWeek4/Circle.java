/*
The Circle Class
Problem Description:
Define the Circle class that contains:
 Two double data fields named x and y that specify the center of the
circle with get methods.
 A data field radius with a get method.
 A no-arg constructor that creates a default circle with (0, 0) for (x, y)
and 1 for radius.
 A constructor that creates a circle with the specified x, y, and radius.
 A method getArea() that returns the area of the circle.
 A method getPerimeter() that returns the perimeter of the circle.
 A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this circle. See Figure (a).
 A method overlaps(Circle circle) that returns true if the specified
circle overlaps with this circle. Two circles overlap if the distance
between the two centers are less than or equal to sum of the radius of
two circles (this.radius + circle.radius). See Figure (b).
p

(a) (b)
Fig: (a) A point is inside the circle. (b) A circle overlaps another circle.
Implement the class. Write a test program that creates a Circle object
c1 (new Circle(2, 2, 5.5)), displays its area and perimeter, and displays
the result of c1.contains(3, 3) and c1.overlaps(new Circle(3, 5, 2.3)).
*/

public class Circle { 

// three private variables x, y that specify the center and radius 

private double x; 

private double y; 

private double radius; 

 

 

// no arg constructer with default values 

public Circle() 

{ 

x = 0; 

y =0; 

radius = 1; 

} 

//constructor with specified x, y, and radius 

public Circle(double x, double y, double radius) 

{ 

this.x=x; 

this.y=y; 

this.radius=radius; 

} 

//get method for x 

public double getX() 

{ 

return x; 

} 

//get method for y 

public double getY() 

{ 

return y; 

} 

//get method for radius 

public double getRadius() 

{ 

return radius; 

} 

//method that formulates area of a circle for specified points 

public double getArea() 

{ 

double area = Math.PI*radius*radius; 

System.out.println(area); 

return area; 

} 

//returns the Perimeter of a circle 

public double getPerimeter() 

{ 

double perimeter = 2*(3.14)*radius; 

System.out.println(perimeter); 

return perimeter; 

} 

//method that returns true if the specified point x and y are inside the given circle 

public boolean contains(double x, double y) 

{ 

//distance variable for the distance between 2 circle's x and y point 

double distance = (Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2))); 

//if distance is less than radius then point is inside the circle 

if(distance<radius) { 

System.out.println("The specified point is inside the circle"); 

return true; 

} 

//else returns true if the point is not inside the circle 

else  

System.out.println("The specified point is not inside the circle"); 

return false; 

 

} 

//method that returns true if the main circle and this specified circle overlaps 

public boolean overlaps(Circle circle) 

{ 

//variable distance that determines the distance between two circle  

double distance = (Math.sqrt(Math.pow(this.x-circle.x,2)+Math.pow(this.y-circle.y,2))); 

//return true if distance between the two centers are less than or equal to sum of the two circles 

if((distance)<= (this.radius+circle.radius)) 

{ 

System.out.println("The circle overlaps"); 

return true; 

} 

// else the circle don't overlap 

System.out.println("The circle doesn't overlap"); 

 

return false; 

} 

 

 

}