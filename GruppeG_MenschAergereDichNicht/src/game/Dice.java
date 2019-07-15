package game;

import java.util.Random;

/**
 * Diese Klasse ist fuer das wuerfeln verantwortlich
 * 
 * @author Lukas, Kim, Isabelle, Jonas
 * @version 1.0
 */
public class Dice {

	/*
	 * Diese Methode wuerfelt eine Zahl zwischen 1 und 6
	 */
	public int rollTheDice() {
		Random random = new Random();
		return random.nextInt(6)+1;
	}
}
