package palindrom;

import java.util.Scanner;

public class Help {
	Scanner input = new Scanner(System.in);
	String slovo = ziskajPalindrom();
	
	public void zistiPalindrom() {
		int spravnePismenka = 0;
		String otoceneSlovo = otocSlovo();
		
		for (int i = 0; i < slovo.length(); i++) {
			if (slovo.toLowerCase().charAt(i) == otoceneSlovo.toLowerCase().charAt(i)) {
				spravnePismenka++;
			} else {
				System.out.println("Slovo \""+slovo+"\" neni palindrom");
				break;
			}
			if (spravnePismenka == slovo.length()) {
				System.out.println("Slovo \""+slovo+"\" je palindrom");
			}
		}
		
	}
	
	private String ziskajPalindrom() {
		System.out.println("Daj slovo");
		return input.nextLine();
	}
	
	private String otocSlovo() {
		String otoceneSlovo = "";
		char aktualnePismenko;
		for (int i = 0; i < slovo.length(); i++) {
			aktualnePismenko = slovo.charAt((slovo.length()-i)-1);
			otoceneSlovo = otoceneSlovo+aktualnePismenko;
		}
		return otoceneSlovo;
	}
	
	public String slovo() {
		return slovo;
	}
	
}
