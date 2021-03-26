package testsPrincipal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.Jeu;

public class TestJeu {
	@Test
	void compTest() {
		// Arrange
		int but = 1434;
		int essai = 0532;

		// Act
		char[] reponse = Jeu.comp(but, essai);
		char[] theorie = {'-', '+', '=', '-'};
		
		
		// Assert
		for(int i = 0 ; i < 4 ; i++) {
			if(reponse[i] != theorie[i]) {
				fail();
			}
		}

	}
}