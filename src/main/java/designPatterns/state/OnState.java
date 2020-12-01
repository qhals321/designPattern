package designPatterns.state;

public class OnState implements State{
    private static final OnState ON_STATE = new OnState();

    private OnState(){}

    public static OnState get(){
        return ON_STATE;
    }

    @Override
    public void on_button(LightStand lightStand) {
        System.out.println("아무 변화가 없습니다.");
    }

    @Override
    public void off_button(LightStand lightStand) {
        System.out.println("불을 끕니다.");
        lightStand.setState(OffState.get());
    }
}
