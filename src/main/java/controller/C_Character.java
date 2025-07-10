package controller;

import model.M_Character;
import repository.R_Character;
import view.V_Character;

public class C_Character {

    private final V_Character view;
    private final R_Character repo;

    public C_Character(V_Character view, R_Character repo) {
        this.view = view;
        this.repo = repo;

        // Button mit EventHandler verknüpfen
        view.fetchButton.setOnAction(event -> {
            String id = view.idInput.getText().trim();
            M_Character character = repo.findById(id);
            if (character != null) {
                view.nameLabel.setText("Name: " + character.getName());
                view.ageLabel.setText("Alter: " + character.getAge());
                view.speziesLabel.setText("Spezies: " + character.getSpezies());
            } else {
                view.nameLabel.setText("Character nicht gefunden.");
                view.ageLabel.setText("");
                view.speziesLabel.setText("");
            }
        });
    }
}
