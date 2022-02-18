// we did not create person object so this makes sence that constructor of person class wont be invoked.
// this is why we will need to invoke person class via base class using super keyword.

public class Main {
	public static void main(String[] args) {
	
		Hero hero1 = new Hero("Batman",42,"Money");
		
		System.out.println(hero1.name);
		System.out.println("is " + hero1.age + " years old!");
		System.out.println(" and has power of " + hero1.power);
		
		}
}


class Person {
	String name;
	int age;
		
	Person() { 
		this.name = name;
		this.age = age;
		}

}

class Hero extends Person {
	String power;
		
	//this is constructor of base class and this will be invoked when Hero object is created.
	Hero(String name, int age, String power) {

		/*super will invoke the constructor of person class since person is a super class
		this way we are actually invoking constructor of person class using super keyword.	
		*/
		super(name, age);  
		}


}
