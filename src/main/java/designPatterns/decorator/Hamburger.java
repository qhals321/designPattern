package designPatterns.decorator;

public class Hamburger extends FastFood{ //기본 메뉴
    @Override
    public void buy() {
        System.out.println("햄버거를 삽니다.");
    }
}
