package java_classes.teacher.u10.ex01;

public class Dog {
	String name;
	void chaseCat() {
		System.out.println("----");
	}
	void bark() {
		System.out.println(name+":  Ruff!!");
	}
	public static void main(String[] args) {
		Dog fido= new Dog();
		fido.bark();
		fido.chaseCat();
		
		
	}

}
