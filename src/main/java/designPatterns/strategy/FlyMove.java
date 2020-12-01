package designPatterns.strategy;

public class FlyMove implements MoveStrategy{
    public void move() {
        System.out.println("하늘을 납니다.");
    }
}
