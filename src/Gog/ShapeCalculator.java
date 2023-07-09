package Gog;

public class ShapeCalculator {

	public String printArea(Shape sh)
	{
		return sh.calculateArea();
	}
	
	public static void main(String[] args) {
		
		System.out.println(new ShapeCalculator().printArea(new Triangle()));
		System.out.println(new ShapeCalculator().printArea(new Rectangle()));
		System.out.println(new ShapeCalculator().printArea(new Circle()));
	}
}
