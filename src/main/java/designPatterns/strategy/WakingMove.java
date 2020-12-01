package designPatterns.strategy;

public class WakingMove implements MoveStrategy{
    public void move() {
        System.out.println("걷습니다.");
    }
}
