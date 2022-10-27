package might.chat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChatClientAppGui extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ChatClientAppGui.class.getResource("scene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 450);
        stage.setTitle("Client!");
        stage.setScene(scene);
        scene.getRoot().lookup("#sendMsgBtn").setOnMouseClicked(evt -> {

        });
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}