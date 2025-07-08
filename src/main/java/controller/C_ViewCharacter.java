package controller;

import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.example.mongodb.Connection;
import view.V_CharacterView;
import model.Character;

public class C_ViewCharacter {

    public Character getCharacterById(String id) {
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
}
