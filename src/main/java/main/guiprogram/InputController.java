package main.guiprogram;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
/**
 * @author Aurelijus Lukšas 5gr.
 * InputController class is a controller class for the view.fxml file.
 * It is responsible for setting the data to the view.fxml file.
 */
public class InputController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button openNextWindowButton;
    @FXML
    private DatePicker birthDate;
    public static int sendOption = 1;

    @FXML
    private TextField height;

    @FXML
    private TextField weight;

    @FXML
    private TextField income;
    Singleton singleton = Singleton.getInstance();
    static Data data;
    /**
     * Initializes the data in the view.fxml file.
     */
    public String getBirthDate() {
        return birthDate.getValue().toString();
    }
    /**
     * Initializes the data in the view.fxml file.
     */
    public String getHeight() {
        return height.getText();
    }
    /**
     * Initializes the data in the view.fxml file.
     */
    public String getWeight() {
        return weight.getText();
    }

    /**
     * Initializes the data in the view.fxml file.
     * @return income.getText();
     */
    public String getIncome() {
        return income.getText();
    }

    /**
     * Initializes the data in the view.fxml file.
     */
    public void updateData() {
        data = new Data.Builder()
                .setBirthDate(getBirthDate())
                .setHeight(Double.parseDouble(getHeight()))
                .setWeight(Double.parseDouble(getWeight()))
                .setIncome(Double.parseDouble(getIncome()))
                .build();

    }

    /**
     * Initializes the data in the view.fxml file and opens second stage.
     * @param event
     */
    @FXML
    private void onOpenNextWindowClick(ActionEvent event) {
        updateData();
        singleton.setData(data);

        try {
            Stage secondStage = new Stage();
            FXMLLoader fxmlLoaderNext = new FXMLLoader(Application.class.getResource("view-next.fxml"));
            OutputController outputController = new OutputController();
            outputController.setData(data);
            fxmlLoaderNext.setController(outputController);
            Scene sceneNext = new Scene(fxmlLoaderNext.load(),600, 400);
            secondStage.setTitle("Stage 2");
            secondStage.setScene(sceneNext);
            secondStage.show();

            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Initializes the data in the view.fxml file.
     * @param actionEvent
     */
    public void sceneControlSend(ActionEvent actionEvent) {
        sendOption = 1;
    }
    /**
     * Initializes the data in the view.fxml file.
     * @param actionEvent
     */
    public void userDataSend(ActionEvent actionEvent) {
        sendOption = 0;
    }
    /**
     * Initializes the data in the view.fxml file.
     * @param actionEvent
     */
    public void singletonSend(ActionEvent actionEvent) {
        sendOption = 2;
    }
}