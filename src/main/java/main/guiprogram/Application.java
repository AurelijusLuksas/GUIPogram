package main.guiprogram;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    private static Stage secondStage;

    @Override
    public void start(Stage stage) throws IOException {
        // Load the first scene
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 572, 489);
        stage.setTitle("Stage 1");
        stage.setScene(scene);
        stage.show();
    }

    public static Stage getSecondStage() {
        return secondStage;
    }

    public static void main(String[] args) {
        launch();
    }
}