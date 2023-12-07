package example;

public abstract class Topping implements Pizza {

    private Pizza pizza;

    public Topping() {
        this.pizza = null;
    }

    public Topping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void tastesLike(String flavor) {
        pizza.tastesLike(flavor);
    }

    @Override
    public int getCost() { return pizza.getCost(); }

    @Override
    public void removeTopping(Pizza pizza) {
        if(pizza == null) {
            return;
        }
        else if(this.pizza.equals(pizza)) {
            this.pizza = pizza.getPizza();
        }
        else {
            this.pizza.removeTopping(pizza);
        }
    }

    @Override
    public Pizza addTopping(Pizza pizza) {
        if (this.pizza != null) {
            this.pizza.addTopping(pizza);
        } else if (this.pizza == null) {
            this.pizza = pizza;
        }
        return this;
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
