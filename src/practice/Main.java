package practice;

public class Main implements Greeting{
	
	public void hi() {
		String str1 = "안녕하세요.";
		String str2 = "강선용 입니다.";
		System.out.println(str1 + str2);
	}
	
	
	public static void main(String[] args) {
		
		Main m = new Main();
		m.hi();
		
		Hyun hyun = new Hyun();
		hyun.hi();
	}
}
