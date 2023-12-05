package example;

public class PepperoniDecorator extends Topping {

    private String flavor = "Pepperoni";

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    public void tastesLike(String flavor) {
        super.tastesLike(this.flavor);
        System.out.println("\t" + this.flavor);
    }
}
