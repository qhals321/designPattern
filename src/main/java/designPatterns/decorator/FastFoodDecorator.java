package designPatterns.decorator;

public abstract class FastFoodDecorator extends FastFood{
    private FastFood fastFood;

    public FastFoodDecorator(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public void buy(){
        fastFood.buy();
    }
}
