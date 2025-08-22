import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import controller.C_Character;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.M_Character;
import org.bson.Document;
import org.example.mongodb.Connection;
import repository.R_Character;
//import view.MainWindow;
import view.V_Character;

import javax.print.Doc;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static javafx.application.Application.launch;

// zum Ausführen der Main: "mvn clean javafx:run" in Terminal eingeben
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        V_Character view = new V_Character();
        R_Character repo = new R_Character(Connection.getDatabase());
        C_Character controller = new C_Character(view, repo);

        Scene scene = new Scene(view.getView(), 1200, 650);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Character View");
        primaryStage.show();

        // Shutdown Hook (Daten aus DB in backup speichern) [Hierfür Jackson dependency hinzugefügt]
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                MongoCollection<Document> collection = Connection.getDatabase().getCollection("Character");
                System.out.println("Collection Name: " + collection.getNamespace());
                List<Document> documents = collection.find().into(new ArrayList<>());

                ObjectMapper mapper = new ObjectMapper();
                mapper.enable(SerializationFeature.INDENT_OUTPUT);
                mapper.writeValue(new File("C:\\IntellyJ_Projekte\\DSA_App\\DasSchwarzeAuge5.0Software\\src\\backup_data\\backup.json"), documents);

                System.out.println("Backup erfolgreich erstellt.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
