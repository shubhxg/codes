// When creating a subclass constructor, if you don't explicitly call a superclass constructor with super
// , then Java will insert an implicit call to the no-arg "default" superclass constructor, i.e. super();

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		displayMessage();
		
		Scanner scanner = new Scanner(System.in);
		var l = scanner.nextFloat();
		var b = scanner.nextFloat();

		Rectangle objrec = new Rectangle(l, b);
		objrec.displayArea();

		Cuboid objcube = new Cuboid(l, b, 2);
		System.out.println();
		objcube.displayVolume();
		scanner.close();
	}
	
	static void displayMessage() {
		System.out.println("Enter the l, b : ");
	}
}

class Rectangle {
	double l, b;
	Rectangle(float length, float width) {
		this.l = length;
		this.b = width;
	}
	void displayArea() {
		System.out.println("Area of this object is " + (l * b));
	}
}

class Cuboid extends Rectangle {
	double h;
	Cuboid(float l, float b, float h) {
		super(l, b); // explicitly calling super constructor 
		this.h = h;
	}
	void displayVolume() {
		System.out.println("Volume of this object is " + (l * b * h));
	}
}
