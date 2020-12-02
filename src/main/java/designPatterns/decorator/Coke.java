package designPatterns.decorator;

public class Coke extends FastFoodDecorator{

    public Coke(FastFood fastFood) {
        super(fastFood);
    }

    public void buy(){
        super.buy();
        buyCoke();
    }

    private void buyCoke() {
        System.out.println("콜라를 삽니다.");
    }
}
