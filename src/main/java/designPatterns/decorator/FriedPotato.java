package designPatterns.decorator;

public class FriedPotato extends FastFoodDecorator{
    public FriedPotato(FastFood fastFood) {
        super(fastFood);
    }

    public void buy(){
        super.buy();
        buyPotato();
    }

    private void buyPotato() {
        System.out.println("감자를 삽니다.");
    }
}
