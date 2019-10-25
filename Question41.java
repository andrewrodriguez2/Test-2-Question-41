import java.util.Scanner;

public class Question41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a shape: ");
		String ShapeChoice = in.next();
		boolean Schoice=Boolean.parseBoolean(ShapeChoice);
		
	if (Schoice = circle){
		int radius;
        double pi = 3.14, area;
        System.out.print("Enter a radius:");
        radius = in.nextInt();
        area = pi * radius * radius;
		System.out.println("Area:" + area);
		
	}if (Schoice = rectangle){
		System.out.println("Enter the length:");
         double length = in.nextDouble();
        System.out.println("Enter the width:");
         double width = in.nextDouble();
          double rarea = length * width;
		System.out.println("Area: " + rarea); 
		
	}if (Schoice = square){
		System.out.println("Enter side of square:");
		double side = in.nextDouble();
		double sarea = side * side;
		System.out.println("Area: " + sarea);
		
	}if (Schoice = triangle){
        System.out.println("Enter the width:");
        double base = in.nextDouble();
        System.out.println("Enter the height:");
		double height = in.nextDouble();
		double tarea = (base * height)/2;
		System.out.println("Area: " + tarea);      
	}else{
		System.out.println("Enter a shape: ");
	}
	
}
}