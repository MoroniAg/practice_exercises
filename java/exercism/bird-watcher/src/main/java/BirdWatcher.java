import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

class BirdWatcher {
	private final int[] birdsPerDay;
	
	public BirdWatcher(int[] birdsPerDay) {
		this.birdsPerDay = birdsPerDay.clone();
	}
	
	public int[] getLastWeek() {
		return this.birdsPerDay;
	}
	
	public int getToday() {
		return this.birdsPerDay[6];
	}
	
	public void incrementTodaysCount() {
		this.birdsPerDay[6] = this.getToday() + 1;
	}
	
	public boolean hasDayWithoutBirds() {
		return Arrays.stream(this.birdsPerDay).boxed().anyMatch(integer -> integer == 0);
	}
	
	public int getCountForFirstDays(int numberOfDays) {
		var total = new AtomicInteger(0);
		for (int i = 0; i < (numberOfDays > 7 ? 7 : numberOfDays); i++) {
			total.set(total.get() + this.birdsPerDay[i]);
		}
		return total.get();
	}
	
	public int getBusyDays() {
		return (int) Arrays.stream(this.birdsPerDay).boxed().filter(integer -> integer >= 5).count();
	}
}
