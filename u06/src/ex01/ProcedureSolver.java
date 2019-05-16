package ex01;

public class ProcedureSolver {

	public static void animalCall(String animal, int size) {
		if (animal.equals("Dog")) {
			if (size > 30) {
				System.out.println("Wooooo, wooooo!");

			} else {
				System.out.println("Wong, wong!!");

			}
		}
		if (animal.equals("Cat")) {
			System.out.println("Meau...");
		}
		if (animal.equals("Sheep")) {
			System.out.println("Mee, mee...");
		}
		if (animal.equals("Ckuckoo")) {
			System.out.println("KuKu..");
		}
	}
}
