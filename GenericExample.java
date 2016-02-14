import java.io.*;
import java.util.*;

abstract class Shape
{
abstract void draw();
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("inside Circle");

	}
}
class Rect extends Shape
{
   public void draw()
   {
 	 System.out.println("inside Rectangle");
   }

}
class GenericExample{

public static void drawImp(List<? extends Shape> lists)
{
   for(Shape s:lists)
   {
	  s.draw();
   }

}
public static void main(String args[])
 {
   List<Circle> arr= new ArrayList<Circle>();
   arr.add(new Circle());
   List<Rect> rr= new ArrayList<Rect>();
   rr.add(new Rect());
   rr.add(new Rect());

   drawImp(arr);
   drawImp(rr);
 
 }
}