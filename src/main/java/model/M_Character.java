package model;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;
import org.example.mongodb.Connection;
import org.bson.Document;

public class M_Character {

    // Persönliche Daten
    private String name;
    private String alter;
    private String geschlecht;
    private String haarfarbe;
    private String spezies;
    private String augenfarbe;
    private String kultur;
    private String groesse;
    private String profession;
    private int gewicht;
    private String sozialstatus;
    private String characteristika;
    private String heimatort;
    private String familie;

    // Eigenschaften
    private int mut = 0;
    private int klugheit = 0;
    private int intuition = 0;
    private int charisma = 0;
    private int fingerfertigkeit = 0;
    private int gewandheit = 0;
    private int konstitution = 0;
    private int koerperkraft = 0;

    private M_Character(String name, String alter, String geschlecht, String haarfarbe,
                        String spezies, String augenfarbe, String kultur, String groesse,
                        String profession, int gewicht, String sozialstatus, String characteristika,
                        String heimatort, String familie) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
        this.haarfarbe = haarfarbe;
        this.spezies = spezies;
        this.augenfarbe = augenfarbe;
        this.kultur = kultur;
        this.groesse = groesse;
        this.profession = profession;
        this.gewicht = gewicht;
        this.sozialstatus = sozialstatus;
        this.characteristika = characteristika;
        this.heimatort = heimatort;
        this.familie = familie;
    }

    public static M_Character createCharacter(String name, String alter, String geschlecht, String haarfarbe, String spezies,
                                              String augenfarbe, String kultur, String groesse, String profession,
                                              int gewicht, String sozialstatus, String characteristika, String heimatort,
                                              String familie) {
        return new M_Character(name, alter, geschlecht, haarfarbe, spezies, augenfarbe, kultur, groesse, profession,
                gewicht, sozialstatus, characteristika, heimatort, familie);
    }

    // Alle Eigenschaften werden über eine Methode gesetzt
    public void setAllEigenschaften(int mut, int klugheit, int intuition, int charisma, int fingerfertigkeit,
                                    int gewandheit, int konstitution, int koerperkraft) {
        this.mut = mut;
        this.klugheit = klugheit;
        this.intuition = intuition;
        this.charisma = charisma;
        this.fingerfertigkeit = fingerfertigkeit;
        this.gewandheit = gewandheit;
        this.konstitution = konstitution;
        this.koerperkraft = koerperkraft;
    }

    // getter Persönliche Daten
    public String getName() {
        return this.name;
    }
    public String getAlter() { return this.alter; }
    public String getGeschlecht() { return this.geschlecht; }
    public String getHaarfarbe() { return this.haarfarbe; }
    public String getSpezies() { return this.spezies; }
    public String getAugenfarbe() { return this.augenfarbe; }
    public String getKultur() { return this.kultur; }
    public String getGroesse() { return this.groesse; }
    public String getProfession() { return this.profession; }
    public int getGewicht() { return this.gewicht; }
    public String getSozialstatus() { return this.sozialstatus; }
    public String getCharacteristika() { return this.characteristika; }
    public String getHeimatort() { return this.heimatort; }
    public String getFamilie() { return this.familie; }

    // getter Eigenschaften
    public int getMut() {
        return mut;
    }
    public int getKlugheit() {
        return klugheit;
    }
    public int getIntuition() {
        return intuition;
    }
    public int getCharisma() {
        return charisma;
    }
    public int getFingerfertigkeit() {
        return fingerfertigkeit;
    }
    public int getGewandheit(){
        return gewandheit;
    }
    public int getKonstitution() {
        return konstitution;
    }
    public int getKoerperkraft() {
        return koerperkraft;
    }

    // setter Persönliche Daten
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String alter) { this.alter = alter; }
    public void setGeschlecht(String geschlecht) { this.geschlecht = geschlecht; }
    public void setHaarfarbe(String haarfarbe) { this.haarfarbe = haarfarbe; }
    public void setSpezies(String spezies) { this.spezies = spezies; }
    public void setAugenfarbe(String augenfarbe) { this.augenfarbe = augenfarbe; }
    public void setKultur(String kultur) { this.kultur = kultur; }
    public void setGroesse(String groesse) { this.groesse = groesse; }
    public void setProfession(String profession) { this.profession = profession; }
    public void setGewicht(int gewicht) { this.gewicht = gewicht; }
    public void setSozialstatus(String sozialstatus) { this.sozialstatus = sozialstatus; }
    public void setCharacteristika(String characteristika) { this.characteristika = characteristika; }
    public void setHeimatort(String heimatort) { this.heimatort = heimatort; }
    public void setFamilie(String familie) { this.familie = familie; }

    // setter Eigenschaften
    public void setMut(int mut) { this.mut = mut; }
    public void setKlugheit(int klugheit) { this.klugheit = klugheit; }
    public void setIntuition(int intuition) { this.intuition = intuition; }
    public void setCharisma(int charisma) { this.charisma = charisma; }
    public void setFingerfertigkeit(int fingerfertigkeit) { this.fingerfertigkeit = fingerfertigkeit; }
    public void setGewandheit(int gewandheit) { this.gewandheit = gewandheit; }
    public void setKonstitution(int konstitution) { this.konstitution = konstitution; }
    public void setKoerperkraft(int koerperkraft) { this.koerperkraft = koerperkraft; }

    // Erstellt ein Dokument mit den Angaben aus Character
    public Document toDocument() {
       return new Document("name", this.name)
               .append("alter", this.alter)
               .append("geschlecht", this.geschlecht)
               .append("haarfarbe", this.haarfarbe)
               .append("spezies", this.spezies)
               .append("augenfarbe", this.augenfarbe)
               .append("kultur", this.kultur)
               .append("groesse", this.groesse)
               .append("profession", this.profession)
               .append("gewicht", this.gewicht)
               .append("sozialstatus", this.sozialstatus)
               .append("characteristika", this.characteristika)
               .append("heimatort", this.heimatort)
               .append("familie", this.familie);
    }
}
