package main;

import java.util.Random;

public class SwitchRandomPercenta {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		double jedna=0;
		double dva=0;
		double tri=0;
		double styri=0;
		double pat=0;
		double sest=0;
		
		int celkoveCislo=0;
		
		int rng;
		
		for (int i=0; i < 1000; i++) {
			rng = random.nextInt(6)+1;
			
			switch (rng) {
			case 1:
				jedna++;
				break;
			case 2:
				dva++;
				break;
			case 3:
				tri++;
				break;
			case 4:
				styri++;
				break;
			case 5:
				pat++;
				break;
			case 6:
				sest++;
				break;
			default:
				break;
			}
		
		}
		
		System.out.println("jednotiek je +- : "+(100*jedna/1000)+'%');
		System.out.println("dvojek je +- : "+(100*dva/1000)+'%');
		System.out.println("trojek je +- : "+(100*tri/1000)+'%');
		System.out.println("stvoriek je +- : "+(100*styri/1000)+'%');
		System.out.println("patiek je +- : "+(100*pat/1000)+'%');
		System.out.println("sestiek je +- : "+(100*sest/1000)+'%');
	}

}
