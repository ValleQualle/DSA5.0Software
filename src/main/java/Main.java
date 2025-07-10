import com.mongodb.client.MongoDatabase;
import controller.C_Character;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.mongodb.Connection;
import repository.R_Character;
//import view.MainWindow;
import view.V_Character;

import static javafx.application.Application.launch;

// zum Ausführen der Main: "mvn clean javafx:run" in Terminal eingeben
public class Main extends Application {


    @Override
    public void start(Stage primaryStage) {
        V_Character view = new V_Character();
        R_Character repo = new R_Character(Connection.getDatabase());
        C_Character controller = new C_Character(view, repo);

        Scene scene = new Scene(view, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Character View");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
/*        Application.launch(MainWindow.class, args);
        // Verbindung zur DSA5Database aufbauen
        Connection con = new Connection();
        MongoDatabase db = con.getDatabase();*/

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
