package controller;

import com.mongodb.client.MongoDatabase;
import model.Character;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.example.mongodb.Connection;
import view.V_CharacterView;

public class C_CharacterController {

    private final V_CharacterView view;
    private final C_CharacterController controller;

    public C_CharacterController(C_CharacterController controller, V_CharacterView view) {

    }

}
