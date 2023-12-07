package example;

public class OnionDecorator extends Topping {

    private String flavor = "Cebola";
    private int onionCost = 4;
    private int cont;

    public OnionDecorator(Pizza pizza) {
        super(pizza);
        this.cont = 1;
    }

    public OnionDecorator(Pizza pizza, int cont) {
        super(pizza);
        this.cont = cont;
    }

    public void tastesLike(String flavor) {
        super.tastesLike(this.flavor);
        System.out.println("\t" + this.flavor);
    }

    public int getCost() {
        int additions = super.getCost();
        return additions + (cont * onionCost);
    }
}
