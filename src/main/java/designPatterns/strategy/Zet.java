package designPatterns.strategy;

public class Zet extends Unit{
    public Zet() {
        super("제트기");
        setMoveStrategy(new FlyMove());
    }
}
