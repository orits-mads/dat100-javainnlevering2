package no.hvl.dat100.tabeller;

import javax.swing.JOptionPane;

public class Tabeller {


	public static void main(String[] args) {
		int[] tabell = {42, 67, 89};

		skrivUt(tabell);

		System.out.println(tilStreng(tabell));

		System.out.println(summer(tabell));

		String tall = JOptionPane.showInputDialog("Hvilket tall vil du søke etter?");
		int tallInt = Integer.parseInt(tall);
		System.out.println(finnesTall(tabell, tallInt));

		System.out.println(posisjonTall(tabell, tallInt));

		skrivUt(reverser(tabell));

		System.out.println(erSortert(tabell));

		int[] tabell2 = {2,3,4};

		skrivUt(settSammen(tabell, tabell2));

	}

	// a)
	public static void skrivUt(int[] tabell) {

			System.out.println("Tabell: ");
			for (int i = 0; i < tabell.length; i++) {
				System.out.print(tabell[i] + " ");
			}
			System.out.println();
		}
	
	// b)
	public static String tilStreng(int[] tabell) {

		String start = "[";
		String str = "";
		for (int i = 0; i < tabell.length - 1; i++) {
			str += tabell[i] + ",";
		}
		str += tabell[tabell.length - 1];

		String slutt = "]";
		return start + str + slutt;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				finnes = true;
			}
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				pos = i;
			}
		}

		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] tab = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			tab[i] = tabell[tabell.length - i - 1];
		}
		
		return tab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = false;

		for (int i = 0; i < tabell.length - 1; i++){
			if (tabell[i] < tabell[i+1]) {
				sortert = true;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] tab = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++ ) {
			tab[i] = tabell1[i];
		}
		for (int i = 0; i< tabell2.length; i++){	// legger til to for-løkker, i tilfelle det er forskjellig lengde på de to tabellene
			tab[i + tabell1.length] = tabell2[i];
			}

		return tab;
	}
}
