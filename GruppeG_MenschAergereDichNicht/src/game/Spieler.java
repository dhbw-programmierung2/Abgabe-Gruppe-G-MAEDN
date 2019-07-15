package game;

import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse enthält die Spieler 
 * 
 * @author Lukas, Kim, Isabelle, Jonas
 * @version 1.0
 */
public class Spieler {

	/*
	 * Name, Farbe und Eigenschaft der Spieler
	 */
	private String name;
	private String farbe;
	private String rival;
	
	/*
	 * Liste der Kegel der Spieler
	 */
	private List<Kegel> kegellist = new ArrayList<>();

  /**
   * Initialisieren eines leeren Spielers
   */
  public Spieler() {
    name = "";
    farbe = "";
    rival = "";
  }
  
  /**
   * Initialisieren eines Spielers mit Name, Farbe und Eigenschaft.
   * 
   * @param name Name des jeweiligen Spielers
   * @param farbe Farbe des jeweiligen Spielers
   * @param rival Eigenschaft des jeweiligen Spielers
   */
  void initSpieler(String name, String farbe, String rival){
    setName(name);
    setFarbe(farbe);
    setRival(rival);
  }

  /**
   * Erstellen der Kegel auf die Startposition.
   * 
   * @param startFeld Startposition der Kegel
   */
  public void erstelleKegel(Feld startFeld){
    Kegel neuerKegel = new Kegel();
    neuerKegel.initKegel(farbe, startFeld);
    kegellist.add(neuerKegel);
  }

  /**
   * Getter des Spielernamens.
   *
   * @return Name des Spielers
   */
  public String getName() {
    return name;
  }

  /**
   * Setter des Spielernamens.
   * 
   * @param name Name des Spielers
   */
  private void setName(String name) {
    this.name = name;
  }

  /**
   * Getter der Spielerfarbe.
   * 
   * @return Farbe des Spielers
   */
  public String getFarbe() {
    return farbe;
  }

  /**
   * Setter der Spielerfarbe.
   * 
   * @param farbe Farbe des Spielers
   */
  private void setFarbe(String farbe) {
    this.farbe = farbe;
  }

  /**
   * Getter der Spielereigenschaft.
   * 
   * @return Eigenschaft des Spielers
   */
  public String getRival() {
    return rival;
  }

  /**
   * Setter der Spielereigenschaft.
   * 
   * @param rival Eigenschaft des Spielers
   */
  private void setRival(String rival) {
    this.rival = rival;
  }
}
