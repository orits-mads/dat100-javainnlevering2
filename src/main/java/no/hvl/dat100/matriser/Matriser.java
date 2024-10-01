package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		
		int[][] matrise1 = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		System.out.println("Skriv ut matrise1 som en matrise:");
		skrivUt(matrise1);

		System.out.println();
		System.out.println("Skriv ut matrise1 som en streng:");
		System.out.println(tilStreng(matrise1));

		System.out.println("Skriver ut matrisen skalert med 5:");
		skrivUt(skaler(5, matrise1));
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

		String str = "";

		for (int[] m : matrise){
			for (int s : m){
				str += (s + " ");
			}
			str += "\n";
		}

		return str;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] mat = new int[matrise.length][matrise[0].length];
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

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}

}
