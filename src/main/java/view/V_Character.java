package view;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class V_Character {
    private final VBox root; /// Wird am Ende des Konstruktors gesetzt & kann auch zu Pane, StackPane etc. geändert werden

    // Angaben zu Persönlichen Daten
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

    // Angaben zu Eigenschaften
    public Label mutLabel;
    public Label klugheitLabel;
    public Label intuitionLabel;
    public Label charismaLabel;
    public Label fingerfertigkeitLabel;
    public Label gewandheitLabel;
    public Label konstitutionLabel;
    public Label koerperkraftLabel;

    public V_Character() {
        // Setzen der Persönlichen Daten - Label
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

        // Setzen der Eigenschaften - Label
        mutLabel = new Label("Mut: ");
        klugheitLabel = new Label("Klugheit: ");
        intuitionLabel =  new Label("Intuition: ");
        charismaLabel = new Label("Charisma: ");
        fingerfertigkeitLabel = new Label("Fingerfertigkeit: ");
        gewandheitLabel = new Label("Gewandheit: ");
        konstitutionLabel = new Label("Konstitution: ");
        koerperkraftLabel = new Label("Körperkraft: ");

        // Erstellen einer HBox, um die Kinder in vBox-Spalten aufteilen zu können
        HBox hBox = new HBox(20);
        VBox vBoxCharacter = new VBox(10); // Spalte für die Persönlichen Daten
        VBox vBoxEigenschaften = new VBox(10); // Spalte für die Eigenschaften

        idInput.setPromptText("Character-ID eingeben");
        vBoxCharacter.getChildren().addAll(idInput, fetchButton, nameLabel, alterLabel, geschlechtLabel,
                haarfarbeLabel, speziesLabel, augenfarbeLabel, kulturLabel, groesseLabel,
                professionLabel, gewichtLabel, sozialstatusLabel, characteristikaLabel,
                heimatortLabel, familieLabel);
        vBoxEigenschaften.getChildren().addAll(mutLabel, klugheitLabel, intuitionLabel, charismaLabel,
                fingerfertigkeitLabel, gewandheitLabel, konstitutionLabel, koerperkraftLabel);
        hBox.getChildren().addAll(vBoxCharacter, vBoxEigenschaften);

        root = new VBox(hBox);
    }

    // Rückgabe der View. Nutze diese Methode, um V_Character nicht erben zu lassen und somit einzuschränken.
    public Parent getView() {
        return root;
    }
}
