package fourplayersgame;

import game.Feld;
import game.Regel;
import game.Spieler;
import game.Dice;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import launcher.LauncherController;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;

import java.util.ArrayList;
import java.util.List;


/**
 * Dieser Controller ist fuer das Steuern und die Initialisierung des 4er Spielfeld zustaendig.
 *
 * @author Lukas, Kim, Isabelle, Jonas
 * @version 1.0
 */
public class GameBoardFourPlayersController {

    /*
     * FXML Komponenten, die auf dem Spielfeld sichtbar sein werden.
     */
    @FXML
    public SplitPane splitPane;
    public GridPane gridPaneLeft;
    public GridPane gridPaneRigth;

    /*
     * Startfelder fuer Gelb.
     */
    public Circle crcBeginYellow001;
    public Circle crcBeginYellow002;
    public Circle crcBeginYellow003;
    public Circle crcBeginYellow004;
    
    /*
     * Startfelder fuer Schwarz.
     */
    public Circle crcBeginBlack001;
    public Circle crcBeginBlack002;
    public Circle crcBeginBlack003;
    public Circle crcBeginBlack004;
    
    /*
     * Startfelder fuer Rot.
     */
    public Circle crcBeginRed001;
    public Circle crcBeginRed002;
    public Circle crcBeginRed003;
    public Circle crcBeginRed004;
    
    /*
     * Startfelder fuer Gruen.
     */
    public Circle crcBeginGreen001;
    public Circle crcBeginGreen002;
    public Circle crcBeginGreen003;
    public Circle crcBeginGreen004;


    /*
     * Endfelder fuer Gelb.
     */
    public Circle crcAimYellow001;
    public Circle crcAimYellow002;
    public Circle crcAimYellow003;
    public Circle crcAimYellow004;
    
    /*
     * Startfelder fuer Schwarz.
     */
    public Circle crcAimBlack001;
    public Circle crcAimBlack002;
    public Circle crcAimBlack003;
    public Circle crcAimBlack004;
    
    /*
     * Startfelder fuer Rot.
     */
    public Circle crcAimRed001;
    public Circle crcAimRed002;
    public Circle crcAimRed003;
    public Circle crcAimRed004;
    
    /*
     * Startfelder fuer Gruen.
     */
    public Circle crcAimGreen001;
    public Circle crcAimGreen002;
    public Circle crcAimGreen003;
    public Circle crcAimGreen004;

    /*
     * Lauffelder des Spielfelds.
     */
    public Circle crcField001;
    public Circle crcField002;
    public Circle crcField003;
    public Circle crcField004;
    public Circle crcField005;
    public Circle crcField006;
    public Circle crcField007;
    public Circle crcField008;
    public Circle crcField009;
    public Circle crcField010;
    public Circle crcField011;
    public Circle crcField012;
    public Circle crcField013;
    public Circle crcField014;
    public Circle crcField015;
    public Circle crcField016;
    public Circle crcField017;
    public Circle crcField018;
    public Circle crcField019;
    public Circle crcField020;
    public Circle crcField021;
    public Circle crcField022;
    public Circle crcField023;
    public Circle crcField024;
    public Circle crcField025;
    public Circle crcField026;
    public Circle crcField027;
    public Circle crcField028;
    public Circle crcField029;
    public Circle crcField030;
    public Circle crcField031;
    public Circle crcField032;
    public Circle crcField033;
    public Circle crcField034;
    public Circle crcField035;
    public Circle crcField036;
    public Circle crcField037;
    public Circle crcField038;
    public Circle crcField039;
    public Circle crcField040;


    /*
     * Button zum Wuerfeln und zum Beenden der Anwendung.
     */
    public Button btnRollTheDice;
    public Button btnExitGame;

    /*
     * Wuerfelbild, welches die gewuerfelte Augenzahl anzeigt.
     */
    public ImageView imgDice;

    /*
     * Textfelder, auf welchem die Namen der Spieler angezeigt werden.
     */
    public TextField txtPlayer1;
    public TextField txtPlayer2;
    public TextField txtPlayer3;
    public TextField txtPlayer4;

    /*
     * Zaehlt mit, wie oft der Wuerfel Button gedrueckt wurde.
     */
    private int numberButtonPressed = 0;

    private ArrayList<String> colorList = new ArrayList<>();
    private List<Feld> felderListe = new ArrayList<>();

    /**
     * Methode, die das Spielfeld initialisiert.
     *
     * @param startPlayer Spieler welcher die hoechste Zahl gewuerfelt hat
     */
    public void initBoard(Regel regel, Integer startPlayer) {
        for (Spieler spieler : regel.getSpielerList()) {
            colorList.add(spieler.getFarbe());
        }
        ObservableList<Node> l_circleList = gridPaneLeft.getChildren();
        for (Node l_node : l_circleList) {
            Circle l_circle = (Circle) l_node;
            Feld neuesFeld = new Feld();
            String letzteDrei = l_circle.getId().substring(l_circle.getId().length() - 3);
            int pos = Integer.valueOf(letzteDrei);
            if (l_circle.getId().startsWith("crcField")) {
                String farbe = "";
                if (l_circle.getFill().equals(Color.rgb(30,171,49))){
                    farbe = "Gruen";
                } else if (l_circle.getFill().equals(Color.rgb(242, 235,104))){
                    farbe = "Gelb";
                } else if (l_circle.getFill().equals(Color.rgb(0, 0,0))){
                    farbe = "Schwarz";
                } else if (l_circle.getFill().equals(Color.rgb(238,39,0))){
                    farbe = "Rot";
                }
                neuesFeld.initFreiFeld(pos, farbe, l_circle);
            } else if (l_circle.getId().startsWith("crcAimBlack")) {
                neuesFeld.initZielFeld(pos, "Schwarz", l_circle);
            } else if (l_circle.getId().startsWith("crcBeginBlack")) {
                neuesFeld.initHausFeld(pos, "Schwarz", l_circle);
            } else if (l_circle.getId().startsWith("crcAimRed")) {
                neuesFeld.initZielFeld(pos, "Rot", l_circle);
            } else if (l_circle.getId().startsWith("crcBeginRed")) {
                neuesFeld.initHausFeld(pos, "Rot", l_circle);
            } else if (l_circle.getId().startsWith("crcAimYellow")) {
                neuesFeld.initZielFeld(pos, "Gelb", l_circle);
            } else if (l_circle.getId().startsWith("crcBeginYellow")) {
                neuesFeld.initHausFeld(pos, "Gelb", l_circle);
            } else if (l_circle.getId().startsWith("crcAimGreen")) {
                neuesFeld.initZielFeld(pos, "Gruen", l_circle);
            } else if (l_circle.getId().startsWith("crcBeginGreen")) {
                neuesFeld.initHausFeld(pos, "Gruen", l_circle);
            }
            felderListe.add(neuesFeld);
        }


        if (colorList.contains("Gelb")) {
            crcBeginYellow001.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
            crcBeginYellow002.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
            crcBeginYellow003.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
            crcField001.setEffect(new DropShadow(+25d, 0d, +2d, Color.YELLOW));
            populateYellow();
        }

        if (colorList.contains("Gruen")) {
            crcBeginGreen001.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
            crcBeginGreen002.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
            crcBeginGreen003.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
            crcField011.setEffect(new DropShadow(+25d, 0d, +2d, Color.GREEN));
            populateGreen();
        }

        if (colorList.contains("Rot")) {
            crcBeginRed001.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
            crcBeginRed002.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
            crcBeginRed003.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
            crcField021.setEffect(new DropShadow(+25d, 0d, +2d, Color.RED));
            populateRed();
        }

        if (colorList.contains("Schwarz")) {
            crcBeginBlack001.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
            crcBeginBlack002.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
            crcBeginBlack003.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
            crcField031.setEffect(new DropShadow(+25d, 0d, +2d, Color.BLACK));
            populateBlack();
        }


        /*
         * Anzeigen der Spielernamen und ihrer jeweiligen Farbe auf dem Spielfeld.
         */
        List<Spieler> spielerList = regel.getSpielerList();
        txtPlayer1.setText(spielerList.get(0).getName() + " - " + colorList.get(0));
        txtPlayer2.setText(spielerList.get(1).getName() + " - " + colorList.get(1));
        if (spielerList.size() == 4) {
            txtPlayer3.setText(spielerList.get(2).getName() + " - " + colorList.get(2));
            txtPlayer4.setText(spielerList.get(3).getName() + " - " + colorList.get(3));
        }
    }

    /**
     * Methode setzt die roten Spielfiguren in die rote Basis.
     * Setzen einer Spielfiguren auf das Lauffeld vor der Basis.
     */
    private void populateRed() {
        Image im4 = new Image("/resources/Rot.jpg", false);
        crcBeginRed001.setFill(new ImagePattern(im4));
        crcBeginRed002.setFill(new ImagePattern(im4));
        crcBeginRed003.setFill(new ImagePattern(im4));
        crcField021.setFill(new ImagePattern(im4));
    }

    /**
     * Methode setzt die schwarzen Spielfiguren in die schwarze Basis.
     * Setzen einer Spielfiguren auf das Lauffeld vor der Basis.
     */
    private void populateBlack() {
        Image im3 = new Image("/resources/Schwarz.jpg", false);
        crcBeginBlack001.setFill(new ImagePattern(im3));
        crcBeginBlack002.setFill(new ImagePattern(im3));
        crcBeginBlack003.setFill(new ImagePattern(im3));
        crcField031.setFill(new ImagePattern(im3));
    }

    /**
     * Methode setzt die gelben Spielfiguren in die gelbe Basis.
     * Setzen einer Spielfiguren auf das Lauffeld vor der Basis.
     */
    private void populateYellow() {
        Image im2 = new Image("/resources/Gelb.jpg", false);
        crcBeginYellow001.setFill(new ImagePattern(im2));
        crcBeginYellow002.setFill(new ImagePattern(im2));
        crcBeginYellow003.setFill(new ImagePattern(im2));
        crcField001.setFill(new ImagePattern(im2));
    }

    /**
     * Methode setzt die gruenen Spielfiguren in die gruene Basis.
     * Setzen einer Spielfiguren auf das Lauffeld vor der Basis.
     */
    private void populateGreen() {
        Image im1 = new Image("/resources/Gruen.jpg", false);
        crcBeginGreen001.setFill(new ImagePattern(im1));
        crcBeginGreen002.setFill(new ImagePattern(im1));
        crcBeginGreen003.setFill(new ImagePattern(im1));
        crcField011.setFill(new ImagePattern(im1));
    }

    /**
     * EventListener für das druecken eines Nodes der GUI.
     *
     * @param event Klicken des Nodes mit der Maus
     */
    @FXML
    public void circleOnActionM(MouseEvent event) {
        String tempCircle = event.getPickResult().getIntersectedNode().getId();
    }


    /**
     * Diese Methode wuerfelt eine Zahl zwischen eins und sechs.
     *
     * @param event Aktionsausloesung einer interatkiven GUI-Komponente
     */
    @FXML
    public void buttonRollTheDiceOnAction(ActionEvent event) {

        //Nach jedem mal Wuerfeln wird die Anzahl der runden/gewuerfelten male um eins erhoeht.
        numberButtonPressed++;

        if (numberButtonPressed == 1) {
            for (int i = 0; i <= LauncherController.numberOfPlayers; i++) {
                Dice rtd = new Dice();
                //rtd.anfangsRunde();
            }
        }

        Dice rtd = new Dice();
        int value = rtd.rollTheDice();
        //Bilder der sechs Wuerfel.
        Image dice = new Image("/resources/Dice" + value + ".png", false);
        //Aendern des Wuerfel bildes zu der gewuerfelten Zahl.
        imgDice.setImage(dice);

        /*
         * Man darf nur einmal Wuerfeln und muss danach ziehen.
         */
        if (event.getSource() == btnRollTheDice) {

            btnRollTheDice.setDisable(true);
            if (/*spieler hat gezogen*/
                //circleOnActionM(event);
                    true) {

                btnRollTheDice.setDisable(false);
            }
        }
    }

    /**
     * Methode, welche die Anwendung beendet.
     *
     * @param event Aktionsausloesung einer interatkiven GUI-Komponente
     */
    @FXML
    public void buttonExitGameOnAction(ActionEvent event) {
        System.exit(0);
    }

    public List<Feld> getFelderListe() {
        return felderListe;
    }
}