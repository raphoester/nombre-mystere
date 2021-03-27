package principal;

import util.Interaction;

public class OrdiDevine extends Partie {
	
	public OrdiDevine(int difficulte) {
		super(difficulte);
	}

//		s.replaceFirst("^0+(?!$)", "");
	@Override
	public int definirnombre() {
		System.out.println("Veuillez choisir le nombre que l'ordinateur va devoir deviner (format integer).");
		return Interaction.delta(tailleMaxInt);
	}

	@Override
	public int deviner() {
		System.out.println("Entree : " + essai);
		int[] reponseDecomposee = Interaction.decomp(essai, difficulte);
		
		for(int i = 0; i < difficulte; i++) {
			switch(comparaison[i]) {
			case '=':
				reponseDecomposee[i] = reponseDecomposee[i];
				break;
			case '-':
				reponseDecomposee[i] = (reponseDecomposee[i]+10)/2;
				break;
			case '+':
				reponseDecomposee[i] = reponseDecomposee[i]/2;
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
