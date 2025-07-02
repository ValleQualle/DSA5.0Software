package org.example.mongodb;

import com.mongodb.client.*;
import org.bson.Document;
import org.bson.json.JsonWriterSettings;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Connection {

    // Diese Klasse baut eine Verbindung zu der MongoDB auf,
    // um auf die darin gespeicherten Daten zugreifen zu können.

    MongoClient mongoClient;
    MongoDatabase database;
    MongoCollection<Document> collection;

    public Connection() {
            this.mongoClient = MongoClients.create("mongodb://localhost:27017");
            this.database = mongoClient.getDatabase("DSA5Database");
    }

    public MongoDatabase getDatabase() {
        return this.database;
    }
}
