package functions;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("zadadj svoju Výšku a Váhu");
		double bmi = bmi(input.nextDouble(), input.nextDouble());
		System.out.println(bmi);
		
		
		System.out.println("zadadj Celok a Cislo");
		double percenta = percenta(input.nextDouble(), input.nextDouble());
		System.out.println(percenta);
		

	}
	
	public static double bmi(double vyska, double vaha) {
		return (1.3 * vaha / vyska);
	}
	
	public static double percenta(double celok, double cislo) {
		return (celok * cislo)/100;
	}

}
