package example;

public class BaconDecorator extends Topping {
    private String flavor = "Bacon";
    public BaconDecorator(Pizza pizza) {
        super(pizza);
    }
    /**
     * O sabor deste ingrediente.
     * @param flavor O sabor, yummy.
     */
    public void tastesLike(String flavor) {
        super.tastesLike(this.flavor);
        System.out.println("\t" + this.flavor);
    }
}
