package driver;

public class Sleep {
	
	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
