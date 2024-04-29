package priemer;

import java.util.Scanner;

public class Help {
	
	Scanner input = new Scanner(System.in);
	double priemer;
	int pocet;
	double sucet = 0;
	
	public double sucetPocetCisiel() {
		System.out.println("Zadaj kolko cisel chces");
		int pocetIteracii = input.nextInt();
		for (int i = -1; i < pocetIteracii; i++) {
			pocet++;
			System.out.println("Ziskaj cislo");
			sucet += sucet+input.nextDouble();
		}
		return(priemer = sucet/pocet);
	}

}
