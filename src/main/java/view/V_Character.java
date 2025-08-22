package view;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class V_Character {
    private final BorderPane root; // Wird am Ende des Konstruktors gesetzt & kann auch zu Pane, StackPane etc. geändert werden

/*    private Image backgroundImage = new Image(
            getClass().getResource("/backgrounds_v4/Persoenliche_Daten.png").toExternalForm()
    );*/
    // Angaben zu Persönlichen Daten
    /*
    public TextField idInput = new TextField();
    public Button fetchCharacterIdButton = new Button("Character laden");
    public Button importCharacterButton = new Button("Importiere einen Character");
    */
    public TitledPane persoenlicheDaten;
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
    public TitledPane eigenschaftenPane;
    public Label mutLabel;
    public Label klugheitLabel;
    public Label intuitionLabel;
    public Label charismaLabel;
    public Label fingerfertigkeitLabel;
    public Label gewandheitLabel;
    public Label konstitutionLabel;
    public Label koerperkraftLabel;

    // Angaben zu Vorteilen
    public TitledPane vorteilPane;
    public Label vorteil;

    // Angaben zu Nachteilen
    public TitledPane nachteilPane;
    public Label nachteil;

    // Angaben zu Erfahrungsgrad
    public TitledPane erfahrungsgradPane;
    public HBox erfahrungsgrad;
    public Label APGesamt;
    public Label APGesammelt;
    public Label APAusgegeben;

    // Angaben zu allgemeinen Sonderfertigkeiten
    public TitledPane allgSonderfertigkeitenPane;
    public Label allgemeineSonderfertigkeiten;

    // Angaben zu Basiswerten
    public TitledPane basiswertePane;
    public Label lebensenergie;
    public Label astralenergie;
    public Label karmaenergie;
    public Label seelenkraft;
    public Label zaehigkeit;
    public Label ausweichen;
    public VBox basiswerte;

    // Angaben zu Schicksalspunkten
    public TitledPane schicksalspunktePane;
    public Label schicksalspunkteWert;
    public Label schicksalspunkteBonus;
    public Label schicksalspunkteMax;
    public Label schicksalspunkteAktuell;
    public HBox schicksalspunkte;

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
        persoenlicheDaten = new TitledPane("Persönliche Daten", persoenlicheDaten);

        // Setzen der Eigenschaften - Label
        mutLabel = new Label("Mut: ");
        klugheitLabel = new Label("Klugheit: ");
        intuitionLabel =  new Label("Intuition: ");
        charismaLabel = new Label("Charisma: ");
        fingerfertigkeitLabel = new Label("Fingerfertigkeit: ");
        gewandheitLabel = new Label("Gewandheit: ");
        konstitutionLabel = new Label("Konstitution: ");
        koerperkraftLabel = new Label("Körperkraft: ");

        // Setzten der Vorteile
        vorteil = new Label("Vorteil: ");
        vorteilPane = new TitledPane("Vorteile", vorteil);

        // Setzen der Nachteile
        nachteil = new Label("Nachteil");
        nachteilPane = new TitledPane("Nachteile", nachteil);

        // Setzen des Erfahrungsgerades
        APGesamt = new Label("AP Gesamt: ");
        APGesammelt = new Label("AP Gesammelt: ");
        APAusgegeben = new Label("AP Ausgegeben: ");
        erfahrungsgrad = new HBox(20);
        erfahrungsgrad.getChildren().addAll(APGesamt, APGesammelt, APAusgegeben);
        erfahrungsgradPane = new TitledPane("Erfahrungsgrad", erfahrungsgradPane);

        //Setzen der allgemeine Sonderfertigkeiten
        allgemeineSonderfertigkeiten = new Label("Allgemeine Sonderfertigkeiten: ");
        allgSonderfertigkeitenPane = new TitledPane("Allgemeine Sonderfertigkeiten", allgemeineSonderfertigkeiten);

        // Setzen der Basiswerte
        lebensenergie = new Label("Lebensenergie: ");
        astralenergie = new Label("Astralenergie: ");
        karmaenergie = new Label("Karmaenergie: ");
        seelenkraft = new Label("Seelenkraft: ");
        zaehigkeit = new Label("Zähigkeit: ");
        ausweichen = new Label("Ausweichen: ");
        basiswerte = new VBox(20);
        basiswerte.getChildren().addAll(lebensenergie, astralenergie, karmaenergie, seelenkraft, zaehigkeit, ausweichen);
        basiswertePane = new TitledPane("Basiswerte", basiswerte);

        // Setzen der Schicksalspunkte
        schicksalspunkteWert = new Label("Wert: ");
        schicksalspunkteBonus = new Label("Bonus/Malus: ");
        schicksalspunkteMax = new Label("Max: ");
        schicksalspunkteAktuell = new Label("Aktuell: ");
        schicksalspunkte = new HBox(20);
        schicksalspunkte.getChildren().addAll(schicksalspunkteWert, schicksalspunkteBonus, schicksalspunkteMax, schicksalspunkteAktuell);
        schicksalspunktePane = new TitledPane("Schicksalspunkte", schicksalspunkte);

/*        // Hintergrund konfigurieren
        BackgroundImage bgImage = new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(
                        BackgroundSize.AUTO, BackgroundSize.AUTO,
                        false, false, true, true
                )
        );*/

        // Erstellen einer HBox, um die Kinder in vBox-Spalten aufteilen zu können
        HBox hBox = new HBox(20);
        VBox vBoxCharacter = new VBox(10); // Spalte für die Persönlichen Daten
        VBox vBoxEigenschaften = new VBox(10); // Spalte für die Eigenschaften

        TilePane personalData = new TilePane(); // Hier werden die persönlichen Daten (Karakterbogen) angezeigt

//        idInput.setPromptText("Character-ID eingeben");
        vBoxCharacter.getChildren().addAll(/*idInput, fetchCharacterIdButton,*/ nameLabel, alterLabel, geschlechtLabel,
                haarfarbeLabel, speziesLabel, augenfarbeLabel, kulturLabel, groesseLabel,
                professionLabel, gewichtLabel, sozialstatusLabel, characteristikaLabel,
                heimatortLabel, familieLabel);
        vBoxEigenschaften.getChildren().addAll(mutLabel, klugheitLabel, intuitionLabel, charismaLabel,
                fingerfertigkeitLabel, gewandheitLabel, konstitutionLabel, koerperkraftLabel);
        hBox.getChildren().addAll(vBoxCharacter, vBoxEigenschaften/*, importCharacterButton*/);

        eigenschaftenPane = new TitledPane("Eigenschaften", vBoxEigenschaften);

        vorteilPane.setCollapsible(false);
        nachteilPane.setCollapsible(false);
        erfahrungsgradPane.setCollapsible(false);
        allgSonderfertigkeitenPane.setCollapsible(false);
        basiswertePane.setCollapsible(false);
        schicksalspunktePane.setCollapsible(false);
        eigenschaftenPane.setCollapsible(false);
        personalData.getChildren().addAll(eigenschaftenPane, vorteilPane, nachteilPane, erfahrungsgradPane, persoenlicheDaten,
                allgSonderfertigkeitenPane, basiswertePane, schicksalspunktePane);

        root = new BorderPane();
        root.setCenter(personalData);
//        root.setBackground(new Background(bgImage));
    }

    // Rückgabe der View. Nutze diese Methode, um V_Character nicht erben zu lassen und somit einzuschränken.
    public Parent getView() {
        return root;
    }
}
