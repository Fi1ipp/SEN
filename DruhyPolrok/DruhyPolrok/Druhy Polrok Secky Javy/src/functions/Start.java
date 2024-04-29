package functions;

public class Start {

	public static void main(String[] args) {
		pozdrav();
		System.out.println(sucetCisel());
		
		System.out.println(naDruhu(5));

	}
	
	public static void pozdrav() {
		System.out.println("Cau");
	}
	
	public static int sucetCisel() {
		return 5+5;
	}
	
	public static int naDruhu(int num) {
		return num*num;
	}

}
