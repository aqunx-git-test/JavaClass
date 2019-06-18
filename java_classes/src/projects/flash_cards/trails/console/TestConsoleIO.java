package projects.flash_cards.trails.console;
/*
 * 結論：
 * 在eclipse console中輸入中文會有問題，但是直接執行class檔就沒問題
 * 建議：遠端除錯模式，或把輸入這塊先隔絕，用Unit test測試，最後再直接用ap執行測試，有問題再使用remote debug
 */

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * print what is input
 */

public class TestConsoleIO {

	public static void main(String[] args) {

		// new a inputstreamreader from system.in
		BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input;
			do {
				input = keyboardReader.readLine();
				System.out.println("Your input is:**"+input+"**");
			} while (input.length() > 0);
		} catch (IOException e) {
			System.out.println("IOException occured...");
		}

//		Console c = System.console();
//		if (c == null) {
//			System.err.println("No console.");
//			System.exit(1);
//		}
//
//		String login = c.readLine("Enter your login: ");
//		System.out.println("login is :**" + login+"**");
	}

}
