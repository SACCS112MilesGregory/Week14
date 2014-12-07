
public class Circle extends TwoDimentionalShape
{
	private final double PI = 3.14159;
	
	public Circle(double len) 
	{
		super(len);
	}
	
	@Override
	public double getArea()
	{
		return PI * super.getLength() * super.getLength();
	}
	
	@Override
	public String toString()
	{
		return String.format("Circle\nRadius: %.2f\n", super.getLength());
	}
}
