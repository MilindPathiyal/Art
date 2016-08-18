
//Milind Pathiyal, Parhuam Jalalian

//Program draws a triangle using a triangle class and uses the given parameters

import gpdraw.*;
import java.util.*;
import java.awt.Color;
public class Triangle
{
    private int side;
    //Pre: Resets all values
    //Post: Sets variable to zero
    public Triangle()
    {
        side = 0;
    }
    //Pre: There must be a value for each unit
    //Post: This adds the given value to side
    public Triangle(int givenSide)
    {
        side = givenSide;
    }
    //Pre: values must be greater than zero
    //Post: Calculates perimter of the triangle by using a formula and returns perimeter
    public int getPerimeter()
    {
        int perimeter = side * 3;
        return perimeter;
    }
    //Pre: None
    //Post: creates the triangle using the values that were given
    public void draw(DrawingTool pen)
    {
       pen.forward(side);
       pen.turnRight(30);
       pen.forward(side);
       pen.turnRight(120);
       pen.forward(side);
       pen.turnRight(120);
       pen.forward(side);
       pen.turnRight(90);
    }
}
