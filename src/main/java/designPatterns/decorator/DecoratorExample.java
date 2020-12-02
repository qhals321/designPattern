package designPatterns.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        FastFood hamburger = new Hamburger();
        hamburger.buy();
        System.out.println("---------------");
        FastFood withPotato = new FriedPotato(hamburger);
        withPotato.buy();
        System.out.println("---------------");
        FastFood withCoke = new Coke(withPotato);
        withCoke.buy();
    }
}
