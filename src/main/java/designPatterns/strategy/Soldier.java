package designPatterns.strategy;

public class Soldier extends Unit{
    public Soldier() {
        super("일반 병사");
        setMoveStrategy(new WakingMove());
    }
}
