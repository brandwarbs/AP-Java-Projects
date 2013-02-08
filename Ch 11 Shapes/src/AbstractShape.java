import TurtleGraphics.Pen;
/**
 * Abstract class AbstractShape - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class AbstractShape implements Shape
{
    // instance variables - replace the example below with your own
    protected double xPos;
    protected double yPos;
    
    public AbstractShape()
    {
    	xPos = 0;
    	yPos = 0;
    }
    
    public AbstractShape(double xLoc, double yLoc)
    {
    	xPos = xLoc;
    	yPos = yLoc;
    }
    
    abstract public double area();
    
    abstract public void draw(Pen p);
    
    public final double getXPos()
    {
    	return xPos;
    }
    
    public final double getYPos()
    {
    	return yPos;
    }
    
    public final void move(double xLoc, double yLoc)
    {
    	xPos = xLoc;
    	yPos = yLoc;
    }
    
    abstract public void stretchBy(double factor);
    
    String str = "(X,Y) Position: (" + xPos + "," + yPos + ") \n"
			+ "Area: " + area();
}
