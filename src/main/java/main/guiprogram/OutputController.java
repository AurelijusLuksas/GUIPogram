package main.guiprogram;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

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
