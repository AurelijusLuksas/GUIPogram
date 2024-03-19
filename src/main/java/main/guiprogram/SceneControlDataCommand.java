package main.guiprogram;

public class SceneControlDataCommand extends BaseCommand {
    private Data data;
    public SceneControlDataCommand(Data data) {
        super(data);
    }

    @Override
    public void execute(OutputController controller) {
        Data dataUser = InputController.data;

        controller.ageOutput.setText(Outputs.getAge(dataUser.getBirthDate()) + " years");
        String bmi = Outputs.getBMI(String.valueOf(dataUser.getHeight()), String.valueOf(dataUser.getWeight()));
        String bmiClean = bmi.replace(",", ".");
        float bmiFloat = Float.parseFloat(bmiClean);
        controller.heightOutput.setText(Outputs.getHealth(bmiFloat));
        controller.weightOutput.setText(bmi);
        controller.wealthOutput.setText(Outputs.getWealth(String.valueOf(dataUser.getIncome())));
        controller.OverallOutput.setText(Outputs.getStatus(bmiFloat, Outputs.getWealth(String.valueOf(dataUser.getIncome())), Outputs.getAge(dataUser.getBirthDate())));
    }
}
