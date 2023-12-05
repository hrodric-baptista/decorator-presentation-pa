package example;

public abstract class Topping implements Pizza {
    private final Pizza pizza;
    /**
     * Recebe a pizza construída.
     * @param pizza A pizza.
     */
    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public void tastesLike(String flavor) {
        pizza.tastesLike(flavor);
    }
}
