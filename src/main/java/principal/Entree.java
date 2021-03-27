package principal;
import util.Interaction;
public class Entree {

	public static void main(String[] args) {
		boolean continuerAJouer = true;
		boolean continuerMemeMode = true;
		while (continuerAJouer) {
			Partie partie ;
			// TODO Auto-generated method stub
			System.out.println("MENU PRINCIPAL");
			System.out.println("1. Deviner");
			System.out.println("2. Faire deviner l'ordinateur");
			System.out.println("3. Quitter l'application");
			
			int choix = Interaction.menu(3);
			if(choix == 1) {
				System.out.println("Choisissez un niveau de difficulté, de 1 à 9 ");
				int diff = Interaction.menu(9);
				partie = new JoueurDevine(diff);
				((JoueurDevine) partie).jouer();
			}
			else if (choix == 2) {
				partie = new OrdiDevine();
				((OrdiDevine) partie).jouer();
			}
			else if (choix == 3) {
				System.out.println("Au revoir !");
				System.exit(0);
			}
			else {
				System.out.println("Erreur dans la fonction menu. Fin du programme.");
			}
			while (continuerMemeMode == true ) {
				System.out.println("Que faire maintenant ?");
				System.out.println("1. Rejouer au même mode");
				System.out.println("2. Revenir au menu principal");
				System.out.println("3. Quitter l'application");
				
				int choixBis = Interaction.menu(3);
				if(choixBis == 1) {
					switch(choix) {
					case 1:
						System.out.println("Choisissez un niveau de difficulté, de 1 à 9 ");
						int diff = Interaction.menu(9);
						partie = new JoueurDevine(diff);
						((JoueurDevine) partie).jouer();
						break;
					case 2:
						partie = new OrdiDevine();
						((OrdiDevine) partie).jouer();
						break;
					default:
						System.out.println("Erreur critique du programme. Fin de l'exécution.");
						System.exit(1);
					}
					
				}
				else if (choixBis == 2){
					continuerMemeMode = false;
				}
				else if (choix == 3) {
					System.out.println("Au revoir !");
					System.exit(0);
				}
				else {
					System.out.println("Erreur dans la fonction menu. Fin du programme.");
				}
			}

		}
	}
}
