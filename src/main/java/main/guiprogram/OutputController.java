package main.guiprogram;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class OutputController extends Data {
    private Data data;
    public OutputController() {
    }
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
            case 0 -> {
                // Implement the UserData functionality here
                Data dataUser = InputController.data;

                ageOutput.setText(Outputs.getAge(dataUser.getBirthDate()) + " years");
                String bmi = Outputs.getBMI(dataUser.getHeight(), dataUser.getWeight());
                String bmiClean = bmi.replace(",", ".");
                float bmiFloat = Float.parseFloat(bmiClean);
                heightOutput.setText(Outputs.getHealth(bmiFloat));
                weightOutput.setText(bmi);
                wealthOutput.setText(Outputs.getWealth(dataUser.getIncome()));
                OverallOutput.setText(Outputs.getStatus(bmiFloat, Outputs.getWealth(dataUser.getIncome()), Outputs.getAge(dataUser.getBirthDate())));
            }
            case 1 -> {
                ageOutput.setText(Outputs.getAge(data.getBirthDate()) + " years");
                String bmi = Outputs.getBMI(data.getHeight(), data.getWeight());
                String bmiClean = bmi.replace(",", ".");
                float bmiFloat = Float.parseFloat(bmiClean);
                heightOutput.setText(Outputs.getHealth(bmiFloat));
                weightOutput.setText(bmi);
                wealthOutput.setText(Outputs.getWealth(data.getIncome()));
                OverallOutput.setText(Outputs.getStatus(bmiFloat, Outputs.getWealth(data.getIncome()), Outputs.getAge(data.getBirthDate())));
            }
            case 2 -> {
                Singleton singleton = Singleton.getInstance();
                Data dataSingleton = singleton.getData();

                ageOutput.setText(Outputs.getAge(dataSingleton.getBirthDate()) + " years");
                String bmi = Outputs.getBMI(dataSingleton.getHeight(), dataSingleton.getWeight());
                String bmiClean = bmi.replace(",", ".");
                float bmiFloat = Float.parseFloat(bmiClean);
                heightOutput.setText(Outputs.getHealth(bmiFloat));
                weightOutput.setText(bmi);
                wealthOutput.setText(Outputs.getWealth(dataSingleton.getIncome()));
                OverallOutput.setText(Outputs.getStatus(bmiFloat, Outputs.getWealth(dataSingleton.getIncome()), Outputs.getAge(dataSingleton.getBirthDate())));
            }
        }
    }
}
