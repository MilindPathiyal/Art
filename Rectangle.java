//Milind Pathiyal, Parhuam Jalalian

//Program draws a rectangle using a rectangle class and uses the given parameters
import gpdraw.*;

import java.util.*;
import java.awt.Color;
public class Rectangle 
{
    private int length;
    private int width;
    //Pre: Resets all values
    //Post: Sets variables to zero
    public Rectangle()
    {
        length = 0;
        width = 0;
    }
    //Pre: There must be a value for each unit
    //Post: This adds the given values to length and width
    public Rectangle(int givenLength, int givenWidth)
    {
        length = givenLength;
        width = givenWidth;
    }
    //Pre: values must be greater than zero
    //Post: Calculates perimter of the rectangle by using a formula and returns perimeter
    public int getPerimeter()
    {
        int perimeter = 2 * length + 2 * width;
        return perimeter;
    }
    //Pre: None
    //Post: creates the rectangle using the values that were given
    public void draw(DrawingTool pen)
    
    {
        pen.forward(length); 
        pen.turnRight(90);
        pen.forward(width);
        pen.forward(length); 
        pen.turnRight(90);
        pen.forward(width);
        pen.forward(length); 
        pen.turnRight(90);
        pen.forward(width);
        pen.forward(length); 
        pen.turnRight(90);
        pen.forward(width);
    }
}
