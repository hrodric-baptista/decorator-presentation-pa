package example;

public class BaconDecorator extends Topping {

    private String flavor = "Bacon";
    private int baconCost = 3;
    private int cont;

    public BaconDecorator(Pizza pizza) {
        super(pizza);
        this.cont = 1;
    }

    public BaconDecorator(Pizza pizza, int cont) {
        super(pizza);
        this.cont = cont;
    }

    public void tastesLike(String flavor) {
        super.tastesLike(this.flavor);
        System.out.println("\t" + this.flavor);
    }

    public int getCost() {
        int additions = super.getCost();
        return additions + (cont * baconCost);
    }
}
