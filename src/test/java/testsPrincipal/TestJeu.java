package testsPrincipal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import principal.Partie;

public class TestJeu {
	@Test
	void compTest() {
		// Arrange
		int but = 14348;
		int essai = 5328;
		int diff = 5;

		// Act
		char[] reponse = Partie.comp(but, essai, diff);
		char[] theorie = {'-', '+', '=', '-', '='};
		
		
		// Assert
		for(int i = 0 ; i < diff ; i++) {
			if(reponse[i] != theorie[i]) {
				fail();
			}
		}

	}
}