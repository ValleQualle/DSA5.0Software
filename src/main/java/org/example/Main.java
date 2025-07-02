package org.example;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.bson.Document;
import org.example.mongodb.Connection;
import org.example.Character;

import java.util.Collection;

// zum Ausführen der Main: "mvn clean javafx:run" in Terminal eingeben
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hallo JavaFX!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
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

    /*
    Wo war ich?
    Ich habe Maven eingerichtet und kann im Terminal mit MongoDB arbeiten.
    Als nächstes möchte ich durch code auf meine MongoDB zugreifen und z.B. neue User in die
    appdb einfügen können.
    Das Ziel ist, so Items und verschiedene game Data zu speichern und abzurufen.
     */

}
