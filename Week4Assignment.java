// Code reviewed by @professorgordon
//Joshua Routledge

import java.util.Scanner;

public class Week4Assignment {

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	double length;
    	double width;
    	double height;
    	
    	System.out.print(	"This program will accept a length, width and height of a box,\n" + 
    						"and then it will report the surface area and volume of it.\n\n");
    	
    	System.out.print("    Enter the length of your box: ");
    	length = input.nextDouble();
    	
    	System.out.print("    Enter the width of your box: ");
    	width = input.nextDouble();
    	
    	System.out.print("    Enter the height of your box: ");
    	height = input.nextDouble();
    	
    	System.out.printf("\nThe surface area of your rectangle is: %,.2f", surfaceArea(length,width,height));
    	System.out.printf("\nThe volume of your rectangle is: %,.2f", volume(length,width,height));
    	
    }
    
    private static double surfaceArea(double length, double width, double height) {
    	double surfaceArea;
    	surfaceArea = (2*length*width)+(2*width*height)+(2*height*length);
    	return surfaceArea;
    }
    
    private static double volume(double length, double width, double height) {
    	double volume;
    	volume = length*width*height;
    	return volume;
    }
    
}
