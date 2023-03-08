package week3.day2;

public class Samsung extends AndroidTv{

	public void playVideo() {
		System.out.println("Watch Video");
		
	}
 public static void main(String[] args) {
	 Samsung obj = new Samsung();
	 obj.openApp();
	 obj.playVideo();
}
}
