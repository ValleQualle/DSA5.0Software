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
                view.alterLabel.setText("Alter: " + character.getAlter());
                view.geschlechtLabel.setText("Geschlecht: " + character.getGeschlecht());
                view.haarfarbeLabel.setText("Haarfarbe: " + character.getHaarfarbe());
                view.speziesLabel.setText("Spezies: " + character.getSpezies());
                view.augenfarbeLabel.setText("Augenfarbe: " + character.getAugenfarbe());
                view.kulturLabel.setText("Kultur: " + character.getKultur());
                view.groesseLabel.setText("Größe: " + character.getGroesse());
                view.professionLabel.setText("Profession: " + character.getProfession());
                view.gewichtLabel.setText("Gewicht: " + character.getGewicht());
                view.sozialstatusLabel.setText("Sozialstatus: " + character.getSozialstatus());
                view.characteristikaLabel.setText("Characteristika: " + character.getCharacteristika());
                view.heimatortLabel.setText("Heimatort: " + character.getHeimatort());
                view.familieLabel.setText("Familie: " + character.getFamilie());
            } else {
                view.nameLabel.setText("Character nicht gefunden.");
                view.alterLabel.setText("");
                view.geschlechtLabel.setText("");
                view.haarfarbeLabel.setText("");
                view.speziesLabel.setText("");
                view.augenfarbeLabel.setText("");
                view.kulturLabel.setText("");
                view.groesseLabel.setText("");
                view.professionLabel.setText("");
                view.gewichtLabel.setText("");
                view.sozialstatusLabel.setText("");
                view.characteristikaLabel.setText("");
                view.heimatortLabel.setText("");
                view.familieLabel.setText("");
            }
        });
    }
}
