public class ElonsToyCar {
	private int distance = 0;
	private int battery = 100;
	
	public ElonsToyCar() {
	}
	
	public static ElonsToyCar buy() {
		return new ElonsToyCar();
	}
	
	public String distanceDisplay() {
		return "Driven " + distance + " meters";
	}
	
	public String batteryDisplay() {
		return "Battery " + (battery == 0 ? "empty" : "at "+battery + "%");
	}
	
	public void drive() {
		if (this.battery > 0) {
			this.distance += 20;
			this.battery--;
		}
	}
}
