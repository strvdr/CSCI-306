/**
 * Burner Class
 * 
 * @author Kale Carlson
 * @author Strydr Silverberg
 * 
 * 2/2/2026
 * Purpose: Simulates a burner on a stove
 */
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
	
	//return a burner's status in the requested format
	@Override
	public String toString() {
		return "[" + mySetting.toString() + "]" + "...." + myTemperature.toString();
	}
	
	public Burner() {
		myTemperature = temperature.COLD;
		mySetting = Setting.OFF;
	}
	
	// increment the setting of a burner unless it is high in which case will stay high
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

	// decrement the setting of a burner unless it is off in which case will stay off
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
	
	// manages the incrementation and decrementation of a burner temperature depending on the timer variable.
	// Each temperature setting has progressively more things to check because we must take into account
	// if a burner's plus/minus button was pressed multiple times
	public void updateTemperature() {
		timer = timer - 1;
		if(timer == 0) {
			switch(this.myTemperature) {
				case COLD:	
					if(this.mySetting == Setting.OFF) {
						break;
					}
					this.myTemperature = temperature.WARM;
					timer = TIME_DURATION;
					break;
				case WARM:					
					if(this.mySetting == Setting.LOW || this.mySetting == Setting.OFF) {
						if(this.mySetting == Setting.OFF) {
							this.myTemperature = temperature.COLD;
							timer = TIME_DURATION;
						}
						break;
					}
					this.myTemperature = temperature.HOT;				
					timer = TIME_DURATION;
					break;
				case HOT:	
					//if temperature is hot, we must see if the setting is anything below high
					//if below high, the burner is cooling else the temperature is rising
					if(this.mySetting == Setting.MEDIUM || this.mySetting == Setting.LOW || this.mySetting == Setting.OFF) {
						if(this.mySetting == Setting.OFF || this.mySetting == Setting.LOW) {
							this.myTemperature = temperature.WARM;
							timer = TIME_DURATION;
						}
						break;
					}
					this.myTemperature = temperature.BLAZING;				
					timer = TIME_DURATION;
					break;
				case BLAZING:						
					if(this.mySetting == Setting.MEDIUM || this.mySetting == Setting.LOW || this.mySetting == Setting.OFF) {
						this.myTemperature = temperature.HOT;
						timer = TIME_DURATION;
					}
					break;
			}	
		}
	}

}
