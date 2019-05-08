package ex01;

public class Runner {

	public static void main(String[] args) {
		// 嘗試呼叫Child中的public, protected
		
		Child child = new Child();
		
		child.publicAction();
		child.protectedAction();
		

	}

}
