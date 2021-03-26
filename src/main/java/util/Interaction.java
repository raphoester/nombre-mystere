package util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

public abstract class Interaction {
	 public static int menu(int taille) {
	    	Scanner scanner = new Scanner(new FilterInputStream(System.in) {
	    	    @Override
	    	    public void close() throws IOException {
	    	        // rien mdr
	    	    }
	    	});
	    	int[] possibilites = new int[taille];
	    	for(int i = 0 ; i < taille ; i++) {
	    		possibilites[i] = i+1;
	    	}
	    	int res = 0 ;
			do {
				res = scanner.nextInt();
			} while (!Interaction.contient(possibilites, res));	
			scanner.close();
			return res;
	    }
	 
	    static boolean contient(int[] tableau, int v) {

	        boolean resultat = false;

	        for(int i : tableau){
	            if(i == v){
	                resultat = true;
	                break;
	            }
	        }
	        return resultat;
	    }
}