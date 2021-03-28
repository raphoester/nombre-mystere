package principal;

import util.Interaction;
import util.Discriminant;

public class OrdiDevine extends Partie {
	
	Discriminant[] donnees ; 
	public OrdiDevine() {
		super();
		this.nombreMystere = definirnombre();
		
		int i = 0;
		int num = nombreMystere;
		while(num!=0){
	         num = num/10;
	         i++;
	      }
		
		this.difficulte = i;
		this.comparaison = new char[difficulte];
		this.tailleMaxNombre = (int) Math.pow(10, difficulte);
		this.donnees = new Discriminant[difficulte];
		
		for (i = 0 ; i < difficulte ; i++) {
			this.donnees[i] = new Discriminant();
		}
	}

	@Override
	public int definirnombre() {
		System.out.println("Veuillez choisir le nombre que l'ordinateur va devoir deviner (max : " + tailleMaxInt + ").");
		return Interaction.delta(tailleMaxInt);
	}

	@Override
	public int deviner() {
		int[] reponseDecomposee = Interaction.decomp(essai, difficulte);
		
		for(int i = 0; i < difficulte; i++) {
			switch(comparaison[i]) {
			case '=':
				break;
			case '-':
				donnees[i].majBI(reponseDecomposee[i]);
				reponseDecomposee[i] = donnees[i].prob();
				break;
			case '+':
				donnees[i].majBS(reponseDecomposee[i]);
				reponseDecomposee[i] = donnees[i].prob();
				break;
			default:
				reponseDecomposee[i] = 5;
			}
		}
		essai = 0;
		for (int a : reponseDecomposee) {
		  essai = 10*essai + a;
		}
		System.out.println("Tentative : "+essai);
		return essai;
	}
}
