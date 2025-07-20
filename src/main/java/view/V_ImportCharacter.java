package view;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;


public class V_ImportCharacter {

    private final VBox root;

    // Inhalt des Fensters
    public TextField pfadEingabe = new TextField();
    public Button importButton = new Button("importieren");

    public V_ImportCharacter() {
        VBox vBox = new VBox(10);
        pfadEingabe.setPromptText("Dateipfad eingeben:");

        vBox.getChildren().addAll(pfadEingabe, importButton);

        root = new VBox(vBox);
    }

    public Parent getView() {
        return root;
    }
}
