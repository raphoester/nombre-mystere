package principal;
import util.Interaction;
public class Entree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nombre mystère ");
		System.out.println("1. Deviner");
		System.out.println("2. Faire deviner l'ordinateur");
		
		int choix = Interaction.menu(2);
		if(choix == 1) {
			
		}
		else if (choix == 2) {
			
		}
		else {
			System.out.println("Erreur dans la fonction menu");
		}

	}

}
