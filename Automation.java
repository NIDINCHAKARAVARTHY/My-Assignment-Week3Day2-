package week3.day2;

public class Automation extends MultipleLangauge{

	public void java() {
		System.out.println("java");
		
	}

	public void selenium() {
		
		System.out.println("Selenium");
	}

	
	public void ruby() {
		
		System.out.println("Ruby");
	}
	
	public static void main(String[] args) {
		Automation obj = new Automation();
		obj.java();
		obj.selenium();
		obj.ruby();
		obj.python();
	}

}
