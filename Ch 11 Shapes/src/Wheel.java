import TurtleGraphics.Pen;
/**
 * Write a description of class Wheel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wheel extends Circle
{
    private int spokes;
    
    public Wheel() 
    {
        super();
        
        spokes = 0;
    }
    
    public Wheel(double xLoc, double yLoc, double r, int s)
    {
    	super(xLoc, yLoc, r);
    	
    	spokes = s;
    }
    
    public void draw(Pen p)
    {
    	super.draw(p);
    	
    	for(int i = 1; i <= spokes; i++)
    	{
    		p.up();
    		p.move(xPos, yPos);
    		p.setDirection(i * 360 / spokes);
    		p.down();
    		p.move(radius);
    	}
    }
    
    public void setSpokes (int s)
    {
    	spokes = s;
    }
    
    public String toString()
    {
    	String str = "WHEEL\n" 
    				+ "Spokes: " + spokes + "\n"
    				+ "(X,Y) Position: (" + xPos + "," + yPos + ") \n"
    				+ "Area: " + area() + "\n"
    				+ "Parameter: " + parameter();
    	
    	return str;
    }
}
