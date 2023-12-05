package example;

public class PizzaImplementation implements Pizza {
    private final String name;
    /**
     * Construtor da pizza.
     * @param name Nome da pizza.
     */
    public PizzaImplementation(String name) {
        this.name = name;
    }
    @Override
    public void tastesLike(String taste) {
        System.out.println("A " + name + " sabe a: ");
    }
}
