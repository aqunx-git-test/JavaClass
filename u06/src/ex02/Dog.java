package ex02;

public class Dog extends Animal {
	
	private int size;

	@Override
	public void call() {
		if (size > 30) {
			System.out.println("Wooooo, wooooo!");

		} else {
			System.out.println("Wong, wong!!");

		}
	}

}
