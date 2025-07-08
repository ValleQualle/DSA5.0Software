package model;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.types.ObjectId;
import org.example.mongodb.Connection;
import org.bson.Document;

public class Character {

    private String name;
    private int age;
    private String spezies;
    MongoCollection<Document> inventory;


    private Character(String n, int a, String s, MongoCollection<Document> i) {
        this.name = n;
        this.age = a;
        this.spezies = s;
        this.inventory = i;
    }

    public static Character createCharacter(String n, int a, String s, MongoDatabase db) {
        MongoCollection<Document> i = db.getCollection("inventory");
        return new Character(n, a, s, i);
    }

    // Karakter nach id aus der db lesen
    public static Character createCharacter(String id) {
        MongoDatabase database = Connection.getDatabase();
        try {
            Document doc = database.getCollection("Character")
                    .find(new Document("_id", new ObjectId(id))).first();
            if (doc != null) {
                String name = doc.getString("name");
                int age = doc.getInteger("age", -1);
                String spezies = doc.getString("spezies");
                return Character.createCharacter(name, age, spezies, database);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ungültige ID: " + id);
        }
        return null;
    }

    // getter
    public String getName() {
        return this.name;
    }
    public int getAge() { return this.age; }
    public String getSpezies() { return this.spezies; }

    // setter
    public void setName(String n) {
        this.name = n;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public void setSpezies(String s) {
        this.spezies = s;
    }

    // Erstellt ein Dokument mit den Angaben aus Character
    public Document toDocument() {
       return new Document("name", this.name)
               .append("age", this.age)
               .append("spezies", this.spezies);
    }
}
