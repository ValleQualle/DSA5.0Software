package org.example;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class Character {

    private String name;
    private int age;
    private String spezies;


    public Character(String n, int a, String s) {
        this.name = n;
        this.age = a;
        this.spezies = s;
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
