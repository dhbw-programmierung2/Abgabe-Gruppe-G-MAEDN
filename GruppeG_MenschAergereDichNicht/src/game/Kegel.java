package game;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Diese Klasse ist für die Spiellogik der Spielfiguren verantwortlich.
 * Diese Klasse simuliert eine Figur, die auf dem Brett gefahren werden kann.
 * 
 * @author Kim, Lukas, Jonas, Isabelle
 * @version 1.0
 */
public class Kegel {

	/*
	 * Variable haelt das Image der Figur.
	 */
	private Image kegelImage;
  
	/*
	* Variable haelt die aktuelle Position der Figur.
	*/
	private Feld aktuellePosition;

	/**
	 * Diese Methode initialisiert den Spieler.
	 * 
	 * @param farbe Farbe des jeweiligen Spielers
	 * @param startFeld Startposition der jeweiligen Kegel
	 */
	void initKegel(String farbe, Feld startFeld){
    setKegelImage(farbe);
    setPosition(startFeld);
  }
	
	/**
	 * Diese Methode gibt den Kegel des Spielers, welcher am Zug ist zurueck.
	 * 
	 * @return kegelImage Bild des jeweiligen Kegels
	 */
	public Image getKegelImage() {
    return kegelImage;
  }
  
  /**
   * Diese Methode setzt die Bilder auf die entsprechenden Felder.
   * 
   * @param farbe Farbe des jeweiligen Spielers
   */
  private void setKegelImage(String farbe) {
    String path = "/resources/" + farbe + ".jpg";
    try {
      BufferedImage l_bufferedImage = ImageIO.read(getClass().getResourceAsStream(path));
      kegelImage = SwingFXUtils.toFXImage(l_bufferedImage, null );
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Getter der Klasse Feld.
   * 
   * @return aktuellePosition Aktuelle Position des Kegels
   */
  public Feld getPosition() {
    return aktuellePosition;
  }
  
  /**
   * Setter der Klasse Feld.
   * 
   * @param aktuellePosition Aktuelle Position des Kegels
   */
  private void setPosition(Feld aktuellePosition) {
    this.aktuellePosition = aktuellePosition;
  }
  
}
