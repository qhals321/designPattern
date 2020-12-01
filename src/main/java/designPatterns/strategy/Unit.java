package designPatterns.strategy;

public abstract class Unit {
    private String name;
    private MoveStrategy moveStrategy;

    public Unit(String name) {
        this.name = name;
    }

    public void move(){
        moveStrategy.move();
    }

    public void setMoveStrategy(MoveStrategy moveStrategy){
        this.moveStrategy = moveStrategy;
    }
}
