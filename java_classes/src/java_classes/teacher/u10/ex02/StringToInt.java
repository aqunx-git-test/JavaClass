package java_classes.teacher.u10.ex02;

public class StringToInt {

	public static void main(String[] args) {
		String str = "xx";
//		int id = getIntCatchingException(str);
		int id = getIntNotCatchingException(str);
		System.out.println("int value is :" + id);
	}

	public static int getIntNotCatchingException(String str) {

		int id = Integer.parseInt(str);
		return id;

	}

	public static int getIntCatchingException(String str) {
		int result = -1;
		try {
			result = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("String format is wrong!!, please check againg!!");
		}

		return result;
		
	}

}
