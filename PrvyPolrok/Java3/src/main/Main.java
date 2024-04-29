package main;

public class Main {

	public static void main(String[] args) {
		int sucet = 0;
		int i=0;
		int cislo = 420;

		/*
		 * for (i = 0; i<cislo; i++) { sucet=sucet+i; } if (i==cislo) {
		 * System.out.println("sucet i je "+sucet); }
		 */

		int a = 0;
		int b = 100;
		boolean bool = true;

		while (bool) {
			a++;
			b--;
			if (a==b) {
				bool=false;
				System.out.println("konec");
			}

		}

		/*
		 * while(a<b) { System.out.println("pes"); a++; b--; }
		 */

	}

}
