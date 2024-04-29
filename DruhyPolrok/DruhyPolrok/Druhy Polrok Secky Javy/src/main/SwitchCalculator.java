package main;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char znak;
		int cislo1;
		int cislo2;
		double vysledok;
		
		System.out.println("Zadaj dve cisla");
		cislo1 = input.nextInt();
		cislo2 = input.nextInt();
		
		System.out.println("Zadaj znak +, -, *, /");
		znak = input.next().charAt(0);
		
		switch (znak) {
		case '+':
			vysledok=cislo1+cislo2;
			System.out.println(vysledok);
			break;
		case '-':
			vysledok=cislo1-cislo2;
			System.out.println(vysledok);
			break;
		case '*':
			vysledok=cislo1*cislo2;
			System.out.println(vysledok);
			break;
		case '/':
			vysledok=cislo1/cislo2;
			System.out.println(vysledok);
			break;

		default: System.out.println("Zly znak");
			break;
		}

	}

}
