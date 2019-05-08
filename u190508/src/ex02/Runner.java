package ex02;

public class Runner {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.whatAmI();

		Child c1 = new Child();
		c1.whatAmI();
		
		Parent p2 = new Child();
		p2.whatAmI();
	}

}
