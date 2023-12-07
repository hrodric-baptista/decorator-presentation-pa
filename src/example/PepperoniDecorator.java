package example;

public class PepperoniDecorator extends Topping {

    private String flavor = "Pepperoni";
    private int pepperoniCost = 1;
    private int cont;

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
        this.cont = 1;
    }

    public PepperoniDecorator(Pizza pizza, int cont) {
        super(pizza);
        this.cont = cont;
    }

    public void tastesLike(String flavor) {
        super.tastesLike(this.flavor);
        System.out.println("\t" + this.flavor);
    }

    public int getCost() {
        int additions = super.getCost();
        return additions + (cont * pepperoniCost);
    }
}
