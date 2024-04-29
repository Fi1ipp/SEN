package somVacsi;

import java.util.Scanner;

public class Help {
	Scanner input = new Scanner(System.in);
	
	private int ziskajCislo() {
		System.out.println("Daj cislo");
		return input.nextInt();
	}
	
	private void jeCisloKladne(int cislo) {
		if (cislo > 0) {
			System.out.println("Cislo '"+cislo+"' je vacsie ako 0");
		} else if (cislo == 0) {
			System.out.println("Cislo '"+cislo+"' je rovne 0");
			funkciaZistiKladneCislo();
		} else {
			System.out.println("Cislo '"+cislo+"' nieje vacsie ako 0");
			funkciaZistiKladneCislo();
		}
	}
	
	public void funkciaZistiKladneCislo() {
		jeCisloKladne(ziskajCislo());
	}
	

}
