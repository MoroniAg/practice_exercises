public class Lasagna {
	
	private Integer timeMinutes = 40;
	private Integer prepareLayer=2;
	
	// TODO: define the 'expectedMinutesInOven()' method
	public int expectedMinutesInOven() {
		return this.timeMinutes;
	}
	// TODO: define the 'remainingMinutesInOven()' method
	public int remainingMinutesInOven(int remainingTime){
		return remainingTime < this.timeMinutes ? this.timeMinutes-remainingTime : 0;
	}
	
	// TODO: define the 'preparationTimeInMinutes()' method
	public int preparationTimeInMinutes(int numberLayers){
		return numberLayers*this.prepareLayer;
	}
	// TODO: define the 'totalTimeInMinutes()' method
	public int totalTimeInMinutes(int numberLayers, int minutesInOven){
		
		return numberLayers*this.prepareLayer+minutesInOven;
		
	}
}
