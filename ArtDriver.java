//Milind Pathiyal & Parhuam Jalalian

//Program creates abstract art by using the rectangle, triangle, and hexagon classes. It also calculates the perimeter of the shape 
import gpdraw.*;
import java.util.*;
import java.awt.Color;
public class ArtDriver
{
    public void draw()
    {
        SketchPad pad = new SketchPad (5000,5000);
        DrawingTool pen = new DrawingTool(pad);
        
        //mobilzes abstract art to a visible standpoint
        pen.up();
        pen.turnLeft(90);
        pen.forward(200);
        pen.turnRight(90);
        pen.backward(230);
        pen.down();
        
        int x = 1;
        int sum = 1;
        int total = 0;
        //Pre: x must be less than 50 in order for an endless loop to occur
        //Post: Draws the figure endlessly
        while ( x < 50 )
        {
            float hue = (float)(sum/360.0000); 
            pen.setColor(Color.getHSBColor(hue, 1.0f, 1.0f)); 
            
            Rectangle box1 = new Rectangle(70,80);
            box1.draw(pen);
            total += box1.getPerimeter();   //Adds perimeter current perimeter
            Triangle box2 = new Triangle(90);
            box2.draw(pen);
            total += box2.getPerimeter();   //Adds perimeter current perimeter
            Hexagon box3 = new Hexagon(70);
            box3.draw(pen);
            total += box3.getPerimeter();   //Adds perimeter current perimeter
            
            pen.forward(100);
            sum++;
            pen.turnRight(117);
            System.out.println(total);  //Prints perimeter each time the figure is drawn
        }      
    }
}
/*
These values represent the total perimeter after each loop
990    
1980
2970
3960
4950
5940
6930
7920
8910
9900
 */