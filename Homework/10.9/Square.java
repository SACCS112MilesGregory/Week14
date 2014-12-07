
public class Square extends TwoDimentionalShape
{

	public Square(double len) 
	{
		super(len);
	}
	
	@Override
	public double getArea()
	{
		return super.getLength() * super.getWidth();
	}
	
	@Override
	public String toString()
	{
		return String.format("Square\nSide: %.2f\n",
				super.getLength());
	}
}
