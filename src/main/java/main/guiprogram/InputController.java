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
    static Data data = new Data();

    public String getBirthDate() {
        return birthDate.getValue().toString();
    }

    public String getHeight() {
        return height.getText();
    }

    public String getWeight() {
        return weight.getText();
    }

    public String getIncome() {
        return income.getText();
    }

    public void updateData() {
        data.setBirthDate(getBirthDate());
        data.setHeight(getHeight());
        data.setWeight(getWeight());
        data.setIncome(getIncome());
    }

    @FXML
    private void onOpenNextWindowClick(ActionEvent event) {
        updateData();
        singleton.setData(data);

        // Show the second stage
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

            // Get the current stage and hide it
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.hide();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sceneControlSend(ActionEvent actionEvent) {
        sendOption = 1;
    }

    public void userDataSend(ActionEvent actionEvent) {
        sendOption = 0;
    }

    public void singletonSend(ActionEvent actionEvent) {
        sendOption = 2;
    }
}