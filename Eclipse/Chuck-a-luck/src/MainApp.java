
public class MainApp {
 
	public static void main(String[] args) {
		Dobbelsteen d = new Dobbelsteen(6);
		System.out.println(d.toString());
		int hallo = d.randomize();
		System.out.println(hallo);
		System.out.println(d.toString());
		hallo = d.randomize();
		System.out.println(hallo);
		System.out.println(d.toString());
		hallo = d.randomize();
		System.out.println(hallo);
		System.out.println(d.toString());
	}
}
