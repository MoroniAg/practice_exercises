import java.util.ArrayList;
import java.util.List;

public class TestTrack {
	
	public static void race(RemoteControlCar car) {
		car.drive();
	}
	
	public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1 , ProductionRemoteControlCar prc2) {
		var list = new ArrayList<ProductionRemoteControlCar>();
		list.add(prc2);
		list.add(prc1);
		return list;
	}
}
