package example;

public class PineappleDecorator extends Topping {

    private String flavor = "Ananás";

    public PineappleDecorator(Pizza pizza) {
        super(pizza);
    }

    public void tastesLike(String flavor) {
        super.tastesLike(this.flavor);
        System.out.println("\t" + this.flavor);
    }
}
