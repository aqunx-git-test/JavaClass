package java_classes.teacher.u10.ex01;

public class ReturnObject {

	public static void main(String[] args) {

// * 宣告一個Dog矩陣dogs, 內含十個元素
		Dog[] dogs = new Dog[3];
// * 在for 迴圈中，建構物件，放到矩陣中
		for (int id = 0; id < dogs.length; id++) {
			dogs[id] = returnDog();
		}
		dogs[0].name = "White";
		dogs[1].name = "LittleBlack";
		dogs[2].name = "Flower";
	}
	public static Dog returnDog() {
		return new Dog();
	}

}
