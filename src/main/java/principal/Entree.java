package principal;
import util.Interaction;
public class Entree {

	public static void main(String[] args) {
		Partie partie ;
		// TODO Auto-generated method stub
		System.out.println("Nombre mystère ");
		System.out.println("1. Deviner");
		System.out.println("2. Faire deviner l'ordinateur");
		
		int choix = Interaction.menu(2);
		if(choix == 1) {
			partie = new JoueurDevine(4);
			((JoueurDevine) partie).jouer();
		}
		else if (choix == 2) {
			partie = new OrdiDevine(4);
			((OrdiDevine) partie).jouer();
		}
		else {
			System.out.println("Erreur dans la fonction menu");
		}

	}

}
