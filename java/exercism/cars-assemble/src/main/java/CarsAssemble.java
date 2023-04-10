public class CarsAssemble {
	
	public double productionRatePerHour(int speed) {
		var production = speed * 221;
		if (speed >= 5 && speed <= 8) {
			return production * 0.9;
		} else if (speed == 9) {
			return production * 0.8;
		} else if (speed == 10) {
			return production * 0.77;
		}
		return production;
	}
	
	public int workingItemsPerMinute(int speed) {
		return (int) this.productionRatePerHour(speed) / 60;
	}
}
