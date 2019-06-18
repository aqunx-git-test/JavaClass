package java_classes.teacher.u10.ex01;

public class ChangeName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// * 宣告一個Dog矩陣dogs, 內含十個元素
		Dog[] dogs = new Dog[3];
// * 在for 迴圈中，建構物件，放到矩陣中
		for (int id = 0; id < dogs.length; id++) {
			dogs[id] = returnDog();
		}
		dogs[0].name = "White";
		dogs[1].name = "LittleBlack";
		dogs[2].name = "Flower";
		
		dogs[0].bark();
		changeName(dogs[0], "小白");
		dogs[0].bark();

		dogs[1].bark();
		changeName(dogs[1], "小黑");
		dogs[1].bark();

		dogs[2].bark();
		changeName(dogs[2], "小花");
		dogs[2].bark();
	}

	public static Dog returnDog() {
		return new Dog();
	}

	public static void changeName(Dog dog, String newName) {
		dog.name = newName;
	}
}
