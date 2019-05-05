package lamp;

/*
 * 修改-190503:
 * 把開關、亮度改為public static final
 * 把power, brightness 由String 改為int
 */
public class Lamp {
// * 把開關、亮度改為public static final
	public static final int POWER_OFF = 0;
	public static final int POWER_ON = 1;
// * 把開關、亮度改為public static final
	public static final int BRIGHTNESS_DARK = 0;
	public static final int BRIGHTNESS_NIGHT = 1;
	public static final int BRIGHTNESS_COMPUTER = 2;
	public static final int BRIGHTNESS_LEISURE = 3;
	public static final int BRIGHTNESS_READING = 4;

	
//	屬性
//	顏色
	private String color = "White";
//	目前狀態
	// 考慮分成兩種狀態：電源power，亮度brightness
	// 電源power: On, Off
// * 把power, brightness 由String 改為int
	private int power = POWER_OFF;
	// 亮度brightness
// * 把power, brightness 由String 改為int
//	String brightness = "Dark";
	private int brightness = BRIGHTNESS_DARK;

//	關、夜間、電腦、休閒、閱讀: Dark, Night, Computer, Leisure, Reading
//	動作（操作）
//	按（開關）: press
	void press() {
//		if (power.equals("Off")) {
//			power = "On";
//		}
		if(power == POWER_OFF) {
			power = POWER_ON;
		}
// * 把開關、亮度改為public static final
//		if (brightness.equals("Dark")) {
//			brightness = "Night";
//		} else if (brightness.equals("Night")) {
//			brightness = "Computer";
//		} else if (brightness.equals("Computer")) {
//			brightness = "Leisure";
//		} else if (brightness.equals("Leisure")) {
//			brightness = "Reading";
//		} else if (brightness.equals("Reading")) {
//			brightness = "Night";
//		}
		switch (brightness) {
		case BRIGHTNESS_DARK:
			brightness = BRIGHTNESS_NIGHT;
			
			break;
		case BRIGHTNESS_NIGHT:
			brightness = BRIGHTNESS_COMPUTER;
			
			break;
		case BRIGHTNESS_COMPUTER:
			brightness = BRIGHTNESS_LEISURE;
			
			break;
		case BRIGHTNESS_LEISURE:
			brightness = BRIGHTNESS_READING;
			
			break;
		case BRIGHTNESS_READING:
			brightness = BRIGHTNESS_NIGHT;
			
			break;
		default:
			break;
		}
	}

//	長按（關）: longPress
	void longPress() {
		this.brightness = BRIGHTNESS_DARK;
		this.power = POWER_OFF;
	}
	String power() {
		switch (this.power) {
		case POWER_OFF:
			return "Off";
			
		case POWER_ON:
			return "On";

		default:
			return null;
		}
	}
//顯示狀態
	void displayStatus() {
		System.out.println("電源狀態：**" + power() + "**");
		System.out.println("亮度：**" + this.brightness + "**");
	}

	public static void main(String[] args) {

		Lamp lamp = new Lamp();

		lamp.displayStatus();

		lamp.press();
		lamp.displayStatus();
		lamp.press();
		lamp.displayStatus();
		lamp.press();
		lamp.displayStatus();
		lamp.press();
		lamp.displayStatus();
		lamp.press();
		lamp.displayStatus();
		lamp.longPress();
		lamp.displayStatus();

	}
	public Lamp(String color) {
		super();
		this.color = color;
	}
	public Lamp() {
		this("White");
	}
//
//	public Lamp(String color) {
//		super();
//		this.color = color;
//	}
//
//	public Lamp() {
//		this("White");
//	}
}
