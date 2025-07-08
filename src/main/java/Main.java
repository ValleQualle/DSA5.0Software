import com.mongodb.client.MongoDatabase;
import javafx.application.Application;
import org.example.mongodb.Connection;
import view.MainWindow;

// zum Ausführen der Main: "mvn clean javafx:run" in Terminal eingeben
public class Main {

    public static void main(String[] args) {
        Application.launch(MainWindow.class, args);
        // Verbindung zur DSA5Database aufbauen
        Connection con = new Connection();
        MongoDatabase db = con.getDatabase();

/*        // Einen Character erstellen
        Character kudu = Character.createCharacter("Waldemar", 65, "Orc", db);
        // Den Character in die Datenbank einfügen
        db.getCollection("Character").insertOne(kudu.toDocument());

        FindIterable<Document> dokumente = db.getCollection("Character").find().projection(new Document("_id", 0));
        for (Document doc : dokumente) {
            System.out.println(doc.toJson());
        }*/
    }
}
