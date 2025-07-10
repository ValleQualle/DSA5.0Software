package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class V_Character extends VBox{

    public TextField idInput = new TextField();
    public Button fetchButton = new Button("Character laden");
    public Label nameLabel;
    public Label speziesLabel;
    public Label ageLabel;

    public V_Character() {
        nameLabel = new Label("Name: ");
        speziesLabel = new Label("Spezies: ");
        ageLabel = new Label("Alter: ");
        idInput.setPromptText("Character-ID eingeben");
        this.setSpacing(10);
        this.getChildren().addAll(idInput, fetchButton, nameLabel, speziesLabel, ageLabel);
    }
}
