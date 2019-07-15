package game;

import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse enthält die Spielregeln 
 * 
 * @author Lukas, Kim, Isabelle, Jonas
 * @version 1.0
 */
public class Regel {

	/*
	 * Erstellen einer Spielerliste
	 */
	private List<Spieler> spielerList = new ArrayList<>();

	/**
	 * Diese Methode erstellt die Spieler fuer die Logik.
	 * Dabei enthaelt der Spieler seine Eigenschaften, wie Name, Farbe und Eigenschaft.
	 * 
	 * @param playerNameList Name des jeweiligen Spielers
	 * @param colorList Farbe des jeweiligen Spielers
	 * @param rivalList Eigenschaft des jeweiligen Spielers
	 */
	public void erstelleSpieler(List<String> playerNameList, List<String> colorList, List<String> rivalList){
		int max = playerNameList.size();
		for (int index = 0; index < max; index++){
			Spieler neuerSpieler = new Spieler();
			String name = playerNameList.get(index);
			String farbe = colorList.get(index);
			String rival = rivalList.get(index);
			neuerSpieler.initSpieler(name, farbe, rival);
			spielerList.add(neuerSpieler);
		}
	}

	/**
	 * Diese Methode starte die Spiellogik mit ihren Regeln
	 */
	public void startGame(){
		do {
			for (Spieler spieler : spielerList){
				int amountThrows = 0;
				//int amountThrows = checkThrows();
				for (int index = 0; index < amountThrows; index++){
					
					/*
					 * Folgende Methoden müssten hier noch aufgerufen werden
					 */
					
					//rollTheDice();
					//checkBreakFree();
					//moveFigure();
				}
			}
		}
		while (!pruefeGewinner());
	}

	/**
	 * Diese Methode prueft ob bereits ein Spieler 4 Kegel in den Zielfeldern hat.
	 * 
	 * @return false wenn kein Gewinner ermittelt wurde
	 */
	private boolean pruefeGewinner() {
		return false;
	}


	/**
	 * Methode um Figur zu ziehen
	 */
	public void goForward() {
		
		/*
		 * Hier muesste der index des Feldes in der ArrayList + die gewuerfelte Zahl hin.
		 * Weiter muesste das Image auf der alten Position geloescht werden und auf der neuen Position initialisiert werden.
		 */
	}
	
	/**
	 * Methode um moeglichen Zug zu ueberpruefen
	 */
	public void validMove() {
		
		/*
		 * Hier muesste gechekt werden ob aktuelles Feld + gewuerfelte Zahl noch in range of Array sind.
		 * Weiter muss gecheckt werden ob Felder besetzt sind oder nicht.
		 * Es wird zusaetzlich die Farbe des Kegels ueberprueft.
		 */
	}

	/**
	 * Diese Methode gibt die Liste der Spieler wieder.
	 * 
	 * @return spielerListe Liste aller teilnehmenden Spieler
	 */
	public List<Spieler> getSpielerList() {
		return spielerList;
	}

}
