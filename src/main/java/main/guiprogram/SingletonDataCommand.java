package main.guiprogram;

public class SingletonDataCommand implements Command{
    private Singleton singleton;
    public SingletonDataCommand(Singleton singleton) {
        this.singleton = singleton;
    }

    @Override
    public void execute(OutputController controller) {
        Singleton singleton = Singleton.getInstance();
        Data dataSingleton = singleton.getData();

        controller.ageOutput.setText(Outputs.getAge(dataSingleton.getBirthDate()) + " years");
        String bmi = Outputs.getBMI(String.valueOf(dataSingleton.getHeight()), String.valueOf(dataSingleton.getWeight()));
        String bmiClean = bmi.replace(",", ".");
        float bmiFloat = Float.parseFloat(bmiClean);
        controller.heightOutput.setText(Outputs.getHealth(bmiFloat));
        controller.weightOutput.setText(bmi);
        controller.wealthOutput.setText(Outputs.getWealth(String.valueOf(dataSingleton.getIncome())));
        controller.OverallOutput.setText(Outputs.getStatus(bmiFloat, Outputs.getWealth(String.valueOf(dataSingleton.getIncome())), Outputs.getAge(dataSingleton.getBirthDate())));
    }
}
