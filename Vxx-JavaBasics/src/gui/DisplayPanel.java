package gui;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DisplayPanel extends JPanel {
	// Variables for message
	private String name, fromCity,toCity, willDrive, music;
	// display – multiple lines allowed in JTextArea
	private JTextArea display;

	public DisplayPanel() {
		name = "Someone";
		fromCity = "Somewhere";
		toCity = "Somewhere";
		willDrive = "needs a ride";
		music = "no music";
		display = new JTextArea(2, 20);
		display.setLineWrap(true); // uses multiple lines
		display.setWrapStyleWord(true); // breaks on word boundaries
		updateDisplay();
		add(display);
	}
	private void updateDisplay()
	{
		display.setText(name + " " + willDrive + " from " + fromCity      
						+ " to " + toCity + " and prefers " + music);
	}
	public void setMusic(String music) {
		this.music = music;
		updateDisplay();
	}
	public void setName(String name) {
		this.name = name;
		updateDisplay();

	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
		updateDisplay();
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
		updateDisplay();
	}
	public void setWillDrive(String willDrive) {
		this.willDrive = willDrive;
		updateDisplay();
	}




	}
