
public class Cube extends ThreeDimentionalShape
{

	public Cube(double len) 
	{
		super(len);
	}
	
	@Override
	public double getArea()
	{
		return super.getLength() * super.getLength();
	}
	
	@Override
	public double getVolume()
	{
		return getArea() * super.getLength();
	}
	
	@Override
	public String toString()
	{
		return String.format("Cube\nSide: %.2f\n", super.getLength());
	}
}
