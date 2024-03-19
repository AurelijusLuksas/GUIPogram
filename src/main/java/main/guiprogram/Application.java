package main.guiprogram;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * @author Aurelijus Lukšas 5gr.
 * The Application class is the entry point for the JavaFX application.
 * It loads the first scene and sets the stage.
 */

public class Application extends javafx.application.Application {
    private static Stage secondStage;
    /**
     * The start method is called after the init method has returned, and after the system is ready for the application to begin running.
     * It is called when the application is started.
     * @param stage the primary stage for this application, onto which the application scene can be set.
     * @throws IOException if the resources are not found.
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Load the first scene
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 572, 489);
        stage.setTitle("Stage 1");
        stage.setScene(scene);
        stage.show();
    }
    /**
     * The main method is ignored in JavaFX applications.
     * It is not required for JavaFX applications when the JAR file for the application is created with the JavaFX Packager tool.
     * When you run a JavaFX application, the Java Virtual Machine (JVM) first calls the main method.
     */
    public static Stage getSecondStage() {
        return secondStage;
    }
    /**
     * The main method is ignored in JavaFX applications.
     * It is not required for JavaFX applications when the JAR file for the application is created with the JavaFX Packager tool.
     * When you run a JavaFX application, the Java Virtual Machine (JVM) first calls the main method.
     */
    public static void main(String[] args) {
        launch();
    }
}