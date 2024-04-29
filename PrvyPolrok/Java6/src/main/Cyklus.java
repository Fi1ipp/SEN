package main;

import java.util.Scanner;

public class Cyklus {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int noveCislo;
		int spolu = 0;
		
		for (int i=0; i <= 6; i++) {
			System.out.println("zadaj cislo ");
			noveCislo=input.nextInt();
			spolu=spolu+noveCislo;
			if (i==6) {
				System.out.println("vsetky cisla spolu su "+spolu);
			}
		}

	}

}
