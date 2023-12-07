package example;

public class PizzaImplementation implements Pizza {

    private final String name;
    private Pizza pizza;

    /**
     * Construtor da pizza.
     * @param name Nome da pizza.
     */
    public PizzaImplementation(String name) {
        this.name = name;
        this.pizza = null;
    }

    @Override
    public void tastesLike(String taste) {
        System.out.println("A " + name + " sabe a: ");
    }

    @Override
    public int getCost() {
        System.out.print("A " + name + " custa: ");
        return 0;
    }

    @Override
    public Pizza getPizza() {
        return null;
    }

    @Override
    public void removeTopping(Pizza pizza) {

    }

    @Override
    public Pizza addTopping(Pizza add) {
        return null;
    }
}
