package game;

import javafx.scene.shape.Circle;

/**
 * Diese Klasse ist für die Spiellogik der Felder verantwortlich.
 * 
 * @author Kim, Lukas, Jonas, Isabelle
 * @version 1.0
 */
public class Feld {

	/*
	 * Enthaelt ob die Postion frei ist, eine Zielposition ist oder eine Hausposition ist
	 */
    private int freiPos = 0;
    private int zielPos = 0;
    private int hausPos = 0;
    
    private String colorCode = "";
    private Circle circle;

    /**
     * Diese Methode initialisiert die freien Felder.
     * 
     * @param freiPos Die freien felder, Lauffelder
     * @param colorCode Die Farbe der jeweiligen Kreise
     * @param circle Die Kreise
     */
    public void initFreiFeld(int freiPos, String colorCode, Circle circle){
        setColorCode(colorCode);
        setFreiPos(freiPos);
        setCircle(circle);
    }

    /**
     * Diese Methode initialisiert die Hausfelder.
     * 
     * @param hausPos Die Position an welcher sich die Haeuser befinden
     * @param colorCode Die Farbe der jeweiligen Haeuser
     * @param circle Die Kreise der Haeuser
     */
    public void initHausFeld(int hausPos, String colorCode, Circle circle){
        setColorCode(colorCode);
        setHausPos(hausPos);
        setCircle(circle);
    }
    /**
     * Diese Methode initialisiert die Zielfelder.
     * 
     * @param zielPos Die Position der Zielfelder
     * @param colorCode Die Farben der Zielfelder
     * @param circle Die Kreise der Zielfelder
     */
    public void initZielFeld(int zielPos, String colorCode, Circle circle){
        setColorCode(colorCode);
        setZielPos(zielPos);
        setCircle(circle);
    }

    /**
     * Getter der freien Positionen.
     * 
     * @return die Position des freien Feldes
     */
    public int getFreiPos() {
        return freiPos;
    }
    
    /**
     * Setter der freien Felder.
     * 
     * @param freiPos setzen der Position eines freien Feldes
     */
    private void setFreiPos(int freiPos) {
        this.freiPos = freiPos;
    }
    
    /**
     * Getter der Zielfelder.
     * 
     * @return die Position des Zielfeldes
     */
    public int getZielPos() {
        return zielPos;
    }
    
    /**
     * Setter der Zielfelder.
     * 
     * @param zielPos Setzen eines Position der Zielfelder
     */
    private void setZielPos(int zielPos) {
        this.zielPos = zielPos;
    }
    
    /**
     * Getter der Hauspostitionen.
     * 
     * @return Position der Hausfelder
     */
    public int getHausPos() {
        return hausPos;
    }
    
    /**
     * Setter der Hauspositionen.
     * 
     * @param hausPos Position der Hausfelder
     */
    private void setHausPos(int hausPos) {
        this.hausPos = hausPos;
    }
    
    /**
     * Getter der Farben eines Feldes.
     * 
     * @return Farbe des jeweiligen Feldes
     */
    public String getColorCode() {
        return colorCode;
    }
    
    /**
     * Setter der Farbe eines Feldes.
     * 
     * @param colorCode Farbe des jeweiligen Feldes
     */
    private void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
    
    /**
     * Getter der Kreise.
     * 
     * @return den jeweiligen Kreis
     */
    public Circle getCircle() {
        return circle;
    }
    
    /**
     * Setter der Kreise.
     * 
     * @param circle den jeweiligen Kreis
     */
    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}
