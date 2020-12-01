package designPatterns.command;

public class LampOn implements Command{
    private Lamp lamp;
    public LampOn(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turn_on();
    }
}
