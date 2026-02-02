
public class Burner {
	enum temperature {
		BLAZING ("VERY HOT! DON'T TOUCH"), //0
		HOT ("CAREFUL"), //1
		WARM ("warm"), //2
		COLD ("cooool"); //3
		
		private String temp;
		temperature (String aTemp) {
			temp = aTemp;
		}
		
		@Override
		public String toString() {
			return temp;
		}
	}
	
	private temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public final static int TIME_DURATION = 2;
	
	
	public temperature getMyTemperature() {
		return myTemperature;
	}
	
	@Override
	public String toString() {
		return "[" + mySetting.toString() + "]" + "...." + myTemperature.toString();
	}
	
	public Burner() {
		myTemperature = temperature.COLD;
		mySetting = Setting.OFF;
	}
	
	public void plusButton() {
		switch(this.mySetting) {
			case OFF:
				this.mySetting = Setting.LOW;
				break;
			case LOW:		
				this.mySetting = Setting.MEDIUM;
				break;
			case MEDIUM:		
				this.mySetting = Setting.HIGH;
				break;
			case HIGH:
				break;

		}
		timer = TIME_DURATION;
	}

	public void minusButton() {
		switch(this.mySetting) {
			case OFF:
				break;
			case LOW:		
				this.mySetting = Setting.OFF;
				break;
			case MEDIUM:		
				this.mySetting = Setting.LOW;
				break;
			case HIGH:		
				this.mySetting = Setting.MEDIUM;
				break;
		}	
		timer = TIME_DURATION;
	}
	
	public void updateTemperature() {
		timer = timer - 1;
		if(timer == 0) {
			switch(this.myTemperature) {
				case COLD:				
					this.myTemperature = temperature.WARM;
					break;
				case WARM:					
					this.myTemperature = temperature.HOT;
					break;
				case HOT:						
					this.myTemperature = temperature.BLAZING;
					break;
				case BLAZING:		
					break;
			}	
		}
	}

}
