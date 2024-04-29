package functions1;

import java.util.Scanner;

public class Help {
	
	Scanner input = new Scanner(System.in);
	String meno;
	
	public void pozdrav() {
		System.out.println("Zadaj meno");
		meno = input.next();
		System.out.println("Cau "+meno);
		}
	
	public void obvodStvorca(int a) {
		System.out.println("Obvod štvorca je : "+a*4);
	}
	
	public double obsahKruhu(double r) {
		return 2*Math.PI*r;
		
	}
	
	public void zisziParneCisla(int a) {
		if (a%2 == 0) {
			System.out.println("Cislo "+a+" je parne");
		} else {
			System.out.println("Cislo "+a+" je neparne");
		}
	}
	
	public double vypocetDPH(double a) {
		return(a+a*0.2);
	}
	
	public void overenieCisla() {
		System.out.println("Zadaj cislo");
		int a = input.nextInt();
		if (a >= 0) {
			System.out.println("Cislo "+a+" je vacsie ako 0");
			} else {
				System.out.println("Cislo "+a+" je mensie ako 0");
				overenieCisla();
			}
	}
	
	public void odsek() {
		System.out.println("__________________________________________");
		System.out.println("");
	}
	
	
}
