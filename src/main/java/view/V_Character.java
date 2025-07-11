package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class V_Character extends VBox{

    public TextField idInput = new TextField();
    public Button fetchButton = new Button("Character laden");
    public Label nameLabel;
    public Label alterLabel;
    public Label geschlechtLabel;
    public Label haarfarbeLabel;
    public Label speziesLabel;
    public Label augenfarbeLabel;
    public Label kulturLabel;
    public Label groesseLabel;
    public Label professionLabel;
    public Label gewichtLabel;
    public Label sozialstatusLabel;
    public Label characteristikaLabel;
    public Label heimatortLabel;
    public Label familieLabel;

    public V_Character() {
        nameLabel = new Label("Name: ");
        alterLabel = new Label("Alter: ");
        geschlechtLabel = new Label("Geschlecht: ");
        haarfarbeLabel = new Label("Haarfarbe: ");
        speziesLabel = new Label("Spezies: ");
        augenfarbeLabel = new Label("Augenfarbe: ");
        kulturLabel = new Label("Kultur: ");
        groesseLabel = new Label("Groesse: ");
        professionLabel = new Label("Profession: ");
        gewichtLabel = new Label("Gewicht: ");
        sozialstatusLabel = new Label("Sozialstatus: ");
        characteristikaLabel = new Label("Characteristika: ");
        heimatortLabel = new Label("Heimatort: ");
        familieLabel = new Label("Familie: ");

        idInput.setPromptText("Character-ID eingeben");
        this.setSpacing(10);
        this.getChildren().addAll(idInput, fetchButton, nameLabel, alterLabel, geschlechtLabel,
                haarfarbeLabel, speziesLabel, augenfarbeLabel, kulturLabel, groesseLabel,
                professionLabel, gewichtLabel, sozialstatusLabel, characteristikaLabel,
                heimatortLabel, familieLabel);
    }
}
