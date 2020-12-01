package designPatterns.state;

public interface State {
    void on_button(LightStand lightStand);
    void off_button(LightStand lightStand);
}
