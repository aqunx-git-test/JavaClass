
public class ElectricFan {
	

//顏色
	String color;
//操作狀態
	String status;
//輸入電壓 
	int voltage;
//風速強弱
	String level;
//轉動否
	boolean isRotating;

//關
	void shutdown() {
		status = "off";
	}
//強
	void storm() {
		status = "on";
		level = "storm";
	}
//中
	void windy() {
		status = "on";
		level = "windy";
	}
	
//弱
	void breeze() {
		status = "on";
		level = "breeze";
	}
//擺頭
	void press() {
		isRotating = true;
	}
//擺頭
	void pull() {
		isRotating = false;
	}


}
