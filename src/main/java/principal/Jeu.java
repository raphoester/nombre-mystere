package principal;
import java.util.Random;

public abstract class Jeu {
	public static int nombreAleatoire() {
		Random r = new Random();
        return r.nextInt(1000);
	}
	
	public static char[] comp(int nbreBut, int tentative) {
		char[] reponse = new char[4];
		int test ;
		for (int i = 0 ; i < 4 ; i+=1) {
			test = (int) Math.pow(10, i+1);
			int tent = ((tentative%test)/(test/10));
			int res = ((nbreBut%test)/(test/10));
			if (tent < res ) {
				reponse[3-i] = '-';
			}
			else if (tent > res ) {
				reponse[3-i] = '+';
			}
			else {
				reponse[3-i]='=';
			}
		}
		return reponse;
	}
}
