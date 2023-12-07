package example;

public class PineappleDecorator extends Topping {

    private String flavor = "Ananás";
    private int pineappleCost = 2;
    private int cont;

    public PineappleDecorator(Pizza pizza) {
        super(pizza);
        this.cont = 1;
    }

    public PineappleDecorator(Pizza pizza, int cont) {
        super(pizza);
        this.cont = cont;
    }

    public void tastesLike(String flavor) {
        super.tastesLike(this.flavor);
        System.out.println("\t" + this.flavor);
    }

    public int getCost() {
        int additions = super.getCost();
        return additions + pineappleCost;
    }
}
