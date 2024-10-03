package no.hvl.dat100.matriser;
import java.util.Scanner;

public class Matriser {

	public static void main(String[] args) {
		
		int[][] matrise1 = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		//a)
		System.out.println("Skriv ut matrise1 som en matrise:");
		skrivUt(matrise1);

		//b)
		System.out.println();
		System.out.println("Skriv ut matrise1 som en streng:");
		System.out.println(tilStreng(matrise1));

		//c)
		Scanner input = new Scanner(System.in);	
		System.out.println("Skriv inn et tall for å skalere matrisen med:");
		int tall = Integer.parseInt(input.nextLine());
		System.out.println("Skriver ut matrisen skalert med " + tall + ":");
		skrivUt(skaler(tall, matrise1));
		System.out.println();

		//d)
		int[][] mat2 = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		if (erLik(matrise1, mat2) == true){
			System.out.println("Matrisene er like");
		} else{
			System.out.println("Matrisene er ulike");
		}
		System.out.println();

		//e)
		skrivUt(speile(matrise1));
		System.out.println();

		//f)
		// Sjekker først om vi kan multiplisere
		if(matrise1.length != mat2[0].length){
			System.out.println("Kan ikke multiplisere matrisene");
		} else{
			skrivUt(multipliser(matrise1, mat2));
		}
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for( int[] m : matrise) {
			for( int s : m){
				System.out.print(s + " ");

			}
			System.out.println();
		}


	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String str = ""; // Lager tom string

		for (int[] m : matrise){
			for (int s : m){
				str += (s + " "); // Utvider stringen med hvert ellement fra radene
			}
			str += "\n"; // For å få hver rad på hver sin linje
		}

		return str;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] mat = new int[matrise.length][matrise[0].length];  // Lager ny matrise som vil være lik størrelse som input

		// Bruker to utvidede for-løkker for å gå gjennom hvert element i hver rad for å gange det med tallet
		int m = 0;
		for (int[] rad : matrise){  
			int n = 0;
			for ( int s : rad){	  
				mat[m][n] = matrise[m][n] * tall;
				n++;
			}
			m++;	
		}

		return mat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// Sjekker først om matrisene er like lange
		if (a.length != b.length) {
			return false;
		}

		// Sjekker deretter om hvert element i matrisene er like
		int m = 0;
		for ( int[] rad : a){
			int n = 0;
			for ( int s : rad){
				if ( a[m][n] != b[m][n]){
					return false;	// Hvis et element er ulikt i matrisene
				}
				n++;
			}
			m++;
		}

		return true;	// Hvis matrisene er like lange og alle elementene er like
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// Lager ny matrise like stor som input matrise
		int[][] spMat = new int[matrise.length][matrise[0].length]; 
		
		int m = 0;
		for (int[] rad : matrise){
			int n = 0;
			for (int s : rad){
				// Snur rekkefølge på matrisen
				spMat[m][n] = matrise[matrise.length - m - 1][matrise[0].length - n- 1];
				n++;
				// Hvis det kun er elementene som skal snus, kan kollone index byttes til kunn m
			}
			m++;
		}
		
		return spMat;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
	    int[][] ab = new int[a.length][b[0].length];

	    for (int i = 0; i < a.length; i++) {
	        for (int j = 0; j < b[0].length; j++) {
	            for (int k = 0; k < b.length; k++) {
	                ab[i][j] += a[i][k] * b[k][j];
	            }
	        }
	    }

	    return ab;
	}

}
