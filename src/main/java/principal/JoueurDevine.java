package principal;

import java.util.Random;

public class JoueurDevine extends Partie{
	public JoueurDevine(int difficulte) {
		super(difficulte);
	}


	@Override
	public int definirnombre() {
		Random r = new Random();
		return r.nextInt(tailleMaxNombre);
	}


	@Override
	public int deviner() {
		System.out.println("Quelle est votre tentative ? ");
		return util.Interaction.menu(tailleMaxNombre);
	}
}
