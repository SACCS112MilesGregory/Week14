
public abstract class TwoDimentionalShape extends Shape 
{

	public TwoDimentionalShape() 
	{
	}
	
	public TwoDimentionalShape(double len)
	{
		super(len);
	}
	  
	public TwoDimentionalShape(double len, double wid)
	{
		super(len, wid);
	}

	public abstract double getArea();


}
