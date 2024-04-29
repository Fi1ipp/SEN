package funkcie;

import java.util.Scanner;

public class Help {
	Scanner input = new Scanner(System.in);
	
	double pi = Math.PI;
	
	public void pozdrav() {
		System.out.println("Ahoj");
	}
	
	public String menoCloveka() {
		System.out.println("Zadaj svoje meno : ");
		return input.nextLine();
	}
	
	public void pozdravCloveka() {
		System.out.println("Ahoj "+menoCloveka());
	}
	
	
	
	
	
	
	public double polomerKruhu() {
		System.out.println("Zadaj polomer kruhu :");
		return input.nextDouble();
	}
	
	double r = polomerKruhu();
	
	public double vypocetObvoduKruhu() {
		return 2*pi*r;
	}
	
	public double vypocetObsahuKruhu() {
		return pi*r*r;
	}
	
	public void vyberSO() {
		System.out.println("Chces vypocitat obvod alebo obsah kruhu?");
		System.out.println("o = Obvod");
		System.out.println("S = Obsah");
		char Znak = input.next().charAt(0);
		switch(Znak) {
			case 'o' :
				System.out.println("Obvod = "+vypocetObvoduKruhu());
			break;
			case 'S' :
				System.out.println("Obsah = "+vypocetObsahuKruhu());
			break;
			default :
				System.out.println("Taka moznost neni");
			break;
	}
}
}
