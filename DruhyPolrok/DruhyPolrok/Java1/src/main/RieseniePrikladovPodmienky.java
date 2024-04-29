package main;

import java.util.Scanner;

public class RieseniePrikladovPodmienky {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	  /*napis program ktory nacita cisla od pouzivatela 
		dokym ich celkova hodnota nedosiahne urcitu hodotu a vypise pocet a sucet*/
		
		System.out.println("daj cislo");
		int x = input.nextInt();
		
		int pocet = 1;
		int sucet = 0;
		
		while (sucet < 500) {
			System.out.println("Zadaj Dalsie");
			x = input.nextInt();
			pocet++;
			sucet = sucet+x;
		}
		System.out.println(sucet);
		System.out.println(pocet);
		
	}

}
