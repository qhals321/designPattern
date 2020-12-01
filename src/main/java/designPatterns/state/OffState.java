package designPatterns.state;

public class OffState implements State{
    private static final OffState OFF_STATE = new OffState();

    private OffState(){}

    public static OffState get(){
        return OFF_STATE;
    }

    @Override
    public void on_button(LightStand lightStand) {
        System.out.println("불을 킵니다.");
        lightStand.setState(OnState.get());
    }

    @Override
    public void off_button(LightStand lightStand) {
        System.out.println("아무 변화가 없습니다.");
    }
}
