package main;

import java.util.Scanner;

public class WhileCyklus {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("zadaj prve cislo");
		int noveCislo = input.nextInt();
		
		int spolu=0;
		int pocet=0;
		double priemer;
		
		
		while(noveCislo != 0) {
			pocet++;
			spolu=spolu+noveCislo;
			System.out.println("zadaj nove cislo");
			noveCislo = input.nextInt();
		}
		
			System.out.println("napisal si "+pocet+" cisel");
			System.out.println("vsetky cisla spolu su "+spolu);
			priemer = spolu/pocet;
			System.out.println("priemer je "+priemer);
		
		
	}
	
}
