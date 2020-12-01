package designPatterns.state;

public class LightStand {
    private State state;

    public LightStand() {
        this.state = OffState.get();
    }

    public void on_button(){
        state.on_button(this);
    }

    public void off_button(){
        state.off_button(this);
    }

    public void setState(State state){
        this.state = state;
    }
}
