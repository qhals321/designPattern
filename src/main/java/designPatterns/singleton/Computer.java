package designPatterns.singleton;

public class Computer {
    private static Computer computer;

    private Computer() {}

    public synchronized static Computer getComputer() {
        if(computer == null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {}
            computer = new Computer();
        }
        return computer;
    }
}
