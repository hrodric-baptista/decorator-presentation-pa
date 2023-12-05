package example;

public class OnionDecorator extends Topping {

    private String flavor = "Cebola";

    public OnionDecorator(Pizza pizza) {
        super(pizza);
    }

    public void tastesLike(String flavor) {
        super.tastesLike(this.flavor);
        System.out.println("\t" + this.flavor);
    }
}
