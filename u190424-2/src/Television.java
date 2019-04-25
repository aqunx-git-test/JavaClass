
public class Television {

//目前使用信號源
	String source;
//電視頻道
	int channel;
//音量大小
	int volume;
//電源開或關
	String power;

//開|關
	void power() {
		if(power.equals("On")) {
			this.power = "Off";
		}
		if(power.equals("Off")) {
			this.power = "On";
		}
	}
//轉台
	void setChannel(int channel) {
		this.channel = channel;
	}
//音量控制
	void setVolume(int volume) {
		this.volume = volume;
	}
//輸入切換
	void setSource(String source) {
		this.source = source;
	}

}
