import TurtleGraphics.Pen;


/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle extends AbstractShape
{
	private double xPos, yPos;
	   private double width;

	   public Triangle() 
	   {
	      super();
	      
	      width = 1;
	   }

	   public Triangle (double xLoc, double yLoc, double w) 
	   {
	      super(xLoc, yLoc);
	      
	      width = w;
	   }
	 
	   public double area() 
	   {
	      return Math.pow(width, 2) * 0.5;
	   }
	   public double parameter() 
	   {
	      return width * 2 + width * Math.pow(2, 0.5);
	   }

	   public void draw (Pen p)
	   {
	      p.up();
	      p.move (xPos, yPos);
	      p.down();
	      p.setDirection (0); p.move (width);
	      p.turn (-90); p.move (width);
	      p.turn (-135); p.move (width * Math.pow(2, 0.5));
	      
	   }

	   public void stretchBy (double factor)
	   {
	      width *= factor;
	   }

	   public String toString()
	   {
	      String str = "TRIANGLE\n"
	                 + "Width: " + width +"\n"
	                 + super.toString();
	      return str;
	   }
}
