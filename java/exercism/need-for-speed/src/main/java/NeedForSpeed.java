class NeedForSpeed {
	
	private int batteryDrain;
	private int speed;
	private int distanceDriven;
	private int battery;
	
	public NeedForSpeed(int speed , int batteryDrain) {
		this.batteryDrain = batteryDrain;
		this.speed = speed;
		battery = 100;
	}
	
	public boolean batteryDrained() {
		return this.battery == 0;
	}
	
	public int distanceDriven() {
		return this.distanceDriven;
	}
	
	public void drive() {
		this.distanceDriven += this.battery == 0 ? 0 : this.speed;
		this.battery -= this.battery == 0 ? 0 : this.batteryDrain;
	}
	
	public static NeedForSpeed nitro() {
		return new NeedForSpeed(50, 4);
	}
	
	public int getBatteryDrain() {
		return batteryDrain;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getBattery() {
		return battery;
	}
}

class RaceTrack {
	private int distance;
	
	public RaceTrack(int distance) {
		this.distance = distance;
	}
	// TODO: define the constructor for the 'RaceTrack' class
	
	public boolean tryFinishTrack(NeedForSpeed car) {
		for (int i = car.distanceDriven(); i < this.distance; i += car.getSpeed()) {
			car.drive();
		}
		return this.distance == car.distanceDriven();
	}
}
