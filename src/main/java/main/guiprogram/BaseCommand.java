package main.guiprogram;

public abstract class BaseCommand implements Command{
    protected Data data;
    public BaseCommand(Data data) {
        this.data = data;
    }
    @Override
    public abstract void execute(OutputController controller);
}
