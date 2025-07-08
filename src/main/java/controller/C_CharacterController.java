package controller;

import model.Character;
import view.V_CharacterView;

public class C_CharacterController {

    private final V_CharacterView view;

    public C_CharacterController(V_CharacterView view) {
        this.view = view;

        // ActionListener auf den Button im View
        /*view.fetchButton.setOnAction(e -> {
            String id = view.idInput.getText().trim();
            if (character != null) {
                view.nameLabel.setText("Name: " + character.getName());
                view.speziesLabel.setText("Spezies " + character.getSpezies());
                view.ageLabel.setText("Alter: " + character.getAge());
            } else {
                view.nameLabel.setText("Kein Karakter gefunden.");
                view.ageLabel.setText("");
            }
        });*/
    }
}
