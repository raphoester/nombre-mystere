package principal;

public abstract class Partie implements IPartie {
	int nombreMystere;
	int essai;
	int difficulte;
	int vie;
	char[] comparaison;
	protected final int tailleMaxInt = 2147483647;
	protected int tailleMaxNombre;
	
	public Partie() {
		this.vie = 11;
	}
	
	public void jouer() {
		while(essai != this.nombreMystere && vie > 0) {
			vie -=1;
			System.out.println("Vies : " + vie );
			essai = deviner();
			comparaison = Partie.comp(nombreMystere, essai, difficulte);
			System.out.println(comparaison);
		}
		if (vie == 0) {
			System.out.println("Perdu !");
		}
		else {
			System.out.println("Gagné !");
		}
	}
	
	public static char[] comp(int nbreBut, int tentative, int taille) { 
		// fonction servant à convertir la tentative et le but en 
		// un tableau de (taille) char de comparaison (-+=)
		// décrivant les approximations de la tentative.
		char[] reponse = new char[taille];
		int test ;
		for (int i = 0 ; i < taille ; i+=1) {
			test = (int) Math.pow(10, i+1);
			int tent = ((tentative%test)/(test/10));
			int res = ((nbreBut%test)/(test/10));
			if (tent < res ) {
				reponse[taille-1-i] = '-';
			}
			else if (tent > res ) {
				reponse[taille-1-i] = '+';
			}
			else {
				reponse[taille-1-i]='=';
			}
		}
		return reponse;
	}
}
