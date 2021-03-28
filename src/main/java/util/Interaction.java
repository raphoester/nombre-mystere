package util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

public abstract class Interaction {
	public static int menu(int taille) {
		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
				// rien
			}
		});
		int[] possibilites = new int[taille];
		for (int i = 0; i < taille; i++) {
			possibilites[i] = i + 1;
		}
		int res = 0;
		do {
		    while (!scanner.hasNextInt()) {
		        scanner.next(); // this is important!
		    }
			res = scanner.nextInt();
		} while(!Interaction.contient(possibilites, res));
		
		scanner.close();
		return res;
	}

	public static int delta(int max) {

		Scanner scanner = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() throws IOException {
				// rien
			}
		});
		
		int res;

		do {
		    while (!scanner.hasNextInt()) {
		        scanner.next(); // this is important!
		    }
			res = scanner.nextInt();
		} while(res>max || res<0);
		scanner.close();
		return res;
	}

	static boolean contient(int[] tableau, int v) {

		boolean resultat = false;

		for (int i : tableau) {
			if (i == v) {
				resultat = true;
				break;
			}
		}
		return resultat;
	}
	
	public static int[] decomp(int entree, int taille) {
		String temp = Integer.toString(entree);
		
		int[] decomposition = new int[taille];
		for (int i = 0 ; i < taille ; i++) {
			decomposition[i]=0;
		}
		for (int i = 0; i < temp.length(); i++)
		{
		    decomposition[i] = temp.charAt(i) - '0';
		}

		return decomposition;
	}
}
