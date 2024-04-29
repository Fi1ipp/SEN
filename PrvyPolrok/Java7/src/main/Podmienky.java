package main;

import java.util.Scanner;

public class Podmienky {

	public static void main(String[] args) {
		
		
		
		int x = 11;
		
		if (x > 10) {
			System.out.println(x+" je väčšie ako 10");
		}
		
		
		
		
		int zapor = -5;
		
		if (zapor < 0) {
			System.out.println(zapor+" je záporné číslo");
		}
		
		
		
		
		int vek = 19;
		
		if (vek >= 18) {
			System.out.println("Správne");
		}
		else {
			System.out.println("Nesprávne");
		}
		
		
		
		String txt = "Abeceda"; 
		
		int a = txt.indexOf("a");
		int A = txt.indexOf("A");
		
		if (a == 0 || A == 0) {
			System.out.println(txt+" začína písmenom A");
		}
		
		
		
		int body = 85;
		
		if (body > 80) {
			System.out.println("Výhra");
		}
		else {
			System.out.println("Prehra");
		}
		
		
		
		String retazecCisel = "895862";
		int cislo = retazecCisel.indexOf("2");
		if (cislo > -1) {
			System.out.println("Retazec cisel "+retazecCisel+" obsahuje cislo 2");
		}
		
		
		
		String meno = "John";
		int age = 26;
		int J = meno.indexOf("J");
		if (age >= 25 && J == 0) {
			System.out.println("Vítazstvo");
		}
		

	}

}
