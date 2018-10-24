import java.util.Scanner;
/**
 * 
 * @author Ewan Brooks
 *
 */

public class RectangleCalculator 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name;
		name = keyboard.nextLine();
		System.out.println("\n\nHello, " + name + " welcome to the Geometry Calculator");
		System.out.println("Please enter to continue. . .");
		keyboard.nextLine();
		System.out.println("AREA OF A RECTANGULAR PRISM");
		System.out.print("Please enter the measure of the width: ");
		String widthStr = keyboard.nextLine();
		System.out.print("Please enter the measure of the height: ");
		String heightStr = keyboard.nextLine();
		System.out.print("Please enter the measure of the length: ");
		String lengthStr = keyboard.nextLine();
		double width;
		width = Double.parseDouble(widthStr);
		double height = Double.parseDouble(heightStr);
		double length = Double.parseDouble(lengthStr);
		System.out.print("Please enter the unit of measure: ");
		String unit = keyboard.nextLine();
		double area = (length*width*height);
		System.out.println("The area of the rectangular prism is " + area + " " + unit + "^2");
		

	}

}

