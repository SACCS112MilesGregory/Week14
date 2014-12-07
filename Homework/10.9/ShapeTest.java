
/**
 * @author Gregory
 *
 */
public class ShapeTest 
{
	public static void main(String[] args) 
	{
		Triangle triangle = new Triangle(3, 4);
		Square square = new Square(5);
		Circle circle = new Circle(7);
		Sphere sphere = new Sphere(11);
		Cube cube = new Cube(9.5);
		Tetrahedron tetra = new Tetrahedron(6.4);
		Shape[] shapes = new Shape[6];

		shapes[0] = triangle;
		shapes[1] = square;
		shapes[2] = circle;
		shapes[3] = sphere;
		shapes[4] = cube;
		shapes[5] = tetra;
		 
		for(int i = 0; i < shapes.length; i++)
		{
			System.out.printf("Shape[%d] is a %s\n",
					i, shapes[i].getClass().getSimpleName());
		}
		
		System.out.println();
		 
		ThreeDimentionalShape shape3D;
		 
		for(Shape shape : shapes)
		{
			System.out.print(shape);
			
			if(shape instanceof TwoDimentionalShape)
			{
				System.out.printf("Area: %.2f\n", shape.getArea());
				System.out.println();
			}
			else
			{
				shape3D = (ThreeDimentionalShape)shape;
				System.out.printf("Area: %.2f\n", shape.getArea());
				System.out.printf("Volume: %.2f\n", shape3D.getVolume());
				System.out.println();
			}
		}
	}
}

