package org.example;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.example.mongodb.Connection;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Verbindung zur DSA5Database aufbauen
        Connection con = new Connection();
        MongoDatabase db = con.getDatabase();

        // Einen Character erstellen
        Character kudu = new Character("Kudu", 24, "Halbelf");
        // Den Character in die Datenbank einfügen
        db.getCollection("Character").insertOne(kudu.toDocument());

        FindIterable<Document> dokumente = db.getCollection("Character").find().projection(new Document("_id", 0));
            for (Document doc : dokumente) {
                System.out.println(doc.toJson());
            }

    }

    /*
    Wo war ich?
    Ich habe Maven eingerichtet und kann im Terminal mit MongoDB arbeiten.
    Als nächstes möchte ich durch code auf meine MongoDB zugreifen und z.B. neue User in die
    appdb einfügen können.
    Das Ziel ist, so Items und verschiedene game Data zu speichern und abzurufen.
     */

}
