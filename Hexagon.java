
//Milind Pathiyal, Parhuam Jalalian

//Program draws a hexagon using a hexagon class and uses the given parameters
import gpdraw.*;
import java.util.*;
import java.awt.Color;
public class Hexagon
{
    private int side;
    //Pre: Resets all values
    //Post: Sets variables to zero
    public Hexagon()
    {
        side = 0;
    }
    //Pre: There must be a value for each unit
    //Post: This adds the given values to side
    public Hexagon(int givenSide)
    {
        side = givenSide;
    }
    //Pre: values must be greater than zero
    //Post: Calculates perimter of the hexagon by using a formula and returns perimeter
    public int getPerimeter()
    {
        int perimeter = side * 6;
        return perimeter;
    }
    //Pre: None
    //Post: creates the hexagon using the values that were given
    public void draw(DrawingTool pen)
    {
       pen.turnLeft(30);
       pen.forward(side);
       pen.turnRight(30);
       pen.forward(side);
       pen.turnRight(60);
       pen.forward(side);
       pen.turnRight(60);
       pen.forward(side);
       pen.turnRight(60);
       pen.forward(side);
       pen.turnRight(60);
       pen.forward(side);
       pen.turnRight(60);
       pen.forward(side);
    }
}