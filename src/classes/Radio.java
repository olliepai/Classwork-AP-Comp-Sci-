package classes;

public class Radio {
	private double station;
	private int volume;
	
	public Radio() {
		station = 87.5;
		volume = 0;
	}
	
	public Radio(double station, int volume) {
		if (station < 87.5 || station > 108.0) {
			this.station = 87.5;
		} else {
			this.station = station;
		}
		
		if (volume < 0 || volume > 11) {
			this.volume = 0;
		} else {
			this.volume = volume;
		}
	}
	
	public int getVolume() {
		return volume;
	}
	
	public double getStation() {
		return station;
	}
	
	public void setVolume(int volume) {
		if (volume < 0 || volume > 11) {
			throw new IllegalArgumentException("Volume values must be between 0 and 11, inclusive.");
		}
		
		this.volume = volume;
	}
	
	public void setStation(double station) {
		if (station < 87.5 || station > 108.0) {
			throw new IllegalArgumentException("Station numbers must be between 87.5 and 108.0, inclusive.");
		}
		
		this.station = station;
	}
	
	public String toString() {
		return "Station: " + station + "\nVolume: " + volume;
	}
}
