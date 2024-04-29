package main;

import java.util.Scanner;

public class MainObject {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int total=0;
		double avr;
		int repeat = input.nextInt();
		for (int i=0; i<repeat; i++) {
			System.out.println("zadaj cislo : ");
			total=total+input.nextInt();
			if (i==repeat-1) {
				avr=total/i;
				System.out.println(avr);
			}
		}
		
		/*
		System.out.println("zadaj desatinne cislo= ");
		double dbl = input.nextDouble();
		System.out.println("zadal si cislo "+dbl);
		
		System.out.println("napis nieco= ");
		String str = input.next();
		System.out.println("napisal si "+str);
		*/
	}

}
