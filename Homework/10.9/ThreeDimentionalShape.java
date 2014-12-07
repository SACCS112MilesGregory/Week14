
public abstract class ThreeDimentionalShape extends Shape
{
	private double height;

	public ThreeDimentionalShape() 
	{
		height = 0;
	}
	
	public ThreeDimentionalShape(double len)
	{
		super(len);
	}
	 
	public ThreeDimentionalShape(double len, double wid)
	{
		super(len, wid);
	}
	public ThreeDimentionalShape(double len, double wid,
			double hgt)
	{
		super(len, wid);
		setHeight(hgt);
	}

	public void setHeight(double hgt)
	{
		height = hgt > 0? hgt : 0;
	}
	 
	public double getHeight()
	{
		return height;
	}

	public abstract double getArea();
	 
	public abstract double getVolume();
}
