package windchill;

public class MyTempConverter {
	public static int calcWindChill(int windSpeed, int temperature) throws Exception  {
		if (temperature < 0)
			throw new Exception("Wind speed and temperature must be > 0");
		
		if (windSpeed < 5)
			return temperature;
		double newTemp = 35.74 + 0.6215*temperature - 
			35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed,0.16);
		return (int) Math.round(newTemp);
	}
}
