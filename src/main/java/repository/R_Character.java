package repository;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import model.M_Character;
import org.bson.Document;
import org.bson.types.ObjectId;

public class R_Character {

    private final MongoDatabase database;

    public R_Character(MongoDatabase db) {
        this.database = db;
    }

    // DB zugriff mit Abfrage der Daten eines bestimmten Characters
    public M_Character findById(String id) {
        try {
            MongoCollection<Document> collection = database.getCollection("Character");
            Document doc = collection.find(new Document("_id", new ObjectId(id))).first();
            if (doc != null) {
                return M_Character.createCharacter(
                        doc.getString("name"),
                        doc.getInteger("age", 0),
                        doc.getString("spezies")
                );
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ungültige ID: + id");
        }
        return null;
    }
}
