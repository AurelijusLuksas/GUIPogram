package main.guiprogram;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
/**
 * @author Aurelijus Lukšas 5gr.
 * OutputController class is a controller class for the view-next.fxml file.
 * It is responsible for setting the data to the view-next.fxml file.
 */
public class OutputController{
    private Data data;
    public void setData(Data data) {
        this.data = data;
    }
    @FXML
    public Label ageOutput;
    @FXML
    public Label heightOutput;
    @FXML
    public Label weightOutput;
    @FXML
    public Label wealthOutput;
    @FXML
    public Label OverallOutput;
    /**
     * Initializes the data in the view-next.fxml file.
     */
    @FXML
    public void initialize() {
        switch (InputController.sendOption) {
            case 0:
                SceneControlDataCommand sceneControlDataCommand = new SceneControlDataCommand(data);
                sceneControlDataCommand.execute(this);
            case 1:
                SingletonDataCommand singletonDataCommand = new SingletonDataCommand(Singleton.getInstance());
                singletonDataCommand.execute(this);
                break;
            case 2:
                UserDataCommand userDataCommand = new UserDataCommand(InputController.data);
                userDataCommand.execute(this);
                break;
        }
    }
}
