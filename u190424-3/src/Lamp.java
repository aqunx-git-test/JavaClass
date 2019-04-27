
public class Lamp {
//	屬性
//	顏色
	String color;
//	目前狀態
	//考慮分成兩種狀態：電源power，亮度brightness
	//電源power: On, Off
	String power;
	//亮度brightness
	String brightness;
//	關、夜間、電腦、休閒、閱讀: Dark, Night, Computer, Leisure, Reading
//	動作（操作）
//	按（開關）: press
	void press() {
		if(power.equals("Off")) {
			power = "On";
		}
		if(brightness.equals("Dark")){
			brightness = "Night";
		}
		if(brightness.equals("Night")){
			brightness = "Computer";
		}
		if(brightness.equals("Computer")){
			brightness = "Leisure";
		}
		if(brightness.equals("Leisure")){
			brightness = "Reading";
		}
		if(brightness.equals("Reading")){
			brightness = "Night";
		}
	}
//	長按（關）: longPress
	void longPress() {
		this.brightness = "Dark";
		this.power = "Off";
	}
//顯示狀態
	void displayStatus() {
		System.out.println("電源狀態：**"+ this.power+"**");
		System.out.println("亮度：**"+ this.brightness+"**");
	}

}
