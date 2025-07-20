package controller;

import view.V_ImportCharacter;

public class C_ImportCharacter {

    private final V_ImportCharacter view;

    public C_ImportCharacter(V_ImportCharacter view) {
        this.view = view;

        view.importButton.setOnAction(event -> {
            String filepath = view.pfadEingabe.getText().trim();
            
        });
    }
}
