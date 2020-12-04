package designPatterns.template;

public abstract class Develop {
    public void develop() {
        coding();
        build();
        deploy();
    }

    protected abstract void build();

    private void deploy() {
        System.out.println("배포합니다.");
    }

    private void coding() {
        System.out.println("코딩을 작성합니다.");
    }
}
